package com.example.app.controlers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.app.models.Evento;
import com.example.app.repository.EventosRepository;


@Controller
public class Controlers {
    
    @Autowired
    private EventosRepository csr;

    @RequestMapping(value="/", method = RequestMethod.GET)
    public ModelAndView index(){
        ModelAndView mv = new ModelAndView("index");
        Iterable<Evento> eventos = csr.findAll();
        mv.addObject("eventos", eventos);
        return mv;
    }

    @RequestMapping(value ="/cadastrarEvento", method=RequestMethod.GET)
    public String cadatrarEvento(){
        return "cadastro_evento.html";
    }

    @RequestMapping (value="/cadastrarEvento", method=RequestMethod.POST)
    public String cadastrarEvento(Evento evento){
        
    csr.save(evento);

    return "redirect:/";
    }

    @RequestMapping("/cadastrosucesso")
    public String cadastrosucesso(){
        return "cadastro-sucesso";
    }

}