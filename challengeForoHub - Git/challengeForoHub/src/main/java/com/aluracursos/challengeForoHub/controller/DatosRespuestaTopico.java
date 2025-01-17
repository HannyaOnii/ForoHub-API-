package com.aluracursos.challengeForoHub.controller;

import com.aluracursos.challengeForoHub.domain.autor.DatosAutor;


public record DatosRespuestaTopico(Long id, String titulo, String mensaje, String fechaDeCreacion, String status, String curso, DatosAutor autor){

}
