/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.FRimoveis.telas;

import br.com.FRimoveis.Conexao.ConexaoBD;
import br.com.FRimoveis.Desenvolvimento.CadastroImoveis;
import br.com.FRimoveis.Desenvolvimento.CadastroImoveisTabela;
import br.com.FRimoveis.dao.CadastroImoveisDB;
import java.awt.Toolkit;
import java.io.IOException;
import java.net.URISyntaxException;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author rodrigolima
 */
public class TelaCadastroImoveis extends javax.swing.JFrame {

    CadastroImoveis cadastroimoveis = new CadastroImoveis();
    CadastroImoveisDB cadastroimoveisDB = new CadastroImoveisDB();
    ConexaoBD conexao = new ConexaoBD();
    int update_sel = 0;

    /**
     * Creates new form TelaCadastroImoveis
     */
    public TelaCadastroImoveis() {
        setIcon();
        initComponents();
        txtIDImovel.setEnabled(false);
        txtUrlImagens.setEnabled(false);
        txtMatriculaImovel.setEnabled(false);
        cbStatusImovel.setEnabled(false);
        txtEnderecoImovel.setEnabled(false);
        txtBairroImovel.setEnabled(false);
        txtCepImovel.setEnabled(false);
        txtNumeroImovel.setEnabled(false);
        txtValorAlugel.setEnabled(false);
        btnSalvarImovel.setEnabled(false);
        btnCancelarImovel.setEnabled(false);
        btnEditarImovel.setEnabled(false);
        btnExcluirImovel.setEnabled(false);
        btnAbrirImagens.setEnabled(false);
        cbStatusImovel.removeAllItems();
        cbStatusImovel.addItem("");
        cbStatusImovel.addItem("LIVRE");
        cbStatusImovel.addItem("ALUGADO");

        MaskFormatter cep = null;

        try {
            txtCepImovel.setValue(null);
            cep = new MaskFormatter("#####-###");
            cep.setPlaceholderCharacter(' ');
            txtCepImovel.setFormatterFactory(new DefaultFormatterFactory(cep));
        } catch (ParseException ex) {
        }
    }

