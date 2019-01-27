/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.sql.SQLException;

import javax.swing.JOptionPane;
import helpers.CaracteresHelper;
import controllers.ProdutosController;
import models.Produto;

/**
 *
 * @author victor.ananias
 */
public class EdicaoProduto extends javax.swing.JFrame {
        private int produtoId;

        /**
         * Creates new form EditarProd
         */
        public EdicaoProduto(int produtoId) {
                this.produtoId = produtoId;
                initComponents();
                // Centralizando a tela
                this.setLocationRelativeTo(null);
                this.setProduto();
        }

        /**
         * This method is called from within the constructor to initialize the form.
         * WARNING: Do NOT modify this code. The content of this method is always
         * regenerated by the Form Editor.
         */
        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated
        // Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                btGroupTipo = new javax.swing.ButtonGroup();
                jPanel1 = new javax.swing.JPanel();
                jLabel1 = new javax.swing.JLabel();
                jLabel2 = new javax.swing.JLabel();
                jLabel4 = new javax.swing.JLabel();
                jTextPrecoProd = new javax.swing.JTextField();
                jBtSalvar = new javax.swing.JButton();
                jLabel5 = new javax.swing.JLabel();
                jRBtPerecivel = new javax.swing.JRadioButton();
                jRBtN = new javax.swing.JRadioButton();
                jTextNome = new javax.swing.JTextField();
                jLabelAviso1 = new javax.swing.JLabel();
                jBtVoltar = new javax.swing.JButton();
                jLabel6 = new javax.swing.JLabel();
                jTextCodProd = new javax.swing.JTextField();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                setTitle("Editar Produto");

                jPanel1.setBackground(new java.awt.Color(255, 255, 255));
                jPanel1.setPreferredSize(new java.awt.Dimension(800, 450));

                jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
                jLabel1.setText("Editar Produto");

                jLabel2.setText("Nome do Produto:");

                jLabel4.setText("Preço:");

                jTextPrecoProd.setPreferredSize(new java.awt.Dimension(10, 25));
                jTextPrecoProd.addKeyListener(new java.awt.event.KeyAdapter() {
                        public void keyTyped(java.awt.event.KeyEvent evt) {
                                jTextPrecoProdKeyTyped(evt);
                        }
                });

