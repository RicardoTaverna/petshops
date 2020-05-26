package Model;

import java.util.Date;


public class Fornecedor {
    private String nome_fantasia;
    private Date data_criacao;
    private String cnpj;
    private String cep;
    private String cidade;
    private String horario_funcionamento;
    private String email;
    private String telefone;

    public Fornecedor(){}

    public Fornecedor(String nome_fantasia, Date data_criacao, String cnpj, String cep, String cidade, String horario_funcionamento, String email, String telefone) {
        this.nome_fantasia = nome_fantasia;
        this.data_criacao = data_criacao;
        this.cnpj = cnpj;
        this.cep = cep;
        this.cidade = cidade;
        this.horario_funcionamento = horario_funcionamento;
        this.email = email;
        this.telefone = telefone;
    }

    public String getNome_fantasia() {
        return nome_fantasia;
    }

    public void setNome_fantasia(String nome_fantasia) {
        this.nome_fantasia = nome_fantasia;
    }

    public Date getData_criacao() {
        return data_criacao;
    }

    public void setData_criacao(Date data_criacao) {
        this.data_criacao = data_criacao;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getHorario_funcionamento() {
        return horario_funcionamento;
    }

    public void setHorario_funcionamento(String horario_funcionamento) {
        this.horario_funcionamento = horario_funcionamento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    
}
