package br.com.luxe.paragon.demoapi.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import br.com.luxe.paragon.demoapi.model.Comprador;
import br.com.luxe.paragon.demoapi.repository.CompradorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/comprador")
class CompradorController {

    @Autowired
    private CompradorRepository compradorRepository;

    private static ArrayList<Comprador> Compradores = new ArrayList<>();


    @GetMapping
    public ResponseEntity<List<Comprador>> getAll() {
        try {
            return new ResponseEntity<>(this.compradorRepository.findAll(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping
    public ResponseEntity<Comprador> create(@RequestBody Comprador item) {
        try {
            Comprador result = this.compradorRepository.save(item);
            return new ResponseEntity<>(result, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.EXPECTATION_FAILED);
        }
    }

    @GetMapping("{id}")
    public ResponseEntity<Comprador> getById(@PathVariable("id") long idComprador) {
        Optional <Comprador> result = this.compradorRepository.findById(idComprador);

        if (result.isPresent()) {
            return new ResponseEntity<>(result.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("{id}")
    public ResponseEntity<Comprador> update(@PathVariable("id") long idComprador, @RequestBody Comprador CompradorNovosDados) {

        Optional <Comprador> result = this.compradorRepository.findById(idComprador);

        if (result.isPresent() == false) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        Comprador compradorAtualizar = result.get();
        compradorAtualizar.setNome(CompradorNovosDados.getNome());
        compradorAtualizar.setCpf(CompradorNovosDados.getCpf());
        compradorAtualizar.setEmail(CompradorNovosDados.getEmail());

        this.compradorRepository.save(compradorAtualizar);
        return new ResponseEntity<>(compradorAtualizar, HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<HttpStatus> delete(@PathVariable("id") long idComprador) {
        try {
            Optional <Comprador> compradorExcluir = this.compradorRepository.findById(idComprador);

            if (compradorExcluir.isPresent() == false){
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }

            this.compradorRepository.delete(compradorExcluir.get());

            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.EXPECTATION_FAILED);
        }
    }

}
