package com.example.app.controlers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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

    @RequestMapping(value = "/editarEvento/{idEvento}", method=RequestMethod.GET)
    public ModelAndView editarEvento(@PathVariable("idEvento") long idEvento){
        Evento evento = csr.findByIdEvento(idEvento);
        ModelAndView mv = new ModelAndView("editar_evento");
        mv.addObject("evento", evento);
          
        return mv;
    }

    @RequestMapping(value = "/editarEvento/{idEvento}",  method = RequestMethod.POST)
    public String editarEvento(@Validated Evento evento, BindingResult result, RedirectAttributes attributes){
        csr.save(evento);
        return "redirect: /so_sucesso";
    }

    @RequestMapping("/so_sucesso")
    public String soSucesso(){
        return "editar-sucesso";
    }

    @RequestMapping("/confirmarExclusao/{idEvento}")
    public ModelAndView confirmarExclusao(@PathVariable("idEvento") long idEvento){
        Evento evento = csr.findByIdEvento(idEvento);
        ModelAndView mv = new ModelAndView("excluir-evento");
        
        mv.addObject("evento", evento);
        
        return mv;
    }

    @RequestMapping("/excluirEvento")
    public String excluirEvento(long idEvento){
        Evento evento = csr.findByIdEvento(idEvento);
        csr.delete(evento);

        return "redirect:/";
    }

























































}