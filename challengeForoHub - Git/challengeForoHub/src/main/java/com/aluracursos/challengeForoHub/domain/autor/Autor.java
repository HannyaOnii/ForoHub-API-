package com.aluracursos.challengeForoHub.domain.autor;

import jakarta.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Getter;



@Getter
@AllArgsConstructor
@Embeddable
public class Autor {
    private String nombre;
    private String email;


    public Autor(DatosAutor autor) {
        this.nombre = autor.nombre();
        this.email = autor.email();
    }
}