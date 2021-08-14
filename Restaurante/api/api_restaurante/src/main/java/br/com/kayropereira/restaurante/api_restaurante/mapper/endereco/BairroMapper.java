package br.com.kayropereira.restaurante.api_restaurante.mapper.endereco;

import br.com.kayropereira.restaurante.api_restaurante.dto.request.endereco.BairroDTO;
import br.com.kayropereira.restaurante.api_restaurante.entity.endereco.Bairro;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BairroMapper {

    BairroMapper INSTANCE = Mappers.getMapper(BairroMapper.class);

    @Mapping(target = "idCidade")
    @Mapping(target = "idGrupo")
    Bairro toModel(BairroDTO bairroDTO);

    BairroDTO toDTO(Bairro bairro);
}