package br.com.luxe.paragon.demoapi.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.ManyToOne;

public class Endereco {
    private Integer id;
    private String rua;

    private Integer numero;

    private String Cep;

    private Integer Complemento;

    @ManyToOne
    @JsonIgnore
    private Comprador Comprador;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getCep() {
        return Cep;
    }

    public void setCep(String cep) {
        Cep = cep;
    }

    public Integer getComplemento() {
        return Complemento;
    }

    public void setComplemento(Integer complemento) {
        Complemento = complemento;
    }

    public Comprador getComprador() {
        return Comprador;
    }

    public void setComprador(Comprador comprador) {
        Comprador = comprador;
    }
}
