package br.com.kayropereira.restaurante.api_restaurante.mapper;

import br.com.kayropereira.restaurante.api_restaurante.dto.request.FuncionarioDTO;
import br.com.kayropereira.restaurante.api_restaurante.entity.Funcionario;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface FuncionarioMapper {

    FuncionarioMapper INSTANCE = Mappers.getMapper(FuncionarioMapper.class);

    @Mapping(target = "dataCriacao", dateFormat = "dd-MM-yyyy")
    @Mapping(target = "dataCriacaoFn", dateFormat = "dd-MM-yyyy")
    @Mapping(target = "dataNascimento", dateFormat = "dd-MM-yyyy")
    Funcionario toModel(FuncionarioDTO funcionarioDTO);

    FuncionarioDTO toDTO(Funcionario funcionario);
}
