/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.FRimoveis.dao;

import br.com.FRimoveis.Desenvolvimento.LoginUsuario;
import br.com.FRimoveis.telas.TelaAcesso;
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

    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public LoginUsuarioDB() {
        conexao = ConexaoBD.conectar();
    }

    public void logar(LoginUsuario login) {
        String sql = "select * from tbusuarios where login = ? and senha = ?";
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, login.getLoginUsuario());
            pst.setString(2, login.getSenhaUsuario());
            rs = pst.executeQuery();

            if (rs.next()) {
                String perfil = rs.getString(2);
                if (perfil.equalsIgnoreCase("ADMIN")) {
                    TelaInical inicial = new TelaInical();
                    inicial.setVisible(true);
                    TelaInical.menuUsuarios.setEnabled(true);
                    conexao.close();
                    pst.close();
                } else {
                    TelaInical inicial = new TelaInical();
                    inicial.setVisible(true);
                    conexao.close();
                    pst.close();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Usuario/Senha Invalido!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

}
