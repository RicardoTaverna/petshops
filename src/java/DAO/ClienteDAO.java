package DAO;

import Model.Cliente;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class ClienteDAO {
    private Conexao conexao;
    private String query;
    private PreparedStatement statement;
    private ResultSet resultSet;

    public ClienteDAO() {
        conexao = new Conexao();
    }
    
    
    public void cadastrarCliente(Cliente cliente){
        try {
            query = "INSERT INTO cliente(primeiro_nome,sobrenome,email,senha)"
                    + "VALUES (" +"'"+ cliente.getPrimeiro_nome() + "'," + "'"+ 
                    cliente.getSobrenome() + "',"
                    + "'"+ cliente.getEmail() + "'," + cliente.getSenha() + ")";

            statement = conexao.getConnection().prepareStatement(query);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void inserirCliente(Cliente cliente){
        try {
            query = "INSERT INTO cliente(primeiro_nome,sobrenome,email,senha,cep,cidade,data_nascimento,cpf,telefone)"
                    + "VALUES (" +"'"+ cliente.getPrimeiro_nome() + "'," + "'"+ 
                    cliente.getSobrenome() + "',"
                    + "'"+ cliente.getEmail() + "'," + cliente.getSenha() + "'," + cliente.getCep() +"'," + 
                    cliente.getCidade() +
                    "'," + cliente.getData_nascimento() +
                    "'," + cliente.getCpf() +"'," + cliente.getTelefone() + ")";

            statement = conexao.getConnection().prepareStatement(query);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ResultSet listarCliente(){
        try {
            query = "SELECT * FROM cliente";
            statement = conexao.getConnection().prepareStatement(query);
            statement.executeQuery();
            resultSet = statement.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return resultSet;
    }
    
    public void editarCliente(int id, Cliente u){
        try{
            query = "UPDATE cliente SET nome='" + u.getPrimeiro_nome() + "', sobrenome='" + u.getSobrenome() + "' "
                    + ", email='" + u.getEmail() + "' , senha='" + u.getSenha() + "' , cep='" + u.getCep() + "'"
                    + ", cidade='" + u.getCidade() + "' , data_nascimento='" + u.getData_nascimento() + "', cpf='" + u.getCpf() + "'"
                    + ", Telefone='" + u.getTelefone() + "' " +
                    
                        "WHERE id = " + id;
        
            statement = conexao.getConnection().prepareStatement(query);
            statement.executeUpdate();
        }
        catch(SQLException e) {
            e.printStackTrace();
        }
    }
    
    
    public void deletarCliente(int id){
        try{
            query = "DELETE FROM cliente WHERE id = " + id;
        
            statement = conexao.getConnection().prepareStatement(query);
            statement.executeUpdate();
        }
        catch(SQLException e) {
            e.printStackTrace();
        }
    }
}
