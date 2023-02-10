package com.example.eggnews.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Table(name = "news")
@Data

public class Noticia {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    Long id;
    String titulo;
    String cuerpo;
    String imgUrl;

    public Noticia(String titulo, String cuerpo, String imgUrl) {
        this.titulo = titulo;
        this.cuerpo = cuerpo;
        this.imgUrl = imgUrl;
    }
    public  Noticia(){

    }
}
