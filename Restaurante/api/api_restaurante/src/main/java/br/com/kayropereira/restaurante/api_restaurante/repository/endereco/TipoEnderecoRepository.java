package br.com.kayropereira.restaurante.api_restaurante.repository.endereco;

import br.com.kayropereira.restaurante.api_restaurante.entity.endereco.TipoEndereco;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TipoEnderecoRepository extends JpaRepository<TipoEndereco, Long> {
}
