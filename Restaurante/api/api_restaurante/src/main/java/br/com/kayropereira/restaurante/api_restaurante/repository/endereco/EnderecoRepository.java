package br.com.kayropereira.restaurante.api_restaurante.repository.endereco;

import br.com.kayropereira.restaurante.api_restaurante.entity.endereco.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnderecoRepository extends JpaRepository<Endereco, Long> {
}
