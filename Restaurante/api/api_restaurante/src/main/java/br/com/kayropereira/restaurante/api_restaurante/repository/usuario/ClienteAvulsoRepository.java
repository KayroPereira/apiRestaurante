package br.com.kayropereira.restaurante.api_restaurante.repository.usuario;

import br.com.kayropereira.restaurante.api_restaurante.entity.usuario.ClienteAvulso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteAvulsoRepository extends JpaRepository<ClienteAvulso, Long> {
}
