package br.com.kayropereira.restaurante.api_restaurante.mapper.endereco;

import br.com.kayropereira.restaurante.api_restaurante.dto.request.endereco.EnderecoDTO;
import br.com.kayropereira.restaurante.api_restaurante.entity.endereco.Endereco;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface EnderecoMapper {

    EnderecoMapper INSTANCE = Mappers.getMapper(EnderecoMapper.class);

    @Mapping(target = "idBairro")
    @Mapping(target = "idTipoEndereco")
    @Mapping(target = "numero")
    @Mapping(target = "dataCriacao")
    @Mapping(target = "dataAtualizacao")
    Endereco toModel(EnderecoDTO enderecoDTO);

    EnderecoDTO toDTO(Endereco endereco);
}
