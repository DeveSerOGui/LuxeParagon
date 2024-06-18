package br.com.luxe.paragon.demoapi.controller;


import br.com.luxe.paragon.demoapi.model.UsuarioModel;
import br.com.luxe.paragon.demoapi.repository.UsuarioRepository;
import br.com.luxe.paragon.demoapi.request.UsuarioRequest;
import br.com.luxe.paragon.demoapi.service.UsuarioService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
public class UsuarioController {


    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @GetMapping("/usuario")
    public ResponseEntity<List<UsuarioModel>> getAllProducts() {

        try {
            return new ResponseEntity<>(this.usuarioService.findAll(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @GetMapping("/usuario/{id}")
    public ResponseEntity<UsuarioModel> getById(@PathVariable("id") String id) {

        Optional<UsuarioModel> result = this.usuarioService.findById(id);

        if (result.isPresent()) {
            return new ResponseEntity<>(result.get(), HttpStatus.OK);
        }

        return new ResponseEntity<>(HttpStatus.NOT_FOUND);

    }


    @PostMapping("/usuario")
    public ResponseEntity<UsuarioModel> create(@RequestBody UsuarioModel item) throws Exception {

        UsuarioModel savedItem = usuarioService.create(item);
        return new ResponseEntity<>(savedItem, HttpStatus.CREATED);
    }

    @PutMapping("/usuario/{id}")
    public ResponseEntity<UsuarioModel> update(@PathVariable("id") String id, @RequestBody UsuarioModel usuarioNovosDados) {
        try {
            UsuarioModel result = this.usuarioService.update(id, usuarioNovosDados);
            return new ResponseEntity<>(result, HttpStatus.OK);
        } catch (Exception ex) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/usuario/{id}")
    public ResponseEntity deleteUsuarioPorID(@PathVariable String id) throws Exception {

        usuarioService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);

    }
}
