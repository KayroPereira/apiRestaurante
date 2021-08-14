package br.com.kayropereira.restaurante.api_restaurante.service.usuario;

import br.com.kayropereira.restaurante.api_restaurante.dto.request.usuario.FuncionarioDTO;
import br.com.kayropereira.restaurante.api_restaurante.dto.response.MessageResponseDTO;
import br.com.kayropereira.restaurante.api_restaurante.entity.usuario.Funcionario;
import br.com.kayropereira.restaurante.api_restaurante.mapper.usuario.FuncionarioMapper;
import br.com.kayropereira.restaurante.api_restaurante.repository.usuario.FuncionarioRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class FuncionarioService {

    private FuncionarioRepository funcionarioRepository;

    private final FuncionarioMapper funcionarioMapper = FuncionarioMapper.INSTANCE;

    public MessageResponseDTO createFuncionario(FuncionarioDTO funcionarioDTO){

        System.out.println(funcionarioDTO);

        Funcionario funcionario = funcionarioMapper.toModel(funcionarioDTO);

        System.out.println(funcionario);

        Funcionario funcionarioSalvar = funcionarioRepository.save(funcionario);

        return createMessageResponse(funcionarioSalvar.getId(), "Funcionário criado com ID ");
    }

    private MessageResponseDTO createMessageResponse(Long id, String mensagem) {
        return MessageResponseDTO.builder()
                .message(mensagem + id)
                .build();
    }
}
