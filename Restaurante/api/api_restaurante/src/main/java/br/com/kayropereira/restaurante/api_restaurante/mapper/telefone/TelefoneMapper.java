package br.com.kayropereira.restaurante.api_restaurante.mapper.telefone;

import br.com.kayropereira.restaurante.api_restaurante.dto.request.telefone.TelefoneDTO;
import br.com.kayropereira.restaurante.api_restaurante.entity.telefone.Telefone;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface TelefoneMapper {

    TelefoneMapper INSTANCE = Mappers.getMapper(TelefoneMapper.class);

    @Mapping(target = "id")
    @Mapping(target = "numero")
    @Mapping(target = "idTipoTelefone")
    Telefone toModel(TelefoneDTO telefoneDTO);

    TelefoneDTO toDTO(Telefone telefone);
}
