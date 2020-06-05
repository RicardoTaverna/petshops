package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    private Connection conn;
    private String banco = "jdbc:mysql://127.0.0.1/petshop?useSSL=false";
    public Conexao (){
    
        try {
            // Carrega o Driver de conexao java-mysql
            Class.forName("com.mysql.jdbc.Driver");
            
            conn = DriverManager.getConnection(banco, "root","");
            
        } 
        catch(ClassNotFoundException ex){}
        catch(SQLException ex){}
    
    }
    
    public Connection getConnection(){
        return conn;
    }
}