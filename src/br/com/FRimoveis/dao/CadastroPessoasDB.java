/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.FRimoveis.dao;

import br.com.FRimoveis.Conexao.ConexaoBD;
import br.com.FRimoveis.Desenvolvimento.CadastroPessoas;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author rodrigolima
 */
public class CadastroPessoasDB {

    ConexaoBD connectarBanco = new ConexaoBD();
    CadastroPessoas pessoa = new CadastroPessoas();

    public void adicionaFisica(CadastroPessoas pessoa) {
        connectarBanco.conectar();
        try {
            PreparedStatement pst = connectarBanco.con.prepareStatement("INSERT INTO tbpessoas(nomeCliente, perfil, cnpjcpf, dataNasc, enderecoPessoa, numeroCasa, bairroPessoa, cepPessoa, telefonePessoa, emailPessoa, referencia01, telefonereferencia01, referencia02, telefonereferencia02) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            pst.setString(1, pessoa.getNomeCliente());
            pst.setString(2, pessoa.getPerfil());
            pst.setString(3, pessoa.getCnpjcpf());
            pst.setDate(4, (Date) pessoa.getDataNasc());
            pst.setString(5, pessoa.getEnderecoPessoa());
            pst.setString(6, pessoa.getNumeroCasa());
            pst.setString(7, pessoa.getBairroPessoa());
            pst.setString(8, pessoa.getCepPessoa());
            pst.setString(9, pessoa.getTelefonePessoa());
            pst.setString(10, pessoa.getEmailPessoa());
            pst.setString(11, pessoa.getReferencia01());
            pst.setString(12, pessoa.getTelefonereferencia01());
            pst.setString(13, pessoa.getReferencia02());
            pst.setString(14, pessoa.getTelefonereferencia02());
            pst.execute();
            pst.close();
            connectarBanco.desconectar();
        } catch (SQLException u) {
            JOptionPane.showMessageDialog(null, "Erro ao adicionar o usuario! \n" + u.getMessage());
        }
    }

    public void adicionaJuridica(CadastroPessoas pessoa) {
        connectarBanco.conectar();
        try {
            PreparedStatement pst = connectarBanco.con.prepareStatement("INSERT INTO tbpessoas(nomeCliente, nomeFantasia, perfil, cnpjcpf, dataNasc, inscEstadual, enderecoPessoa, numeroCasa, bairroPessoa, cepPessoa, telefonePessoa, emailPessoa, referencia01, telefonereferencia01, referencia02, telefonereferencia02) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            pst.setString(1, pessoa.getNomeCliente());
            pst.setString(2, pessoa.getNomeFantasia());
            pst.setString(3, pessoa.getPerfil());
            pst.setString(4, pessoa.getCnpjcpf());
            pst.setDate(5, (Date) pessoa.getDataNasc());
            pst.setString(6, pessoa.getInscEstadual());
            pst.setString(7, pessoa.getEnderecoPessoa());
            pst.setString(8, pessoa.getNumeroCasa());
            pst.setString(9, pessoa.getBairroPessoa());
            pst.setString(10, pessoa.getCepPessoa());
            pst.setString(11, pessoa.getTelefonePessoa());
            pst.setString(12, pessoa.getEmailPessoa());
            pst.setString(13, pessoa.getReferencia01());
            pst.setString(14, pessoa.getTelefonereferencia01());
            pst.setString(15, pessoa.getReferencia02());
            pst.setString(16, pessoa.getTelefonereferencia02());
            pst.execute();
            pst.close();
            connectarBanco.desconectar();
        } catch (SQLException u) {
            JOptionPane.showMessageDialog(null, "Erro ao adicionar o usuario! \n" + u.getMessage());
        }
    }

    public CadastroPessoas pesquisaUsuario(CadastroPessoas pessoa) {
        connectarBanco.conectar();
        connectarBanco.executaSql("select * from tbpessoas where nomeCliente like '%" + pessoa.getPesquisaPessoa() + "%'");
        try {
            connectarBanco.rs.first();
            pessoa.setIdpessoa(connectarBanco.rs.getString("idpessoa"));
            pessoa.setNomeCliente(connectarBanco.rs.getString("nomeCliente"));
            pessoa.setNomeFantasia(connectarBanco.rs.getString("nomeFantasia"));
            pessoa.setPerfil(connectarBanco.rs.getString("perfil"));
            pessoa.setCnpjcpf(connectarBanco.rs.getString("cnpjcpf"));
            pessoa.setDataNasc(connectarBanco.rs.getDate("dataNasc"));
            pessoa.setInscEstadual(connectarBanco.rs.getString("inscEstadual"));
            pessoa.setEnderecoPessoa(connectarBanco.rs.getString("enderecoPessoa"));
            pessoa.setNumeroCasa(connectarBanco.rs.getString("numeroCasa"));
            pessoa.setBairroPessoa(connectarBanco.rs.getString("bairroPessoa"));
            pessoa.setCepPessoa(connectarBanco.rs.getString("cepPessoa"));
            pessoa.setTelefonePessoa(connectarBanco.rs.getString("telefonePessoa"));
            pessoa.setEmailPessoa(connectarBanco.rs.getString("emailPessoa"));
            pessoa.setReferencia01(connectarBanco.rs.getString("referencia01"));
            pessoa.setTelefonereferencia01(connectarBanco.rs.getString("telefonereferencia01"));
            pessoa.setReferencia02(connectarBanco.rs.getString("referencia02"));
            pessoa.setTelefonereferencia02(connectarBanco.rs.getString("telefonereferencia02"));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Usuario não Cadastrado!!\n Digite novamente!");
        }
        connectarBanco.desconectar();
        return pessoa;
    }

    public void editarPessoas(CadastroPessoas pessoa) {
        connectarBanco.conectar();
        try {
            PreparedStatement pst = connectarBanco.con.prepareStatement("update tbpessoas set nomeCliente = ?, nomeFantasia = ?, perfil = ?, cnpjcpf = ?, dataNasc = ?, inscEstadual = ?, enderecoPessoa = ?, numeroCasa = ?, bairroPessoa = ?, cepPessoa = ?, telefonePessoa = ?, emailPessoa = ?, referencia01 = ?, telefonereferencia01 = ?, referencia02 = ?, telefonereferencia02 = ? where idpessoa = ?");
            pst.setString(1, pessoa.getNomeCliente());
            pst.setString(2, pessoa.getNomeFantasia());
            pst.setString(3, pessoa.getPerfil());
            pst.setString(4, pessoa.getCnpjcpf());
            pst.setDate(5, (Date) pessoa.getDataNasc());
            pst.setString(6, pessoa.getInscEstadual());
            pst.setString(7, pessoa.getEnderecoPessoa());
            pst.setString(8, pessoa.getNumeroCasa());
            pst.setString(9, pessoa.getBairroPessoa());
            pst.setString(10, pessoa.getCepPessoa());
            pst.setString(11, pessoa.getTelefonePessoa());
            pst.setString(12, pessoa.getEmailPessoa());
            pst.setString(13, pessoa.getReferencia01());
            pst.setString(14, pessoa.getTelefonereferencia01());
            pst.setString(15, pessoa.getReferencia02());
            pst.setString(16, pessoa.getTelefonereferencia02());
            pst.setString(17, pessoa.getIdpessoa());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Usuarios Atualizado com Sucesso!!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao editar o usuario! \n" + e.getMessage());
        }
        connectarBanco.desconectar();
    }

    public void excluirPessoa(CadastroPessoas pessoa) {
        connectarBanco.conectar();
        try {
            PreparedStatement pst = connectarBanco.con.prepareStatement("delete from tbpessoas where idpessoa = ?");
            pst.setString(1, pessoa.getIdpessoa());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Cliente deletado com Sucesso!!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao deletar o Cliente! \n" + e.getMessage());
        }

        connectarBanco.desconectar();
    }

}
