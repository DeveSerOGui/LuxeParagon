package br.com.luxe.paragon.demoapi.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("Produtos")
public class Produto {

    @Id
    private String id;

    private String nome;

    private String categoria;

    private String preco;

    private String tamanho;

    private String marca;

    private String genero;

    public Produto(String id, String nome, String categoria, String preco, String marca, String genero, String tamanho) {
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
        this.marca = marca;
        this.genero = genero;
        this.tamanho = tamanho;
    }

    public Produto() {
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

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }


    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

}
