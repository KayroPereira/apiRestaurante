package br.com.kayropereira.restaurante.api_restaurante.repository.usuario;

import br.com.kayropereira.restaurante.api_restaurante.entity.usuario.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
