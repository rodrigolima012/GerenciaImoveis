/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.FRimoveis.dao;

import java.sql.*;

/**
 *
 * @author rodrigolima
 */
public class ConexaoBD {

    public static Connection conectar() {
        java.sql.Connection conexao = null;
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/gerenciadorimoveis";
        String user = "root";
        String password = "12312378";
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);            
            return conexao;            
        } catch (Exception e) {           
            return null;
        }

    }

}
