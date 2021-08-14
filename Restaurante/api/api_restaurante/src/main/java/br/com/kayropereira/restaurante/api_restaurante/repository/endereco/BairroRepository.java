package br.com.kayropereira.restaurante.api_restaurante.repository.endereco;

import br.com.kayropereira.restaurante.api_restaurante.entity.endereco.Bairro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BairroRepository extends JpaRepository<Bairro, Long> {
}
