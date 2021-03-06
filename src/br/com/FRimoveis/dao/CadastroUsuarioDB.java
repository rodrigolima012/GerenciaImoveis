/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.FRimoveis.dao;

import br.com.FRimoveis.Conexao.ConexaoBD;
import br.com.FRimoveis.Desenvolvimento.CadastroUsuarios;
import java.awt.HeadlessException;
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

    public CadastroUsuarios pesquisaUsuario(CadastroUsuarios usuario) {
        connectarBanco.conectar();
        connectarBanco.executaSql("select * from tbusuarios where nomeUsuario like '%" + usuario.getPesquisa() + "%'");
        try {
            connectarBanco.rs.first();
            usuario.setIdUsuario(connectarBanco.rs.getString("idusuario"));
            usuario.setPerfilUsuario(connectarBanco.rs.getString("perfilUser"));
            usuario.setNomeUsuario(connectarBanco.rs.getString("nomeUsuario"));
            usuario.setLoginUsuario(connectarBanco.rs.getString("login"));
            usuario.setSenhaUsuario(connectarBanco.rs.getString("senha"));
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Usuario não Cadastrado!!\n Digite novamente!");
        }
        connectarBanco.desconectar();
        return usuario;
    }

    public void editarUsuario(CadastroUsuarios usuario) {
        connectarBanco.conectar();
        try {
            PreparedStatement pst = connectarBanco.con.prepareStatement("update tbusuarios set perfilUser = ?, nomeUsuario = ?, login = ?, senha = ? where idusuario = ?");
            pst.setString(1, usuario.getPerfilUsuario());
            pst.setString(2, usuario.getNomeUsuario());
            pst.setString(3, usuario.getLoginUsuario());
            pst.setString(4, usuario.getSenhaUsuario());
            pst.setString(5, usuario.getIdUsuario());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Usuarios Atualizado com Sucesso!!");
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao editar o usuario! \n" + e.getMessage());
        }
        connectarBanco.desconectar();
    }

    public void excluirUsuario(CadastroUsuarios usuario) {
        connectarBanco.conectar();
        try {
            PreparedStatement pst = connectarBanco.con.prepareStatement("delete from tbusuarios where idusuario = ?");
            pst.setString(1, usuario.getIdUsuario());
            if (usuario.getIdUsuario().equalsIgnoreCase("1")) {
                JOptionPane.showMessageDialog(null, "Usuario Administrador não pode ser removido!!!");
            } else {
                pst.execute();
                JOptionPane.showMessageDialog(null, "Usuarios deletado com Sucesso!!");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao deletar o usuario! \n" + e.getMessage());
        }
        connectarBanco.desconectar();
    }

    public String atualizarTabela() {
        connectarBanco.conectar();
        String sql = ("select * from tbusuarios order by idusuario");
        connectarBanco.executaSql(sql);
        try {
            connectarBanco.rs.first();
            return sql;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar a tabela!");
        }
        connectarBanco.desconectar();
        return null;
    }

    public String atualizarTabelaPesquisar(CadastroUsuarios usuario) {
        connectarBanco.conectar();
        String sql = ("select * from tbusuarios where nomeUsuario like '%" + usuario.getPesquisa() + "%'");
        connectarBanco.executaSql(sql);
        try {
            connectarBanco.rs.first();
            return sql;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar a tabela!");
        }
        connectarBanco.desconectar();
        return null;
    }

    public void setDadosUsuario(String dados) {
        usuario = new CadastroUsuarios();
        connectarBanco.conectar();
        String sql = ("select * from tbusuarios where idusuario like '%" + dados + "%'");
        connectarBanco.executaSql(sql);
        try {
            connectarBanco.rs.first();
            usuario.setIdUsuario(connectarBanco.rs.getString("idusuario"));
            usuario.setPerfilUsuario(connectarBanco.rs.getString("perfilUser"));
            usuario.setNomeUsuario(connectarBanco.rs.getString("nomeUsuario"));
            usuario.setLoginUsuario(connectarBanco.rs.getString("login"));
            usuario.setSenhaUsuario(connectarBanco.rs.getString("senha"));

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao setar os dados!");
        }
        connectarBanco.desconectar();
    }

    public CadastroUsuarios getUsuarios() {
        return this.usuario;
    }
}
