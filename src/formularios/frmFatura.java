
package formularios;

import classes.Dados;
import classes.Opcoes;
import classes.Utilidades;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class frmFatura extends javax.swing.JInternalFrame {
    private Dados msDados;
    private DefaultTableModel mTabela;
    
    public void setDados(Dados msDados) {
        this.msDados = msDados;
    }
    public frmFatura() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtData = new javax.swing.JTextField();
        cmbProduto = new javax.swing.JComboBox<>();
        cmbCliente = new javax.swing.JComboBox<>();
        txtQuantidade = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDetalhes = new javax.swing.JTable();
        btnAdicionar = new javax.swing.JButton();
        btnDeletar = new javax.swing.JButton();
        btnDeletarTudo = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnPesqCliente = new javax.swing.JButton();
        btnPesqProduto = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtQuant = new javax.swing.JTextField();
        txtValor = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Formulário de Vendas :");
        setToolTipText("");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("Data :");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 255));
        jLabel2.setText("Cliente :");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 255));
        jLabel3.setText("Produto :");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 255));
        jLabel4.setText("Quantidade :");

        txtData.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtData.setForeground(new java.awt.Color(51, 51, 255));
        txtData.setEnabled(false);
        txtData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataActionPerformed(evt);
            }
        });

        cmbProduto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cmbProduto.setForeground(new java.awt.Color(51, 51, 255));

        cmbCliente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cmbCliente.setForeground(new java.awt.Color(51, 51, 255));

        txtQuantidade.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtQuantidade.setForeground(new java.awt.Color(51, 51, 255));
        txtQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuantidadeActionPerformed(evt);
            }
        });

        tblDetalhes.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tblDetalhes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblDetalhes);

        btnAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/somar.png"))); // NOI18N
        btnAdicionar.setToolTipText("ADICIONAR PRODUTO");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        btnDeletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/excluir (2).png"))); // NOI18N
        btnDeletar.setToolTipText("EXCLUIR PRODUTO");

        btnDeletarTudo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/excluir_tudo.png"))); // NOI18N
        btnDeletarTudo.setToolTipText("EXCLUIR TODOS OS PRODUTOS");

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/salvar3.png"))); // NOI18N
        btnSalvar.setToolTipText("SALVAR VENDA");
        btnSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btnPesqCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pesquisar3.png"))); // NOI18N
        btnPesqCliente.setToolTipText("PESQUISAR CLIENTE");

        btnPesqProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pesquisar3.png"))); // NOI18N
        btnPesqProduto.setToolTipText("PESQUISAR PRODUTO");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("Total :");

        txtQuant.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtQuant.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtQuant.setEnabled(false);
        txtQuant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuantActionPerformed(evt);
            }
        });

        txtValor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtValor.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtValor.setEnabled(false);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/vendas.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 693, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(27, 27, 27)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(btnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(42, 42, 42)
                                                    .addComponent(btnDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(btnDeletarTudo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(43, 43, 43)))
                                            .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(cmbProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cmbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(btnPesqCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnPesqProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                                .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(32, 32, 32)
                            .addComponent(jLabel6))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(373, 373, 373)
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtQuant, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cmbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPesqCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cmbProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3))
                            .addComponent(btnPesqProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAdicionar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnDeletarTudo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtQuant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        
        
        Opcoes opc = new Opcoes("leandrobarr@yahoo.com.br","SELECIONE UM CLIENTE");
        cmbCliente.addItem(opc.toString());
        for (int i = 0; i<msDados.numeroClientes(); i++) {
            opc = new Opcoes(
            msDados.getClientes()[i].getIdCliente(), 
            msDados.getClientes()[i].getNome()+""+
            msDados.getClientes()[i].getSobrenome());
            cmbCliente.addItem(opc.toString());
            
        }
        
        opc = new Opcoes("leandrobarr@yahoo.com.br","SELECIONE UM PRODUTO");
        cmbProduto.addItem(opc.toString());
        for (int i = 0; i<msDados.numeroProdutos(); i++) {
            opc = new Opcoes(
            msDados.getProdutos()[i].getIdProduto(), 
            msDados.getProdutos()[i].getDescricao());
            cmbProduto.addItem(opc.toString());
            
            
        }
        
        txtData.setText(Utilidades.formatDate(new Date()));
        txtQuant.setText("0");
        txtValor.setText("0");
        
        preencherTabela();
    }//GEN-LAST:event_formInternalFrameOpened

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        
        if(cmbProduto.getSelectedIndex()==0) {
            JOptionPane.showMessageDialog(rootPane, "FAVOR SELECIONAR UM PRODUTO");
            cmbProduto.requestFocusInWindow();
            return;
        }
        if(txtQuantidade.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "FAVOR DIGITAR UMA QUANTIDADE");
            txtQuantidade.requestFocusInWindow();
            return;
        }
        if(!Utilidades.isNumeric(txtQuantidade.getText())) {
            JOptionPane.showMessageDialog(rootPane, "Favor digitar números numéricos");
            txtQuantidade.setText("");
            txtQuantidade.requestFocusInWindow();
            return;
        }
        
        int quantidade = Integer.parseInt(txtQuantidade.getText());
        if (quantidade <= 0) {
            JOptionPane.showMessageDialog(rootPane, "Favor digitar valores acima de zero");
            txtQuantidade.requestFocusInWindow();
            txtQuantidade.setText("");
            return;
        }
        
        int pos = msDados.posicaoProduto(((Opcoes)cmbProduto.getSelectedItem()).getValor());
        
        String registro[] = new String[5];
        registro[0] = msDados.getProdutos()[pos].getIdProduto();
        registro[1] = msDados.getProdutos()[pos].getDescricao();
        registro[2] = ""+ msDados.getProdutos()[pos].getPreco();
        registro[3] = ""+ quantidade;
        registro[4] = ""+ (quantidade* msDados.getProdutos()[pos].getPreco());
        mTabela.addRow(registro);
        
        cmbProduto.setSelectedIndex(0);
        txtQuantidade.setText("");
        cmbProduto.requestFocusInWindow();
        
       
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void txtQuantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuantActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQuantActionPerformed

    private void txtQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuantidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQuantidadeActionPerformed

    private void txtDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnDeletarTudo;
    private javax.swing.JButton btnPesqCliente;
    private javax.swing.JButton btnPesqProduto;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> cmbCliente;
    private javax.swing.JComboBox<String> cmbProduto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDetalhes;
    private javax.swing.JTextField txtData;
    private javax.swing.JTextField txtQuant;
    private javax.swing.JTextField txtQuantidade;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
    
    private void preencherTabela() {
        String titulos[] = {"ID PRODUTO", "DESCRIÇÃO", "PREÇO", "QTDE","VALOR"};
        String registro[] = new String[5];
        mTabela = new DefaultTableModel(null, titulos);
        tblDetalhes.setModel(mTabela);
       
    }
       
}



