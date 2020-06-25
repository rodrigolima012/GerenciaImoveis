/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.FRimoveis.telas;

import br.com.FRimoveis.Conexao.ConexaoBD;
import br.com.FRimoveis.Desenvolvimento.CadastroContratoTabela;
import br.com.FRimoveis.Desenvolvimento.ConsultaContrato;
import br.com.FRimoveis.Desenvolvimento.ConsultaContratoTela;
import br.com.FRimoveis.dao.ConsultaContratoDB;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;

/**
 *
 * @author rodrigolima
 */
public final class TelaConsultarContrato extends javax.swing.JFrame {

    ConsultaContrato consultaContrato = new ConsultaContrato();
    ConsultaContratoDB ConsultaContratoDB = new ConsultaContratoDB();
    TelaEmailAnexo enviarEmail = new TelaEmailAnexo();
    ConexaoBD conexao = new ConexaoBD();
    String idContrato;

    /**
     * Creates new form TelaConsultarContrato
     */
    public TelaConsultarContrato() {
        initComponents();
        setIcon();
        rbMatriculaImovel.setEnabled(false);
        rbNomeCliente.setEnabled(false);
        txtPesquisarContrato.setEnabled(false);
        btnNovoConsultarContrato.setEnabled(true);
        btnCancelarConsultarContrato.setEnabled(false);
        btnInativarConsultarContrato.setEnabled(false);
        btnImprimirConsultarContrato.setEnabled(false);
        btnEmailConsultarContrato.setEnabled(false);
        jTConsultaContrato.setEnabled(true);

    }

    public void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/IconeSistema/IconeSistema.png")));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgEscolhaPesquisa = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        rbMatriculaImovel = new javax.swing.JRadioButton();
        rbNomeCliente = new javax.swing.JRadioButton();
        txtPesquisarContrato = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTConsultaContrato = new javax.swing.JTable();
        btnNovoConsultarContrato = new javax.swing.JButton();
        btnCancelarConsultarContrato = new javax.swing.JButton();
        btnInativarConsultarContrato = new javax.swing.JButton();
        btnEmailConsultarContrato = new javax.swing.JButton();
        btnImprimirConsultarContrato = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("FR - Gerenciador de Imoveis - Consultar Contrato");
        setPreferredSize(new java.awt.Dimension(1008, 681));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/FRimoveis/icones/Capturar.JPG"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 36)); // NOI18N
        jLabel2.setText("Consultar Contrato");

