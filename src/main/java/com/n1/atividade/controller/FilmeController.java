package com.n1.atividade.controller;

import org.springframework.web.bind.annotation.*;
import com.n1.atividade.entity.Filme;
import com.n1.atividade.service.FilmeService;

import java.util.List;
import java.util.Map;

@RestController
public class FilmeController {

    private final FilmeService filmeService;

    // Construtor que injeta o FilmeService
    public FilmeController(FilmeService filmeService) {
        this.filmeService = filmeService;
    }

    // Mapeamento para criar um filme
    @RequestMapping(value = "/createfilme", method = RequestMethod.POST)
    public Filme createFilme(@RequestBody Filme filme) {
        return filmeService.createFilme(filme);
    }

    // Mapeamento para ler todos os filmes
    @RequestMapping(value = "/readfilme", method = RequestMethod.GET)
    public List<Filme> readFilmes() {
        return filmeService.readFilmes();
    }

    // Mapeamento para atualizar um filme
    @RequestMapping(value = "/updatefilme", method = RequestMethod.PUT)
    public Filme updateFilme(@RequestBody Filme filme) {
        return filmeService.updateFilme(filme);
    }

    // Mapeamento para excluir um filme com base no ID
    @RequestMapping(value = "/deletefilme", method = RequestMethod.DELETE)
    public String deleteFilme(@RequestBody Map<String, Long> request) {
        Long id = request.get("id");
        return filmeService.deleteFilme(id);
    }
}
