package com.aluracursos.challengeForoHub.domain.topicos;



import com.aluracursos.challengeForoHub.domain.autor.DatosAutor;
import jakarta.validation.constraints.NotBlank;

public record DatosRegistroTopico(
        Long id,
        @NotBlank
        String titulo,
        @NotBlank
        String mensaje,
        @NotBlank
        String fechaDeCreacion,
        @NotBlank
        String status,
        @NotBlank
        String curso,
        @NotBlank
        DatosAutor autor

){

}
