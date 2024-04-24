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

            Comprador comprador1 = new Comprador();
            comprador1.setId(1);
            comprador1.setNome("Guilherme");
            comprador1.setCpf("123");

            Comprador comprador2 = new Comprador();
            comprador2.setId(2);
            comprador2.setNome("João");
            comprador2.setCpf("456");

            return new ResponseEntity<>(Compradores, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
