/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.simed.view;


import br.com.simed.crud.CadastroCidade;
import br.com.simed.crud.CadastroEstados;
import br.com.simed.model.Cidade;
import br.com.simed.model.Estado;
import br.com.simed.model.Tabela;
import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;

/**
 *
 * @author Ranster
 */
public class JIFrameCadastroCidade extends javax.swing.JInternalFrame {

    /**
     * Creates new form JIFrameCadastroCidade
     */
    public JIFrameCadastroCidade() {
        initComponents();
        TabelaCidadeCadastrados();
        
        }
    
    
    
    public void listarSigla(){
         
          CadastroCidade c = new CadastroCidade();
          c.listaEstado(CBEstado);
          
     } 
    
    
public void setPosicao() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2);

    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        CBEstado = new javax.swing.JComboBox<>();
        jButton_Novo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jText_NomeCidade = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton_Salvar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Cidades_Cadastrados = new javax.swing.JTable();
        jButton_Sair = new javax.swing.JButton();
        jButton_Excluir = new javax.swing.JButton();
        jButton_Ignorar = new javax.swing.JButton();
        jText_Buscar_Nome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jText_IdCidade = new javax.swing.JTextField();

        setTitle("Cadastro de Cidades - SIMED");

        CBEstado.setEnabled(false);
        CBEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBEstadoActionPerformed(evt);
            }
        });

        jButton_Novo.setText("novo");
        jButton_Novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_NovoActionPerformed(evt);
            }
        });

        jLabel1.setText("Nome: ");

        jText_NomeCidade.setEnabled(false);

        jLabel2.setText("Estado: ");

        jButton_Salvar.setText("Salvar");
        jButton_Salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SalvarActionPerformed(evt);
            }
        });

        jTable_Cidades_Cadastrados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable_Cidades_Cadastrados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_Cidades_CadastradosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_Cidades_Cadastrados);

        jButton_Sair.setText("Sair");
        jButton_Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SairActionPerformed(evt);
            }
        });

        jButton_Excluir.setText("Excluir");
        jButton_Excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ExcluirActionPerformed(evt);
            }
        });

        jButton_Ignorar.setText("Ignorar");
        jButton_Ignorar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_IgnorarActionPerformed(evt);
            }
        });

        jText_Buscar_Nome.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jText_Buscar_NomeCaretUpdate(evt);
            }
        });

        jLabel3.setText("ID Estado:");

        jText_IdCidade.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 494, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton_Sair, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jText_Buscar_Nome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jText_NomeCidade)
                                    .addComponent(CBEstado, 0, 201, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton_Novo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton_Salvar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton_Excluir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton_Ignorar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jText_IdCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jText_IdCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jText_NomeCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(CBEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Novo)
                    .addComponent(jButton_Salvar)
                    .addComponent(jButton_Excluir)
                    .addComponent(jButton_Ignorar))
                .addGap(8, 8, 8)
                .addComponent(jText_Buscar_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton_Sair)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CBEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBEstadoActionPerformed

    private void jButton_NovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_NovoActionPerformed
        listarSigla();
        novo();
        TabelaCidadeCadastrados();
        limparCampos();
    }//GEN-LAST:event_jButton_NovoActionPerformed

    private void jButton_SalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SalvarActionPerformed
         if(!(jText_IdCidade.getText().isEmpty() | jText_NomeCidade.getText().isEmpty()| CBEstado.getSelectedItem().toString().isEmpty())){
            atualizar();
            novo();
            TabelaCidadeCadastrados();
        }else{
            salvar();
            novo();
            TabelaCidadeCadastrados();
        }
        
    }//GEN-LAST:event_jButton_SalvarActionPerformed

    private void jButton_IgnorarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_IgnorarActionPerformed
        limparCampos();

    }//GEN-LAST:event_jButton_IgnorarActionPerformed

    private void jTable_Cidades_CadastradosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_Cidades_CadastradosMouseClicked
       if(evt.getClickCount() == 2) {
            
            
            int linha = jTable_Cidades_Cadastrados.getSelectedRow();
            jText_IdCidade.setText(String.valueOf(jTable_Cidades_Cadastrados.getValueAt(linha, 0)));      
            jText_NomeCidade.setText(String.valueOf(jTable_Cidades_Cadastrados.getValueAt(linha, 1)));
            CBEstado.setSelectedItem(String.valueOf(jTable_Cidades_Cadastrados.getValueAt(linha, 2)));

          //  CBEstado.getSelectedItem().toString(jTable_Cidades_Cadastrados.getValueAt(linha, 1));
            
            
        }
    }//GEN-LAST:event_jTable_Cidades_CadastradosMouseClicked

    private void jButton_ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ExcluirActionPerformed
                excluir();
                TabelaCidadeCadastrados();
    }//GEN-LAST:event_jButton_ExcluirActionPerformed

    private void jButton_SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SairActionPerformed
        dispose();
        JFramePrincipal.setTelaNull();
    }//GEN-LAST:event_jButton_SairActionPerformed

    private void jText_Buscar_NomeCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jText_Buscar_NomeCaretUpdate
        TabelaCidadeCadastrados();
    }//GEN-LAST:event_jText_Buscar_NomeCaretUpdate


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Object> CBEstado;
    private javax.swing.JButton jButton_Excluir;
    private javax.swing.JButton jButton_Ignorar;
    private javax.swing.JButton jButton_Novo;
    private javax.swing.JButton jButton_Sair;
    private javax.swing.JButton jButton_Salvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable_Cidades_Cadastrados;
    private javax.swing.JTextField jText_Buscar_Nome;
    private javax.swing.JTextField jText_IdCidade;
    private javax.swing.JTextField jText_NomeCidade;
    // End of variables declaration//GEN-END:variables

