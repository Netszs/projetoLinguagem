/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package br.com.lanchonete.view;

import br.com.lanchonete.modelo.Cliente;
import br.com.lanchonete.rdn.PedidoRdn;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sebas
 */
public class FrmPedido extends javax.swing.JInternalFrame {
    
    ArrayList<Cliente> lstCliente;

    boolean modoAlterarDeletar = false;
    int id = 0;
    int indiceLista = 0;
    
    public FrmPedido() {
        
        lstCliente = new ArrayList<Cliente>();
        
        initComponents();
        
        this.modoNovo();

        this.carregarTabela();
    }

    
    @SuppressWarnings("unchecked")
    
    private void modoNovo() {
        //LIMPAR OS CAMPOS
        txtNome.setText("");
        txtPedido.setText("");
        txtLanche.setText("");
        txtDescricao.setText("");

        //DESABILITAR OS CAMPOS
        txtNome.setEnabled(false);
        txtPedido.setEnabled(false);
        txtLanche.setEnabled(false);
        txtDescricao.setEnabled(false);

        btnNovo.setText("Salvar");
        //DESABILITAR OS BOTÕES
        btnAlterar.setEnabled(false);
        btnDeletar.setEnabled(false);
    }
    
    private void habilitarCampos() {

        txtNome.setEnabled(true);
        txtPedido.setEnabled(true);
        txtLanche.setEnabled(true);
        txtDescricao.setEnabled(true);
    }
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnNovo = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnDeletar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablePedido = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtLanche = new javax.swing.JTextField();
        txtDescricao = new javax.swing.JTextField();
        txtPedido = new javax.swing.JTextField();

        jButton1.setText("jButton1");

        setTitle("Pedido do Cliente");
        setName(""); // NOI18N

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnNovo.setText("Adicionar");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnDeletar.setText("Deletar");
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(278, 278, 278)
                .addComponent(btnNovo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(263, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo)
                    .addComponent(btnAlterar)
                    .addComponent(btnDeletar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        TablePedido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Cliente", "Lanche", "Descrição", "Número Pedido"
            }
        ));
        TablePedido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablePedidoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablePedido);

        jLabel1.setText("Nome Cliente:");

        jLabel2.setText("Lanche:");

        jLabel3.setText("Descrição:");

        jLabel4.setText("Número do Pedido");

        txtDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescricaoActionPerformed(evt);
            }
        });

        txtPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPedidoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtLanche, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLanche, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(txtPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescricaoActionPerformed

    private void txtPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPedidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPedidoActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        int idCli = 0;

        if (this.modoAlterarDeletar == true) {
            idCli = this.id;

        } else {
            idCli = 0;
        }

        Cliente cliente = new Cliente(idCli, txtNome.getText());

        PedidoRdn cliRdn = new PedidoRdn();

        if (this.modoAlterarDeletar == true) {

            //ALTERO O VALOR NA POSIÇÃO DA LISTA
            //lstCliente.set(this.indiceLista, cliente);
            cliRdn.alterarCliente(cliente);
            btnNovo.setEnabled(true);

        } else {
            //lstCliente.add(cliente);            
            cliRdn.inserirCliente(cliente);

        }

        this.modoAlterarDeletar = false;
        this.carregarTabela();

        this.modoNovo();
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        //HABILITAR OS CAMPOS
        this.habilitarCampos();
        //DESABILITAR OS BOTÕES
        btnAlterar.setEnabled(true);
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        /// 0=yes, 1=no, 2=cancel
        int input = JOptionPane.showConfirmDialog(null,
                "Deseja realmente excluir?", "Atenção!!!", JOptionPane.YES_NO_OPTION);

        if (input == 0) {
            
            PedidoRdn rdn = new PedidoRdn();

            rdn.deletarCliente(this.id);

            this.carregarTabela();

        }
        this.modoNovo();
    }//GEN-LAST:event_btnDeletarActionPerformed

    private void TablePedidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablePedidoMouseClicked
        this.modoAlterarDeletar = true;

        //PEGA A LINHA SELECIONADA
        int row = this.TablePedido.getSelectedRow();

        //RECUPERA O VALOr DA COLUNA ID ESTA NA 0
        int idCliente = (int) this.TablePedido.getValueAt(row, 0);

        //GUARDA O ID PARA ALTERAR/REMOVER
        this.id = idCliente;

        //int indice = 0;
        PedidoRdn rdn = new PedidoRdn();

        //RECUPERAR POR ID
        Cliente cliente = rdn.obterPorId(id);

        /*for (int i = 0; i < lstCliente.size(); i++) {

            if (lstCliente.get(i).getId().equals(idCliente)) {

                cliente = lstCliente.get(i);
                indice = i;
                break;
            }
        }
        this.indiceLista = indice;*/
        txtNome.setText(cliente.getNome());
        

        
        this.habilitarCampos();

        btnNovo.setEnabled(true);

        btnAlterar.setEnabled(false);

        btnDeletar.setEnabled(true);

        btnAlterar.setText("Alterar");
    }//GEN-LAST:event_TablePedidoMouseClicked


    private void carregarTabela() {

        //CLASSE USADA PARA MANIPULAR A TABELA
        DefaultTableModel model = (DefaultTableModel) TablePedido.getModel();

        //limpar a tabela antes de selecionar
        model.setRowCount(0);

        PedidoRdn cliRdn = new PedidoRdn();

        List<Cliente> lstCli = cliRdn.obterTodos();

        //para cada cliente da lista
        for (Cliente cli : lstCli) {
            //adicionar a linha
            model.addRow(new Object[]{
                cli.getId(),
                cli.getNome()
            });
        }

        TablePedido.setModel(model);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablePedido;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtLanche;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPedido;
    // End of variables declaration//GEN-END:variables
}
