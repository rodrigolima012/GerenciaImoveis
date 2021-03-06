/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.FRimoveis.telas;

import br.com.FRimoveis.Conexao.ConexaoBD;
import br.com.FRimoveis.Desenvolvimento.CadastroUsuarioTabela;
import br.com.FRimoveis.Desenvolvimento.CadastroUsuarios;
import br.com.FRimoveis.dao.CadastroUsuarioDB;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;

/**
 *
 * @author rodrigolima
 */
public final class TelaCadastroUsuarios extends javax.swing.JFrame {

    CadastroUsuarios cadastroUsuarios = new CadastroUsuarios();
    CadastroUsuarioDB cadastroUsuariosDB = new CadastroUsuarioDB();
    ConexaoBD conexao = new ConexaoBD();
    int update_sel = 0;

    /**
     * Creates new form TelaCadastroUsuarios
     */
    public TelaCadastroUsuarios() {
        initComponents();
        txtIDUsuario.setEnabled(false);
        txtLoginUsuario.setEnabled(false);
        txtNomeUsuario.setEnabled(false);
        txtSenhaUsuario.setEnabled(false);
        cbPerfilUsuario.setEnabled(false);
        btnCancelarUsuario.setEnabled(false);
        btnEditarUsuario.setEnabled(false);
        btnExcluirUsuario.setEnabled(false);
        btnSalvarUsuario.setEnabled(false);
        setIcon();
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
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cbPerfilUsuario = new javax.swing.JComboBox<>();
        txtNomeUsuario = new javax.swing.JTextField();
        txtLoginUsuario = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtIDUsuario = new javax.swing.JTextField();
        btnSalvarUsuario = new javax.swing.JButton();
        btnCancelarUsuario = new javax.swing.JButton();
        btnExcluirUsuario = new javax.swing.JButton();
        btnEditarUsuario = new javax.swing.JButton();
        txtSenhaUsuario = new javax.swing.JPasswordField();
        txtBuscarUsuario = new javax.swing.JTextField();
        btnNovoUsuario = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTUsuarios = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("FR - Gerenciador de Imoveis - Cadastro de Usuarios");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/FRimoveis/icones/Capturar.JPG"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 36)); // NOI18N
        jLabel1.setText("Cadastro de Usuarios");

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N
        jLabel2.setText("Perfil Usuario:");

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N
        jLabel3.setText("Login:");

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N
        jLabel4.setText("Nome Usuario:");

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N
        jLabel5.setText("Senha:");

        cbPerfilUsuario.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        cbPerfilUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbPerfilUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPerfilUsuarioActionPerformed(evt);
            }
        });

        txtNomeUsuario.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtNomeUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeUsuarioActionPerformed(evt);
            }
        });

        txtLoginUsuario.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N
        jLabel6.setText("ID Usuario:");

        txtIDUsuario.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtIDUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIDUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDUsuarioActionPerformed(evt);
            }
        });

        btnSalvarUsuario.setBackground(new java.awt.Color(204, 204, 204));
        btnSalvarUsuario.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        btnSalvarUsuario.setText("Salvar");
        btnSalvarUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalvarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarUsuarioActionPerformed(evt);
            }
        });

        btnCancelarUsuario.setBackground(new java.awt.Color(204, 204, 204));
        btnCancelarUsuario.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        btnCancelarUsuario.setText("Cancelar");
        btnCancelarUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarUsuarioActionPerformed(evt);
            }
        });

        btnExcluirUsuario.setBackground(new java.awt.Color(204, 204, 204));
        btnExcluirUsuario.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        btnExcluirUsuario.setText("Excluir");
        btnExcluirUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExcluirUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirUsuarioActionPerformed(evt);
            }
        });

        btnEditarUsuario.setBackground(new java.awt.Color(204, 204, 204));
        btnEditarUsuario.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        btnEditarUsuario.setText("Editar");
        btnEditarUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarUsuarioActionPerformed(evt);
            }
        });

        txtSenhaUsuario.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        txtBuscarUsuario.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtBuscarUsuario.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtBuscarUsuario.setToolTipText("Informe o nome do usuario!");
        txtBuscarUsuario.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        txtBuscarUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarUsuarioKeyReleased(evt);
            }
        });

        btnNovoUsuario.setBackground(new java.awt.Color(204, 204, 204));
        btnNovoUsuario.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        btnNovoUsuario.setText("Novo");
        btnNovoUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNovoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoUsuarioActionPerformed(evt);
            }
        });

        jTUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTUsuariosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTUsuarios);

        jLabel8.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 51));
        jLabel8.setText("TODOS OS CAMPOS SÃO OBRIGATORIOS!");

        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel9.setText("Pesquisa por Nome:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtNomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtLoginUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtIDUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel2)
                                        .addGap(10, 10, 10)
                                        .addComponent(cbPerfilUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnNovoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSalvarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCancelarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnExcluirUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnEditarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBuscarUsuario)
                            .addComponent(txtSenhaUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE))))
                .addGap(17, 17, 17))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(26, 26, 26))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbPerfilUsuario)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtIDUsuario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtNomeUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtLoginUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtSenhaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluirUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBuscarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNovoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        setSize(new java.awt.Dimension(1021, 472));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cbPerfilUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPerfilUsuarioActionPerformed
    }//GEN-LAST:event_cbPerfilUsuarioActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        cbPerfilUsuario.removeAllItems();
        cbPerfilUsuario.addItem("");
        cbPerfilUsuario.addItem("ADMIN");
        cbPerfilUsuario.addItem("USUARIO");
    }//GEN-LAST:event_formWindowActivated

    private void btnSalvarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarUsuarioActionPerformed
        switch (update_sel) {
            case 1:
                cadastroUsuarios.setPerfilUsuario(cbPerfilUsuario.getSelectedItem().toString());
                cadastroUsuarios.setNomeUsuario(txtNomeUsuario.getText());
                cadastroUsuarios.setLoginUsuario(txtLoginUsuario.getText());
                cadastroUsuarios.setSenhaUsuario(txtSenhaUsuario.getText());
                if ((cbPerfilUsuario.getSelectedItem().toString().isEmpty()) || (txtNomeUsuario.getText().isEmpty()) || (txtLoginUsuario.getText().isEmpty()) || (txtSenhaUsuario.getText().isEmpty())) {
                    JOptionPane.showMessageDialog(null, "Os campos não podem retornar vazios");
                } else {
                    cadastroUsuariosDB.adiciona(cadastroUsuarios);
                    JOptionPane.showMessageDialog(null, "Usuário " + txtNomeUsuario.getText() + " inserido com sucesso! ");
                }
                cbPerfilUsuario.setSelectedItem("");
                txtNomeUsuario.setText("");
                txtLoginUsuario.setText("");
                txtSenhaUsuario.setText("");

                break;
            case 2:
                cadastroUsuarios.setIdUsuario(txtIDUsuario.getText());
                cadastroUsuarios.setPerfilUsuario(cbPerfilUsuario.getSelectedItem().toString());
                cadastroUsuarios.setNomeUsuario(txtNomeUsuario.getText());
                cadastroUsuarios.setLoginUsuario(txtLoginUsuario.getText());
                cadastroUsuarios.setSenhaUsuario(txtSenhaUsuario.getText());
                cadastroUsuariosDB.editarUsuario(cadastroUsuarios);
                txtIDUsuario.setText("");
                txtNomeUsuario.setText("");
                txtLoginUsuario.setText("");
                txtSenhaUsuario.setText("");
                txtBuscarUsuario.setText("");
                cbPerfilUsuario.setSelectedItem("");
                txtIDUsuario.setEnabled(false);
                txtLoginUsuario.setEnabled(false);
                txtNomeUsuario.setEnabled(false);
                txtSenhaUsuario.setEnabled(false);
                cbPerfilUsuario.setEnabled(false);
                txtBuscarUsuario.setEnabled(true);
                btnCancelarUsuario.setEnabled(false);
                btnEditarUsuario.setEnabled(false);
                btnExcluirUsuario.setEnabled(false);
                btnSalvarUsuario.setEnabled(false);
                btnNovoUsuario.setEnabled(true);

                break;
        }
        String sql = cadastroUsuariosDB.atualizarTabela();
        dadosTabela(sql);
    }//GEN-LAST:event_btnSalvarUsuarioActionPerformed

    private void btnEditarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarUsuarioActionPerformed
        update_sel = 2;
        txtBuscarUsuario.setEnabled(false);
        txtLoginUsuario.setEnabled(true);
        txtNomeUsuario.setEnabled(true);
        txtSenhaUsuario.setEnabled(true);
        cbPerfilUsuario.setEnabled(true);
        btnCancelarUsuario.setEnabled(true);
        btnEditarUsuario.setEnabled(false);
        btnExcluirUsuario.setEnabled(false);
        btnSalvarUsuario.setEnabled(true);
        btnNovoUsuario.setEnabled(false);
    }//GEN-LAST:event_btnEditarUsuarioActionPerformed

    private void btnCancelarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarUsuarioActionPerformed
        txtIDUsuario.setText("");
        txtNomeUsuario.setText("");
        txtLoginUsuario.setText("");
        txtSenhaUsuario.setText("");
        cbPerfilUsuario.setSelectedItem("");
        txtBuscarUsuario.setText("");
        txtLoginUsuario.setEnabled(false);
        txtNomeUsuario.setEnabled(false);
        txtSenhaUsuario.setEnabled(false);
        cbPerfilUsuario.setEnabled(false);
        txtBuscarUsuario.setEnabled(true);
        btnCancelarUsuario.setEnabled(false);
        btnEditarUsuario.setEnabled(false);
        btnExcluirUsuario.setEnabled(false);
        btnSalvarUsuario.setEnabled(false);
        btnNovoUsuario.setEnabled(true);
        String sql = cadastroUsuariosDB.atualizarTabela();
        dadosTabela(sql);
    }//GEN-LAST:event_btnCancelarUsuarioActionPerformed

    private void txtIDUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDUsuarioActionPerformed

    private void txtNomeUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeUsuarioActionPerformed

    private void btnNovoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoUsuarioActionPerformed
        update_sel = 1;
        txtIDUsuario.setText("");
        cbPerfilUsuario.setSelectedItem("");
        txtNomeUsuario.setText("");
        txtLoginUsuario.setText("");
        txtSenhaUsuario.setText("");
        btnCancelarUsuario.setEnabled(true);
        btnEditarUsuario.setEnabled(false);
        btnExcluirUsuario.setEnabled(false);
        btnSalvarUsuario.setEnabled(true);
        btnNovoUsuario.setEnabled(false);
        txtBuscarUsuario.setEnabled(false);
        txtLoginUsuario.setEnabled(true);
        txtNomeUsuario.setEnabled(true);
        txtSenhaUsuario.setEnabled(true);
        cbPerfilUsuario.setEnabled(true);
    }//GEN-LAST:event_btnNovoUsuarioActionPerformed

    private void btnExcluirUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirUsuarioActionPerformed
        int res;
        res = JOptionPane.showConfirmDialog(rootPane, "Deseja Remover o usuarios?");
        if (res == JOptionPane.YES_OPTION) {
            cadastroUsuarios.setIdUsuario(txtIDUsuario.getText());
            cadastroUsuariosDB.excluirUsuario(cadastroUsuarios);
            txtIDUsuario.setText("");
            txtNomeUsuario.setText("");
            txtLoginUsuario.setText("");
            txtSenhaUsuario.setText("");
            txtBuscarUsuario.setText("");
            cbPerfilUsuario.setSelectedItem("");
            txtIDUsuario.setEnabled(false);
            txtLoginUsuario.setEnabled(false);
            txtNomeUsuario.setEnabled(false);
            txtSenhaUsuario.setEnabled(false);
            cbPerfilUsuario.setEnabled(false);
            txtBuscarUsuario.setEnabled(true);
            btnCancelarUsuario.setEnabled(false);
            btnEditarUsuario.setEnabled(false);
            btnExcluirUsuario.setEnabled(false);
            btnSalvarUsuario.setEnabled(false);
            btnNovoUsuario.setEnabled(true);
            String sql = cadastroUsuariosDB.atualizarTabela();
            dadosTabela(sql);
        }
    }//GEN-LAST:event_btnExcluirUsuarioActionPerformed

    private void jTUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTUsuariosMouseClicked
        String nome_usuario = "" + jTUsuarios.getValueAt(jTUsuarios.getSelectedRow(), 0);
        cadastroUsuariosDB.setDadosUsuario(nome_usuario);

        cadastroUsuarios = cadastroUsuariosDB.getUsuarios();

        txtIDUsuario.setText(cadastroUsuarios.getIdUsuario());
        cbPerfilUsuario.setSelectedItem(cadastroUsuarios.getPerfilUsuario());
        txtNomeUsuario.setText(cadastroUsuarios.getNomeUsuario());
        txtLoginUsuario.setText(cadastroUsuarios.getLoginUsuario());
        txtSenhaUsuario.setText(cadastroUsuarios.getSenhaUsuario());

        btnCancelarUsuario.setEnabled(true);
        btnEditarUsuario.setEnabled(true);
        btnExcluirUsuario.setEnabled(true);
        txtBuscarUsuario.setEnabled(true);
        btnSalvarUsuario.setEnabled(false);
        btnNovoUsuario.setEnabled(false);

        txtIDUsuario.setEnabled(false);
        txtLoginUsuario.setEnabled(false);
        txtNomeUsuario.setEnabled(false);
        txtSenhaUsuario.setEnabled(false);
        cbPerfilUsuario.setEnabled(false);
    }//GEN-LAST:event_jTUsuariosMouseClicked

    private void txtBuscarUsuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarUsuarioKeyReleased
        txtIDUsuario.setText("");
        txtNomeUsuario.setText("");
        txtLoginUsuario.setText("");
        txtSenhaUsuario.setText("");
        cbPerfilUsuario.setSelectedItem("");
        btnCancelarUsuario.setEnabled(true);
        btnEditarUsuario.setEnabled(false);
        btnExcluirUsuario.setEnabled(false);
        btnSalvarUsuario.setEnabled(false);
        btnNovoUsuario.setEnabled(true);

        if (txtBuscarUsuario.getText().isEmpty()) {
            String sql = cadastroUsuariosDB.atualizarTabela();
            dadosTabela(sql);
        } else {
            cadastroUsuarios.setPesquisa(txtBuscarUsuario.getText());
            CadastroUsuarios model = cadastroUsuariosDB.pesquisaUsuario(cadastroUsuarios);
            try {
                String sql = cadastroUsuariosDB.atualizarTabelaPesquisar(model);
                dadosTabela(sql);
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_txtBuscarUsuarioKeyReleased

    public void dadosTabela(String sql) {
        ArrayList dados = new ArrayList();
        String[] colunas = new String[]{"ID Usuario", "Nome Usuario", "Login Usuario", "Perfil Usuario"};
        conexao.conectar();
        conexao.executaSql(sql);
        try {
            conexao.rs.first();
            do {
                dados.add(new Object[]{conexao.rs.getString("idusuario"), conexao.rs.getString("nomeUsuario"), conexao.rs.getString("login"), conexao.rs.getString("perfilUser")});
            } while (conexao.rs.next());
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao preencher as tabelas! \n" + e.getMessage());
        }
        CadastroUsuarioTabela tabela = new CadastroUsuarioTabela(dados, colunas);

        jTUsuarios.setModel(tabela);
        jTUsuarios.getColumnModel().getColumn(0).setPreferredWidth(100);
        jTUsuarios.getColumnModel().getColumn(0).setResizable(false);

        jTUsuarios.getColumnModel().getColumn(1).setPreferredWidth(401);
        jTUsuarios.getColumnModel().getColumn(1).setResizable(false);

        jTUsuarios.getColumnModel().getColumn(2).setPreferredWidth(255);
        jTUsuarios.getColumnModel().getColumn(2).setResizable(false);

        jTUsuarios.getColumnModel().getColumn(3).setPreferredWidth(219);
        jTUsuarios.getColumnModel().getColumn(3).setResizable(false);

        jTUsuarios.getTableHeader().setReorderingAllowed(false);
        jTUsuarios.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        jTUsuarios.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

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
            java.util.logging.Logger.getLogger(TelaCadastroUsuarios.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroUsuarios.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroUsuarios.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroUsuarios.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new TelaCadastroUsuarios().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelarUsuario;
    private javax.swing.JButton btnEditarUsuario;
    private javax.swing.JButton btnExcluirUsuario;
    private javax.swing.JButton btnNovoUsuario;
    private javax.swing.JButton btnSalvarUsuario;
    private javax.swing.JComboBox<String> cbPerfilUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTUsuarios;
    private javax.swing.JTextField txtBuscarUsuario;
    private javax.swing.JTextField txtIDUsuario;
    private javax.swing.JTextField txtLoginUsuario;
    private javax.swing.JTextField txtNomeUsuario;
    private javax.swing.JPasswordField txtSenhaUsuario;
    // End of variables declaration//GEN-END:variables

}
