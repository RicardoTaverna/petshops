package Model;

import java.util.Date;


public class Cliente {
    private String primeiro_nome;
    private String sobrenome;
    private String email;
    private String senha;
    private String cep;
    private String cidade;
    private String cpf;
    private String telefone;
    
    public Cliente() {}     
        
    public Cliente(String primeiro_nome, String sobrenome, String email, String senha,
            String cep, String cidade, String cpf, String telefone) {
        this.primeiro_nome = primeiro_nome;
        this.sobrenome = sobrenome;
        this.email = email;
        this.senha = senha;
        this.cep = cep;
        this.cidade = cidade;
        this.cpf = cpf;
        this.telefone = telefone;
    }


    public String getPrimeiro_nome() {
        return primeiro_nome;
    }

    public void setPrimeiro_nome(String primeiro_nome) {
        this.primeiro_nome = primeiro_nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    
    
    
}
