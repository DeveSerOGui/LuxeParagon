package br.com.luxe.paragon.demoapi.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document("Pedidos")
public class Pedido {

    @Id
    private String id;

    private List<Produto> produtos = new ArrayList<Produto>();

    public Pedido(String id, Produto produto){
        this.id = id;
        this.produtos = produtos;
    }

    public Pedido() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public List<Produto> getProdutos() {
        return produtos;
    }


    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

}
