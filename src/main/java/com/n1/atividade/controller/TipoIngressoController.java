package com.n1.atividade.controller;

import org.springframework.web.bind.annotation.*;
import com.n1.atividade.entity.TipoIngresso;
import com.n1.atividade.service.TipoIngressoService;

import java.util.List;
import java.util.Map;

@RestController
public class TipoIngressoController {

    private final TipoIngressoService tipoIngressoService;

    // Construtor que injeta o TipoIngressoService
    public TipoIngressoController(TipoIngressoService tipoIngressoService) {
        this.tipoIngressoService = tipoIngressoService;
    }

    // Mapeamento para criar um tipo de ingresso
    @RequestMapping(value = "createtipoingresso", method = RequestMethod.POST)
    public TipoIngresso createTipoIngresso(@RequestBody TipoIngresso tipoIngresso) {
        // Chama o serviço para criar um tipo de ingresso com base nos dados fornecidos
        return tipoIngressoService.createTipoIngresso(tipoIngresso);
    }

    // Mapeamento para ler todos os tipos de ingresso
    @RequestMapping(value = "readtipoingresso", method = RequestMethod.GET)
    public List<TipoIngresso> readTipoIngresso() {
        // Chama o serviço para obter uma lista de tipos de ingresso
        return tipoIngressoService.readTipoIngresso();
    }

    // Mapeamento para atualizar um tipo de ingresso
    @RequestMapping(value = "updatetipoingresso", method = RequestMethod.PUT)
    public TipoIngresso updateTipoIngresso(@RequestBody TipoIngresso tipoIngresso) {
        // Chama o serviço para atualizar um tipo de ingresso com base nos dados fornecidos
        return tipoIngressoService.updateTipoIngresso(tipoIngresso);
    }

    // Mapeamento para excluir um tipo de ingresso com base no ID
    @RequestMapping(value = "deletetipoingresso", method = RequestMethod.DELETE)
    public String deleteTipoIngresso(@RequestBody Map<String, Integer> request) {
        int id = request.get("id");
        // Chama o serviço para excluir um tipo de ingresso com base no ID fornecido
        return tipoIngressoService.deleteTipoIngresso(id);
    }
}
