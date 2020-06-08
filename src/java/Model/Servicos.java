package Model;


public class Servicos {
    private int fornecedorId;
    private String nome;
    private Float preco;
    private String descricao;
    private String tempo_servico;
    
    public Servicos(){}

    public Servicos(int fornecedorId, String nome, Float preco, String descricao, String tempo_servico) {
        this.fornecedorId = fornecedorId;
        this.nome = nome;
        this.preco = preco;
        this.descricao = descricao;
        this.tempo_servico = tempo_servico;
    }

    public int getFornecedorId() {
        return fornecedorId;
    }

    public void setFornecedorId(int fornecedorId) {
        this.fornecedorId = fornecedorId;
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
