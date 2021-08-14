package br.com.kayropereira.restaurante.api_restaurante.service.endereco;

import br.com.kayropereira.restaurante.api_restaurante.dto.request.endereco.GrupoBairroDTO;
import br.com.kayropereira.restaurante.api_restaurante.dto.response.MessageResponseDTO;
import br.com.kayropereira.restaurante.api_restaurante.dto.update.endereco.GrupoBairroUpdateDTO;
import br.com.kayropereira.restaurante.api_restaurante.entity.endereco.GrupoBairro;
import br.com.kayropereira.restaurante.api_restaurante.exception.GrupoBairroNotFoundException;
import br.com.kayropereira.restaurante.api_restaurante.mapper.endereco.GrupoBairroMapper;
import br.com.kayropereira.restaurante.api_restaurante.repository.endereco.GrupoBairroRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class GrupoBairroService {

    private GrupoBairroRepository grupoBairroRepository;

    private final GrupoBairroMapper grupoBairroMapper = GrupoBairroMapper.INSTANCE;

    public MessageResponseDTO createGrupoBairro(GrupoBairroDTO grupoBairroDTO){

        GrupoBairro grupoBairroSave = grupoBairroRepository.save(grupoBairroMapper.toModel(grupoBairroDTO));

        return MessageResponseDTO
                .builder()
                .build()
                .createMessageResponse(grupoBairroSave.getId(), "Grupo bairro criado com ID ");
    }

    public List<GrupoBairroDTO> listAll(){
        List<GrupoBairro> grupoBairro = grupoBairroRepository.findAll();

        return grupoBairro.stream()
                .map(grupoBairroMapper::toDTO)
                .collect(Collectors.toList());
    }

    public GrupoBairroDTO findById(Long id) throws GrupoBairroNotFoundException {

        GrupoBairro grupoBairro = verifyIfExists(id);

        return grupoBairroMapper.toDTO(grupoBairro);
    }

    public Page<GrupoBairroDTO> findAllByPage(Integer line, Integer size){

        PageRequest page = PageRequest.of(line, size);

        return grupoBairroMapper.toPageDTO(grupoBairroRepository.findAll(page));
    }

    public MessageResponseDTO deleteById(Long id) throws GrupoBairroNotFoundException {

        verifyIfExists(id);

        grupoBairroRepository.deleteById(id);

        return MessageResponseDTO.builder()
                .build()
                .createMessageResponse(id, "Grupo Bairro excluída com sucesso. Id ");
    }

    public MessageResponseDTO updateByIdPartial(Long id, GrupoBairroUpdateDTO grupoBairroDTO) throws GrupoBairroNotFoundException {
        GrupoBairro grupoBairro = verifyIfExists(id);

        GrupoBairro grupoBairroUpdate = grupoBairroMapper.toModel(grupoBairroDTO);


        if(grupoBairroDTO.getDescricao() != null) grupoBairro.setDescricao(grupoBairroUpdate.getDescricao());
        if(grupoBairroDTO.getFatorCobranca() != null) grupoBairro.setFatorCobranca(grupoBairroUpdate.getFatorCobranca());

        grupoBairroRepository.save(grupoBairro);

        return MessageResponseDTO.builder()
                .build()
                .createMessageResponse(id, "Grupo Bairro atualizado ");
    }

    public MessageResponseDTO updateById(Long id, GrupoBairroDTO grupoBairroDTO) throws GrupoBairroNotFoundException {

        verifyIfExists(id);

        grupoBairroDTO.setId(id);

        grupoBairroRepository.save(grupoBairroMapper.toModel(grupoBairroDTO));

        return MessageResponseDTO.builder()
                .build()
                .createMessageResponse(id, "Grupo Bairro atualizado ");
    }

    private GrupoBairro verifyIfExists(Long id) throws GrupoBairroNotFoundException {
        return grupoBairroRepository.findById(id)
                .orElseThrow(() -> new GrupoBairroNotFoundException(id));
    }
}