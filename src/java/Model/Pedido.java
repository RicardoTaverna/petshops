package Model;

import java.util.Date;


public class Pedido {
    private Cliente cliente;
    private Fornecedor fornecerdor;
    private Servicos servicos;
    private Date data_pedido;
    private int quantidade;
    
    public Pedido(){}

    public Pedido(Cliente cliente, Fornecedor fornecerdor, Servicos servicos, Date data_pedido, int quantidade) {
        this.cliente = cliente;
        this.fornecerdor = fornecerdor;
        this.servicos = servicos;
        this.data_pedido = data_pedido;
        this.quantidade = quantidade;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Fornecedor getFornecerdor() {
        return fornecerdor;
    }

    public void setFornecerdor(Fornecedor fornecerdor) {
        this.fornecerdor = fornecerdor;
    }

    public Servicos getServicos() {
        return servicos;
    }

    public void setServicos(Servicos servicos) {
        this.servicos = servicos;
    }

    public Date getData_pedido() {
        return data_pedido;
    }

    public void setData_pedido(Date data_pedido) {
        this.data_pedido = data_pedido;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    
}
