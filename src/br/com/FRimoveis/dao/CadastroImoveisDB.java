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
            PreparedStatement pst = connectarBanco.con.prepareStatement("INSERT INTO tbimoveis(statusImovel, enderecoimovel, bairroImovel, cepImovel, numeroCasa, aluguelImovel, matriculaImovel) VALUES (?,?,?,?,?,?,?)");
            pst.setString(1, imovel.getStatusImovel());
            pst.setString(2, imovel.getEnderecoImovel());
            pst.setString(3, imovel.getBairroImovel());
            pst.setString(4, imovel.getCepImovel());
            pst.setString(5, imovel.getNumeroImovel());
            pst.setDouble(6, imovel.getAluguelCasa());
            pst.setString(7, imovel.getMatriculaImovel());            
            pst.execute();
            pst.close();
            connectarBanco.desconectar();
        } catch (SQLException u) {
            JOptionPane.showMessageDialog(null, "Erro ao adicionar o usuario! \n" + u.getMessage());
        }
    }

}
