package com.n1.atividade.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.n1.atividade.entity.Ingresso;
import java.util.List;

// Define o pacote em que esta classe está localizada
public interface IngressoRepository extends JpaRepository<Ingresso, Integer> {
    // Esta interface estende JpaRepository para realizar operações CRUD em objetos Ingresso

    // Ingresso é a entidade com a qual esta interface trabalha e Integer é o tipo da chave primária

    // Método personalizado que verifica se existe um ingresso com uma determinada poltrona em uma sessão
    public boolean existsByPoltronaAndIdSessao(String poltrona, Integer idSessao);

    // Método personalizado que retorna uma lista de ingressos com uma determinada poltrona em uma sessão
    public List<Ingresso> findByPoltronaAndIdSessao(String poltrona, Integer idSessao);

    // Consulta personalizada usando JPQL para encontrar o ID máximo de uma sessão
    @Query("select max(i.id) from Ingresso i")
    public Integer findMaxIdSessao();
}
