package com.example.eggnews.controllers;

import com.example.eggnews.entidades.Noticia;
import com.example.eggnews.services.NoticiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/")

public class HomeController {

    @Autowired
    NoticiaService noticiaService;

    @GetMapping("/")
    public String index(ModelMap modelo){

        List<Noticia> noticias = noticiaService.mostarNoticias();
            modelo.addAttribute("noticias", noticias);
            return "index.html";
    }
}
