/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.FRimoveis.dao;

import br.com.FRimoveis.Conexao.ConexaoBD;
import br.com.FRimoveis.Desenvolvimento.ConsultaContrato;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author rodrigolima
 */
public class ConsultaContratoDB {

    ConexaoBD connectarBanco = new ConexaoBD();
    ConsultaContrato consultarContrato = new ConsultaContrato();
    
    public void verificarContratos(String data) {
        String dtfinal, idcont;
        connectarBanco.conectar();
        String sql = ("select * from tbcontratos");

        try {
            connectarBanco.executaSql(sql);
            connectarBanco.rs.first();
            do {
                idcont = connectarBanco.rs.getString("idcontrato");
                dtfinal = connectarBanco.rs.getString("datafinal");
                Date datadia, dataFinalContrato;

                SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
                SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");

                datadia = sdf1.parse(data);
                dataFinalContrato = sdf2.parse(dtfinal);

                if (datadia.after(dataFinalContrato)) {
                    inativarContrato(idcont);
                    break;
                }
            } while (connectarBanco.rs.next());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRO");
        }
        connectarBanco.desconectar();

    }

    public void inativarContrato(String consulta) {
        connectarBanco.conectar();
        try {
            PreparedStatement pst = connectarBanco.con.prepareStatement("update tbcontratos set statusContrato = 'INATIVO' where statusContrato = 'ATIVO' and idcontrato like '%" + consulta + "%'");
            pst.execute();
        } catch (Exception e) {
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
        } catch (Exception e) {
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
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Contrato não Cadastrado!!\n Digite novamente!");
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
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Contrato não Cadastrado!!\n Digite novamente!");
        }
        connectarBanco.desconectar();
        return null;
    }
}
