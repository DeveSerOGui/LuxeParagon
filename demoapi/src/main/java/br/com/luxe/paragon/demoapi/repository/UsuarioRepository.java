package br.com.luxe.paragon.demoapi.repository;

import br.com.luxe.paragon.demoapi.model.UsuarioModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends MongoRepository<UsuarioModel, String> {
    String countById(String id);
}
