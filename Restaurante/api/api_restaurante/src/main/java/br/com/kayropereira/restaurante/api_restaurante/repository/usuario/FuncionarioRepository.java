package br.com.kayropereira.restaurante.api_restaurante.repository.usuario;

import br.com.kayropereira.restaurante.api_restaurante.entity.usuario.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Float> {
}