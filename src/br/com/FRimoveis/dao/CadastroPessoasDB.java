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

}
