/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.lanchonete.rdn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author sebas
 */
public class ConnectionFactory {

    private String URL = "jdbc:sqlserver://localhost:1433;databaseName=db_lanchonete;trustServerCertificate=true;integratedSecurity=true;";
    
    public Connection getConnection(){
    
         try {

            return DriverManager.getConnection(this.URL);
        } catch (SQLException ex) {

            throw new RuntimeException(ex);
        }
    }
}
