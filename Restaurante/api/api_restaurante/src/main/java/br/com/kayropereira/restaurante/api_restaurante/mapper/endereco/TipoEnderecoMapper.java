package br.com.kayropereira.restaurante.api_restaurante.mapper.endereco;

import br.com.kayropereira.restaurante.api_restaurante.dto.request.endereco.TipoEnderecoDTO;
import br.com.kayropereira.restaurante.api_restaurante.entity.endereco.TipoEndereco;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface TipoEnderecoMapper {

    TipoEnderecoMapper INSTANCE = Mappers.getMapper(TipoEnderecoMapper.class);

    TipoEndereco toModel(TipoEnderecoDTO tipoEnderecoDTO);

    TipoEnderecoDTO toDTO(TipoEndereco tipoEndereco);
}