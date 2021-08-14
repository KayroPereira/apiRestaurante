package br.com.kayropereira.restaurante.api_restaurante.mapper.usuario;

import br.com.kayropereira.restaurante.api_restaurante.dto.request.usuario.UsuarioDTO;
import br.com.kayropereira.restaurante.api_restaurante.entity.usuario.Usuario;
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
