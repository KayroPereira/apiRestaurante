package br.com.kayropereira.restaurante.api_restaurante.repository.usuario;

import br.com.kayropereira.restaurante.api_restaurante.entity.usuario.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
