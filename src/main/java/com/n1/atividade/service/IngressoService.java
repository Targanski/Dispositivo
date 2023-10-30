package com.n1.atividade.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.n1.atividade.entity.Ingresso;
import com.n1.atividade.repository.IngressoRepository;
import jakarta.transaction.Transactional;

@Service
public class IngressoService {

    @Autowired
    private IngressoRepository ingressoRepository;
@Transactional
    public Ingresso createIngresso(Ingresso ingresso) {
        return ingressoRepository.save(ingresso);
    }

    public List<Ingresso> readIngresso() {
        return ingressoRepository.findAll();
    }

    @Transactional
    public String updateIngresso(Ingresso ingresso) {
        Optional<Ingresso> optionalIngresso = ingressoRepository.findById(ingresso.getId());

        if (optionalIngresso.isPresent()) {
            Ingresso ingressoToBeUpdated = optionalIngresso.get();
            ingressoToBeUpdated.setPoltrona(ingresso.getPoltrona());
            ingressoToBeUpdated.setIdSessao(ingresso.getIdSessao());
            ingressoToBeUpdated.setTipoIngresso(ingresso.getTipoIngresso());
            ingressoRepository.save(ingressoToBeUpdated);
            return "Ingresso atualizado.";
        } else {
            return "Ingresso não existe na base.";
        }
    }

    @Transactional
    public String deleteIngresso(Ingresso ingresso) {
        if (ingressoRepository.existsById(ingresso.getId())) {
            try {
                ingressoRepository.deleteById(ingresso.getId());
                return "Ingresso deletado.";
            } catch (Exception e) {
                throw e;
            }
        } else {
            return "Ingresso não existe na base.";
        }
    }
}
