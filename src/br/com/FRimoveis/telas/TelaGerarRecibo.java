/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.FRimoveis.telas;

import br.com.FRimoveis.Conexao.ConexaoBD;
import br.com.FRimoveis.Desenvolvimento.ConsultaContrato;
import br.com.FRimoveis.Desenvolvimento.ConsultaContratoTabela;
import br.com.FRimoveis.dao.ConsultaContratoDB;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author rodrigolima
 */
public class TelaGerarRecibo extends javax.swing.JFrame {

    ConsultaContrato consultaContrato = new ConsultaContrato();
    ConsultaContratoDB ConsultaContratoDB = new ConsultaContratoDB();
    TelaEmailAnexo enviarEmail = new TelaEmailAnexo();
    ConexaoBD conexao = new ConexaoBD();

    /**
     * Creates new form TelaGerarRecibo
     */
    public TelaGerarRecibo() {
        initComponents();
        cbMesPagamento.addItem("");
        cbMesPagamento.addItem("Janeiro");
        cbMesPagamento.addItem("Fevereiro");
        cbMesPagamento.addItem("Março");
        cbMesPagamento.addItem("Abril");
        cbMesPagamento.addItem("Maio");
        cbMesPagamento.addItem("Junho");
        cbMesPagamento.addItem("Julho");
        cbMesPagamento.addItem("Agosto");
        cbMesPagamento.addItem("Setembro");
        cbMesPagamento.addItem("Outubro");
        cbMesPagamento.addItem("Novembro");
        cbMesPagamento.addItem("Dezembro");
        
        txtJuros.setEnabled(false);
        
        MaskFormatter juros;
        try {
            txtJuros.setValue(null);
            juros = new MaskFormatter("###");
            juros.setPlaceholderCharacter(' ');
            txtJuros.setFormatterFactory(new DefaultFormatterFactory(juros));
        } catch (ParseException ex) {
        }
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
        jScrollPane1 = new javax.swing.JScrollPane();
        JtbParcelasRecibo = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        txtPesquisarClienteRecibo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtbPesquisarCliente = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtNoneCliente = new javax.swing.JLabel();
        txtEnderecoliente = new javax.swing.JLabel();
        txtContratoCliente = new javax.swing.JLabel();
        txtTelefoneCliente = new javax.swing.JLabel();
        txtMatriculaCliente = new javax.swing.JLabel();
        txtAluguelRecibo = new javax.swing.JLabel();
        btnNovoRecibo = new javax.swing.JButton();
        btnGerarRecibo = new javax.swing.JButton();
        btnEnviarEmail = new javax.swing.JButton();
        btnCancelarRecibo = new javax.swing.JButton();
        cbJuros = new javax.swing.JCheckBox();
        txtJuros = new javax.swing.JFormattedTextField();
        jLabel11 = new javax.swing.JLabel();
        cbMesPagamento = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("FR - Gerenciador de Imoveis - Gerar Recibo");
        setPreferredSize(new java.awt.Dimension(900, 600));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/FRimoveis/icones/Capturar.JPG"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 36)); // NOI18N
        jLabel2.setText("Gerar Recibo");

        JtbParcelasRecibo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(JtbParcelasRecibo);

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel3.setText("Parcelas");

        txtPesquisarClienteRecibo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesquisarClienteReciboActionPerformed(evt);
            }
        });
        txtPesquisarClienteRecibo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisarClienteReciboKeyReleased(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel4.setText("Pesquisar Cliente:");

        jtbPesquisarCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jtbPesquisarCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtbPesquisarClienteMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jtbPesquisarCliente);

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel5.setText("Nome:");

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel6.setText("Endereço:");

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel7.setText("Telefone:");

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel8.setText("Matricula Imovel:");

        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel9.setText("Valor Aluguel:");

        jLabel10.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel10.setText("Contrato:");

        txtNoneCliente.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        txtNoneCliente.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        txtEnderecoliente.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        txtEnderecoliente.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        txtContratoCliente.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        txtContratoCliente.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        txtTelefoneCliente.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        txtTelefoneCliente.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        txtMatriculaCliente.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        txtMatriculaCliente.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        txtAluguelRecibo.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        txtAluguelRecibo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        btnNovoRecibo.setBackground(new java.awt.Color(204, 204, 204));
        btnNovoRecibo.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        btnNovoRecibo.setText("Novo");

        btnGerarRecibo.setBackground(new java.awt.Color(204, 204, 204));
        btnGerarRecibo.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        btnGerarRecibo.setText("Gerar Recibo");
        btnGerarRecibo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerarReciboActionPerformed(evt);
            }
        });

        btnEnviarEmail.setBackground(new java.awt.Color(204, 204, 204));
        btnEnviarEmail.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        btnEnviarEmail.setText("Enviar por Email");
        btnEnviarEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarEmailActionPerformed(evt);
            }
        });

        btnCancelarRecibo.setBackground(new java.awt.Color(204, 204, 204));
        btnCancelarRecibo.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        btnCancelarRecibo.setText("Cancelar");
        btnCancelarRecibo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarReciboActionPerformed(evt);
            }
        });

        cbJuros.setBackground(new java.awt.Color(255, 255, 255));
        cbJuros.setText("Juros?");
        cbJuros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbJurosMouseClicked(evt);
            }
        });
        cbJuros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbJurosActionPerformed(evt);
            }
        });

        txtJuros.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));

        jLabel11.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel11.setText("Mês do Pagamento:");

        cbMesPagamento.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(9, 9, 9))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtPesquisarClienteRecibo, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbJuros)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtJuros, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 607, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtNoneCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtEnderecoliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtTelefoneCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtMatriculaCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtContratoCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtAluguelRecibo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnGerarRecibo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnNovoRecibo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnCancelarRecibo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnEnviarEmail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbMesPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)))
                .addGap(17, 17, 17))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel2)))
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPesquisarClienteRecibo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(cbJuros, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                                .addComponent(txtJuros, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbMesPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(btnNovoRecibo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnGerarRecibo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEnviarEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCancelarRecibo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                                    .addComponent(txtNoneCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                                    .addComponent(txtEnderecoliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                                    .addComponent(txtTelefoneCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtMatriculaCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                                    .addComponent(txtContratoCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                                    .addComponent(txtAluguelRecibo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        setSize(new java.awt.Dimension(916, 634));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtPesquisarClienteReciboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisarClienteReciboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesquisarClienteReciboActionPerformed

    private void btnGerarReciboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerarReciboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGerarReciboActionPerformed

    private void btnCancelarReciboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarReciboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarReciboActionPerformed

    private void btnEnviarEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEnviarEmailActionPerformed

    private void cbJurosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbJurosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbJurosActionPerformed

    private void txtPesquisarClienteReciboKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisarClienteReciboKeyReleased
        consultaContrato.setPesquisarContrato(txtPesquisarClienteRecibo.getText());
        String sql = ConsultaContratoDB.pesquisaNomeCliente(consultaContrato);
        try {
            dadosTabela(sql);
        } catch (ParseException ex) {
            Logger.getLogger(TelaConsultarContrato.class.getName()).log(Level.SEVERE, null, ex);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesquisarClienteReciboKeyReleased

    private void jtbPesquisarClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbPesquisarClienteMouseClicked
        txtContratoCliente.setText((String) jtbPesquisarCliente.getValueAt(jtbPesquisarCliente.getSelectedRow(), 0));
        txtNoneCliente.setText((String) jtbPesquisarCliente.getValueAt(jtbPesquisarCliente.getSelectedRow(), 2));
        txtEnderecoliente.setText((String) jtbPesquisarCliente.getValueAt(jtbPesquisarCliente.getSelectedRow(), 6));
        txtMatriculaCliente.setText((String) jtbPesquisarCliente.getValueAt(jtbPesquisarCliente.getSelectedRow(), 9));
        txtAluguelRecibo.setText((String) jtbPesquisarCliente.getValueAt(jtbPesquisarCliente.getSelectedRow(), 8));
        txtTelefoneCliente.setText((String) jtbPesquisarCliente.getValueAt(jtbPesquisarCliente.getSelectedRow(), 4));
        // TODO add your handling code here:
    }//GEN-LAST:event_jtbPesquisarClienteMouseClicked

    private void cbJurosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbJurosMouseClicked
        if(cbJuros.isSelected()){
            txtJuros.setEnabled(true);
        }else{
            txtJuros.setEnabled(false);
        }
    }//GEN-LAST:event_cbJurosMouseClicked

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
            java.util.logging.Logger.getLogger(TelaGerarRecibo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaGerarRecibo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaGerarRecibo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaGerarRecibo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new TelaGerarRecibo().setVisible(true);
        });
    }

    public void dadosTabela(String sql) throws ParseException {
        ArrayList dados = new ArrayList();
        String[] colunas = new String[]{"ID Contrato", "Status Contrato", "Nome Cliente", "CPF / CNPJ", "Telefone", "E-mail", "Endereço Imovel", "Bairro Imovel", "Alugel Imovel", "Matricula"};
        conexao.conectar();
        conexao.executaSql(sql);
        try {
            conexao.rs.first();
            do {
                dados.add(new Object[]{conexao.rs.getString("idcontrato"), conexao.rs.getString("statusContrato"), conexao.rs.getString("nomeCliente"), conexao.rs.getString("cnpjcpf"), conexao.rs.getString("telefonePessoa"), conexao.rs.getString("emailPessoa"), conexao.rs.getString("enderecoimovel"), conexao.rs.getString("bairroImovel"), "R$ " + conexao.rs.getString("aluguelImovel"), conexao.rs.getString("matriculaImovel")});
            } while (conexao.rs.next());
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(rootPane, "Valor na busca Invalido!!\nFavor tentar novamente!");
        }
        ConsultaContratoTabela tabela = new ConsultaContratoTabela(dados, colunas);

        jtbPesquisarCliente.setModel(tabela);

        jtbPesquisarCliente.getColumnModel().getColumn(0).setPreferredWidth(80);
        jtbPesquisarCliente.getColumnModel().getColumn(0).setResizable(false);

        jtbPesquisarCliente.getColumnModel().getColumn(1).setPreferredWidth(100);
        jtbPesquisarCliente.getColumnModel().getColumn(1).setResizable(false);

        jtbPesquisarCliente.getColumnModel().getColumn(2).setPreferredWidth(180);
        jtbPesquisarCliente.getColumnModel().getColumn(2).setResizable(false);

        jtbPesquisarCliente.getColumnModel().getColumn(3).setPreferredWidth(110);
        jtbPesquisarCliente.getColumnModel().getColumn(3).setResizable(false);

        jtbPesquisarCliente.getColumnModel().getColumn(4).setPreferredWidth(120);
        jtbPesquisarCliente.getColumnModel().getColumn(4).setResizable(false);

        jtbPesquisarCliente.getColumnModel().getColumn(5).setPreferredWidth(230);
        jtbPesquisarCliente.getColumnModel().getColumn(5).setResizable(false);

        jtbPesquisarCliente.getColumnModel().getColumn(6).setPreferredWidth(150);
        jtbPesquisarCliente.getColumnModel().getColumn(6).setResizable(false);

        jtbPesquisarCliente.getColumnModel().getColumn(7).setPreferredWidth(150);
        jtbPesquisarCliente.getColumnModel().getColumn(7).setResizable(false);

        jtbPesquisarCliente.getColumnModel().getColumn(8).setPreferredWidth(100);
        jtbPesquisarCliente.getColumnModel().getColumn(8).setResizable(false);

        jtbPesquisarCliente.getColumnModel().getColumn(9).setPreferredWidth(100);
        jtbPesquisarCliente.getColumnModel().getColumn(9).setResizable(false);

        jtbPesquisarCliente.getTableHeader().setReorderingAllowed(false);
        jtbPesquisarCliente.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        jtbPesquisarCliente.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        conexao.desconectar();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JtbParcelasRecibo;
    private javax.swing.JButton btnCancelarRecibo;
    private javax.swing.JButton btnEnviarEmail;
    private javax.swing.JButton btnGerarRecibo;
    private javax.swing.JButton btnNovoRecibo;
    private javax.swing.JCheckBox cbJuros;
    private javax.swing.JComboBox<String> cbMesPagamento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jtbPesquisarCliente;
    private javax.swing.JLabel txtAluguelRecibo;
    private javax.swing.JLabel txtContratoCliente;
    private javax.swing.JLabel txtEnderecoliente;
    private javax.swing.JFormattedTextField txtJuros;
    private javax.swing.JLabel txtMatriculaCliente;
    private javax.swing.JLabel txtNoneCliente;
    private javax.swing.JTextField txtPesquisarClienteRecibo;
    private javax.swing.JLabel txtTelefoneCliente;
    // End of variables declaration//GEN-END:variables
}
