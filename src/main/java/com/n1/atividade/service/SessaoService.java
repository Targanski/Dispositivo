package com.n1.atividade.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.n1.atividade.entity.Sessao;
import com.n1.atividade.repository.SessaoRepository;

@Service
public class SessaoService {

    @Autowired
    private SessaoRepository sessaoRepository;

    public Sessao createSessao(Sessao sessao) {
        return sessaoRepository.save(sessao);
    }

    public List<Sessao> readSessao() {
        return sessaoRepository.findAll();
    }

    public Sessao updateSessao(Sessao sessao) {
        Optional<Sessao> optionalSessao = sessaoRepository.findById(sessao.getId());

        if (optionalSessao.isPresent()) {
            Sessao sessaoToBeUpdated = optionalSessao.get();
            sessaoToBeUpdated.setFilme(sessao.getFilme());
            sessaoToBeUpdated.setHorario(sessao.getHorario());
            sessaoToBeUpdated.setData(sessao.getData());
            sessaoToBeUpdated.setCapacidade(sessao.getCapacidade());
            return sessaoRepository.save(sessaoToBeUpdated);
        } else {
            // Pode lançar uma exceção ou retornar um valor indicando que a sessão não existe na base.
            return null;
        }
    }

    @Transactional
public String deleteSessao(int id) {
    Optional<Sessao> optionalSessao = sessaoRepository.findById(id);

    if (optionalSessao.isPresent()) {
        try {
            sessaoRepository.delete(optionalSessao.get());
            return "Sessão deletada.";
        } catch (Exception e) {
            throw new RuntimeException("Erro ao excluir a sessão: " + e.getMessage());
        }
    } else {
        return "Sessão não existe na base.";
    }
}

}
