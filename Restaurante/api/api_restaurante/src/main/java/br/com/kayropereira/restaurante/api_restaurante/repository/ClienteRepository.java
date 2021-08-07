package br.com.kayropereira.restaurante.api_restaurante.repository;

import br.com.kayropereira.restaurante.api_restaurante.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
