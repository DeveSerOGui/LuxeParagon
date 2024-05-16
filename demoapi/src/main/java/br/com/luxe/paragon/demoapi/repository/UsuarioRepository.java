package br.com.luxe.paragon.demoapi.repository;

import br.com.luxe.paragon.demoapi.model.UsuarioModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UsuarioRepository extends MongoRepository<UsuarioModel, String> {
}
