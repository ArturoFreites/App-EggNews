package com.example.eggnews;

import com.example.eggnews.entidades.Noticia;
import com.example.eggnews.repository.NoticiaRepository;
import com.example.eggnews.services.NoticiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
public class EggnewsApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(EggnewsApplication.class, args);
        NoticiaRepository repository= context.getBean(NoticiaRepository.class);
    }

}
