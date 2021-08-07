package br.com.kayropereira.restaurante.api_restaurante.service;

import br.com.kayropereira.restaurante.api_restaurante.dto.request.FuncionarioDTO;
import br.com.kayropereira.restaurante.api_restaurante.dto.response.MessageResponseDTO;
import br.com.kayropereira.restaurante.api_restaurante.entity.Funcionario;
import br.com.kayropereira.restaurante.api_restaurante.mapper.FuncionarioMapper;
import br.com.kayropereira.restaurante.api_restaurante.repository.FuncionarioRepository;
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
