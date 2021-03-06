package views;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import controllers.UsuariosController;
import models.Usuario;

public class Usuarios extends javax.swing.JFrame {
    private static final long serialVersionUID = 8708548799894834215L;
    ArrayList<Usuario> usuarios;
    DefaultTableModel modelTbUsuarios = new DefaultTableModel(new Object[][] {},
            new Object[] { "Usuário", "Nome", "Tipo" }) {
        private static final long serialVersionUID = 890127435315553587L;
        boolean[] canEdit = new boolean[] { false, false, false, false };

        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return canEdit[columnIndex];
        }
    };

    public Usuarios() {
        this.initComponents();
        this.setLocationRelativeTo(null);
        this.updateTbUsuarios();
    }

    private void updateTbUsuarios() {
        try {
            this.usuarios = new UsuariosController().buscarUsuarios();
            
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao buscar usuários.");
        }

        for (int i = 0; i < this.usuarios.size(); i++) {
            modelTbUsuarios.addRow(new String[]{
                String.valueOf(this.usuarios.get(i).getLogin()),
                String.valueOf(this.usuarios.get(i).getNome()),
                String.valueOf(this.usuarios.get(i).getTipo() == 'A' ? "Administrador" : "Usuário")});
        }

        jTbUsuarios.setModel(modelTbUsuarios);
    }
    
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTbUsuarios = new javax.swing.JTable();
        jBtCadastrar = new javax.swing.JButton();
        jBtEditar = new javax.swing.JButton();
        jBtVoltar = new javax.swing.JButton();
        jBtSenha = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Usuários");

        jPanel1.setBackground(new java.awt.Color(254, 254, 254));
        jPanel1.setPreferredSize(new java.awt.Dimension(1100, 600));

        jLabelTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelTitle.setText("Usuários");

        jTbUsuarios.setModel(this.modelTbUsuarios);

        jTbUsuarios.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTbUsuarios);
        if (jTbUsuarios.getColumnModel().getColumnCount() > 0) {
            jTbUsuarios.getColumnModel().getColumn(0).setResizable(false);
            jTbUsuarios.getColumnModel().getColumn(1).setResizable(false);
            jTbUsuarios.getColumnModel().getColumn(2).setResizable(false);
        }

        jBtCadastrar.setText("Cadastrar");
        jBtCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtCadastrarActionPerformed(evt);
            }
        });

        jBtEditar.setText("Editar");
        jBtEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtEditarActionPerformed(evt);
            }
        });

        jBtVoltar.setText("Menu");
        jBtVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtVoltarActionPerformed(evt);
            }
        });

        jBtSenha.setText("Alterar Senha");
        jBtSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtSenhaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jBtVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 48, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 816, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jBtEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jBtCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jBtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(58, 58, 58))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(467, 467, 467))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabelTitle)
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jBtCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(jBtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jBtEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jBtVoltar)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtCadastrarActionPerformed
        new CadastroUsuario().setVisible(true);
        Usuarios.this.dispose();
    }//GEN-LAST:event_jBtCadastrarActionPerformed

    private void jBtEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtEditarActionPerformed
        if(jTbUsuarios.getSelectedRow() == -1){
            JOptionPane.showMessageDialog(null, "Você não selecionou um usuário");
        } else {
            Usuarios.this.dispose();
            new EdicaoUsuario(usuarios.get(jTbUsuarios.getSelectedRow())).setVisible(true);
        }
    }//GEN-LAST:event_jBtEditarActionPerformed

    private void jBtVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtVoltarActionPerformed
        new Menu().setVisible(true);
        Usuarios.this.dispose();
    }//GEN-LAST:event_jBtVoltarActionPerformed

    private void jBtSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtSenhaActionPerformed
        if (jTbUsuarios.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Você não selecionou um usuário");
            return;
        } 
        Usuario usuario = usuarios.get(this.jTbUsuarios.getSelectedRow());
        new AlteracaoSenha(usuario).setVisible(true);
    }//GEN-LAST:event_jBtSenhaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtCadastrar;
    private javax.swing.JButton jBtEditar;
    private javax.swing.JButton jBtSenha;
    private javax.swing.JButton jBtVoltar;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTbUsuarios;
    // End of variables declaration//GEN-END:variables
}
