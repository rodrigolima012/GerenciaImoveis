/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.FRimoveis.dao;

import br.com.FRimoveis.Conexao.ConexaoBD;
import br.com.FRimoveis.Desenvolvimento.CadastroUsuarios;
import br.com.FRimoveis.Desenvolvimento.LoginUsuario;
import br.com.FRimoveis.telas.TelaPrincipal;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author rodrigolima
 */
public class LoginUsuarioDB {

    ConexaoBD connectarBanco = new ConexaoBD();
    CadastroUsuarios usuario = new CadastroUsuarios();

    public void logar(LoginUsuario login) {
        connectarBanco.conectar();
        try {
            PreparedStatement pst = connectarBanco.con.prepareStatement("select * from tbusuarios where login = ? and senha = ?");
            pst.setString(1, login.getLoginUsuario());
            pst.setString(2, login.getSenhaUsuario());
            connectarBanco.rs = pst.executeQuery();

            if (connectarBanco.rs.next()) {
                String perfil = connectarBanco.rs.getString(2);
                if (perfil.equalsIgnoreCase("ADMINISTRADOR")) {
                    TelaPrincipal inicial = new TelaPrincipal();
                    inicial.setVisible(true);
                    TelaPrincipal.menuUsuarios.setEnabled(true);
                    TelaPrincipal.menuImoveis.setEnabled(false);
                    TelaPrincipal.menuPessoas.setEnabled(false);
                    TelaPrincipal.menuConsultas.setEnabled(false);
                    TelaPrincipal.menuRelatorios.setEnabled(false);
                    connectarBanco.desconectar();
                    pst.close();
                } else {
                    TelaPrincipal inicial = new TelaPrincipal();
                    inicial.setVisible(true);
                    connectarBanco.desconectar();
                    pst.close();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Usuario/Senha Invalido!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro! \n" + e.getMessage());
        }
    }

}
