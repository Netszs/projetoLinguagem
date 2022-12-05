/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.lanchonete.rdn;


import br.com.lanchonete.modelo.Cliente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author sebas
 */
public class PedidoRdn {
    
    public int inserirCliente(Cliente cli) {
        
        try{
            
            int linhasAfetadas = 0;
            
            StringBuilder str = new StringBuilder();
            
            str.append("INSERT INTO pessoa(                 ");
            str.append("            nome                    ");
            str.append("            ,tipo)                  ");
            str.append("      VALUES(                       ");
            str.append("             ?                      ");
            str.append("            ,?                      ");
            str.append("         )                          ");    
            
            ConnectionFactory factory = new ConnectionFactory();
            Connection conn = factory.getConnection();
            
            //CRIA O STATMENT JÁ PREPARADO PARA OBTER O ID CLIENTE GERADO
            PreparedStatement stmt = conn.prepareStatement(str.toString(), Statement.RETURN_GENERATED_KEYS);
            
            stmt.setString(1, cli.getNome());
            stmt.setInt(2, 1);
            
            int id = 0;
            
            linhasAfetadas =stmt.executeUpdate();   
            
            ResultSet rs = stmt.getGeneratedKeys();
            if (rs.next()) {
                //RECUPERA O IDCLIENTE
                
               id = rs.getInt(1); //recuperar o id               
            }   
            
            //LIBERAR OS RECURSOS
            stmt.close();
            conn.close();
            
            return linhasAfetadas;  
            
        } catch (SQLException ex) {
            System.out.println("ERRO: " + ex.getMessage());
            return 0;
        }
    }
    
    public int alterarCliente(Cliente cli) {

        try {
            int linhasAfetadas = 0;
            StringBuilder str = new StringBuilder();

            str.append("UPDATE PESSOA SET NOME 			 = ?        ");
            str.append("WHERE	ID                               = ?        ");

            ConnectionFactory factory = new ConnectionFactory();
            Connection conn = factory.getConnection();

            PreparedStatement stmt = conn.prepareStatement(str.toString());

            stmt.setString(1, cli.getNome());

            linhasAfetadas = stmt.executeUpdate();
            
            //LIBERAR OS RECURSOS
            stmt.close();
            conn.close();

            return linhasAfetadas;

        } catch (SQLException ex) {
            System.out.println("ERRO:" + ex.getMessage());
            return 0;
        }
    }
    
    public int deletarCliente(int idCliente) {
        try {

            int linhasAfetadas = 0;

            String str = "DELETE FROM PESSOA WHERE ID = ?";
            ConnectionFactory factory = new ConnectionFactory();
            Connection conn = factory.getConnection();

            PreparedStatement stmt = conn.prepareStatement(str.toString());
            stmt.setInt(1, idCliente);

            linhasAfetadas = stmt.executeUpdate();

            stmt.close();
            conn.close();

            return linhasAfetadas;

        } catch (Exception ex) {
            System.out.println("Erro: " + ex.getMessage());
            return 0;
        }
    }
    
    public List<Cliente> obterTodos() {
        try {

            List<Cliente> lstCli = new ArrayList<Cliente>();

            StringBuilder str = new StringBuilder();

            str.append("SELECT  ID               ");
            str.append("     ,NOME               ");
            str.append("FROM PESSOA              ");
            str.append(" WHERE TIPO = 1           ");

            //ABRE A CONEXÃO
            Connection conn = new ConnectionFactory().getConnection();

            //CRIAR NOSSO STATEMENT            
            Statement stmt = conn.createStatement();

            //RECEBER OS DADOS NO RESULTSET
            ResultSet rs = stmt.executeQuery(str.toString());

            return lstCli;

        } catch (SQLException ex) {

            System.out.println("ERRO:" + ex.getMessage());
            return null;
        }
    }
    
    public Cliente obterPorId(int id) {
        try {

            Cliente ret = null;

            StringBuilder str = new StringBuilder();

            str.append("SELECT  ID               ");
            str.append("     ,NOME               ");
            str.append("FROM PESSOA              ");
            str.append(" WHERE TIPO = 1          ");
            str.append(" AND ID      = ?         ");

            //ABRE A CONEXÃO
            Connection conn = new ConnectionFactory().getConnection();

            //CRIAR NOSSO STATEMENT            
            PreparedStatement stmt = conn.prepareStatement(str.toString());

          
            stmt.setInt(1, id);
            
            //RECEBER OS DADOS NO RESULTSET
            ResultSet rs = stmt.executeQuery();

            return ret;

        } catch (SQLException ex) {

            System.out.println("ERRO:" + ex.getMessage());
            return null;
        }
    }
    
}
