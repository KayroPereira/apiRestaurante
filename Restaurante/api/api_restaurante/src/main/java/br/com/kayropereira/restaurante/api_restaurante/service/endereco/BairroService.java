package br.com.kayropereira.restaurante.api_restaurante.service.endereco;

import br.com.kayropereira.restaurante.api_restaurante.dto.request.endereco.BairroDTO;
import br.com.kayropereira.restaurante.api_restaurante.dto.response.MessageResponseDTO;
import br.com.kayropereira.restaurante.api_restaurante.entity.endereco.Bairro;
import br.com.kayropereira.restaurante.api_restaurante.mapper.endereco.BairroMapper;
import br.com.kayropereira.restaurante.api_restaurante.repository.endereco.BairroRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class BairroService {

    private BairroRepository bairroRepository;

    private final BairroMapper bairroMapper = BairroMapper.INSTANCE;

    public MessageResponseDTO createBairro(BairroDTO bairroDTO){
        Bairro bairroSave = bairroRepository.save(bairroMapper.toModel(bairroDTO));

        return MessageResponseDTO
                .builder()
                .build()
                .createMessageResponse(bairroSave.getId(), "Bairro criado com ID ");
    }
}
