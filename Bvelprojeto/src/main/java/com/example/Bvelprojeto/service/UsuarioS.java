package com.example.Bvelprojeto.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.example.Bvelprojeto.model.UsuarioModel;
import com.example.Bvelprojeto.repository.UsuarioRepository;

@Service
public class UsuarioS {
    @Autowired
    private UsuarioRepository usuarioR;
    public List<UsuarioModel> findAll() {
        return usuarioR.findAll();
    }
    public ResponseEntity<UsuarioModel> findById(UUID id) {
        Optional<UsuarioModel> usuariom = usuarioR.findById(id);
        return null;
    }
    public UsuarioModel save(UsuarioModel usuariom) {
        return usuarioR.save(usuariom);
    }
    public ResponseEntity<UsuarioModel>update(UUID id, UsuarioModel uUser) {
        Optional<UsuarioModel> vuser = usuarioR.findById(id);
        return null;
    }
    }
