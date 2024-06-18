package br.com.luxe.paragon.demoapi.request;
import br.com.luxe.paragon.demoapi.model.Produto;

import java.util.List;

public class PedidoRequest {

    private String nome;

    private String email;

    private String senha;

    private List<Produto> produtos;

    public PedidoRequest(String nome, String email, String senha, List<Produto> produtos) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.produtos = produtos;
    }

    public PedidoRequest() {
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

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }
}
