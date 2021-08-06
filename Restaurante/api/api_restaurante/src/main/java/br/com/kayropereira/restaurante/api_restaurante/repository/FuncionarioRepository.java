package br.com.kayropereira.restaurante.api_restaurante.repository;

import br.com.kayropereira.restaurante.api_restaurante.entity.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Float> {
}