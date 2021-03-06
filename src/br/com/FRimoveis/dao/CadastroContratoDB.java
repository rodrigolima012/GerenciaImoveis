/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.FRimoveis.dao;

import br.com.FRimoveis.Conexao.ConexaoBD;
import br.com.FRimoveis.Desenvolvimento.CadastroContrato;
import br.com.FRimoveis.Desenvolvimento.CadastroImoveis;
import br.com.FRimoveis.Desenvolvimento.CadastroPessoas;
import br.com.FRimoveis.telas.TelaGerarContrato;
import br.com.FRimoveis.telas.TelaPrincipal;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRExporter;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.export.JRPdfExporter;

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
            pst.setDate(1, (Date) contrato.getDataInicial());
            pst.setDate(2, (Date) contrato.getDataFinal());
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

    public String atualizarTabelaCLI() {
        connectarBanco.conectar();
        String sql = ("select * from tbpessoas order by idpessoa");
        connectarBanco.executaSql(sql);
        try {
            connectarBanco.rs.first();
            return sql;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Contrato não Cadastrado!!\n Digite novamente!");
        }
        connectarBanco.desconectar();
        return null;
    }

    public String atualizarTabelaIMO() {
        connectarBanco.conectar();
        String sql = ("select * from tbimoveis order by idimovel");
        connectarBanco.executaSql(sql);
        try {
            connectarBanco.rs.first();
            return sql;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Contrato não Cadastrado!!\n Digite novamente!");
        }
        connectarBanco.desconectar();
        return null;
    }

    public String atualizarTabelaPessoa(CadastroPessoas usuario) {
        connectarBanco.conectar();
        String sql = ("select * from tbpessoas where nomeCliente like '%" + usuario.getPesquisaPessoa() + "%'");
        connectarBanco.executaSql(sql);
        try {
            connectarBanco.rs.first();
            return sql;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Contrato não Cadastrado!!\n Digite novamente!");
        }
        connectarBanco.desconectar();
        return null;
    }

    public String atualizarTabelaImoveis(CadastroImoveis imovel) {
        connectarBanco.conectar();
        String sql = ("select * from tbimoveis where matriculaImovel like '%" + imovel.getPesquisar() + "%'");
        connectarBanco.executaSql(sql);
        try {
            connectarBanco.rs.first();
            return sql;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Contrato não Cadastrado!!\n Digite novamente!");
        }
        connectarBanco.desconectar();
        return null;
    }

    public String setarIDPessoa(String usuario) {
        connectarBanco.conectar();
        String sql = ("select * from tbpessoas where idpessoa = '" + usuario + "'");
        connectarBanco.executaSql(sql);
        try {
            connectarBanco.rs.first();
            return (connectarBanco.rs.getString("idpessoa"));
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Contrato não Cadastrado!!\n Digite novamente!");
        }
        connectarBanco.desconectar();
        return null;
    }

    public String setarIDImovel(String imovel) {
        connectarBanco.conectar();
        String sql = ("select * from tbimoveis where idimovel = '" + imovel + "' and statusImovel = 'LIVRE'");
        connectarBanco.executaSql(sql);
        try {
            connectarBanco.rs.first();
            return (connectarBanco.rs.getString("idimovel"));
        } catch (SQLException e) {
            TelaGerarContrato.txtMatriculaImovel.setText("");
            JOptionPane.showMessageDialog(null, "Casa ja esta Alugada!\nFavor Escolher outro Imovel!");
        }
        connectarBanco.desconectar();
        return null;
    }
    
    public void imprimirRelatorio() throws IOException{
        try {
            connectarBanco.conectar();
            connectarBanco.executaSql("select * from tbcontratos order by idcontrato");
            JRResultSetDataSource relatContratos = new JRResultSetDataSource(connectarBanco.rs);
            OutputStream saida = new FileOutputStream("Relatorios/RelatoriosdeContratos.pdf");
            
            JasperPrint jP = JasperFillManager.fillReport("Relatorios/RelatoriosdeContratos.jasper", new HashMap(), relatContratos);
            
            JRExporter exporter = new JRPdfExporter();
            exporter.setParameter(JRExporterParameter.JASPER_PRINT, jP);
            exporter.setParameter(JRExporterParameter.OUTPUT_STREAM, saida);

            exporter.exportReport();
            saida.close();
            java.awt.Desktop.getDesktop().open(new File("Relatorios/RelatoriosdeContratos.pdf"));
            
        } catch (JRException e) {
            JOptionPane.showMessageDialog(null, "Erro ao abrir o Relatorio de Contratos!\n" + e.getMessage());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
        connectarBanco.desconectar();
    }
    
}
