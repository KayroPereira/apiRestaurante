package br.com.kayropereira.restaurante.api_restaurante.service;

import br.com.kayropereira.restaurante.api_restaurante.dto.request.UsuarioDTO;
import br.com.kayropereira.restaurante.api_restaurante.dto.response.MessageResponseDTO;
import br.com.kayropereira.restaurante.api_restaurante.entity.Usuario;
import br.com.kayropereira.restaurante.api_restaurante.mapper.UsuarioMapper;
import br.com.kayropereira.restaurante.api_restaurante.repository.UsuarioRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class UsuarioService {

    private UsuarioRepository usuarioRepository;

    private final UsuarioMapper usuarioMapper = UsuarioMapper.INSTANCE;

    public MessageResponseDTO createtUsuario(UsuarioDTO usuarioDTO){
        Usuario usuario = usuarioMapper.toModel(usuarioDTO);

        Usuario usuarioSalvar = usuarioRepository.save(usuario);
        return createMessageResponse(usuarioSalvar.getId(), "Criado usuario com id ");
    }

    private MessageResponseDTO createMessageResponse(Long id, String mensagem) {
        return MessageResponseDTO
                .builder()
                .message(mensagem + id)
                .build();
    }
}
