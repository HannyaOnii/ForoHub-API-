package com.aluracursos.challengeForoHub.domain.topicos;

import com.aluracursos.challengeForoHub.domain.autor.Autor;
import jakarta.persistence.*;
import lombok.*;


@Table(name= "topicos")
@Entity(name = "Topico")
@AllArgsConstructor
@EqualsAndHashCode(of = "id")

public class Topico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String mensaje;
    private String fechaDeCreacion;
    private String status;
    private String curso;
    @Embedded
    private Autor autor;

    public Topico(DatosRegistroTopico datosRegistroTopico) {
        this.id = datosRegistroTopico.id();
        this.titulo = datosRegistroTopico.titulo();
        this.mensaje = datosRegistroTopico.mensaje();
        this.fechaDeCreacion = datosRegistroTopico.fechaDeCreacion();
        this.status = datosRegistroTopico.status();
        this.curso = datosRegistroTopico.curso();
        this.autor = new Autor(datosRegistroTopico.autor());

    }


    public Long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getMensaje() {
        return mensaje;
    }

    public String getFechaDeCreacion() {
        return fechaDeCreacion;
    }

    public String getStatus() {
        return status;
    }

    public String getCurso() {
        return curso;
    }


    public void actualizarDatos(DatosActualizarTopico datosActualizarTopico) {
        if(datosActualizarTopico.titulo() != null){
            this.titulo = datosActualizarTopico.titulo();
        }
        if(datosActualizarTopico.mensaje() != null){
            this.mensaje = datosActualizarTopico.mensaje();
        }if(datosActualizarTopico.curso() != null){
            this.curso = datosActualizarTopico.curso();
        }

    }
}



