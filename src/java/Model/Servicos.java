package Model;


public class Servicos {
    private Fornecedor fornecedor;
    private String nome;
    private Float preco;
    private String descricao;
    private String tempo_servico;
    
    public Servicos(){}

    public Servicos(Fornecedor fornecedor, String nome, Float preco, String descricao, String tempo_servico) {
        this.fornecedor = fornecedor;
        this.nome = nome;
        this.preco = preco;
        this.descricao = descricao;
        this.tempo_servico = tempo_servico;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Float getPreco() {
        return preco;
    }

    public void setPreco(Float preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTempo_servico() {
        return tempo_servico;
    }

    public void setTempo_servico(String tempo_servico) {
        this.tempo_servico = tempo_servico;
    }
    
    
}
