package com.n1.atividade.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Sessao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id; // Chave primária para identificar a sessão

    @ManyToOne
    @JoinColumn(name = "id_filme")
    private Filme filme; // Associação com a entidade Filme, relacionada pelo ID do filme

    private String horario; // Horário da sessão
    private String data; // Data da sessão
    private int capacidade; // Capacidade de assentos disponíveis na sessão

    public Sessao() {
        // Construtor padrão
    }

    // Getters e setters para acessar e modificar os atributos da classe

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    @Override
    public String toString() {
        return "Sessao{" +
                "id=" + id +
                ", filme=" + filme +
                ", horario='" + horario + '\'' +
                ", data='" + data + '\'' +
                ", capacidade=" + capacidade +
                '}';
    }
}
