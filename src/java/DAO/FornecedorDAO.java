package DAO;

import Model.Fornecedor;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class FornecedorDAO {
    private Conexao conexao;
    private String query;
    private PreparedStatement statement;
    private ResultSet resultSet;

    public FornecedorDAO() {
        conexao = new Conexao();
    }

    public void inserirFornecedor(Fornecedor fornecedor){
        try {
            query = "INSERT INTO fornecedor(nome_fantasia,cnpj,cep,cidade,horario_funcionamento,email,telefone,senha) "
                    + "VALUES (" + "'" + fornecedor.getNome_fantasia() + "'," 
                    + "'" + fornecedor.getCnpj() + "'," 
                    + "'" + fornecedor.getCep() + "'," 
                    + "'" + fornecedor.getCidade() + "',"
                    + "'" + fornecedor.getHorario_funcionamento() + "',"
                    + "'" + fornecedor.getEmail() + "'," 
                    + "'" + fornecedor.getTelefone() + "',"
                    + "'" + fornecedor.getSenha() + "')";

            statement = conexao.getConnection().prepareStatement(query);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ResultSet listarFornecedor(){
        try {
            query = "SELECT * FROM fornecedor";
            statement = conexao.getConnection().prepareStatement(query);
            statement.executeQuery();
            resultSet = statement.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return resultSet;
    }
    
    public void editarFornecedor(int id, Fornecedor u){
        try{
            query = "UPDATE fornecedor SET nome='" + u.getNome_fantasia()
                    + ", cnpj='" + u.getCnpj() 
                    + "' , cep='" + u.getCep() 
                    + "' , cidade='" + u.getCidade() + "'"
                    + ", horario_funcionamento='" + u.getHorario_funcionamento() 
                    + "' , email='" + u.getEmail() 
                    + "', telefone='" + u.getTelefone() + "'"
                    + ", Telefone='" + u.getTelefone() + "' " +
                        "WHERE id = " + id;
        
            statement = conexao.getConnection().prepareStatement(query);
            statement.executeUpdate();
        }
        catch(SQLException e) {
            e.printStackTrace();
        }
    }
    
    
    public void deletarFornecedor(int id){
        try{
            query = "DELETE FROM fornecedor WHERE id = " + id;
        
            statement = conexao.getConnection().prepareStatement(query);
            statement.executeUpdate();
        }
        catch(SQLException e) {
            e.printStackTrace();
        }
    }
    
    public ResultSet listarUmFornecedor(int id){
        try {
            query = "SELECT * FROM fornecedor WHERE fornecedorid = " + id;
            statement = conexao.getConnection().prepareStatement(query);
            statement.executeQuery();
            resultSet = statement.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return resultSet;
    }
    
    
}
