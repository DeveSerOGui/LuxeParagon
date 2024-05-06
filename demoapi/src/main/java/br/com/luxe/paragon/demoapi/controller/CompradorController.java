package br.com.luxe.paragon.demoapi.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import br.com.luxe.paragon.demoapi.model.Comprador;
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

    private static ArrayList<Comprador> Compradores = new ArrayList<>();

    @GetMapping
    public ResponseEntity<List<Comprador>> getAll() {
        try {
            return new ResponseEntity<>(Compradores, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping
    public ResponseEntity<Comprador> create(@RequestBody Comprador item) {
        try {
            Compradores.add(item);
            return new ResponseEntity<>(item, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.EXPECTATION_FAILED);
        }
    }

    @GetMapping("{id}")
    public ResponseEntity<Comprador> getById(@PathVariable("id") Integer idComprador) {
        Comprador result = null;

        for (Comprador item : Compradores) {
            if (item.getId() == idComprador) {
                result = item;
                break;
            }
        }

        if (result != null) {
            return new ResponseEntity<>(result, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("{id}")
    public ResponseEntity<Comprador> update(@PathVariable("id") Integer idComprador, @RequestBody Comprador CompradorNovosDados) {

        Comprador compradorAtualizar = null;

        for (Comprador item : Compradores) {
            if (item.getId() == idComprador) {
                compradorAtualizar = item;
                break;
            }
        }

        if (compradorAtualizar == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        compradorAtualizar.setNome(CompradorNovosDados.getNome());
        compradorAtualizar.setCpf(CompradorNovosDados.getCpf());
        compradorAtualizar.setEmail(CompradorNovosDados.getEmail());

        return new ResponseEntity<>(compradorAtualizar, HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<HttpStatus> delete(@PathVariable("id") Integer idComprador) {
        try {
            Comprador compradorExcluir = null;

            for (Comprador item : Compradores) {
                if (item.getId() == idComprador) {
                    compradorExcluir = item;
                    break;
                }
            }

            if (compradorExcluir == null){
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }

            Compradores.remove(compradorExcluir);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.EXPECTATION_FAILED);
        }
    }

}
