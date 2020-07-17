/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.FRimoveis.dao;

import br.com.FRimoveis.Conexao.ConexaoBD;
import br.com.FRimoveis.Desenvolvimento.ConsultaContrato;
import br.com.FRimoveis.telas.TelaConsultarContrato;
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
import java.util.Date;
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
public class ConsultaContratoDB {

    ConexaoBD connectarBanco = new ConexaoBD();
    ConsultaContrato consultarContrato = new ConsultaContrato();

    public void verificarContratos(String data) {
        String dtfinal, idcont, statusContrato;
        Date datadia, dataFinalContrato;
        connectarBanco.conectar();
        String sql = ("select * from tbcontratos");

        try {
            connectarBanco.executaSql(sql);
            connectarBanco.rs.first();
            do {
                idcont = connectarBanco.rs.getString("idcontrato");
                dtfinal = connectarBanco.rs.getString("datafinal");
                statusContrato = connectarBanco.rs.getString("statusContrato");

                SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
                SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");

                datadia = sdf1.parse(data);
                dataFinalContrato = sdf2.parse(dtfinal);

                if (datadia.after(dataFinalContrato) & (statusContrato.equalsIgnoreCase("ATIVO"))) {
                    JOptionPane.showMessageDialog(null, "O Contrato com o ID " + idcont + "\nVenceu e foi Encerrado!\nFavor Verificar a tela Consulta de Contratos!");
                    inativarContrato(idcont);
                    break;
                }
            } while (connectarBanco.rs.next());
        } catch (SQLException | ParseException e) {
            JOptionPane.showMessageDialog(null, "ERRO");
        }
        connectarBanco.desconectar();
    }

    public void inativarContrato(String consulta) {
        connectarBanco.conectar();
        try {
            PreparedStatement pst = connectarBanco.con.prepareStatement("update tbcontratos set statusContrato = 'ENCERRADO' where statusContrato = 'ATIVO' and idcontrato like '%" + consulta + "%'");
            pst.execute();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao Inativar o Contrato!");
        }
        connectarBanco.desconectar();
    }

    public String pesquisarTodos() {
        connectarBanco.conectar();
        String sql = ("select tbcontratos.idcontrato, tbcontratos.statusContrato, tbcontratos.datainicial, tbcontratos.datafinal, tbpessoas.nomeCliente, tbpessoas.NomeFantasia, tbpessoas.cnpjcpf, tbpessoas.perfil, tbpessoas.telefonePessoa, tbpessoas.emailPessoa, tbimoveis.statusImovel, tbimoveis.enderecoimovel, tbimoveis.bairroImovel, tbimoveis.aluguelImovel, tbimoveis.matriculaImovel"
                + " from tbcontratos"
                + " inner join tbpessoas"
                + " on tbcontratos.tbpessoas_idpessoa = tbpessoas.idpessoa"
                + " inner join tbimoveis"
                + " on tbcontratos.tbimoveis_idimovel = tbimoveis.idimovel");

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

    public String pesquisaNomeCliente(ConsultaContrato consulta) {
        connectarBanco.conectar();
        String sql = ("select tbcontratos.idcontrato, tbcontratos.statusContrato, tbcontratos.datainicial, tbcontratos.datafinal, tbpessoas.nomeCliente, tbpessoas.NomeFantasia, tbpessoas.cnpjcpf, tbpessoas.perfil, tbpessoas.telefonePessoa, tbpessoas.emailPessoa, tbimoveis.statusImovel, tbimoveis.enderecoimovel, tbimoveis.bairroImovel, tbimoveis.aluguelImovel, tbimoveis.matriculaImovel"
                + " from tbcontratos "
                + " inner join tbimoveis"
                + " on tbcontratos.tbimoveis_idimovel = tbimoveis.idimovel"
                + " inner join tbpessoas"
                + " on tbcontratos.tbpessoas_idpessoa = tbpessoas.idpessoa"
                + " where tbpessoas.nomeCliente like '%" + consulta.getPesquisarContrato() + "%'");
        connectarBanco.executaSql(sql);
        try {
            connectarBanco.rs.first();
            return sql;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Cliente não tem Contrato Cadastrado!!\n Digite novamente!");
        }
        connectarBanco.desconectar();
        return null;
    }

    public String pesquisaMatricula(ConsultaContrato consulta) {
        connectarBanco.conectar();
        String sql = ("select tbcontratos.idcontrato, tbcontratos.statusContrato, tbcontratos.datainicial, tbcontratos.datafinal, tbpessoas.nomeCliente, tbpessoas.NomeFantasia, tbpessoas.cnpjcpf, tbpessoas.perfil, tbpessoas.telefonePessoa, tbpessoas.emailPessoa, tbimoveis.statusImovel, tbimoveis.enderecoimovel, tbimoveis.bairroImovel, tbimoveis.aluguelImovel, tbimoveis.matriculaImovel"
                + " from tbcontratos "
                + " inner join tbpessoas"
                + " on tbcontratos.tbpessoas_idpessoa = tbpessoas.idpessoa"
                + " inner join tbimoveis"
                + " on tbcontratos.tbimoveis_idimovel = tbimoveis.idimovel"
                + " where tbimoveis.matriculaImovel like '%" + consulta.getPesquisarContrato() + "%'");
        connectarBanco.executaSql(sql);
        try {
            connectarBanco.rs.first();
            return sql;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Matricula não tem Contrato Cadastrado!!\n Digite novamente!");
        }
        connectarBanco.desconectar();
        return null;
    }

    public void imprimirRecibo(int idContrato) throws IOException {
        try {
            connectarBanco.conectar();
            String sql = ("select tbcontratos.idcontrato, tbcontratos.statusContrato, tbcontratos.datainicial, tbcontratos.datafinal, tbpessoas.nomeCliente, tbpessoas.NomeFantasia, tbpessoas.cnpjcpf, tbpessoas.perfil, tbpessoas.telefonePessoa, tbpessoas.emailPessoa, tbimoveis.statusImovel, tbimoveis.enderecoimovel, tbimoveis.bairroImovel, tbimoveis.aluguelImovel, tbimoveis.matriculaImovel"
                + " from tbcontratos "
                + " inner join tbimoveis"
                + " on tbcontratos.tbimoveis_idimovel = tbimoveis.idimovel"
                + " inner join tbpessoas"
                + " on tbcontratos.tbpessoas_idpessoa = tbpessoas.idpessoa"
                + " where tbcontratos.idcontrato like '%" + idContrato + "%'");
        connectarBanco.executaSql(sql);
            JRResultSetDataSource ReciboCliente = new JRResultSetDataSource(connectarBanco.rs);
            try (OutputStream saida = new FileOutputStream("Relatorios/ReciboCliente.pdf")) {
                HashMap parametros = new HashMap();
                parametros.put("id", (idContrato));
                JasperPrint jP = JasperFillManager.fillReport("Relatorios/ReciboCliente.jasper", parametros, ReciboCliente);
                
                JRExporter exporter = new JRPdfExporter();
                exporter.setParameter(JRExporterParameter.JASPER_PRINT, jP);
                exporter.setParameter(JRExporterParameter.OUTPUT_STREAM, saida);
                
                exporter.exportReport();
            }
            java.awt.Desktop.getDesktop().open(new File("Relatorios/ReciboCliente.pdf"));
        } catch (JRException e) {
            JOptionPane.showMessageDialog(null, "Erro ao abrir o Recibo de Clientes!\n" + e.getMessage());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        connectarBanco.desconectar();
    }
}
