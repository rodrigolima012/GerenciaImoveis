/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.FRimoveis.dao;

import br.com.FRimoveis.Conexao.ConexaoBD;
import br.com.FRimoveis.Desenvolvimento.CadastroContrato;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author rodrigolima
 */
public class CadastroContratoDB {
    ConexaoBD connectarBanco = new ConexaoBD();
    CadastroContrato contrato = new CadastroContrato();

    public void adicionaContrato(CadastroContrato contrato) {
        connectarBanco.conectar();
        try {
            PreparedStatement pst = connectarBanco.con.prepareStatement("INSERT INTO tbcontratos(datainicial, datafinal, statusContrato, tbpessoas_idpessoa, tbimoveis_idimovel) VALUES (?,?,?,?,?)");
            pst.setDate(1,(Date) contrato.getDataInicial());
            pst.setDate(2,(Date) contrato.getDataFinal());
            pst.setString(3, contrato.getStatusContrato());
            pst.setInt(4, contrato.getIdPessoa());
            pst.setInt(5, contrato.getIdImovel());
            pst.execute();
            pst.close();
            connectarBanco.desconectar();
        } catch (SQLException u) {
            JOptionPane.showMessageDialog(null, "Erro ao adicionar o Contrato! \n" + u.getMessage());
        }
    }
}
