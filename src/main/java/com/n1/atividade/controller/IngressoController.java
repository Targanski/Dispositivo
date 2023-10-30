package com.n1.atividade.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.n1.atividade.entity.Ingresso;
import com.n1.atividade.service.IngressoService;

@RestController
public class IngressoController {

    @Autowired
    private IngressoService ingressoService;

    // O controlador está marcado como um controlador REST
    // e está associado à classe IngressoService.

    // Mapeamento para criar um ingresso
    @RequestMapping(value = "/createingresso", method = RequestMethod.POST)
    public Ingresso createIngresso(@RequestBody Ingresso ingresso) {
        // Chama o serviço para criar um ingresso com base nos dados fornecidos
        return ingressoService.createIngresso(ingresso);
    }

    // Mapeamento para ler todos os ingressos
    @RequestMapping(value = "/readingresso", method = RequestMethod.GET)
    public List<Ingresso> readIngresso() {
        // Chama o serviço para obter uma lista de ingressos
        return ingressoService.readIngresso();
    }

    // Mapeamento para atualizar um ingresso
    @RequestMapping(value = "/updateingresso", method = RequestMethod.PUT)
    public String updateIngresso(@RequestBody Ingresso ingresso) {
        // Chama o serviço para atualizar um ingresso com base nos dados fornecidos
        return ingressoService.updateIngresso(ingresso);
    }

    // Mapeamento para excluir um ingresso com base nos dados fornecidos
    @RequestMapping(value = "/deleteingresso", method = RequestMethod.DELETE)
    public String deleteIngresso(@RequestBody Ingresso ingresso) {
        // Chama o serviço para excluir um ingresso com base nos dados fornecidos
        return ingressoService.deleteIngresso(ingresso);
    }
}
