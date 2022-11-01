package com.example.Bvelprojeto.controller;
import java.util.List;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.Bvelprojeto.model.UsuarioModel;
import com.example.Bvelprojeto.service.UsuarioS;

@RestController
@RequestMapping("/userr")
public class UsuarioC {
    @Autowired
    private UsuarioS uService;

    @GetMapping
    public List<UsuarioModel> findAll() {
        return uService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<UsuarioModel> findById(@PathVariable UUID id) {
        return uService.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public UsuarioModel save(@RequestBody UsuarioModel usuariom) {
        return uService.save(usuariom);
    }

    @PutMapping("/{id}")
    public ResponseEntity<UsuarioModel> update(@PathVariable UUID id, @RequestBody UsuarioModel uUser) {
        return uService.update(id, uUser);
    }
}



