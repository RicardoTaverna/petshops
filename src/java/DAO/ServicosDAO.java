package DAO;

import Model.Servicos;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class ServicosDAO {
    private Conexao conexao;
    private String query;
    private PreparedStatement statement;
    private ResultSet resultSet;

    public ServicosDAO() {
        conexao = new Conexao();
    }

    public void inserirServicos(Servicos servicos){
        try {
            query = "INSERT INTO servicos(fornecedorId,nome,preco,descricao,tempo_servico) "
                    + "VALUES (" + servicos.getFornecedorId() + "," +
                    "'"+ servicos.getNome() + "'," +  
                    servicos.getPreco()+ "," +
                    "'" + servicos.getDescricao() + "'," + 
                    "'" + servicos.getTempo_servico() + "')";

            statement = conexao.getConnection().prepareStatement(query);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ResultSet listarServicos(int id){
        try {
            query = "SELECT * FROM servicos WHERE fornecedorId = " + id;
            statement = conexao.getConnection().prepareStatement(query);
            statement.executeQuery();
            resultSet = statement.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return resultSet;
    }
    
    public void editarServicos(int id, Servicos u){
        try{
            query = "UPDATE servicos SET nome='" + u.getNome() + "', preco='" + 
                    u.getPreco() + "'"
                    + ", descricao='" + u.getDescricao() + "' "
                    + ", tempo_servico='" + u.getTempo_servico() + "' " +
                        "WHERE id = " + id;
        
            statement = conexao.getConnection().prepareStatement(query);
            statement.executeUpdate();
        }
        catch(SQLException e) {
            e.printStackTrace();
        }
    }
    
    
    public void deletarServicos(int id){
        try{
            query = "DELETE FROM servicos WHERE servicosId = " + id;
        
            statement = conexao.getConnection().prepareStatement(query);
            statement.executeUpdate();
        }
        catch(SQLException e) {
            e.printStackTrace();
        }
    }
}
