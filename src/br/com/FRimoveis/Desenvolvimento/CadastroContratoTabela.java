/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.FRimoveis.Desenvolvimento;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author rodrigolima
 */
public class CadastroContratoTabela extends AbstractTableModel {
    private ArrayList linhas = null;
    private String[] colunas = null;

    public CadastroContratoTabela(ArrayList linhas, String[] colunas) {
        setLinhas(linhas);
        setColunas(colunas);
    }

    public ArrayList getLinhas() {
        return linhas;
    }

    public void setLinhas(ArrayList linhas) {
        this.linhas = linhas;
    }

    public String[] getColunas() {
        return colunas;
    }

    public void setColunas(String[] colunas) {
        this.colunas = colunas;
    }

    public int getColumnCount() {
        return colunas.length;
    }

    public int getRowCount() {
        return linhas.size();
    }
    
    public String getColumnName(int numCol){
        return colunas[numCol];
    }
    
    public Object getValueAt(int numeroLinhas, int numerosColunas){
        Object[] linha = (Object[])getLinhas().get(numeroLinhas);
        return linha[numerosColunas];
    }
}

