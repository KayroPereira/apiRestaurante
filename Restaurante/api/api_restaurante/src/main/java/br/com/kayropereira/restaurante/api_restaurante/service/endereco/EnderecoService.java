package br.com.kayropereira.restaurante.api_restaurante.service.endereco;

import br.com.kayropereira.restaurante.api_restaurante.dto.request.endereco.EnderecoDTO;
import br.com.kayropereira.restaurante.api_restaurante.dto.response.MessageResponseDTO;
import br.com.kayropereira.restaurante.api_restaurante.entity.endereco.Endereco;
import br.com.kayropereira.restaurante.api_restaurante.mapper.endereco.EnderecoMapper;
import br.com.kayropereira.restaurante.api_restaurante.repository.endereco.EnderecoRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class EnderecoService {

    private EnderecoRepository enderecoRepository;

    private final EnderecoMapper enderecoMapper = EnderecoMapper.INSTANCE;

    public MessageResponseDTO createEndereco(EnderecoDTO enderecoDTO){
        Endereco enderecoSave = enderecoRepository.save(enderecoMapper.toModel(enderecoDTO));

        return MessageResponseDTO
                .builder()
                .build()
                .createMessageResponse(enderecoSave.getId(), "Endereço criado com ID ");
    }
}
