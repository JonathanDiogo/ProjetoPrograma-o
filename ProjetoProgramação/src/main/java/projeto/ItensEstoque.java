/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class ItensEstoque extends javax.swing.JFrame {

    private void buscarItens (){ 
	try{ 
            DAO dao = new DAO(); 
            ItensEstoques [] itens = dao.obterItens(); 
            ItensCombo.setModel(new DefaultComboBoxModel<>(itens)); 
	} 
	catch (Exception e){ 
		JOptionPane.showMessageDialog(null, "Sem itens, tente "
		+ "novamente mais tarde."); 
		e.printStackTrace(); 
	} 
    }
    /**
     * Creates new form CursosTela
     */
    public ItensEstoque() {
        super("ItensEstoque");
        initComponents();
        buscarItens();
        ItensEstoques itens = (ItensEstoques) ItensCombo.getSelectedItem(); 
        iditemEstoque.setText(Integer.toString(itens.getId())); 
        nomeItem.setText(itens.getNome()); 
        valorItem.setText(itens.getValor());
        setLocationRelativeTo(null); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ItensCombo = new javax.swing.JComboBox<>();
        iditemEstoque = new javax.swing.JTextField();
        nomeItem = new javax.swing.JTextField();
        valorItem = new javax.swing.JTextField();
        addItemButtom = new javax.swing.JButton();
        cancelarItemButton = new javax.swing.JButton();
        removerItemButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 153));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBackground(new java.awt.Color(165, 180, 243));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "GERENCIAR ITENS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanel1.setDoubleBuffered(false);
        jPanel1.setEnabled(false);

        ItensCombo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ItensCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItensComboActionPerformed(evt);
            }
        });

        iditemEstoque.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "ID DO ITEM"));
        iditemEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iditemEstoqueActionPerformed(evt);
            }
        });

        nomeItem.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "NOME"));
        nomeItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeItemActionPerformed(evt);
            }
        });

        valorItem.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "VALOR"));
        valorItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valorItemActionPerformed(evt);
            }
        });

        addItemButtom.setBackground(new java.awt.Color(214, 214, 214));
        addItemButtom.setText("Novo");
        addItemButtom.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 51), new java.awt.Color(51, 51, 51), null, null));
        addItemButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addItemButtomActionPerformed(evt);
            }
        });

        cancelarItemButton.setBackground(new java.awt.Color(214, 214, 214));
        cancelarItemButton.setText("Cancelar");
        cancelarItemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarItemButtonActionPerformed(evt);
            }
        });

        removerItemButton.setBackground(new java.awt.Color(214, 214, 214));
        removerItemButton.setText("Remover");
        removerItemButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 51), new java.awt.Color(51, 51, 51), null, null));
        removerItemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerItemButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(iditemEstoque)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ItensCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(valorItem)
                            .addComponent(nomeItem)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(addItemButtom, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                                .addComponent(removerItemButton, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cancelarItemButton, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(133, 133, 133))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ItensCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(iditemEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(nomeItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(valorItem, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addItemButtom, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(removerItemButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71)
                .addComponent(cancelarItemButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(89, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ItensComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItensComboActionPerformed
        ItensEstoques itens = (ItensEstoques) ItensCombo.getSelectedItem(); 
        iditemEstoque.setText(Integer.toString(itens.getId())); 
        nomeItem.setText(itens.getNome()); 
        valorItem.setText(itens.getValor());
    }//GEN-LAST:event_ItensComboActionPerformed

    private void removerItemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerItemButtonActionPerformed
        int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover este item?"); 
        if (escolha == JOptionPane.YES_OPTION){ 
            try{ 
                int id = Integer.parseInt (iditemEstoque.getText()); 
                ItensEstoques itens = new ItensEstoques (id); 
                DAO dao = new DAO(); 
                dao.removerItens(itens); 
                JOptionPane.showMessageDialog(null, "Item removido!"); 
                buscarItens(); 
                nomeItem.setText(""); 
                valorItem.setText(""); 
                iditemEstoque.setText(""); 
            } 
            catch (Exception e){ 
                JOptionPane.showMessageDialog(null, "Falha técnica. Tente novamente " 
                    +"mais tarde."); 
                e.printStackTrace(); 
            } 
             
        }
    }//GEN-LAST:event_removerItemButtonActionPerformed

    private void cancelarItemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarItemButtonActionPerformed
        GerenciamentoTela dt = new GerenciamentoTela();
        dt.setVisible(true); 
        this.dispose();
    }//GEN-LAST:event_cancelarItemButtonActionPerformed

    private void iditemEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iditemEstoqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_iditemEstoqueActionPerformed

    private void nomeItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeItemActionPerformed

    private void valorItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valorItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valorItemActionPerformed
 
    private void addItemButtomActionPerformed(java.awt.event.ActionEvent evt) {                                                     
        
        String nome = nomeItem.getText(); 
        String valor = valorItem.getText(); 
        if (nomeItem == null || nome.length() == 0 || 
                valorItem == null || valor.length() == 0){ 
            JOptionPane.showMessageDialog (null, "Preencha nome do item e valor"); 
        } 
        else{ 
            try{ 
                int escolha = JOptionPane.showConfirmDialog(null, "Confirmar cadastro" 
                + " do item?"); 
                if (escolha == JOptionPane.YES_OPTION){ 
                    ItensEstoques itens = new ItensEstoques(nome, valor); 
                    DAO dao = new DAO(); 
                    dao.inserirItens(itens); 
                    JOptionPane.showMessageDialog(null, "Item cadastrado com" + 
                        "sucesso"); 
                    nomeItem.setText(""); 
                    valorItem.setText(""); 
                    buscarItens(); 
                }  
            } 
            catch (Exception e){ 
                JOptionPane.showMessageDialog(null, "Houve um problema ao inserir novo item"); 
                e.printStackTrace(); 
            }
        }
    }                                                    


    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ItensEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ItensEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ItensEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ItensEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ItensEstoque().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<projeto.ItensEstoques> ItensCombo;
    private javax.swing.JButton addItemButtom;
    private javax.swing.JButton cancelarItemButton;
    private javax.swing.JTextField iditemEstoque;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nomeItem;
    private javax.swing.JButton removerItemButton;
    private javax.swing.JTextField valorItem;
    // End of variables declaration//GEN-END:variables
}
