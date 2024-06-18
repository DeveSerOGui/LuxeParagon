package br.com.luxe.paragon.demoapi.repository;

import br.com.luxe.paragon.demoapi.model.Produto;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends MongoRepository<Produto, String> {
    String countById(String id);
}
