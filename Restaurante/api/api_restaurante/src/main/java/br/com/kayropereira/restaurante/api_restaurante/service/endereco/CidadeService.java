package br.com.kayropereira.restaurante.api_restaurante.service.endereco;

import br.com.kayropereira.restaurante.api_restaurante.dto.request.endereco.CidadeDTO;
import br.com.kayropereira.restaurante.api_restaurante.dto.response.MessageResponseDTO;
import br.com.kayropereira.restaurante.api_restaurante.entity.endereco.Cidade;
import br.com.kayropereira.restaurante.api_restaurante.mapper.endereco.CidadeMapper;
import br.com.kayropereira.restaurante.api_restaurante.repository.endereco.CidadeRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class CidadeService {

    private final CidadeMapper cidadeMapper = CidadeMapper.INSTANCE;

    private CidadeRepository cidadeRepository;

    public MessageResponseDTO createCidade(CidadeDTO cidadeDTO){
        Cidade cidade = cidadeMapper.toModel(cidadeDTO);

        Cidade cidadeSalva = cidadeRepository.save(cidade);

        return createMessageResponse(cidadeSalva.getId(), "Cidade criada com ID ");
    }

    private MessageResponseDTO createMessageResponse(Long id, String mensagem) {
        return MessageResponseDTO.builder()
                .message(mensagem + id)
                .build();
    }
}
