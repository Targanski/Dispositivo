package com.n1.atividade.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tipoingresso")
public class TipoIngresso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id; // Chave primária para identificar o tipo de ingresso

    private String nome; // Nome do tipo de ingresso
    private double valor; // Valor associado a este tipo de ingresso

    // Getters e setters para acessar e modificar os atributos da classe

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "TipoIngresso{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", valor=" + valor +
                '}';
    }
}
