package br.com.kayropereira.restaurante.api_restaurante.service;

import br.com.kayropereira.restaurante.api_restaurante.dto.request.TipoTelefoneDTO;
import br.com.kayropereira.restaurante.api_restaurante.dto.response.MessageResponseDTO;
import br.com.kayropereira.restaurante.api_restaurante.entity.TipoTelefone;
import br.com.kayropereira.restaurante.api_restaurante.mapper.TipoTelefoneMapper;
import br.com.kayropereira.restaurante.api_restaurante.repository.TipoTelefoneRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class TipoTelefoneService {

    private TipoTelefoneRepository tipoTelefoneRepository;

    private final TipoTelefoneMapper tipoTelefoneMapper = TipoTelefoneMapper.INSTANCE;

    public MessageResponseDTO createTipoTelefone(TipoTelefoneDTO tipoTelefoneDTO){

        TipoTelefone tipoTelefone = tipoTelefoneMapper.toModel(tipoTelefoneDTO);

        TipoTelefone tipoTelefoneSalvar = tipoTelefoneRepository.save(tipoTelefone);

        return createMessageResponse(tipoTelefoneSalvar.getId(), "Tipo de telefone com ID ");
    }

    private MessageResponseDTO createMessageResponse(Integer id, String mensagem) {
        return MessageResponseDTO
                .builder()
                .message(mensagem + id)
                .build();
    }
}
