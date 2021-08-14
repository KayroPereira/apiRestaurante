package br.com.kayropereira.restaurante.api_restaurante.mapper.endereco;

import br.com.kayropereira.restaurante.api_restaurante.dto.request.endereco.GrupoBairroDTO;
import br.com.kayropereira.restaurante.api_restaurante.dto.update.endereco.GrupoBairroUpdateDTO;
import br.com.kayropereira.restaurante.api_restaurante.entity.endereco.GrupoBairro;
import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;

import java.util.List;

@Mapper
public interface GrupoBairroMapper {

    GrupoBairroMapper INSTANCE = Mappers.getMapper(GrupoBairroMapper.class);

    @Mapping(target = "fatorCobranca")
    GrupoBairro toModel(GrupoBairroDTO grupoBairroDTO);

    GrupoBairroDTO toDTO(GrupoBairro grupoBairro);

    @Mapping(target = "fatorCobranca")
    GrupoBairro toModel(GrupoBairroUpdateDTO grupoBairroUpdateDTO);

    @IterableMapping(elementTargetType = GrupoBairroDTO.class)
    List<GrupoBairroDTO> toListDTO(List<GrupoBairro> grupoBairros);

    default Page<GrupoBairroDTO> toPageDTO(Page<GrupoBairro> grupoBairros){
        Page<GrupoBairroDTO> page = new PageImpl<>(toListDTO(grupoBairros.getContent()), grupoBairros.getPageable(), grupoBairros.getTotalElements());
        return page;
    }
}
