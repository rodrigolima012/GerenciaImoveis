/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.FRimoveis.telas;

import br.com.FRimoveis.Conexao.ConexaoBD;
import br.com.FRimoveis.Desenvolvimento.CadastroContrato;
import br.com.FRimoveis.Desenvolvimento.CadastroContratoTabela;
import br.com.FRimoveis.Desenvolvimento.CadastroImoveis;
import br.com.FRimoveis.Desenvolvimento.CadastroPessoas;
import br.com.FRimoveis.dao.CadastroContratoDB;
import br.com.FRimoveis.dao.CadastroImoveisDB;
import br.com.FRimoveis.dao.CadastroPessoasDB;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;

/**
 *
 * @author rodrigolima
 */
public final class TelaGerarContrato extends javax.swing.JFrame {

    CadastroPessoas cadastroPessoas = new CadastroPessoas();
    CadastroPessoasDB cadastroPessoasDB = new CadastroPessoasDB();
    CadastroImoveis cadastroimoveis = new CadastroImoveis();
    CadastroImoveisDB cadastroimoveisDB = new CadastroImoveisDB();
    CadastroContrato cadastroContrato = new CadastroContrato();
    CadastroContratoDB cadastroContratoDB = new CadastroContratoDB();
    ConexaoBD conexao = new ConexaoBD();
    private String dataInicialFinal;
    private String dataFinalFinal;

    /**
     * Creates new form TelaGerarContrato
     */
    public TelaGerarContrato() {
        initComponents();
        txtIDCliente.setVisible(false);
        txtIDImovel.setVisible(false);
        txtPesquisarCliente.setEnabled(false);
        txtPesquisarImovel.setEnabled(false);
        jTClienteContrato.setEnabled(false);
        jTImovelContrato.setEnabled(false);
        btnCancelarContrato.setEnabled(false);
        btnSalvarContrato.setEnabled(false);
        jDateContratoFinal.setEnabled(false);
        jDateContratoInical.setEnabled(false);
        setIcon();
    }

