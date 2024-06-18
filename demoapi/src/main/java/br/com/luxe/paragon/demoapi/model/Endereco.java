package br.com.luxe.paragon.demoapi.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("Enderecos")
public class Endereco {

    @Id
    private String id;

    private String rua;

    private String numero;

    private String complemento;

    private String cep;

    public Endereco(String rua, String numero, String complemento, String cep) {
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
        this.cep = cep;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        complemento = complemento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        cep = cep;
    }

}
