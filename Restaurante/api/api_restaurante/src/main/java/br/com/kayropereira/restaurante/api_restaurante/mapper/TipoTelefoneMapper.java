package br.com.kayropereira.restaurante.api_restaurante.mapper;

import br.com.kayropereira.restaurante.api_restaurante.dto.request.TipoTelefoneDTO;
import br.com.kayropereira.restaurante.api_restaurante.entity.TipoTelefone;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface TipoTelefoneMapper {

    TipoTelefoneMapper INSTANCE = Mappers.getMapper(TipoTelefoneMapper.class);

    @Mapping(target = "id")
    @Mapping(target = "descricao")
    TipoTelefone toModel(TipoTelefoneDTO tipoTelefoneDTO);

    TipoTelefoneDTO toDTO(TipoTelefone tipoTelefone);
}
