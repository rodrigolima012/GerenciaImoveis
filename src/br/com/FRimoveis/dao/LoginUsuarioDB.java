/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.FRimoveis.dao;

import br.com.FRimoveis.Conexao.ConexaoBD;
import br.com.FRimoveis.Desenvolvimento.CadastroUsuarios;
import br.com.FRimoveis.Desenvolvimento.LoginUsuario;
import br.com.FRimoveis.telas.TelaLogin;
import br.com.FRimoveis.telas.TelaInical;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
                if (perfil.equalsIgnoreCase("ADMIN")) {
                    TelaInical inicial = new TelaInical();
                    inicial.setVisible(true);
                    TelaInical.menuUsuarios.setEnabled(true);
                    connectarBanco.desconectar();
                    pst.close();
                } else {
                    TelaInical inicial = new TelaInical();
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
