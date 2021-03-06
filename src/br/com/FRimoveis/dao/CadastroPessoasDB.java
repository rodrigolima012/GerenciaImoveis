/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.FRimoveis.dao;

import br.com.FRimoveis.Conexao.ConexaoBD;
import br.com.FRimoveis.Desenvolvimento.CadastroPessoas;
import br.com.FRimoveis.telas.TelaPrincipal;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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
             pst.setString(4, pessoa.getDataNasc());
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
            pst.setString(5, pessoa.getDataNasc());
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
            pessoa.setDataNasc(connectarBanco.rs.getString("dataNasc"));
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
        } catch (SQLException e) {
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
            pst.setString(5, pessoa.getDataNasc());
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
        } catch (SQLException e) {
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

    public String atualizarTabela() {
        connectarBanco.conectar();
        String sql = ("select * from tbpessoas order by idpessoa");
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

    public String atualizarTabelaPesquisar(CadastroPessoas pessoa) {
        connectarBanco.conectar();
        String sql = ("select * from tbpessoas where nomeCliente like '%" + pessoa.getPesquisaPessoa() + "%'");
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

    public void setClienteDados(String dados) {
        pessoa = new CadastroPessoas();
        connectarBanco.conectar();
        connectarBanco.executaSql("select * from tbpessoas where idpessoa = '" + dados + "'");
        try {
            connectarBanco.rs.first();
            pessoa.setIdpessoa(connectarBanco.rs.getString("idpessoa"));
            pessoa.setNomeCliente(connectarBanco.rs.getString("nomeCliente"));
            pessoa.setNomeFantasia(connectarBanco.rs.getString("nomeFantasia"));
            pessoa.setPerfil(connectarBanco.rs.getString("perfil"));
            pessoa.setCnpjcpf(connectarBanco.rs.getString("cnpjcpf"));
            
            String dataNasc = connectarBanco.rs.getString("dataNasc");
            SimpleDateFormat in = new SimpleDateFormat("yyyy-MM-dd");
            SimpleDateFormat out = new SimpleDateFormat("dd/MM/yyyy");
            String result = null;            
            try {
                result = out.format(in.parse(dataNasc));
            } catch (ParseException ex) {
                Logger.getLogger(CadastroPessoasDB.class.getName()).log(Level.SEVERE, null, ex);
            }
            pessoa.setDataNasc(result);
            
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

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Selecionar o Cliente" + ex.getMessage());
        }
        connectarBanco.desconectar();
    }
    
     public void imprimirRelatorio() throws IOException{
        try {
            connectarBanco.conectar();
            connectarBanco.executaSql("select * from tbpessoas order by idpessoa");
            JRResultSetDataSource relatClientes = new JRResultSetDataSource(connectarBanco.rs);
            OutputStream saida = new FileOutputStream("Relatorios/RelatoriosdeClientes.pdf");
            
            JasperPrint jP = JasperFillManager.fillReport("Relatorios/RelatoriosdeClientes.jasper", new HashMap(), relatClientes);
            
            JRExporter exporter = new JRPdfExporter();
            exporter.setParameter(JRExporterParameter.JASPER_PRINT, jP);
            exporter.setParameter(JRExporterParameter.OUTPUT_STREAM, saida);

            exporter.exportReport();
            saida.close();
            java.awt.Desktop.getDesktop().open(new File("Relatorios/RelatoriosdeClientes.pdf"));
            
        } catch (JRException e) {
            JOptionPane.showMessageDialog(null, "Erro ao abrir o Relatorio de Clientes!\n" + e.getMessage());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
        connectarBanco.desconectar();
    }

    public CadastroPessoas getPessoas() {
        return this.pessoa;
    }

}
