package com.n1.atividade.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Filme {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // Chave primária para identificar o filme

    private String nome; // Nome do filme
    private String duracao; // Duração do filme
    private String classificacao; // Classificação etária do filme
    private boolean cartaz; // Indica se o filme está em cartaz ou não

    // Getters e setters para acessar e modificar os atributos da classe

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }

    public boolean isCartaz() {
        return cartaz;
    }

    public void setCartaz(boolean cartaz) {
        this.cartaz = cartaz;
    }

    @Override
    public String toString() {
        return "Filme{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", duracao='" + duracao + '\'' +
                ", classificacao='" + classificacao + '\'' +
                ", cartaz=" + cartaz +
                '}';
    }
}
