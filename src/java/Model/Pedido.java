package Model;

import java.util.Date;


public class Pedido {
    private int clienteId;
    private int fornecerdorId;
    private int servicosId;
    private Date data_pedido;
    private int quantidade;
    
    public Pedido(){}

    public Pedido(int clienteId, int fornecerdorId, int servicosId, Date data_pedido, int quantidade) {
        this.clienteId = clienteId;
        this.fornecerdorId = fornecerdorId;
        this.servicosId = servicosId;
        this.data_pedido = data_pedido;
        this.quantidade = quantidade;
    }

    public int getClienteId() {
        return clienteId;
    }

    public void setClienteId(int clienteId) {
        this.clienteId = clienteId;
    }

    public int getFornecerdorId() {
        return fornecerdorId;
    }

    public void setFornecerdorId(int fornecerdorId) {
        this.fornecerdorId = fornecerdorId;
    }

    public int getServicosId() {
        return servicosId;
    }

    public void setServicosId(int servicosId) {
        this.servicosId = servicosId;
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
