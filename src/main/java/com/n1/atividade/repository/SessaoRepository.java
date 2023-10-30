package com.n1.atividade.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.n1.atividade.entity.Filme;
import com.n1.atividade.entity.Sessao;

// Define o pacote em que esta classe está localizada
public interface SessaoRepository extends JpaRepository<Sessao, Integer> {
    // Esta interface estende JpaRepository para realizar operações CRUD em objetos Sessao

    // Sessao é a entidade com a qual esta interface trabalha e Integer é o tipo da chave primária

    // Método personalizado que verifica se existe uma sessão com o mesmo filme, horário e data.
    public boolean existsByFilmeAndHorarioAndData(Filme filme, String horario, String data);

    // Outros métodos de repositório padrão...

    // Adicione métodos personalizados, se necessário.
}
