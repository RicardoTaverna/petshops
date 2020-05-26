package DAO;

import Model.Pedido;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class PedidoDAO {
    private Conexao conexao;
    private String query;
    private PreparedStatement statement;
    private ResultSet resultSet;

    public PedidoDAO() {
        conexao = new Conexao();
    }

    public void inserirPedido(Pedido pedido){
        try {
            query = "INSERT INTO pedido(data_pedido,quantidade) VALUES (" +"'"+ pedido.getData_pedido() + "'," + "'"+ 
                    pedido.getQuantidade()+ ")";

            statement = conexao.getConnection().prepareStatement(query);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ResultSet listarPedido(){
        try {
            query = "SELECT * FROM pedido";
            statement = conexao.getConnection().prepareStatement(query);
            statement.executeQuery();
            resultSet = statement.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return resultSet;
    }
    
    public void editarPedido(int id, Pedido u){
        try{
            query = "UPDATE pedido SET data_pedido='" + u.getData_pedido() + "', quantidade='" + 
                    u.getQuantidade() + "' " +
                        "WHERE id = " + id;
        
            statement = conexao.getConnection().prepareStatement(query);
            statement.executeUpdate();
        }
        catch(SQLException e) {
            e.printStackTrace();
        }
    }
    
    
    public void deletarPedido(int id){
        try{
            query = "DELETE FROM pedido WHERE id = " + id;
        
            statement = conexao.getConnection().prepareStatement(query);
            statement.executeUpdate();
        }
        catch(SQLException e) {
            e.printStackTrace();
        }
    }
}