private void novo() {
        limparCampos();
        jText_NomeCidade.setEnabled(true);
        CBEstado.setEnabled(true);

    }

 private void limparCampos() {
      jText_NomeCidade.setText("");
      jText_IdCidade.setText("");
      CBEstado.setSelectedItem("");

       // jText_NomeCidade.setEditable(false);
        //CBEstado.setEditable(false);
        TabelaCidadeCadastrados();

       
    }
  private void salvar() {
        
        if(!(jText_NomeCidade.getText().isEmpty() | CBEstado.getSelectedItem().toString().isEmpty())){
            Cidade cidade = new Cidade();
            
            cidade.setNome(jText_NomeCidade.getText().trim().toUpperCase());
            int codEstado = ((Estado) CBEstado.getSelectedItem()).getCodigoEstado();
            cidade.setCodigoEstado(codEstado);

            CadastroCidade cadastrar = new CadastroCidade();
            cadastrar.IncluirCidade(cidade);
            novo();
        }else{
            JOptionPane.showMessageDialog(this, "Dados Inválidos");
        }
     

    }
  
 public void TabelaCidadeCadastrados() {
        
        Cidade cidade = new Cidade();
        CadastroCidade cidades_cadastrados = new CadastroCidade();
        cidade.setNome(jText_Buscar_Nome.getText().toUpperCase().trim());
        
        ArrayList dados = cidades_cadastrados.listarCidade(cidade);
        String[] colunas = new String[]{"ID", "NOME", "ID_ESTADO"};
        Tabela modelo = new Tabela(dados, colunas);
        jTable_Cidades_Cadastrados.setModel(modelo);
        jTable_Cidades_Cadastrados.getColumnModel().getColumn(0).setPreferredWidth(80);
        jTable_Cidades_Cadastrados.getColumnModel().getColumn(0).setResizable(false);
        jTable_Cidades_Cadastrados.getColumnModel().getColumn(1).setPreferredWidth(290);
        jTable_Cidades_Cadastrados.getColumnModel().getColumn(1).setResizable(false);
        jTable_Cidades_Cadastrados.getColumnModel().getColumn(2).setPreferredWidth(80);
        jTable_Cidades_Cadastrados.getColumnModel().getColumn(2).setResizable(false);
       
        jTable_Cidades_Cadastrados.getTableHeader().setReorderingAllowed(false);
        jTable_Cidades_Cadastrados.setAutoResizeMode(jTable_Cidades_Cadastrados.AUTO_RESIZE_OFF);
        jTable_Cidades_Cadastrados.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

    }
    private void excluir() {
        if (!(jText_NomeCidade.getText().isEmpty() && CBEstado.getSelectedItem().toString().isEmpty())) {

            int opcao = JOptionPane.showConfirmDialog(this, "Deseja Realmente Excluir este Registro", "", JOptionPane.YES_NO_OPTION);
            boolean resposta;
            resposta = opcao == JOptionPane.YES_OPTION;
            if (resposta) {
                Cidade cidade = new Cidade();
                cidade.setCodigocidade(Integer.valueOf(jText_IdCidade.getText().trim()));

                CadastroCidade excluir_cidade = new CadastroCidade();
               excluir_cidade.excluirCidade(cidade);
                limparCampos();
            }

        }else{
            JOptionPane.showMessageDialog(this, "Nenhum Registro Foi Selecionado ...");
        }
    }
       private void atualizar() {
        
        if(!(jText_NomeCidade.getText().isEmpty() | CBEstado.getSelectedItem().toString().isEmpty())){
            Cidade cidade = new Cidade();
            cidade.setNome(jText_NomeCidade.getText().trim().toUpperCase());
            int codEstado = ((Estado) CBEstado.getSelectedItem()).getCodigoEstado();
            cidade.setCodigoEstado(codEstado);
            cidade.setCodigocidade(Integer.valueOf(jText_IdCidade.getText().trim()));
            

            CadastroCidade atualizar = new CadastroCidade();
            atualizar.atualizarCidade(cidade);
            novo();
        }else{
            JOptionPane.showMessageDialog(this, "Dados Inválidos");
        }
    }

}
