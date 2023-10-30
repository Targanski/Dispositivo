package com.n1.atividade.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Ingresso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Define a geração automática do ID
    private Integer id; // Chave primária para identificar o ingresso

    private String poltrona; // Representa a poltrona do ingresso
    private Integer idSessao; // ID da sessão à qual o ingresso está associado
    private Integer tipoIngresso; // Tipo de ingresso (por exemplo, inteiro, meia-entrada, etc.)

    public Ingresso() {
        // Construtor padrão
    }

    // Getters e setters para acessar e modificar os atributos da classe

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPoltrona() {
        return poltrona;
    }

    public void setPoltrona(String poltrona) {
        this.poltrona = poltrona;
    }

    public Integer getIdSessao() {
        return idSessao;
    }

    public void setIdSessao(Integer idSessao) {
        this.idSessao = idSessao;
    }

    public Integer getTipoIngresso() {
        return tipoIngresso;
    }

    public void setTipoIngresso(Integer tipoIngresso) {
        this.tipoIngresso = tipoIngresso;
    }

    @Override
    public String toString() {
        return "Ingresso{" +
                "id=" + id +
                ", poltrona='" + poltrona + '\'' +
                ", idSessao=" + idSessao +
                ", tipoIngresso=" + tipoIngresso +
                '}';
    }
}
