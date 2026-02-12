package com.apostila.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.apostila.app.models.Tarefa;
import com.apostila.app.repository.TarefaRepository;

@Controller
public class TarefasController {
    
    @Autowired
    private TarefaRepository tarefaRepository;

    @GetMapping("/tarefas")
    public String listarTarefas(Model model){
        model.addAttribute("listaTarefas", tarefaRepository.findAll());

        return "lista_tarefas"; // Retorna o template Thymeleaf
    }

    @PostMapping("/salvarTarefa")
    public String salvarTarefa(Tarefa tarefa){
        tarefaRepository.save(tarefa);

        return "redirect:/tarefas"; // Redireciona para a lista após salvar
    }
}
