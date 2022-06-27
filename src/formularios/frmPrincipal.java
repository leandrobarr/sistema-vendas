/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

import classes.BackGround;
import classes.Dados;

/**
 *
 * @author Leandro
 */
public class frmPrincipal extends javax.swing.JFrame {
    private Dados msDados;
    
    public void setDados(Dados msDados) {
        this.msDados = msDados;
    }
   
    public frmPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dpnDesktop = new BackGround();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuArquivo = new javax.swing.JMenu();
        mnuArquivoClientes = new javax.swing.JMenuItem();
        mnuArquivoProdutos = new javax.swing.JMenuItem();
        mnuArquivoUsuarios = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnuArquivoTrocarSenha = new javax.swing.JMenuItem();
        mnuArquivoTrocarUsuario = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        mnuArquivoSair = new javax.swing.JMenuItem();
        mnuMovimento = new javax.swing.JMenu();
        mnuMovimentoNovaVenda = new javax.swing.JMenuItem();
        mnuMovimentoRelatorioVenda = new javax.swing.JMenuItem();
        mnuAjuda = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Vendas :");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        dpnDesktop.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout dpnDesktopLayout = new javax.swing.GroupLayout(dpnDesktop);
        dpnDesktop.setLayout(dpnDesktopLayout);
        dpnDesktopLayout.setHorizontalGroup(
            dpnDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 782, Short.MAX_VALUE)
        );
        dpnDesktopLayout.setVerticalGroup(
            dpnDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 425, Short.MAX_VALUE)
        );

        mnuArquivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/arquivo.png"))); // NOI18N
        mnuArquivo.setText("Arquivos");
        mnuArquivo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        mnuArquivoClientes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mnuArquivoClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cliente.png"))); // NOI18N
        mnuArquivoClientes.setText("Clientes");
        mnuArquivoClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuArquivoClientesActionPerformed(evt);
            }
        });
        mnuArquivo.add(mnuArquivoClientes);

        mnuArquivoProdutos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mnuArquivoProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/produto.png"))); // NOI18N
        mnuArquivoProdutos.setText("Produtos");
        mnuArquivoProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuArquivoProdutosActionPerformed(evt);
            }
        });
        mnuArquivo.add(mnuArquivoProdutos);

        mnuArquivoUsuarios.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mnuArquivoUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/usuario.png"))); // NOI18N
        mnuArquivoUsuarios.setText("Usuários");
        mnuArquivoUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuArquivoUsuariosActionPerformed(evt);
            }
        });
        mnuArquivo.add(mnuArquivoUsuarios);
        mnuArquivo.add(jSeparator1);

        mnuArquivoTrocarSenha.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mnuArquivoTrocarSenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/trocar_senha.png"))); // NOI18N
        mnuArquivoTrocarSenha.setText("Trocar Senha");
        mnuArquivo.add(mnuArquivoTrocarSenha);

        mnuArquivoTrocarUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mnuArquivoTrocarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/trocar_usuario.png"))); // NOI18N
        mnuArquivoTrocarUsuario.setText("Trocar Usuário");
        mnuArquivoTrocarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuArquivoTrocarUsuarioActionPerformed(evt);
            }
        });
        mnuArquivo.add(mnuArquivoTrocarUsuario);
        mnuArquivo.add(jSeparator2);

        mnuArquivoSair.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mnuArquivoSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sair1.png"))); // NOI18N
        mnuArquivoSair.setText("Sair");
        mnuArquivoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuArquivoSairActionPerformed(evt);
            }
        });
        mnuArquivo.add(mnuArquivoSair);

        jMenuBar1.add(mnuArquivo);

        mnuMovimento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/relatorio.png"))); // NOI18N
        mnuMovimento.setText("Movimentos");
        mnuMovimento.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        mnuMovimentoNovaVenda.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mnuMovimentoNovaVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Nova_Venda.png"))); // NOI18N
        mnuMovimentoNovaVenda.setText("Nova Venda");
        mnuMovimento.add(mnuMovimentoNovaVenda);

        mnuMovimentoRelatorioVenda.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mnuMovimentoRelatorioVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Relatorio_Vendas.png"))); // NOI18N
        mnuMovimentoRelatorioVenda.setText("Relatório Venda");
        mnuMovimento.add(mnuMovimentoRelatorioVenda);

        jMenuBar1.add(mnuMovimento);

        mnuAjuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ajuda1.png"))); // NOI18N
        mnuAjuda.setText("Ajuda");
        mnuAjuda.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jMenuItem1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sobre.png"))); // NOI18N
        jMenuItem1.setText("Sobre");
        mnuAjuda.add(jMenuItem1);

        jMenuItem2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ajuda.png"))); // NOI18N
        jMenuItem2.setText("Dúvidas");
        mnuAjuda.add(jMenuItem2);

        jMenuBar1.add(mnuAjuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dpnDesktop)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dpnDesktop)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuArquivoProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuArquivoProdutosActionPerformed
        frmProdutos msProdutos = new frmProdutos();
        msProdutos.setDados(msDados);
        dpnDesktop.add(msProdutos);
        msProdutos.show();
    }//GEN-LAST:event_mnuArquivoProdutosActionPerformed

    private void mnuArquivoTrocarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuArquivoTrocarUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuArquivoTrocarUsuarioActionPerformed

    private void mnuArquivoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuArquivoSairActionPerformed
        msDados.salvarTudo();
        System.exit(0);
    }//GEN-LAST:event_mnuArquivoSairActionPerformed

    private void mnuArquivoUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuArquivoUsuariosActionPerformed
      frmUsuarios msUsuarios = new frmUsuarios();
      msUsuarios.setDados(msDados);
      dpnDesktop.add(msUsuarios);
      msUsuarios.show();
    }//GEN-LAST:event_mnuArquivoUsuariosActionPerformed

    private void mnuArquivoClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuArquivoClientesActionPerformed
      frmClientes msClientes = new frmClientes();
      msClientes.setDados(msDados);
      dpnDesktop.add(msClientes);
      msClientes.show();
    }//GEN-LAST:event_mnuArquivoClientesActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        ((BackGround)dpnDesktop).setImagem("/images/background.jpg");
    }//GEN-LAST:event_formWindowOpened

    
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
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane dpnDesktop;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JMenu mnuAjuda;
    private javax.swing.JMenu mnuArquivo;
    private javax.swing.JMenuItem mnuArquivoClientes;
    private javax.swing.JMenuItem mnuArquivoProdutos;
    private javax.swing.JMenuItem mnuArquivoSair;
    private javax.swing.JMenuItem mnuArquivoTrocarSenha;
    private javax.swing.JMenuItem mnuArquivoTrocarUsuario;
    private javax.swing.JMenuItem mnuArquivoUsuarios;
    private javax.swing.JMenu mnuMovimento;
    private javax.swing.JMenuItem mnuMovimentoNovaVenda;
    private javax.swing.JMenuItem mnuMovimentoRelatorioVenda;
    // End of variables declaration//GEN-END:variables
}