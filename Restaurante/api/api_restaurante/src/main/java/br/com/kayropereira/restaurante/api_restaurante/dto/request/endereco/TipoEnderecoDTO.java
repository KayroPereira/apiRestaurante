package br.com.kayropereira.restaurante.api_restaurante.dto.request.endereco;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/*
   -----------------------------------------
   |            JSON Test                  |
   -----------------------------------------
    {
        "descricao": "Residencial"
    }

    select * from tipo_endereco;
*/

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TipoEnderecoDTO {

    private Long id;

    @NotEmpty
    @NotNull
    @Size(max = 80)
    private String descricao;
}
