package com.example.eggnews.services;

import com.example.eggnews.entidades.Noticia;
import com.example.eggnews.repository.NoticiaRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


@Service
public class NoticiaService {

    @Autowired
    private NoticiaRepository noticiaRepository;

    @Transactional
    public void crearNoticia(String titulo, String cuerpo, String imgUrl) throws Exception{

        validadDatos(titulo,cuerpo,imgUrl);
        Noticia noticia = new Noticia();
        noticia.setTitulo(titulo);
        noticia.setCuerpo(cuerpo);
        noticia.setImgUrl(imgUrl);

        noticiaRepository.save(noticia);
    }

    private void validadDatos(String titulo, String cuerpo, String imgUrl) throws Exception {

        if (titulo.isEmpty()){
            throw new Exception("error");
        }

        if (cuerpo.isEmpty()){
            throw new Exception("error cuerpo");
        }

        if (imgUrl.isEmpty() ){
            throw new Exception("error imgUrl");
        }
    }

    public List<Noticia> mostarNoticias(){
        return noticiaRepository.findAll();
    }
}