                jBtSalvar.setText("Salvar");
                jBtSalvar.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jBtSalvarActionPerformed(evt);
                        }
                });

                jLabel5.setText("Tipo:");

                btGroupTipo.add(jRBtPerecivel);
                jRBtPerecivel.setSelected(true);
                jRBtPerecivel.setText("Perecível");
                jRBtPerecivel.setActionCommand("P");

                btGroupTipo.add(jRBtN);
                jRBtN.setText("Não Perecível");
                jRBtN.setActionCommand("N");

                jTextNome.addFocusListener(new java.awt.event.FocusAdapter() {
                        public void focusLost(java.awt.event.FocusEvent evt) {
                                jTextNomeFocusLost(evt);
                        }
                });
                jTextNome.addKeyListener(new java.awt.event.KeyAdapter() {
                        public void keyTyped(java.awt.event.KeyEvent evt) {
                                jTextNomeKeyTyped(evt);
                        }
                });

                jLabelAviso1.setFont(new java.awt.Font("Cantarell", 0, 12)); // NOI18N
                jLabelAviso1.setForeground(java.awt.Color.red);

                jBtVoltar.setText("Voltar");
                jBtVoltar.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jBtVoltarActionPerformed(evt);
                        }
                });

                jLabel6.setText("Código do Produto: ");

                jTextCodProd.setEditable(false);
                jTextCodProd.setEnabled(false);
                jTextCodProd.setPreferredSize(new java.awt.Dimension(80, 25));

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(jPanel1Layout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout
                                                .createSequentialGroup().addGap(0, 209, Short.MAX_VALUE)
                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                .addComponent(jBtSalvar,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                105,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addComponent(jLabel5)
                                                                                .addPreferredGap(
                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                                67, Short.MAX_VALUE)
                                                                                .addComponent(jRBtPerecivel)
                                                                                .addGap(18, 18, 18).addComponent(jRBtN))
                                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addGroup(jPanel1Layout
                                                                                                .createParallelGroup(
                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                .addComponent(jLabel2,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                Short.MAX_VALUE)
                                                                                                .addComponent(jLabel6,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                Short.MAX_VALUE)
                                                                                                .addComponent(jLabel4,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                Short.MAX_VALUE))
                                                                                .addGap(26, 26, 26)
                                                                                .addGroup(jPanel1Layout
                                                                                                .createParallelGroup(
                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                false)
                                                                                                .addComponent(jTextPrecoProd,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                Short.MAX_VALUE)
                                                                                                .addComponent(jTextNome)
                                                                                                .addComponent(jTextCodProd,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                150,
                                                                                                                Short.MAX_VALUE))))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabelAviso1, javax.swing.GroupLayout.PREFERRED_SIZE, 154,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(94, 94, 94))
                                .addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup().addContainerGap()
                                                                .addComponent(jBtVoltar,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                115,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel1Layout.createSequentialGroup().addGap(296, 296, 296)
                                                                .addComponent(jLabel1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                173,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(0, 0, Short.MAX_VALUE)));
                jPanel1Layout.setVerticalGroup(jPanel1Layout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup().addGap(73, 73, 73).addComponent(jLabel1)
                                                .addGap(34, 34, 34)
                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jLabel6).addComponent(jTextCodProd,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jTextNome,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                25,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jLabel2))
                                                                .addComponent(jLabelAviso1,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jTextPrecoProd,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jLabel4))
                                                .addGap(22, 22, 22)
                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jLabel5).addComponent(jRBtPerecivel)
                                                                .addComponent(jRBtN))
                                                .addGap(26, 26, 26).addComponent(jBtSalvar)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76,
                                                                Short.MAX_VALUE)
                                                .addComponent(jBtVoltar).addContainerGap()));

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 799,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 1, Short.MAX_VALUE)));
                layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 449,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE)));

                pack();
        }// </editor-fold>//GEN-END:initComponents

        private void jTextPrecoProdKeyTyped(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_jTextPrecoProdKeyTyped
                // if(!(conversorCaracteres.getNUMEROS()+",").contains(
                // (evt.getKeyChar()+""))){
                // evt.consume();
                // }
        }// GEN-LAST:event_jTextPrecoProdKeyTyped

    private void setProduto() {

        Produto produto = new Produto();

        try {
            produto = new ProdutosController().buscarProduto(produtoId);
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Erro ao buscar produto.");
        }

        jTextCodProd.setText(produtoId + "");
        jTextNome.setText(String.valueOf(produto.getNome()));
        jTextPrecoProd.setText(String.valueOf(CaracteresHelper.addMascaraMonetaria(produto.getValor())));
    }

    private void verificaCampoNome() {
        if (jTextNome.getText().equals("")) {
            jLabelAviso1.setText("Campo Obrigatório");
        } else {
            jLabelAviso1.setText("");
        }
    }

    private void jBtSalvarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jBtSalvarActionPerformed
        Produto produto = new Produto();

        this.verificaCampoNome();
        if (!jTextNome.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "O campo \"Nome do Produto\"\n" + "precisa ser preenchido.", "Aviso",
                    JOptionPane.INFORMATION_MESSAGE);
        }

        if (jTextPrecoProd.getText().equals("")) {
            jTextPrecoProd.setText("0");
        }

        try {
            new ProdutosController().atualizarProduto(
                produtoId, 
                jTextNome.getText(),
                btGroupTipo.getSelection().getActionCommand(), 
                produto.getQuantidade(),
                CaracteresHelper.rmMascaraMonetaria(jTextPrecoProd.getText())
            );

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao atualizar produto", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        }

        JOptionPane.showMessageDialog(null, "Informações Atualizadas", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        
    }// GEN-LAST:event_jBtSalvarActionPerformed

    private void jTextNomeFocusLost(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_jTextNomeFocusLost
        this.verificaCampoNome();
    }// GEN-LAST:event_jTextNomeFocusLost

    private void jTextNomeKeyTyped(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_jTextNomeKeyTyped
        // if(!(evt.getKeyChar()+"").equals(" ")){
        // String texto = jTextNome.getText();
        // String letra = conversorCaracteres.verificaLetra(evt);
        // evt.consume();
        // jTextNome.setText(texto + letra);
        // }
    }// GEN-LAST:event_jTextNomeKeyTyped

    private void jBtVoltarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jBtVoltarActionPerformed
        EdicaoProduto.this.dispose();
        new Estoque().setVisible(true);
    }// GEN-LAST:event_jBtVoltarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btGroupTipo;
    private javax.swing.JButton jBtSalvar;
    private javax.swing.JButton jBtVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelAviso1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRBtN;
    private javax.swing.JRadioButton jRBtPerecivel;
    private javax.swing.JTextField jTextCodProd;
    private javax.swing.JTextField jTextNome;
    private javax.swing.JTextField jTextPrecoProd;
    // End of variables declaration//GEN-END:variables
}
