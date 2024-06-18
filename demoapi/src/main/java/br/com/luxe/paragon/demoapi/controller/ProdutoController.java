package br.com.luxe.paragon.demoapi.controller;

import br.com.luxe.paragon.demoapi.model.Endereco;
import br.com.luxe.paragon.demoapi.model.Pedido;
import br.com.luxe.paragon.demoapi.model.Produto;
import br.com.luxe.paragon.demoapi.request.ProdutoRequest;
import br.com.luxe.paragon.demoapi.service.ProdutoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
public class ProdutoController {

    private final ProdutoService produtoService;

    public ProdutoController(ProdutoService produtoService){
        this.produtoService = produtoService;
    }

    @GetMapping("/produtos")
    public ResponseEntity<List<Produto>> getAllProducts() {

        try {
            return new ResponseEntity<>(this.produtoService.findAll(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/produtos/{id}")
    public ResponseEntity<Produto> getById(@PathVariable("id") String id) {

        Optional<Produto> result = this.produtoService.findById(id);

        if (result.isPresent()) {
            return new ResponseEntity<>(result.get(), HttpStatus.OK);
        }

        return new ResponseEntity<>(HttpStatus.NOT_FOUND);

    }

    @PostMapping("/produtos")
    public ResponseEntity<Produto> create(@RequestBody Produto item) throws Exception {

        Produto savedItem = produtoService.create(item);
        return new ResponseEntity<>(savedItem, HttpStatus.CREATED);
    }

    @PutMapping("/pedidos/{idPedido}/produtos")
    public ResponseEntity<Produto> create(@PathVariable("idPedido") String idProduto, @RequestBody Produto produto){
        Produto savedItem = produtoService.save(idProduto, produto);
        return new ResponseEntity<>(savedItem, HttpStatus.CREATED);
    }


    @PutMapping("/produtos/{id}")
    public ResponseEntity<Produto> update(@PathVariable("id") String id, @RequestBody Produto produtoNovosDados) {
        try {
            Produto result = this.produtoService.update(id, produtoNovosDados);
            return new ResponseEntity<>(result, HttpStatus.OK);
        } catch (Exception ex) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/produtos/{id}")
    public ResponseEntity deleteProdutoPorID(@PathVariable String id) throws Exception {

        produtoService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);

    }
}
