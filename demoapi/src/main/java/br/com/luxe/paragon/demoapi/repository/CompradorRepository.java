package br.com.luxe.paragon.demoapi.repository;

import br.com.luxe.paragon.demoapi.model.Comprador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompradorRepository extends JpaRepository<Comprador, Long> {
}
