package com.aluracursos.challengeForoHub.domain.topicos;


public record DatosListadoTopicos(Long id, String titulo, String mensaje, String status,String curso) {

    public DatosListadoTopicos(Topico topico) {
        this(topico.getId(),topico.getTitulo(), topico.getMensaje(), topico.getStatus(), topico.getCurso());
    }
}