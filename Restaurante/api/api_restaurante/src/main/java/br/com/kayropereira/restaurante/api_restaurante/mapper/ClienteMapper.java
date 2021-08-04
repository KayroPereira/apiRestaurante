package br.com.kayropereira.restaurante.api_restaurante.mapper;


import br.com.kayropereira.restaurante.api_restaurante.dto.request.ClienteDTO;
import br.com.kayropereira.restaurante.api_restaurante.entity.Cliente;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ClienteMapper {

    ClienteMapper INSTANCE = Mappers.getMapper(ClienteMapper.class);

    @Mapping(target = "dataCriacao", dateFormat = "dd-MM-yyyy")
    @Mapping(target = "dataCriacaoCl", dateFormat = "dd-MM-yyyy")
    @Mapping(target = "dataNascimento", dateFormat = "dd-MM-yyyy")
    Cliente toModel(ClienteDTO clienteDTO);

    ClienteDTO toDTO(Cliente cliente);
}