package br.com.kayropereira.restaurante.api_restaurante.mapper.usuario;

import br.com.kayropereira.restaurante.api_restaurante.dto.request.usuario.ClienteAvulsoDTO;
import br.com.kayropereira.restaurante.api_restaurante.dto.request.telefone.TelefoneDTO;
import br.com.kayropereira.restaurante.api_restaurante.entity.usuario.ClienteAvulso;
import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ClienteAvulsoMapper {

    ClienteAvulsoMapper INSTANCE = Mappers.getMapper(ClienteAvulsoMapper.class);

    @Mapping(target = "dataCriacao", dateFormat = "dd-MM-yyyy")
    @IterableMapping(elementTargetType = TelefoneDTO.class)
    ClienteAvulso toModel(ClienteAvulsoDTO clienteAvulsoDTO);

    ClienteAvulsoDTO toDTO(ClienteAvulso clienteAvulso);
}
