/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.FRimoveis.dao;

import br.com.FRimoveis.Conexao.ConexaoBD;
import br.com.FRimoveis.Desenvolvimento.CadastroImoveis;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author rodrigolima
 */
public class CadastroImoveisDB {

    ConexaoBD connectarBanco = new ConexaoBD();
    CadastroImoveis imovel = new CadastroImoveis();

    public void adicionaImoveis(CadastroImoveis imovel) {
        connectarBanco.conectar();
        try {
            PreparedStatement pst = connectarBanco.con.prepareStatement("INSERT INTO tbimoveis(statusImovel, enderecoimovel, bairroImovel, cepImovel, numeroCasa, aluguelImovel, matriculaImovel, urlImagens) VALUES (?,?,?,?,?,?,?,?)");
            pst.setString(1, imovel.getStatusImovel());
            pst.setString(2, imovel.getEnderecoImovel());
            pst.setString(3, imovel.getBairroImovel());
            pst.setString(4, imovel.getCepImovel());
            pst.setString(5, imovel.getNumeroImovel());
            pst.setDouble(6, imovel.getAluguelCasa());
            pst.setString(7, imovel.getMatriculaImovel()); 
            pst.setString(8, imovel.getImagensUrl()); 
            pst.execute();
            pst.close();
            connectarBanco.desconectar();
        } catch (SQLException u) {
            JOptionPane.showMessageDialog(null, "Erro ao adicionar o Imovel! \n" + u.getMessage());
        }
    }
    
    public CadastroImoveis pesquisaImovel(CadastroImoveis imovel) {
        connectarBanco.conectar();
        connectarBanco.executaSql("select * from tbimoveis where matriculaImovel like '%" + imovel.getPesquisar() + "%'");
        try {
            connectarBanco.rs.first();
            imovel.setIdimovel(connectarBanco.rs.getString("idimovel"));
            imovel.setStatusImovel(connectarBanco.rs.getString("statusImovel"));
            imovel.setEnderecoImovel(connectarBanco.rs.getString("enderecoimovel"));
            imovel.setBairroImovel(connectarBanco.rs.getString("bairroImovel"));
            imovel.setCepImovel(connectarBanco.rs.getString("cepImovel"));
            imovel.setNumeroImovel(connectarBanco.rs.getString("numeroCasa"));
            imovel.setAluguelCasa(connectarBanco.rs.getDouble("aluguelImovel"));
            imovel.setMatriculaImovel(connectarBanco.rs.getString("matriculaImovel"));
            imovel.setImagensUrl(connectarBanco.rs.getString("urlImagens"));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Imovel não Cadastrado!!\n Digite novamente!");
        }
        connectarBanco.desconectar();
        return imovel;
    }
    
    public void editarPessoas(CadastroImoveis imovel) {
        connectarBanco.conectar();
        try {
            PreparedStatement pst = connectarBanco.con.prepareStatement("update tbimoveis set statusImovel = ?, enderecoimovel = ?, bairroImovel = ?, cepImovel = ?, numeroCasa = ?, aluguelImovel = ?, matriculaImovel = ?, urlImagens = ?  where idimovel = ?");
            pst.setString(1, imovel.getStatusImovel());
            pst.setString(2, imovel.getEnderecoImovel());
            pst.setString(3, imovel.getBairroImovel());
            pst.setString(4, imovel.getCepImovel());
            pst.setString(5, imovel.getNumeroImovel());
            pst.setDouble(6, imovel.getAluguelCasa());
            pst.setString(7, imovel.getMatriculaImovel());
            pst.setString(8, imovel.getImagensUrl());
            pst.setString(9, imovel.getIdimovel());
            pst.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao editar o Imovel! \n" + e.getMessage());
        }
        connectarBanco.desconectar();
    }
    
    public void editarStatus(CadastroImoveis imovel) {
        connectarBanco.conectar();
        try {
            PreparedStatement pst = connectarBanco.con.prepareStatement("update tbimoveis set statusImovel = ? where idimovel = ?");
            pst.setString(1, imovel.getStatusImovel());
            pst.setString(2, imovel.getIdimovel());
            pst.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao editar o Imovel! \n" + e.getMessage());
        }
        connectarBanco.desconectar();
    }
    
     public void excluirImovel(CadastroImoveis imovel) {
        connectarBanco.conectar();
        try {
            PreparedStatement pst = connectarBanco.con.prepareStatement("delete from tbimoveis where idimovel = ?");
            pst.setString(1, imovel.getIdimovel());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Imovel deletado com Sucesso!!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao deletar o Cliente! \n" + e.getMessage());
        }

        connectarBanco.desconectar();
    }

}
