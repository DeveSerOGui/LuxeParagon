package br.com.luxe.paragon.demoapi.repository;

import br.com.luxe.paragon.demoapi.model.Pedido;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepository extends MongoRepository <Pedido, String>{
    String countById(String id);
}
