package br.com.luxe.paragon.demoapi.repository;

import br.com.luxe.paragon.demoapi.model.Endereco;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends MongoRepository<Endereco, String> {
}
