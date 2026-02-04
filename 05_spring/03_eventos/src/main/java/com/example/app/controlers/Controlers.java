package com.example.app.controlers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.app.models.Eventos;
import com.example.app.repository.EventosRepository;


@Controller
public class Controlers {
    
    @Autowired
    private EventosRepository CSR;

    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping(value ="/cadastrarEvento", method=RequestMethod.GET)
    public String cadatrarEvento(){
        return "cadastro_evento.html";
    }

    @RequestMapping (value="/cadastrarEvento", method=RequestMethod.POST)
    public String cadastrarEvento(Eventos eventos){
        
    CSR.save(eventos);

    return "redirect:/";
    }

    @RequestMapping("/cadastrosucesso")
    public String cadastrosucesso(){
        return "cadastro-sucesso";
    }
}