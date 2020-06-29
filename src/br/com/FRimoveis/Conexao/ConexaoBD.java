/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.FRimoveis.Conexao;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author rodrigolima
 */
public class ConexaoBD {
    public Statement stm;
    public ResultSet rs;
    private final String driver = "com.mysql.jdbc.Driver";
    private final String caminho = "jdbc:mysql://localhost:3306/imovelGerenciador";
    private final String usuario = "root";
    private final String senha = "";
    public Connection con;
 
    public void conectar() {
        try {
            System.setProperty("jdbc.Drivers", driver);
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(caminho, usuario, senha);
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Conexão com o Banco DONW \n" + e.getMessage());
            System.exit(0);
        }
    }
    
    public void desconectar(){
        try {
            con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao Desconectar \n" + e.getMessage());
        }
    }
    
    public void executaSql(String sql){
        try {
            stm = con.createStatement(rs.TYPE_SCROLL_INSENSITIVE, rs.CONCUR_READ_ONLY);
            rs = stm.executeQuery(sql);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao Executa SQL \n" + e.getMessage());
        }
        
    }

}
