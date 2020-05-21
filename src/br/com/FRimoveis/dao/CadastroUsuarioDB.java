/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.FRimoveis.dao;

import br.com.FRimoveis.Desenvolvimento.CadastroUsuarios;
import java.sql.*;
import java.sql.PreparedStatement;

/**
 *
 * @author rodrigolima
 */
public class CadastroUsuarioDB {

    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public CadastroUsuarioDB() {
        conexao = ConexaoBD.conectar();
    }

    public void adiciona(CadastroUsuarios usuario) {
        String sql = "INSERT INTO tbusuarios(perfilUser, nomeUsuario, login, senha) VALUES (?,?,?,?)";
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, usuario.getPerfilUsuario());
            pst.setString(2, usuario.getNomeUsuario());
            pst.setString(3, usuario.getLoginUsuario());
            pst.setString(4, usuario.getSenhaUsuario());

            pst.execute();
            pst.close();
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }
}
