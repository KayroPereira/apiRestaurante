package br.com.kayropereira.restaurante.api_restaurante.mapper.endereco;

import br.com.kayropereira.restaurante.api_restaurante.dto.request.endereco.CidadeDTO;
import br.com.kayropereira.restaurante.api_restaurante.entity.endereco.Cidade;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CidadeMapper {

    CidadeMapper INSTANCE = Mappers.getMapper(CidadeMapper.class);

    Cidade toModel(CidadeDTO cidadeDTO);

    CidadeDTO toDTO(Cidade cidade);

}
