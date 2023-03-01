package com.firstcrud.demo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.firstcrud.demo.model.Estado;
import com.firstcrud.demo.service.EstadoService;

@RestController
@RequestMapping ("/estado/")
public class EstadoREST {
    
    @Autowired
    private EstadoService estadoService;

    @GetMapping
    private ResponseEntity<List<Estado>> getAllPaises() {
        return ResponseEntity.ok(estadoService.findAll());
    }
}
