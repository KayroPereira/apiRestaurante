package br.com.kayropereira.restaurante.api_restaurante.mapper;

import br.com.kayropereira.restaurante.api_restaurante.dto.request.TelefoneDTO;
import br.com.kayropereira.restaurante.api_restaurante.entity.Telefone;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Service;

@Mapper
public interface TelefoneMapper {

    TelefoneMapper INSTANCE = Mappers.getMapper(TelefoneMapper.class);

    @Mapping(target = "id")
    @Mapping(target = "numero")
    @Mapping(target = "idTipoTelefone")
    Telefone toModel(TelefoneDTO telefoneDTO);

    TelefoneDTO toDTO(Telefone telefone);
}
