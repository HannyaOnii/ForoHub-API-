package com.aluracursos.challengeForoHub.controller;


import com.aluracursos.challengeForoHub.domain.topicos.*;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/topicos")

public class TopicoController {

    @Autowired
    public TopicoRepository topicoRepository;

    @PostMapping
    public void  registrarTopico(@RequestBody DatosRegistroTopico datosRegistroTopico) {
      topicoRepository.save(new Topico(datosRegistroTopico));
    }

    @GetMapping
    public Page<DatosListadoTopicos> listarTopicos(Pageable paginacion){
        return topicoRepository.findAll(paginacion).map(DatosListadoTopicos::new);

    }
    @PutMapping
    @Transactional
    public void actualizarTopico(@RequestBody @Valid DatosActualizarTopico datosActualizarTopico) {
        Topico topico = topicoRepository.getReferenceById(datosActualizarTopico.id());
        topico.actualizarDatos(datosActualizarTopico);
    }
    @DeleteMapping("/{id}")
    public void eliminarTopico(@PathVariable Long id){
        //Borrar en la base de datos
        Topico topico = topicoRepository.getReferenceById(id);
        topicoRepository.delete(topico);

    }

}