        rbMatriculaImovel.setBackground(new java.awt.Color(255, 255, 255));
        bgEscolhaPesquisa.add(rbMatriculaImovel);
        rbMatriculaImovel.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        rbMatriculaImovel.setText("Matricula do Imovel");
        rbMatriculaImovel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbMatriculaImovelMouseClicked(evt);
            }
        });

        rbNomeCliente.setBackground(new java.awt.Color(255, 255, 255));
        bgEscolhaPesquisa.add(rbNomeCliente);
        rbNomeCliente.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        rbNomeCliente.setText("Nome do Cliente");
        rbNomeCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbNomeClienteMouseClicked(evt);
            }
        });
        rbNomeCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbNomeClienteActionPerformed(evt);
            }
        });

        txtPesquisarContrato.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtPesquisarContrato.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtPesquisarContrato.setToolTipText("Selecione a Opção para Pesquisar!");
        txtPesquisarContrato.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisarContratoKeyReleased(evt);
            }
        });

        jTConsultaContrato.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTConsultaContrato.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTConsultaContratoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTConsultaContrato);

        btnNovoConsultarContrato.setBackground(new java.awt.Color(204, 204, 204));
        btnNovoConsultarContrato.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        btnNovoConsultarContrato.setText("Novo");
        btnNovoConsultarContrato.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNovoConsultarContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoConsultarContratoActionPerformed(evt);
            }
        });

        btnCancelarConsultarContrato.setBackground(new java.awt.Color(204, 204, 204));
        btnCancelarConsultarContrato.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        btnCancelarConsultarContrato.setText("Cancelar");
        btnCancelarConsultarContrato.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelarConsultarContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarConsultarContratoActionPerformed(evt);
            }
        });

        btnInativarConsultarContrato.setBackground(new java.awt.Color(204, 204, 204));
        btnInativarConsultarContrato.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        btnInativarConsultarContrato.setText("Encerrar Contrato");
        btnInativarConsultarContrato.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInativarConsultarContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInativarConsultarContratoActionPerformed(evt);
            }
        });

        btnEmailConsultarContrato.setBackground(new java.awt.Color(204, 204, 204));
        btnEmailConsultarContrato.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        btnEmailConsultarContrato.setText("Enviar por Email");
        btnEmailConsultarContrato.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEmailConsultarContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmailConsultarContratoActionPerformed(evt);
            }
        });

        btnImprimirConsultarContrato.setBackground(new java.awt.Color(204, 204, 204));
        btnImprimirConsultarContrato.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        btnImprimirConsultarContrato.setText("Imprimir Contrato");
        btnImprimirConsultarContrato.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnImprimirConsultarContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirConsultarContratoActionPerformed(evt);
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
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 474, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rbNomeCliente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbMatriculaImovel))
                            .addComponent(txtPesquisarContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnNovoConsultarContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelarConsultarContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnInativarConsultarContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnImprimirConsultarContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEmailConsultarContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbNomeCliente)
                    .addComponent(rbMatriculaImovel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPesquisarContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovoConsultarContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelarConsultarContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInativarConsultarContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEmailConsultarContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnImprimirConsultarContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(1024, 526));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void rbNomeClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbNomeClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbNomeClienteActionPerformed

    private void btnNovoConsultarContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoConsultarContratoActionPerformed
        rbMatriculaImovel.setEnabled(true);
        rbNomeCliente.setEnabled(true);
        txtPesquisarContrato.setEnabled(true);
        btnNovoConsultarContrato.setEnabled(false);
        btnCancelarConsultarContrato.setEnabled(true);
        btnInativarConsultarContrato.setEnabled(false);
        btnEmailConsultarContrato.setEnabled(false);
        jTConsultaContrato.setEnabled(true);
        btnEmailConsultarContrato.setEnabled(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNovoConsultarContratoActionPerformed

    private void btnCancelarConsultarContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarConsultarContratoActionPerformed
        rbMatriculaImovel.setEnabled(false);
        rbNomeCliente.setEnabled(false);
        txtPesquisarContrato.setEnabled(false);
        btnNovoConsultarContrato.setEnabled(true);
        btnCancelarConsultarContrato.setEnabled(false);
        btnInativarConsultarContrato.setEnabled(false);
        btnEmailConsultarContrato.setEnabled(false);
        jTConsultaContrato.setEnabled(false);
        txtPesquisarContrato.setText("");

        ArrayList dados = new ArrayList();
        String[] colunas = new String[]{};
        dados.add(new Object[]{});
        CadastroContratoTabela tabela = new CadastroContratoTabela(dados, colunas);
        jTConsultaContrato.setModel(tabela);

        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarConsultarContratoActionPerformed

    private void rbNomeClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbNomeClienteMouseClicked
        txtPesquisarContrato.setText("");
    }//GEN-LAST:event_rbNomeClienteMouseClicked

    private void rbMatriculaImovelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbMatriculaImovelMouseClicked
        txtPesquisarContrato.setText("");
    }//GEN-LAST:event_rbMatriculaImovelMouseClicked

    private void jTConsultaContratoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTConsultaContratoMouseClicked
        btnInativarConsultarContrato.setEnabled(true);
        btnImprimirConsultarContrato.setEnabled(true);
        btnEmailConsultarContrato.setEnabled(false);

        idContrato = "" + jTConsultaContrato.getValueAt(jTConsultaContrato.getSelectedRow(), 0);
    }//GEN-LAST:event_jTConsultaContratoMouseClicked

    private void btnInativarConsultarContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInativarConsultarContratoActionPerformed
        int sair = JOptionPane.showConfirmDialog(null, "Quer Encerrar esse Contrato?", "Atenção", JOptionPane.YES_NO_OPTION);
        String sql = ConsultaContratoDB.pesquisarTodos();
        String valorID = "" + jTConsultaContrato.getValueAt(jTConsultaContrato.getSelectedRow(), 0);
        int idValor = Integer.parseInt(valorID);
        
        
        if (sair == JOptionPane.YES_OPTION) {
            try {
                conexao.conectar();
                conexao.executaSql(sql);
                conexao.rs.first();
                do {
                    int valor = conexao.rs.getInt("idcontrato");
                    String validar = conexao.rs.getString("statusContrato");
                    if (valor == idValor) {
                        if (validar.equalsIgnoreCase("ENCERRADO")) {
                            JOptionPane.showMessageDialog(null, "Contrato ja Encerrado!");
                        } else {
                            ConsultaContratoDB.inativarContrato(idContrato);
                            try {
                                dadosTabela(sql);
                                break;
                            } catch (ParseException ex) {
                                Logger.getLogger(TelaConsultarContrato.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                    }
                } while (conexao.rs.next());

            } catch (SQLException ex) {
                Logger.getLogger(TelaConsultarContrato.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnInativarConsultarContratoActionPerformed

    private void txtPesquisarContratoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisarContratoKeyReleased
        if (txtPesquisarContrato.getText().isEmpty()) {
            String sql = ConsultaContratoDB.pesquisarTodos();
            try {
                dadosTabela(sql);
            } catch (ParseException ex) {
                Logger.getLogger(TelaConsultarContrato.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (rbNomeCliente.isSelected()) {
            consultaContrato.setPesquisarContrato(txtPesquisarContrato.getText());
            String sql = ConsultaContratoDB.pesquisaNomeCliente(consultaContrato);
            try {
                dadosTabela(sql);
            } catch (ParseException ex) {
                Logger.getLogger(TelaConsultarContrato.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else if (rbMatriculaImovel.isSelected()) {
            consultaContrato.setPesquisarContrato(txtPesquisarContrato.getText());
            String sql = ConsultaContratoDB.pesquisaMatricula(consultaContrato);
            try {
                dadosTabela(sql);
            } catch (ParseException ex) {
                Logger.getLogger(TelaConsultarContrato.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesquisarContratoKeyReleased

    private void btnEmailConsultarContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmailConsultarContratoActionPerformed
        enviarEmail.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEmailConsultarContratoActionPerformed

    private void btnImprimirConsultarContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirConsultarContratoActionPerformed
        btnEmailConsultarContrato.setEnabled(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnImprimirConsultarContratoActionPerformed

    public void dadosTabela(String sql) throws ParseException {
        ArrayList dados = new ArrayList();
        String[] colunas = new String[]{"ID Contrato", "Status Contrato", "Data Inicial", "Data Final", "Nome Cliente", "Nome Fantasia", "CPF / CNPJ", "Perfil", "Telefone", "E-mail", "Status Imovel", "Endereço Imovel", "Bairro Imovel", "Alugel Imovel", "Matricula"};
        conexao.conectar();
        conexao.executaSql(sql);
        SimpleDateFormat in = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat out = new SimpleDateFormat("dd/MM/yyyy");
        try {
            conexao.rs.first();
            do {
                String dataInicial = conexao.rs.getString("datainicial");
                String dataFinal = conexao.rs.getString("datafinal");
                String result1 = out.format(in.parse(dataInicial));
                String data01 = result1;
                String result2 = out.format(in.parse(dataFinal));
                String data02 = result2;

                dados.add(new Object[]{conexao.rs.getString("idcontrato"), conexao.rs.getString("statusContrato"), data01, data02, conexao.rs.getString("nomeCliente"), conexao.rs.getString("NomeFantasia"), conexao.rs.getString("cnpjcpf"), conexao.rs.getString("perfil"), conexao.rs.getString("telefonePessoa"), conexao.rs.getString("emailPessoa"), conexao.rs.getString("statusImovel"), conexao.rs.getString("enderecoimovel"), conexao.rs.getString("bairroImovel"), "R$ " + conexao.rs.getString("aluguelImovel"), conexao.rs.getString("matriculaImovel")});
            } while (conexao.rs.next());
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(rootPane, "Valor na busca Invalido!!\nFavor tentar novamente!");
        }
        ConsultaContratoTela tabela = new ConsultaContratoTela(dados, colunas);

        jTConsultaContrato.setModel(tabela);

        jTConsultaContrato.getColumnModel().getColumn(0).setPreferredWidth(80);
        jTConsultaContrato.getColumnModel().getColumn(0).setResizable(false);

        jTConsultaContrato.getColumnModel().getColumn(1).setPreferredWidth(100);
        jTConsultaContrato.getColumnModel().getColumn(1).setResizable(false);

        jTConsultaContrato.getColumnModel().getColumn(2).setPreferredWidth(80);
        jTConsultaContrato.getColumnModel().getColumn(2).setResizable(false);

        jTConsultaContrato.getColumnModel().getColumn(3).setPreferredWidth(80);
        jTConsultaContrato.getColumnModel().getColumn(3).setResizable(false);

        jTConsultaContrato.getColumnModel().getColumn(4).setPreferredWidth(180);
        jTConsultaContrato.getColumnModel().getColumn(4).setResizable(false);

        jTConsultaContrato.getColumnModel().getColumn(5).setPreferredWidth(180);
        jTConsultaContrato.getColumnModel().getColumn(5).setResizable(false);

        jTConsultaContrato.getColumnModel().getColumn(6).setPreferredWidth(120);
        jTConsultaContrato.getColumnModel().getColumn(6).setResizable(false);

        jTConsultaContrato.getColumnModel().getColumn(7).setPreferredWidth(90);
        jTConsultaContrato.getColumnModel().getColumn(7).setResizable(false);

        jTConsultaContrato.getColumnModel().getColumn(8).setPreferredWidth(110);
        jTConsultaContrato.getColumnModel().getColumn(8).setResizable(false);

        jTConsultaContrato.getColumnModel().getColumn(9).setPreferredWidth(250);
        jTConsultaContrato.getColumnModel().getColumn(9).setResizable(false);

        jTConsultaContrato.getColumnModel().getColumn(10).setPreferredWidth(90);
        jTConsultaContrato.getColumnModel().getColumn(10).setResizable(false);

        jTConsultaContrato.getColumnModel().getColumn(11).setPreferredWidth(160);
        jTConsultaContrato.getColumnModel().getColumn(11).setResizable(false);

        jTConsultaContrato.getColumnModel().getColumn(12).setPreferredWidth(160);
        jTConsultaContrato.getColumnModel().getColumn(12).setResizable(false);

        jTConsultaContrato.getColumnModel().getColumn(13).setPreferredWidth(90);
        jTConsultaContrato.getColumnModel().getColumn(13).setResizable(false);

        jTConsultaContrato.getColumnModel().getColumn(14).setPreferredWidth(80);
        jTConsultaContrato.getColumnModel().getColumn(14).setResizable(false);

        jTConsultaContrato.getTableHeader().setReorderingAllowed(false);
        jTConsultaContrato.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        jTConsultaContrato.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        conexao.desconectar();
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
            java.util.logging.Logger.getLogger(TelaConsultarContrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaConsultarContrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaConsultarContrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaConsultarContrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new TelaConsultarContrato().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgEscolhaPesquisa;
    private javax.swing.JButton btnCancelarConsultarContrato;
    private javax.swing.JButton btnEmailConsultarContrato;
    private javax.swing.JButton btnImprimirConsultarContrato;
    private javax.swing.JButton btnInativarConsultarContrato;
    private javax.swing.JButton btnNovoConsultarContrato;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTConsultaContrato;
    private javax.swing.JRadioButton rbMatriculaImovel;
    private javax.swing.JRadioButton rbNomeCliente;
    private javax.swing.JTextField txtPesquisarContrato;
    // End of variables declaration//GEN-END:variables
}
