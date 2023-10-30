package com.n1.atividade.repository;

import org.springframework.data.repository.CrudRepository;
import com.n1.atividade.entity.Filme;

// Define o pacote em que esta classe está localizada
public interface FilmeRepository extends CrudRepository<Filme, Long> {
    // Esta interface estende CrudRepository para realizar operações CRUD em objetos Filme

    // Filme é a entidade com a qual esta interface trabalha e Long é o tipo da chave primária

    // Métodos para CRUD, como save, findById, findAll, delete, etc., estão disponíveis por padrão
}
