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
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;

/**
 *
 * @author rodrigolima
 */
public class TelaConsultarContrato extends javax.swing.JFrame {

    ConsultaContrato consultaimoveis = new ConsultaContrato();
    ConsultaContratoDB consultaimoveisDB = new ConsultaContratoDB();
    ConexaoBD conexao = new ConexaoBD();

    /**
     * Creates new form TelaConsultarContrato
     */
    public TelaConsultarContrato() {
        initComponents();
        setIcon();
        rbMatriculaImovel.setEnabled(false);
        rbNomeCliente.setEnabled(false);
        txtPesquisarContrato.setEnabled(false);
        btnPesquisarContrato.setEnabled(false);
        btnNovoConsultarContrato.setEnabled(true);
        btnCancelarConsultarContrato.setEnabled(false);
        btnInativarConsultarContrato.setEnabled(false);
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
        btnPesquisarContrato = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTConsultaContrato = new javax.swing.JTable();
        btnNovoConsultarContrato = new javax.swing.JButton();
        btnCancelarConsultarContrato = new javax.swing.JButton();
        btnInativarConsultarContrato = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1008, 681));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/FRimoveis/icones/Capturar.JPG"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 2, 36)); // NOI18N
        jLabel2.setText("Consultar Contrato");

        rbMatriculaImovel.setBackground(new java.awt.Color(255, 255, 255));
        bgEscolhaPesquisa.add(rbMatriculaImovel);
        rbMatriculaImovel.setText("Matricula do Imovel");
        rbMatriculaImovel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbMatriculaImovelMouseClicked(evt);
            }
        });

        rbNomeCliente.setBackground(new java.awt.Color(255, 255, 255));
        bgEscolhaPesquisa.add(rbNomeCliente);
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

        btnPesquisarContrato.setText("Pesquisar");
        btnPesquisarContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarContratoActionPerformed(evt);
            }
        });

        jTConsultaContrato.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTConsultaContrato);

        btnNovoConsultarContrato.setText("Novo");
        btnNovoConsultarContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoConsultarContratoActionPerformed(evt);
            }
        });

        btnCancelarConsultarContrato.setText("Cancelar");
        btnCancelarConsultarContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarConsultarContratoActionPerformed(evt);
            }
        });

        btnInativarConsultarContrato.setText("Inativar Contrato");

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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtPesquisarContrato, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rbNomeCliente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbMatriculaImovel)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPesquisarContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnNovoConsultarContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelarConsultarContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnInativarConsultarContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPesquisarContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisarContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovoConsultarContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelarConsultarContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInativarConsultarContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        btnPesquisarContrato.setEnabled(true);
        btnNovoConsultarContrato.setEnabled(false);
        btnCancelarConsultarContrato.setEnabled(true);
        btnInativarConsultarContrato.setEnabled(true);
        jTConsultaContrato.setEnabled(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNovoConsultarContratoActionPerformed

    private void btnCancelarConsultarContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarConsultarContratoActionPerformed
        rbMatriculaImovel.setEnabled(false);
        rbNomeCliente.setEnabled(false);
        txtPesquisarContrato.setEnabled(false);
        btnPesquisarContrato.setEnabled(false);
        btnNovoConsultarContrato.setEnabled(true);
        btnCancelarConsultarContrato.setEnabled(false);
        btnInativarConsultarContrato.setEnabled(false);
        jTConsultaContrato.setEnabled(false);
        txtPesquisarContrato.setText("");

        ArrayList dados = new ArrayList();
        String[] colunas = new String[]{};
        dados.add(new Object[]{});
        CadastroContratoTabela tabela = new CadastroContratoTabela(dados, colunas);
        jTConsultaContrato.setModel(tabela);

        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarConsultarContratoActionPerformed

    private void btnPesquisarContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarContratoActionPerformed
        if (txtPesquisarContrato.getText().isEmpty()) {
            try {
                dadosTabela("select DISTINCT tbcontratos.idcontrato, tbcontratos.statusContrato, tbpessoas.nomeCliente, tbpessoas.NomeFantasia, tbpessoas.cnpjcpf, tbpessoas.perfil, tbpessoas.telefonePessoa, tbpessoas.emailPessoa, tbimoveis.statusImovel, tbimoveis.enderecoimovel, tbimoveis.bairroImovel, tbimoveis.aluguelImovel, tbimoveis.matriculaImovel"
                    + " from tbcontratos"
                    + " inner join tbpessoas"
                    + " on tbcontratos.tbpessoas_idpessoa = tbpessoas.idpessoa"
                    + " inner join tbimoveis"
                    + " on tbcontratos.tbimoveis_idimovel = tbimoveis.idimovel ");                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, "Nenhum Contrato encontrado!!\nFavor tentar novamente!");
            }
            
        } else if (rbNomeCliente.isSelected()) {
            try {
                dadosTabela("select DISTINCTROW tbcontratos.idcontrato, tbcontratos.statusContrato, tbpessoas.nomeCliente, tbpessoas.NomeFantasia, tbpessoas.cnpjcpf, tbpessoas.perfil, tbpessoas.telefonePessoa, tbpessoas.emailPessoa, tbimoveis.statusImovel, tbimoveis.enderecoimovel, tbimoveis.bairroImovel, tbimoveis.aluguelImovel, tbimoveis.matriculaImovel"
                    + " from tbcontratos "
                    + " inner join tbimoveis"
                    + " on tbcontratos.tbimoveis_idimovel = tbimoveis.idimovel"
                    + " inner join tbpessoas"
                    + " where tbpessoas.nomeCliente like '%" + txtPesquisarContrato.getText() + "%'"
                    + " and tbcontratos.tbimoveis_idimovel = tbimoveis.idimovel and tbcontratos.tbpessoas_idpessoa = tbpessoas.idpessoa group by tbcontratos.idcontrato");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, "Cliente não encontrada!\nFavor tentar novamente!");
            }
            
        } else if (rbMatriculaImovel.isSelected()) {
            try {
                dadosTabela("select DISTINCT tbcontratos.idcontrato, tbcontratos.statusContrato, tbpessoas.nomeCliente, tbpessoas.NomeFantasia, tbpessoas.cnpjcpf, tbpessoas.perfil, tbpessoas.telefonePessoa, tbpessoas.emailPessoa, tbimoveis.statusImovel, tbimoveis.enderecoimovel, tbimoveis.bairroImovel, tbimoveis.aluguelImovel, tbimoveis.matriculaImovel"
                    + " from tbcontratos "
                    + " inner join tbpessoas"
                    + " on tbcontratos.tbpessoas_idpessoa = tbpessoas.idpessoa"
                    + " inner join tbimoveis"
                    + " where tbimoveis.matriculaImovel like '%" + txtPesquisarContrato.getText() + "%'"
                    + " and tbcontratos.tbimoveis_idimovel = tbimoveis.idimovel and tbcontratos.tbpessoas_idpessoa = tbpessoas.idpessoa group by tbcontratos.idcontrato");                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, "Matricula não encontrada!\nFavor tentar novamente!");
            }
        }
    }//GEN-LAST:event_btnPesquisarContratoActionPerformed

    private void rbNomeClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbNomeClienteMouseClicked
        txtPesquisarContrato.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_rbNomeClienteMouseClicked

    private void rbMatriculaImovelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbMatriculaImovelMouseClicked
        txtPesquisarContrato.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_rbMatriculaImovelMouseClicked

    public void dadosTabela(String sql) {
        ArrayList dados = new ArrayList();
        String[] colunas = new String[]{"Status Contrato", "Nome Cliente", "Nome Fantasia", "CPF / CNPJ", "Perfil", "Telefone", "E-mail", "Status Imovel", "Endereço Imovel", "Bairro Imovel", "Alugel Imovel", "Matricula"};
        conexao.conectar();
        conexao.executaSql(sql);
        try {
            conexao.rs.first();
            do {
                dados.add(new Object[]{conexao.rs.getString("statusContrato"), conexao.rs.getString("nomeCliente"), conexao.rs.getString("NomeFantasia"), conexao.rs.getString("cnpjcpf"), conexao.rs.getString("perfil"), conexao.rs.getString("telefonePessoa"), conexao.rs.getString("emailPessoa"), conexao.rs.getString("statusImovel"), conexao.rs.getString("enderecoimovel"), conexao.rs.getString("bairroImovel"), conexao.rs.getString("aluguelImovel"), conexao.rs.getString("matriculaImovel")});
            } while (conexao.rs.next());
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(rootPane, "Valor na busca Invalido!!\nFavor tentar novamente!");
        }
        ConsultaContratoTela tabela = new ConsultaContratoTela(dados, colunas);

        jTConsultaContrato.setModel(tabela);

        jTConsultaContrato.getColumnModel().getColumn(0).setPreferredWidth(100);
        jTConsultaContrato.getColumnModel().getColumn(0).setResizable(false);

        jTConsultaContrato.getColumnModel().getColumn(1).setPreferredWidth(170);
        jTConsultaContrato.getColumnModel().getColumn(1).setResizable(false);

        jTConsultaContrato.getColumnModel().getColumn(2).setPreferredWidth(170);
        jTConsultaContrato.getColumnModel().getColumn(2).setResizable(false);

        jTConsultaContrato.getColumnModel().getColumn(3).setPreferredWidth(129);
        jTConsultaContrato.getColumnModel().getColumn(3).setResizable(false);

        jTConsultaContrato.getColumnModel().getColumn(4).setPreferredWidth(80);
        jTConsultaContrato.getColumnModel().getColumn(4).setResizable(false);

        jTConsultaContrato.getColumnModel().getColumn(5).setPreferredWidth(110);
        jTConsultaContrato.getColumnModel().getColumn(5).setResizable(false);

        jTConsultaContrato.getColumnModel().getColumn(6).setPreferredWidth(170);
        jTConsultaContrato.getColumnModel().getColumn(6).setResizable(false);

        jTConsultaContrato.getColumnModel().getColumn(7).setPreferredWidth(100);
        jTConsultaContrato.getColumnModel().getColumn(7).setResizable(false);

        jTConsultaContrato.getColumnModel().getColumn(8).setPreferredWidth(150);
        jTConsultaContrato.getColumnModel().getColumn(8).setResizable(false);

        jTConsultaContrato.getColumnModel().getColumn(9).setPreferredWidth(100);
        jTConsultaContrato.getColumnModel().getColumn(9).setResizable(false);

        jTConsultaContrato.getColumnModel().getColumn(10).setPreferredWidth(100);
        jTConsultaContrato.getColumnModel().getColumn(10).setResizable(false);

        jTConsultaContrato.getColumnModel().getColumn(11).setPreferredWidth(100);
        jTConsultaContrato.getColumnModel().getColumn(11).setResizable(false);

        jTConsultaContrato.getTableHeader().setReorderingAllowed(false);
        jTConsultaContrato.setAutoResizeMode(jTConsultaContrato.AUTO_RESIZE_OFF);
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
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaConsultarContrato().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgEscolhaPesquisa;
    private javax.swing.JButton btnCancelarConsultarContrato;
    private javax.swing.JButton btnInativarConsultarContrato;
    private javax.swing.JButton btnNovoConsultarContrato;
    private javax.swing.JButton btnPesquisarContrato;
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
