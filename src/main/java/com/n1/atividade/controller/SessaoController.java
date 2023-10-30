package com.n1.atividade.controller;

import org.springframework.web.bind.annotation.*;
import com.n1.atividade.entity.Sessao;
import com.n1.atividade.service.SessaoService;

import java.util.List;
import java.util.Map;

@RestController
public class SessaoController {

    private final SessaoService sessaoService;

    // Construtor que injeta o SessaoService
    public SessaoController(SessaoService sessaoService) {
        this.sessaoService = sessaoService;
    }

    // Mapeamento para criar uma sessão
    @RequestMapping(value = "createsessao", method = RequestMethod.POST)
    public Sessao createSessao(@RequestBody Sessao sessao) {
        // Chama o serviço para criar uma sessão com base nos dados fornecidos
        return sessaoService.createSessao(sessao);
    }

    // Mapeamento para ler todas as sessões
    @RequestMapping(value = "readsessao", method = RequestMethod.GET)
    public List<Sessao> readSessao() {
        // Chama o serviço para obter uma lista de sessões
        return sessaoService.readSessao();
    }

    // Mapeamento para atualizar uma sessão
    @RequestMapping(value = "updatesessao", method = RequestMethod.PUT)
    public Sessao updateSessao(@RequestBody Sessao sessao) {
        // Chama o serviço para atualizar uma sessão com base nos dados fornecidos
        return sessaoService.updateSessao(sessao);
    }

    // Mapeamento para excluir uma sessão com base no ID
    @RequestMapping(value = "deletesessao", method = RequestMethod.DELETE)
    public String deleteSessao(@RequestBody Map<String, Integer> request) {
        int id = request.get("id");
        // Chama o serviço para excluir uma sessão com base no ID fornecido
        return sessaoService.deleteSessao(id);
    }
}
