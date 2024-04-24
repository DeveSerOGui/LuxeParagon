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
            public ResponseEntity<Comprador> getById(@PathVariable("id") Integer id) {
                Comprador result = null;

                        for(Comprador item : Compradores){
                            if (item.getId()==id){
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
                public ResponseEntity<Comprador> update(@PathVariable("id") Integer id, @RequestBody Comprador CompradorNovosDados) {

                    Comprador compradorAtualizar = null;
                    
                    for(Comprador item : Compradores){
                        if (item.getId()==id){
                            compradorAtualizar = item;
                            break;
                        }
                    }

                    if (compradorAtualizar == null){
                        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
                    }

                    compradorAtualizar.setNome(compradorAtualizar.getNome());
                    compradorAtualizar.setCpf(compradorAtualizar.getCpf());

                    return new ResponseEntity<Comprador>(compradorAtualizar, HttpStatus.OK);
                }
            
}
