package br.com.luxe.paragon.demoapi.service;


import br.com.luxe.paragon.demoapi.model.Endereco;
import br.com.luxe.paragon.demoapi.model.Pedido;
import br.com.luxe.paragon.demoapi.model.Produto;
import br.com.luxe.paragon.demoapi.model.UsuarioModel;
import br.com.luxe.paragon.demoapi.repository.PedidoRepository;
import br.com.luxe.paragon.demoapi.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    public Optional<Pedido> findById(String id) {
        return this.pedidoRepository.findById(id);
    }

    public List<Pedido> findAll() {
        return this.pedidoRepository.findAll();
    }

    public Optional<Pedido> getById(String id) {
        return this.pedidoRepository.findById(id);
    }

    public Pedido create(Pedido pedido) {
        return this.pedidoRepository.save(pedido);
    }

    public void delete(String id) throws Exception {
        Optional<Pedido> pedidoASerExcluido = this.pedidoRepository.findById(id);
        this.pedidoRepository.delete(pedidoASerExcluido.get());
    }

}
