package com.n1.atividade.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.n1.atividade.entity.Filme;
import com.n1.atividade.repository.FilmeRepository;
import java.util.ArrayList;


import java.util.List;
import java.util.Optional;

import org.springframework.transaction.annotation.Transactional;

@Service
public class FilmeService {

    @Autowired
    private FilmeRepository filmeRepository;

    @Transactional
    public Filme createFilme(Filme filme) {
        return filmeRepository.save(filme);
    }

    public List<Filme> readFilmes() {
        Iterable<Filme> filmesIterable = filmeRepository.findAll();
        List<Filme> filmes = new ArrayList<>();
        filmesIterable.forEach(filmes::add);
        return filmes;
    }

    @Transactional
    public Filme updateFilme(Filme filme) {
        Optional<Filme> optionalFilme = filmeRepository.findById(filme.getId());

        if (optionalFilme.isPresent()) {
            Filme filmeToBeUpdated = optionalFilme.get();
            filmeToBeUpdated.setNome(filme.getNome());
            filmeToBeUpdated.setDuracao(filme.getDuracao());
            filmeToBeUpdated.setClassificacao(filme.getClassificacao());
            filmeToBeUpdated.setCartaz(filme.isCartaz());
            return filmeRepository.save(filmeToBeUpdated);
        } else {
            // Lançar uma exceção ou retornar um valor indicando que o filme não existe na base.
            return null;
        }
    }

    @Transactional
public String deleteFilme(Long id) {
    if (filmeRepository.existsById(id)) {
        try {
            final Optional<Filme> filme = filmeRepository.findById(id);
            filme.ifPresent(s -> filmeRepository.delete(s));
            return "Filme deletado.";
        } catch (Exception e) {
            throw e;
        }
    } else {
        return "Filme não existe na base.";
    }
}


}