    public void LimparDados() {
        txtIDImovel.setText("");
        txtUrlImagens.setText("");
        txtMatriculaImovel.setText("");
        cbStatusImovel.setSelectedItem("");
        txtEnderecoImovel.setText("");
        txtBairroImovel.setText("");
        txtCepImovel.setText("");
        txtNumeroImovel.setText("");
        txtValorAlugel.setText("");
        txtBuscarImovel.setText("");
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtIDImovel = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cbStatusImovel = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txtMatriculaImovel = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtEnderecoImovel = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtBairroImovel = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtNumeroImovel = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        btnNovoImovel = new javax.swing.JButton();
        btnSalvarImovel = new javax.swing.JButton();
        btnCancelarImovel = new javax.swing.JButton();
        btnExcluirImovel = new javax.swing.JButton();
        btnPesquisarImovel = new javax.swing.JButton();
        txtBuscarImovel = new javax.swing.JTextField();
        btnEditarImovel = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTImoveis = new javax.swing.JTable();
        txtCepImovel = new javax.swing.JFormattedTextField();
        txtValorAlugel = new javax.swing.JFormattedTextField();
        jLabel12 = new javax.swing.JLabel();
        txtUrlImagens = new javax.swing.JTextField();
        btnAbrirImagens = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("FR - Gerenciador de Imoveis - Cadastro de Imoveis");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 36)); // NOI18N
        jLabel1.setText("Cadastro de Imoveis");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 51));
        jLabel2.setText("* Campos Obrigatorios");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/FRimoveis/icones/Capturar.JPG"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel4.setText("ID Imovel:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel5.setText("*Status do Imovel:");

        cbStatusImovel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel6.setText("*Matricula Imovel:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel7.setText("*Endereço:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel8.setText("*Bairro:");

        txtBairroImovel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBairroImovelActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel9.setText("*CEP:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel10.setText("*Numero Imovel:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel11.setText("*Valor Aluguel:");

        btnNovoImovel.setText("Novo");
        btnNovoImovel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoImovelActionPerformed(evt);
            }
        });

        btnSalvarImovel.setText("Salvar");
        btnSalvarImovel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarImovelActionPerformed(evt);
            }
        });

        btnCancelarImovel.setText("Cancelar");
        btnCancelarImovel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarImovelActionPerformed(evt);
            }
        });

        btnExcluirImovel.setText("Excluir");
        btnExcluirImovel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirImovelActionPerformed(evt);
            }
        });

        btnPesquisarImovel.setText("Pesquisar");
        btnPesquisarImovel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarImovelActionPerformed(evt);
            }
        });

        btnEditarImovel.setText("Editar");
        btnEditarImovel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarImovelActionPerformed(evt);
            }
        });

        jTImoveis.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTImoveis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTImoveisMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTImoveis);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel12.setText("Imagens URL:");

        txtUrlImagens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUrlImagensActionPerformed(evt);
            }
        });

        btnAbrirImagens.setText("Abrir Imagens");
        btnAbrirImagens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirImagensActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnNovoImovel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalvarImovel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelarImovel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluirImovel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditarImovel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtBuscarImovel, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPesquisarImovel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtEnderecoImovel))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtIDImovel, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMatriculaImovel, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbStatusImovel, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtBairroImovel))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtUrlImagens))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCepImovel, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNumeroImovel, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel11)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtValorAlugel)
                            .addComponent(btnAbrirImagens, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMatriculaImovel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbStatusImovel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtIDImovel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEnderecoImovel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBairroImovel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumeroImovel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCepImovel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValorAlugel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtUrlImagens, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAbrirImagens, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPesquisarImovel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnNovoImovel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSalvarImovel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCancelarImovel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnExcluirImovel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtBuscarImovel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnEditarImovel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        setSize(new java.awt.Dimension(888, 588));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtBairroImovelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBairroImovelActionPerformed
    }//GEN-LAST:event_txtBairroImovelActionPerformed

    private void btnNovoImovelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoImovelActionPerformed
        update_sel = 1;
        btnSalvarImovel.setEnabled(true);
        btnCancelarImovel.setEnabled(true);
        btnNovoImovel.setEnabled(false);
        txtMatriculaImovel.setEnabled(true);
        cbStatusImovel.setEnabled(true);
        txtEnderecoImovel.setEnabled(true);
        txtBairroImovel.setEnabled(true);
        txtCepImovel.setEnabled(true);
        txtNumeroImovel.setEnabled(true);
        txtValorAlugel.setEnabled(true);
        txtUrlImagens.setEnabled(true);
        txtBuscarImovel.setEnabled(false);
        btnPesquisarImovel.setEnabled(false);
        btnAbrirImagens.setEnabled(false);

        // TODO add your handling code here:
    }//GEN-LAST:event_btnNovoImovelActionPerformed

    private void btnSalvarImovelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarImovelActionPerformed
        if (update_sel == 1) {
            if (cbStatusImovel.getSelectedItem().toString().isEmpty() || txtEnderecoImovel.getText().isEmpty() || txtBairroImovel.getText().isEmpty() || txtCepImovel.getText().isEmpty()
                    || txtNumeroImovel.getText().isEmpty() || txtValorAlugel.getText().isEmpty() || txtMatriculaImovel.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Favor Preencher os campos Obrigatorios!");
            } else {
                cadastroimoveis.setStatusImovel(cbStatusImovel.getSelectedItem().toString());
                cadastroimoveis.setEnderecoImovel(txtEnderecoImovel.getText());
                cadastroimoveis.setBairroImovel(txtBairroImovel.getText());
                cadastroimoveis.setCepImovel(txtCepImovel.getText());
                cadastroimoveis.setNumeroImovel(txtNumeroImovel.getText());
                cadastroimoveis.setAluguelCasa(Double.parseDouble(txtValorAlugel.getText()));
                cadastroimoveis.setMatriculaImovel(txtMatriculaImovel.getText());
                cadastroimoveis.setImagensUrl(txtUrlImagens.getText());

                cadastroimoveisDB.adicionaImoveis(cadastroimoveis);
                LimparDados();
                JOptionPane.showMessageDialog(null, "Imovel inserido com sucesso! ");
            }
        } else if (update_sel == 2) {
            if (cbStatusImovel.getSelectedItem().toString().isEmpty() || txtEnderecoImovel.getText().isEmpty() || txtBairroImovel.getText().isEmpty() || txtCepImovel.getText().isEmpty()
                    || txtNumeroImovel.getText().isEmpty() || txtValorAlugel.getText().isEmpty() || txtMatriculaImovel.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Favor Preencher os campos Obrigatorios!");
            } else {
                cadastroimoveis.setIdimovel(txtIDImovel.getText());
                cadastroimoveis.setStatusImovel(cbStatusImovel.getSelectedItem().toString());
                cadastroimoveis.setEnderecoImovel(txtEnderecoImovel.getText());
                cadastroimoveis.setBairroImovel(txtBairroImovel.getText());
                cadastroimoveis.setCepImovel(txtCepImovel.getText());
                cadastroimoveis.setNumeroImovel(txtNumeroImovel.getText());
                cadastroimoveis.setAluguelCasa(Double.parseDouble(txtValorAlugel.getText()));
                cadastroimoveis.setMatriculaImovel(txtMatriculaImovel.getText());
                cadastroimoveis.setImagensUrl(txtUrlImagens.getText());

                cadastroimoveisDB.editarPessoas(cadastroimoveis);
                LimparDados();
                JOptionPane.showMessageDialog(null, "Imovel inserido com sucesso! ");
            }
        }
        String sql = cadastroimoveisDB.atualizarTabela();
        dadosTabela(sql);
    }//GEN-LAST:event_btnSalvarImovelActionPerformed

    private void btnCancelarImovelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarImovelActionPerformed
        txtMatriculaImovel.setEnabled(false);
        cbStatusImovel.setEnabled(false);
        txtEnderecoImovel.setEnabled(false);
        txtBairroImovel.setEnabled(false);
        txtCepImovel.setEnabled(false);
        txtNumeroImovel.setEnabled(false);
        txtValorAlugel.setEnabled(false);
        txtUrlImagens.setEnabled(false);
        btnSalvarImovel.setEnabled(false);
        btnCancelarImovel.setEnabled(false);
        btnEditarImovel.setEnabled(false);
        btnExcluirImovel.setEnabled(false);
        btnNovoImovel.setEnabled(true);
        txtBuscarImovel.setEnabled(true);
        btnPesquisarImovel.setEnabled(true);
        btnAbrirImagens.setEnabled(false);
        LimparDados();
    }//GEN-LAST:event_btnCancelarImovelActionPerformed

    private void btnExcluirImovelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirImovelActionPerformed
        int res = 0;
        res = JOptionPane.showConfirmDialog(rootPane, "Deseja Remover o Imovel?");
        if (res == JOptionPane.YES_OPTION) {
            cadastroimoveis.setIdimovel(txtIDImovel.getText());
            cadastroimoveisDB.excluirImovel(cadastroimoveis);
            LimparDados();
        }
        String sql = cadastroimoveisDB.atualizarTabela();
        dadosTabela(sql);
    }//GEN-LAST:event_btnExcluirImovelActionPerformed

    private void btnPesquisarImovelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarImovelActionPerformed
        if (txtBuscarImovel.getText().isEmpty()) {
            String sql = cadastroimoveisDB.atualizarTabela();
            dadosTabela(sql);
        } else {
            cadastroimoveis.setPesquisar(txtBuscarImovel.getText());
            CadastroImoveis model = cadastroimoveisDB.pesquisaImovel(cadastroimoveis);
            try {
                String sql = cadastroimoveisDB.atualizarTabelaPesquisar(model);
                dadosTabela(sql);
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_btnPesquisarImovelActionPerformed

    private void btnEditarImovelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarImovelActionPerformed
        update_sel = 2;
        btnNovoImovel.setEnabled(false);
        btnSalvarImovel.setEnabled(true);
        btnAbrirImagens.setEnabled(false);
        btnCancelarImovel.setEnabled(true);
        btnExcluirImovel.setEnabled(false);
        txtMatriculaImovel.setEnabled(true);
        cbStatusImovel.setEnabled(true);
        txtEnderecoImovel.setEnabled(true);
        txtBairroImovel.setEnabled(true);
        txtCepImovel.setEnabled(true);
        txtNumeroImovel.setEnabled(true);
        txtValorAlugel.setEnabled(true);
        txtUrlImagens.setEnabled(true);
        String sql = cadastroimoveisDB.atualizarTabela();
        dadosTabela(sql);
    }//GEN-LAST:event_btnEditarImovelActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated

        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

    private void btnAbrirImagensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirImagensActionPerformed
        String url;
        url = txtUrlImagens.getText();
        try {
            java.awt.Desktop.getDesktop().browse(new java.net.URI(url));
        } catch (URISyntaxException ex) {
            Logger.getLogger(TelaCadastroImoveis.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TelaCadastroImoveis.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAbrirImagensActionPerformed

    private void txtUrlImagensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUrlImagensActionPerformed
    }//GEN-LAST:event_txtUrlImagensActionPerformed

    private void jTImoveisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTImoveisMouseClicked
        String nome_imovel = "" + jTImoveis.getValueAt(jTImoveis.getSelectedRow(), 0);
        conexao.conectar();
        conexao.executaSql("select * from tbimoveis where idimovel = '" + nome_imovel + "'");
        try {
            conexao.rs.first();
            txtIDImovel.setText(conexao.rs.getString("idimovel"));
            cbStatusImovel.setSelectedItem(conexao.rs.getString("statusImovel"));
            txtEnderecoImovel.setText(conexao.rs.getString("enderecoimovel"));
            txtBairroImovel.setText(conexao.rs.getString("bairroImovel"));
            txtCepImovel.setText(conexao.rs.getString("cepImovel"));
            txtNumeroImovel.setText(conexao.rs.getString("numeroCasa"));
            txtValorAlugel.setText(conexao.rs.getString("aluguelImovel"));
            txtMatriculaImovel.setText(conexao.rs.getString("matriculaImovel"));
            txtUrlImagens.setText(conexao.rs.getString("urlImagens"));

            btnCancelarImovel.setEnabled(true);
            btnEditarImovel.setEnabled(true);
            btnExcluirImovel.setEnabled(true);
            btnPesquisarImovel.setEnabled(true);
            txtBuscarImovel.setEnabled(true);
            btnAbrirImagens.setEnabled(true);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Selecionar o Imovel" + ex.getMessage());
        }
        conexao.desconectar();
    }//GEN-LAST:event_jTImoveisMouseClicked
    public void dadosTabela(String sql) {
        ArrayList dados = new ArrayList();
        String[] colunas = new String[]{"ID Imoveis", "Matricula Imovel", "Endereço Imovel", "Bairro Imovel", "Status do Imoveil", "Valor Aluguel"};
        conexao.conectar();
        conexao.executaSql(sql);
        try {
            conexao.rs.first();
            do {
                dados.add(new Object[]{conexao.rs.getString("idimovel"), conexao.rs.getString("matriculaImovel"), conexao.rs.getString("enderecoimovel"), conexao.rs.getString("bairroImovel"), conexao.rs.getString("statusImovel"), conexao.rs.getString("aluguelImovel")});
            } while (conexao.rs.next());
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao preencher as tabelas! \n" + e.getMessage());
        }
        CadastroImoveisTabela tabela = new CadastroImoveisTabela(dados, colunas);

        jTImoveis.setModel(tabela);
        jTImoveis.getColumnModel().getColumn(0).setPreferredWidth(70);
        jTImoveis.getColumnModel().getColumn(0).setResizable(false);

        jTImoveis.getColumnModel().getColumn(1).setPreferredWidth(150);
        jTImoveis.getColumnModel().getColumn(1).setResizable(false);

        jTImoveis.getColumnModel().getColumn(2).setPreferredWidth(250);
        jTImoveis.getColumnModel().getColumn(2).setResizable(false);

        jTImoveis.getColumnModel().getColumn(3).setPreferredWidth(164);
        jTImoveis.getColumnModel().getColumn(3).setResizable(false);

        jTImoveis.getColumnModel().getColumn(4).setPreferredWidth(130);
        jTImoveis.getColumnModel().getColumn(4).setResizable(false);

        jTImoveis.getColumnModel().getColumn(5).setPreferredWidth(100);
        jTImoveis.getColumnModel().getColumn(5).setResizable(false);

        jTImoveis.getTableHeader().setReorderingAllowed(false);
        jTImoveis.setAutoResizeMode(jTImoveis.AUTO_RESIZE_OFF);
        jTImoveis.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        conexao.desconectar();
    }

    public void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/IconeSistema/IconeSistema.png")));
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
            java.util.logging.Logger.getLogger(TelaCadastroImoveis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroImoveis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroImoveis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroImoveis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroImoveis().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbrirImagens;
    private javax.swing.JButton btnCancelarImovel;
    private javax.swing.JButton btnEditarImovel;
    private javax.swing.JButton btnExcluirImovel;
    private javax.swing.JButton btnNovoImovel;
    private javax.swing.JButton btnPesquisarImovel;
    private javax.swing.JButton btnSalvarImovel;
    private javax.swing.JComboBox<String> cbStatusImovel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTImoveis;
    private javax.swing.JTextField txtBairroImovel;
    private javax.swing.JTextField txtBuscarImovel;
    private javax.swing.JFormattedTextField txtCepImovel;
    private javax.swing.JTextField txtEnderecoImovel;
    private javax.swing.JTextField txtIDImovel;
    private javax.swing.JTextField txtMatriculaImovel;
    private javax.swing.JTextField txtNumeroImovel;
    private javax.swing.JTextField txtUrlImagens;
    private javax.swing.JFormattedTextField txtValorAlugel;
    // End of variables declaration//GEN-END:variables
}
