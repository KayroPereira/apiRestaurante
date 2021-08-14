package br.com.kayropereira.restaurante.api_restaurante.repository.endereco;

import br.com.kayropereira.restaurante.api_restaurante.entity.endereco.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CidadeRepository extends JpaRepository<Cidade, Long> {
}
