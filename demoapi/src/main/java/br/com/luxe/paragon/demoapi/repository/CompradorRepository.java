package br.com.luxe.paragon.demoapi.repository;

import br.com.luxe.paragon.demoapi.model.Comprador;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompradorRepository extends MongoRepository<Comprador, Long> {
}
