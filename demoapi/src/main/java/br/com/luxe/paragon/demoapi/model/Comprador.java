package br.com.luxe.paragon.demoapi.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table (name = "compradores")
public class Comprador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idComprador;

    @Column(nullable = false)
    private String nome;
    @Column(nullable = true)
    private  String cpf;
    @Column(nullable = false)
    private String email;

    //@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    //@JoinColumn(name = "comprador_id")
    //private List<Endereco> enderecos;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getId() {
        return idComprador;
    }

    public void setId(long id) {
        this.idComprador = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
