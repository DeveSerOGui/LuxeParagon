package br.com.luxe.paragon.demoapi.controller;


import br.com.luxe.paragon.demoapi.model.Endereco;
import br.com.luxe.paragon.demoapi.model.UsuarioModel;
import br.com.luxe.paragon.demoapi.repository.EnderecoRepository;
import br.com.luxe.paragon.demoapi.repository.UsuarioRepository;
import br.com.luxe.paragon.demoapi.service.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/usuario/{idUsuario}/enderecos")
@RestController
public class EnderecoController {

    @Autowired
    private EnderecoRepository enderecoRepository;

    @Autowired
    private EnderecoService enderecoService;


    @GetMapping
    public ResponseEntity<List<Endereco>> getAllEnderecos() {
        return ResponseEntity.ok(this.enderecoRepository.findAll());
    }

    @GetMapping("{id}")
    public ResponseEntity<List<Endereco>> getAllEndercoPorID() {

        return ResponseEntity.ok(this.enderecoRepository.findAll());
    }

    @PostMapping
    public ResponseEntity<Endereco> create(@PathVariable("idUsuario") String idUsuario, @RequestBody Endereco endereco){
        Endereco savedItem = enderecoService.save(idUsuario, endereco);
        return new ResponseEntity<>(savedItem, HttpStatus.CREATED);
    }




}
