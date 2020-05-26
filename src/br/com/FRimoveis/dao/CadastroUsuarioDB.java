/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.FRimoveis.dao;

import br.com.FRimoveis.Conexao.ConexaoBD;
import br.com.FRimoveis.Desenvolvimento.CadastroUsuarios;
import java.sql.*;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author rodrigolima
 */
public class CadastroUsuarioDB {

   
    ConexaoBD connectarBanco = new ConexaoBD();
    CadastroUsuarios usuario = new CadastroUsuarios();

   

    public void adiciona(CadastroUsuarios usuario) {
        connectarBanco.conectar();
        try {
            PreparedStatement pst = connectarBanco.con.prepareStatement("INSERT INTO tbusuarios(perfilUser, nomeUsuario, login, senha) VALUES (?,?,?,?)");
            pst.setString(1, usuario.getPerfilUsuario());
            pst.setString(2, usuario.getNomeUsuario());
            pst.setString(3, usuario.getLoginUsuario());
            pst.setString(4, usuario.getSenhaUsuario());
            pst.execute();
            pst.close();
            connectarBanco.desconectar();
        } catch (SQLException u) {
            JOptionPane.showMessageDialog(null, "Erro ao adicionar o usuario! \n" + u.getMessage());
        }
    }
    
    public CadastroUsuarios pesquisaUsuario(CadastroUsuarios usuario){
        connectarBanco.conectar();
        connectarBanco.executaSql("select * from tbusuarios where idusuarios like '%"+usuario.getIdUsuario()+"%'");
        try {
            connectarBanco.rs.first();
            usuario.setIdUsuario(connectarBanco.rs.getString("idusuarios"));
            usuario.setPerfilUsuario(connectarBanco.rs.getString("perfilUser"));
            usuario.setNomeUsuario(connectarBanco.rs.getString("nomeUsuario"));
            usuario.setLoginUsuario(connectarBanco.rs.getString("login"));
            usuario.setSenhaUsuario(connectarBanco.rs.getString("senha"));            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao pesquisar o usuario! \n" + e.getMessage());
        }       
        connectarBanco.desconectar();
        return usuario;
    }
}
