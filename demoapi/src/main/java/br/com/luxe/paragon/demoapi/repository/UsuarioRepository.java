package br.com.luxe.paragon.demoapi.repository;

import luxeparagon.apimongo.model.UsuarioModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UsuarioRepository extends MongoRepository<UsuarioModel, String> {
}
