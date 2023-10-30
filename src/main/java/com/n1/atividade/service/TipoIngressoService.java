package com.n1.atividade.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.n1.atividade.entity.TipoIngresso;
import com.n1.atividade.repository.TipoIngressoRepository;

import java.util.List;
import java.util.Optional;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TipoIngressoService {

    @Autowired
    private TipoIngressoRepository tipoIngressoRepository;

    @Transactional
    public TipoIngresso createTipoIngresso(TipoIngresso tipoIngresso) {
        return tipoIngressoRepository.save(tipoIngresso);
    }

    public List<TipoIngresso> readTipoIngresso() {
        return tipoIngressoRepository.findAll();
    }

    @Transactional
    public TipoIngresso updateTipoIngresso(TipoIngresso tipoIngresso) {
        Optional<TipoIngresso> optionalTipoIngresso = tipoIngressoRepository.findById(tipoIngresso.getId());

        if (optionalTipoIngresso.isPresent()) {
            TipoIngresso tipoIngressoToBeUpdated = optionalTipoIngresso.get();
            tipoIngressoToBeUpdated.setNome(tipoIngresso.getNome());
            tipoIngressoToBeUpdated.setValor(tipoIngresso.getValor());
            return tipoIngressoRepository.save(tipoIngressoToBeUpdated);
        } else {
            // Lançar uma exceção ou retornar um valor indicando que o tipo de ingresso não existe na base.
            return null;
        }
    }

    @Transactional
    public String deleteTipoIngresso(int id) {
        Optional<TipoIngresso> optionalTipoIngresso = tipoIngressoRepository.findById(id);
    
        if (optionalTipoIngresso.isPresent()) {
            try {
                tipoIngressoRepository.delete(optionalTipoIngresso.get());
                return "Tipo de Ingresso deletado.";
            } catch (Exception e) {
                throw new RuntimeException("Erro ao excluir o tipo de ingresso: " + e.getMessage());
            }
        } else {
            return "Tipo de Ingresso não existe na base.";
        }
    }
}


