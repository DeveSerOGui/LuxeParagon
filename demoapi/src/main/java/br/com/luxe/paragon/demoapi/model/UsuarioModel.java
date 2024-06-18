package br.com.luxe.paragon.demoapi.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document("Usuarios")
public class UsuarioModel {

    @Id
    private String id;

    private String nome;

    private String email;

    private String senha;

    private List<Endereco> enderecos = new ArrayList<Endereco>();

    public UsuarioModel(String nome, String id, String email, Endereco endereco, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.enderecos = enderecos;
    }

    public UsuarioModel() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }
}
