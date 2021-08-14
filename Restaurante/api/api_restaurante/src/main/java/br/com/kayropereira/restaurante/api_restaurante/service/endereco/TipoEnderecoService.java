package br.com.kayropereira.restaurante.api_restaurante.service.endereco;

import br.com.kayropereira.restaurante.api_restaurante.dto.request.endereco.TipoEnderecoDTO;
import br.com.kayropereira.restaurante.api_restaurante.dto.response.MessageResponseDTO;
import br.com.kayropereira.restaurante.api_restaurante.entity.endereco.TipoEndereco;
import br.com.kayropereira.restaurante.api_restaurante.mapper.endereco.TipoEnderecoMapper;
import br.com.kayropereira.restaurante.api_restaurante.repository.endereco.TipoEnderecoRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class TipoEnderecoService {

    private TipoEnderecoRepository tipoEnderecoRepository;

    private final TipoEnderecoMapper tipoEnderecoMapper = TipoEnderecoMapper.INSTANCE;

    public MessageResponseDTO createTipoEndereco(TipoEnderecoDTO tipoEnderecoDTO){
        TipoEndereco tipoEnderecoSave = tipoEnderecoRepository.save(tipoEnderecoMapper.toModel(tipoEnderecoDTO));

        return MessageResponseDTO.builder()
                .build()
                .createMessageResponse(tipoEnderecoSave.getId(), "Tipo Endereco criado com ID ");
    }

    public List<TipoEnderecoDTO> listAll(){
        List<TipoEndereco> tipoEnderecos = tipoEnderecoRepository.findAll();

        return tipoEnderecos.stream()
                .map(tipoEnderecoMapper::toDTO)
                .collect(Collectors.toList());
    }
}