    public void LimparTela() {
        ArrayList dados = new ArrayList();
        String[] colunas = new String[]{};
        dados.add(new Object[]{});
        CadastroContratoTabela tabela = new CadastroContratoTabela(dados, colunas);
        jTClienteContrato.setModel(tabela);
        jTImovelContrato.setModel(tabela);

        txtIDCliente.setText("");
        txtIDImovel.setText("");
        txtPesquisarCliente.setText("");
        txtPesquisarImovel.setText("");
        jDateContratoFinal.setDate(null);
        jDateContratoInical.setDate(null);

        txtIDCliente.setEnabled(false);
        txtIDImovel.setEnabled(false);
        txtPesquisarCliente.setEnabled(false);
        txtPesquisarImovel.setEnabled(false);
        jTClienteContrato.setEnabled(false);
        jTImovelContrato.setEnabled(false);
        btnCancelarContrato.setEnabled(false);
        btnSalvarContrato.setEnabled(false);
        jDateContratoFinal.setEnabled(false);
        jDateContratoInical.setEnabled(false);
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
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTClienteContrato = new javax.swing.JTable();
        txtPesquisarCliente = new javax.swing.JTextField();
        txtIDCliente = new javax.swing.JTextField();
        txtNomeCliente = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTImovelContrato = new javax.swing.JTable();
        txtPesquisarImovel = new javax.swing.JTextField();
        txtIDImovel = new javax.swing.JTextField();
        txtMatriculaImovel = new javax.swing.JLabel();
        btnNovoContrato = new javax.swing.JButton();
        btnSalvarContrato = new javax.swing.JButton();
        btnCancelarContrato = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jDateContratoFinal = new com.toedter.calendar.JDateChooser();
        jPanel5 = new javax.swing.JPanel();
        jDateContratoInical = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("FR - Gerenciador de Imoveis - Gerar Contrato");
        setPreferredSize(new java.awt.Dimension(872, 549));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/FRimoveis/icones/Capturar.JPG"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 36)); // NOI18N
        jLabel2.setText("Gerar Contrato");

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 51));
        jLabel3.setText("* Campos Obrigatorios");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Buscar Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 0, 18))); // NOI18N
        jPanel2.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N

        jTClienteContrato.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTClienteContrato.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTClienteContratoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTClienteContrato);

        txtPesquisarCliente.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtPesquisarCliente.setToolTipText("Informe o Nome do Cliente!");
        txtPesquisarCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisarClienteKeyReleased(evt);
            }
        });

        txtIDCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtIDCliente.setEnabled(false);
        txtIDCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDClienteActionPerformed(evt);
            }
        });

        txtNomeCliente.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 826, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(txtPesquisarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(208, 208, 208)
                .addComponent(txtIDCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtIDCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPesquisarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNomeCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Buscar Imovel", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 0, 18))); // NOI18N
        jPanel3.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N

        jTImovelContrato.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTImovelContrato.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTImovelContratoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTImovelContrato);

        txtPesquisarImovel.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtPesquisarImovel.setToolTipText("Informe a Matricula do Imovel!");
        txtPesquisarImovel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisarImovelKeyReleased(evt);
            }
        });

        txtIDImovel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtIDImovel.setEnabled(false);
        txtIDImovel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDImovelActionPerformed(evt);
            }
        });

        txtMatriculaImovel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 826, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(txtPesquisarImovel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(207, 207, 207)
                .addComponent(txtIDImovel, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtMatriculaImovel, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtIDImovel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPesquisarImovel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMatriculaImovel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE))
        );

        btnNovoContrato.setBackground(new java.awt.Color(204, 204, 204));
        btnNovoContrato.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        btnNovoContrato.setText("Novo");
        btnNovoContrato.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNovoContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoContratoActionPerformed(evt);
            }
        });

        btnSalvarContrato.setBackground(new java.awt.Color(204, 204, 204));
        btnSalvarContrato.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        btnSalvarContrato.setText("Salvar");
        btnSalvarContrato.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalvarContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarContratoActionPerformed(evt);
            }
        });

        btnCancelarContrato.setBackground(new java.awt.Color(204, 204, 204));
        btnCancelarContrato.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        btnCancelarContrato.setText("Cancelar");
        btnCancelarContrato.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelarContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarContratoActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Data Final"));

        jDateContratoFinal.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDateContratoFinal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDateContratoFinal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Data Inicial"));

        jDateContratoInical.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDateContratoInical, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDateContratoInical, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnNovoContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnSalvarContrato, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCancelarContrato, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3))
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovoContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvarContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelarContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(105, 105, 105))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 646, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(872, 685));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtIDClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDClienteActionPerformed

    private void txtIDImovelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDImovelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDImovelActionPerformed

    private void btnNovoContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoContratoActionPerformed
        txtPesquisarCliente.setEnabled(true);
        txtPesquisarImovel.setEnabled(true);
        jTClienteContrato.setEnabled(true);
        jTImovelContrato.setEnabled(true);
        btnCancelarContrato.setEnabled(true);
        btnSalvarContrato.setEnabled(true);
        jDateContratoFinal.setEnabled(true);
        jDateContratoInical.setEnabled(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNovoContratoActionPerformed

    private void btnSalvarContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarContratoActionPerformed
        if (txtIDCliente.getText().isEmpty() || txtIDImovel.getText().isEmpty() || jDateContratoFinal.getDate() == null || jDateContratoFinal.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Favor Preencher os campos Obrigatorios!");
        } else {
            cadastroContrato.setStatusContrato("ATIVO");
            cadastroContrato.setIdPessoa(Integer.parseInt(txtIDCliente.getText()));
            cadastroContrato.setIdImovel(Integer.parseInt(txtIDImovel.getText()));
            try {
                java.util.Date dataInicial = jDateContratoInical.getDate();
                SimpleDateFormat formato = new SimpleDateFormat("yyy/MM/dd");
                this.dataInicialFinal = formato.format(dataInicial);
                java.sql.Date data = new java.sql.Date(formato.parse(dataInicialFinal).getTime());
                cadastroContrato.setDataInicial(data);

                java.util.Date dataFinal = jDateContratoFinal.getDate();
                this.dataFinalFinal = formato.format(dataFinal);
                java.sql.Date data1 = new java.sql.Date(formato.parse(dataFinalFinal).getTime());
                cadastroContrato.setDataFinal(data1);

                cadastroimoveis.setIdimovel(txtIDImovel.getText());
                cadastroimoveis.setStatusImovel("ALUGADO");
                cadastroimoveisDB.editarStatus(cadastroimoveis);
            } catch (ParseException e) {
            }
            cadastroContratoDB.adicionaContrato(cadastroContrato);
            JOptionPane.showMessageDialog(null, "Contrato inserido com Sucesso!");
            LimparTela();
        }
    }//GEN-LAST:event_btnSalvarContratoActionPerformed

    private void btnCancelarContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarContratoActionPerformed
        LimparTela();
    }//GEN-LAST:event_btnCancelarContratoActionPerformed

    private void jTClienteContratoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTClienteContratoMouseClicked
        String nome_pessoa = "" + jTClienteContrato.getValueAt(jTClienteContrato.getSelectedRow(), 0);
        String nomeCliente = "" + jTClienteContrato.getValueAt(jTClienteContrato.getSelectedRow(), 1);
        String dados = cadastroContratoDB.setarIDPessoa(nome_pessoa);
        txtIDCliente.setText(dados);
        txtNomeCliente.setText(nomeCliente);
    }//GEN-LAST:event_jTClienteContratoMouseClicked

    private void jTImovelContratoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTImovelContratoMouseClicked
        String nome_Imovel = "" + jTImovelContrato.getValueAt(jTImovelContrato.getSelectedRow(), 0);
        String matricula = "" + jTImovelContrato.getValueAt(jTImovelContrato.getSelectedRow(), 2);
        txtMatriculaImovel.setText(matricula);
        String dados = cadastroContratoDB.setarIDImovel(nome_Imovel);
        txtIDImovel.setText(dados);
        
    }//GEN-LAST:event_jTImovelContratoMouseClicked

    private void txtPesquisarClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisarClienteKeyReleased
        if (txtPesquisarCliente.getText().isEmpty()) {
            String sql = cadastroContratoDB.atualizarTabelaCLI();
            dadosTabelaCliente(sql);
        } else {
            cadastroPessoas.setPesquisaPessoa(txtPesquisarCliente.getText());
            CadastroPessoas model = cadastroPessoasDB.pesquisaUsuario(cadastroPessoas);
            try {
                String sql = cadastroContratoDB.atualizarTabelaPessoa(model);
                dadosTabelaCliente(sql);
            } catch (Exception e) {
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesquisarClienteKeyReleased

    private void txtPesquisarImovelKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisarImovelKeyReleased
        if (txtPesquisarImovel.getText().isEmpty()) {
            String sql = cadastroContratoDB.atualizarTabelaIMO();
            dadosTabelaImovel(sql);
        } else {
            cadastroimoveis.setPesquisar(txtPesquisarImovel.getText());
            CadastroImoveis model = cadastroimoveisDB.pesquisaImovel(cadastroimoveis);
            try {
                String sql = cadastroContratoDB.atualizarTabelaImoveis(model);
                dadosTabelaImovel(sql);
            } catch (Exception e) {
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesquisarImovelKeyReleased
    public void dadosTabelaCliente(String sql) {
        ArrayList dados = new ArrayList();
        String[] colunas = new String[]{"ID Cliente", "Nome Cliente", "Nome Fantasia", "CNPJ / CPF", "Perfil Cliente"};
        conexao.conectar();
        conexao.executaSql(sql);
        try {
            conexao.rs.first();
            do {
                dados.add(new Object[]{conexao.rs.getString("idpessoa"), conexao.rs.getString("nomeCliente"), conexao.rs.getString("nomeFantasia"), conexao.rs.getString("cnpjcpf"), conexao.rs.getString("perfil")});
            } while (conexao.rs.next());
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao preencher as tabelas! \n" + e.getMessage());
        }
        CadastroContratoTabela tabela = new CadastroContratoTabela(dados, colunas);

        jTClienteContrato.setModel(tabela);
        jTClienteContrato.getColumnModel().getColumn(0).setPreferredWidth(70);
        jTClienteContrato.getColumnModel().getColumn(0).setResizable(false);

        jTClienteContrato.getColumnModel().getColumn(1).setPreferredWidth(245);
        jTClienteContrato.getColumnModel().getColumn(1).setResizable(false);

        jTClienteContrato.getColumnModel().getColumn(2).setPreferredWidth(244);
        jTClienteContrato.getColumnModel().getColumn(2).setResizable(false);

        jTClienteContrato.getColumnModel().getColumn(3).setPreferredWidth(164);
        jTClienteContrato.getColumnModel().getColumn(3).setResizable(false);

        jTClienteContrato.getColumnModel().getColumn(4).setPreferredWidth(115);
        jTClienteContrato.getColumnModel().getColumn(4).setResizable(false);

        jTClienteContrato.getTableHeader().setReorderingAllowed(false);
        jTClienteContrato.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        jTClienteContrato.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        conexao.desconectar();
    }

    public void dadosTabelaImovel(String sql) {
        ArrayList dados = new ArrayList();
        String[] colunas = new String[]{"ID Imovel", "Status do Imovel", "Matricula Imovel", "Aluguel Imovel", "Numero Casa"};
        conexao.conectar();
        conexao.executaSql(sql);
        try {
            conexao.rs.first();
            do {
                dados.add(new Object[]{conexao.rs.getString("idimovel"), conexao.rs.getString("statusImovel"), conexao.rs.getString("matriculaImovel"), conexao.rs.getString("aluguelImovel"), conexao.rs.getString("numeroCasa")});
            } while (conexao.rs.next());
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao preencher as tabelas! \n" + e.getMessage());
        }
        CadastroContratoTabela tabela = new CadastroContratoTabela(dados, colunas);

        jTImovelContrato.setModel(tabela);
        jTImovelContrato.getColumnModel().getColumn(0).setPreferredWidth(70);
        jTImovelContrato.getColumnModel().getColumn(0).setResizable(false);

        jTImovelContrato.getColumnModel().getColumn(1).setPreferredWidth(247);
        jTImovelContrato.getColumnModel().getColumn(1).setResizable(false);

        jTImovelContrato.getColumnModel().getColumn(2).setPreferredWidth(247);
        jTImovelContrato.getColumnModel().getColumn(2).setResizable(false);

        jTImovelContrato.getColumnModel().getColumn(3).setPreferredWidth(168);
        jTImovelContrato.getColumnModel().getColumn(3).setResizable(false);

        jTImovelContrato.getColumnModel().getColumn(4).setPreferredWidth(113);
        jTImovelContrato.getColumnModel().getColumn(4).setResizable(false);

        jTImovelContrato.getTableHeader().setReorderingAllowed(false);
        jTImovelContrato.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        jTImovelContrato.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

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
            java.util.logging.Logger.getLogger(TelaGerarContrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaGerarContrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaGerarContrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaGerarContrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new TelaGerarContrato().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelarContrato;
    private javax.swing.JButton btnNovoContrato;
    private javax.swing.JButton btnSalvarContrato;
    private com.toedter.calendar.JDateChooser jDateContratoFinal;
    private com.toedter.calendar.JDateChooser jDateContratoInical;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTClienteContrato;
    private javax.swing.JTable jTImovelContrato;
    private javax.swing.JTextField txtIDCliente;
    private javax.swing.JTextField txtIDImovel;
    public static javax.swing.JLabel txtMatriculaImovel;
    private javax.swing.JLabel txtNomeCliente;
    private javax.swing.JTextField txtPesquisarCliente;
    private javax.swing.JTextField txtPesquisarImovel;
    // End of variables declaration//GEN-END:variables
}
