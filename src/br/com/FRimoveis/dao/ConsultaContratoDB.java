/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.FRimoveis.dao;

import br.com.FRimoveis.Conexao.ConexaoBD;
import br.com.FRimoveis.Desenvolvimento.ConsultaContrato;
import javax.swing.JOptionPane;

/**
 *
 * @author rodrigolima
 */
public class ConsultaContratoDB {
    ConexaoBD connectarBanco = new ConexaoBD();
    
    public void pesquisaUsuario(ConsultaContrato consulta) {
        connectarBanco.conectar();
        connectarBanco.executaSql("select * from tbusuarios where nomeUsuario like '%" + consulta.getPesquisarContrato()+ "%'");
        try {
            connectarBanco.rs.first();            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Usuario não Cadastrado!!\n Digite novamente!");            
        }
        connectarBanco.desconectar();
    }
    
}
