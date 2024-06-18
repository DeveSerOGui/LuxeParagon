package br.com.luxe.paragon.demoapi.controller;


import br.com.luxe.paragon.demoapi.model.Pedido;
import br.com.luxe.paragon.demoapi.repository.PedidoRepository;
import br.com.luxe.paragon.demoapi.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class PedidoController {

    @Autowired
    private PedidoRepository pedidoRepository;

    @Autowired
    private PedidoService pedidoService;


    @GetMapping("/pedidos")
    public ResponseEntity<List<Pedido>> getAllPedidos() {
        return ResponseEntity.ok(this.pedidoRepository.findAll());
    }

    @GetMapping("/pedidos/{id}")
    public ResponseEntity<List<Pedido>> getPedidoPorID() {

        return ResponseEntity.ok(this.pedidoRepository.findAll());
    }

    @PostMapping("/pedidos")
    public ResponseEntity<Pedido> create(@RequestBody Pedido item) throws Exception {

        Pedido savedItem = pedidoService.create(item);
        return new ResponseEntity<>(savedItem, HttpStatus.CREATED);
    }

    @DeleteMapping("/pedidos/{id}")
    public ResponseEntity deletePedidoPorID(@PathVariable String id) throws Exception {

        pedidoService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);

    }

}
