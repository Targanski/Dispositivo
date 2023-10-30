package com.n1.atividade.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.n1.atividade.entity.TipoIngresso;

// Define o pacote em que esta classe está localizada
public interface TipoIngressoRepository extends JpaRepository<TipoIngresso, Integer> {
    // Esta interface estende JpaRepository para realizar operações CRUD em objetos TipoIngresso

    // TipoIngresso é a entidade com a qual esta interface trabalha e Integer é o tipo da chave primária

    // Outros métodos de repositório padrão...

    // Adicione métodos personalizados, se necessário.
}
