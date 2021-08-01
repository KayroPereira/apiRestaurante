package br.com.kayropereira.restaurante.api_restaurante.mapper;

import br.com.kayropereira.restaurante.api_restaurante.dto.request.UsuarioDTO;
import br.com.kayropereira.restaurante.api_restaurante.entity.Usuario;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UsuarioMapper {

    UsuarioMapper INSTANCE = Mappers.getMapper(UsuarioMapper.class);

    @Mapping(target = "dataCriacao", dateFormat = "dd-MM-yyyy")
    Usuario toModel(UsuarioDTO usuarioDTO);

    UsuarioDTO toDTO(Usuario usuario);
}
