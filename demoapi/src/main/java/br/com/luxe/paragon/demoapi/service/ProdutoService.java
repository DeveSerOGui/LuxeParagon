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
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    @Autowired
    private  PedidoService pedidoService;

    @Autowired
    private PedidoRepository pedidoRepository;

    public Optional<Produto> findById(String id) {
        return this.produtoRepository.findById(id);
    }

    public List<Produto> findAll() {
        return this.produtoRepository.findAll();
    }

    public Optional<Produto> getById(String id) {
        return this.produtoRepository.findById(id);
    }

    public Produto create(Produto produto) {
        return this.produtoRepository.save(produto);
    }

    public Produto update(String id, Produto newData) throws Exception {
        Optional<Produto> result = this.produtoRepository.findById(id);

        Produto produtoASerAtualizado = result.get();
        produtoASerAtualizado.setNome(newData.getNome());
        produtoASerAtualizado.setCategoria(newData.getCategoria());
        produtoASerAtualizado.setPreco(newData.getPreco());
        produtoASerAtualizado.setGenero(newData.getGenero());
        produtoASerAtualizado.setMarca(newData.getMarca());
        produtoASerAtualizado.setTamanho(newData.getTamanho());
        this.produtoRepository.save(produtoASerAtualizado);
        return produtoASerAtualizado;
    }

    public void delete(String id) throws Exception {
        Optional<Produto> produtoASerExcluido = this.produtoRepository.findById(id);
        this.produtoRepository.delete(produtoASerExcluido.get());
    }

    public Produto save(String idProduto, Produto item){
        Optional<Pedido> opPedido = this.pedidoService.findById(idProduto);

        Pedido pedido = opPedido.get();
        pedido.getProdutos().add(item);
        this.pedidoRepository.save(pedido);

        return item;
    }
}
