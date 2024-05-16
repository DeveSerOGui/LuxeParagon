package br.com.luxe.paragon.demoapi.controller;


import br.com.luxe.paragon.demoapi.repository.UsuarioRepository;
import br.com.luxe.paragon.demoapi.request.UsuarioRequest;
import luxeparagon.apimongo.model.UsuarioModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsuarioController {

    private final UsuarioRepository usuarioRepository;

    public UsuarioController(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @GetMapping("/usuario")
    public ResponseEntity<List<UsuarioModel>> getAllProducts() {

        return ResponseEntity.ok(this.usuarioRepository.findAll());
    }
    @PostMapping("/usuario")
    public ResponseEntity<UsuarioModel> createUsuario(@RequestBody UsuarioRequest usuarioRequest) {

        UsuarioModel usuario = new UsuarioModel();
        usuario.setNome(usuarioRequest.getNome());
        usuario.setEmail(usuarioRequest.getEmail());
        usuario.setSenha(usuarioRequest.getSenha());

        return ResponseEntity.status(201).body(this.usuarioRepository.save(usuario));
    }

}
