package br.com.kayropereira.restaurante.api_restaurante.repository;

import br.com.kayropereira.restaurante.api_restaurante.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
