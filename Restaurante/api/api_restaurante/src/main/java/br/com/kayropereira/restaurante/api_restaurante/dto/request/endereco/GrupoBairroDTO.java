package br.com.kayropereira.restaurante.api_restaurante.dto.request.endereco;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;

/*
   -----------------------------------------
   |            JSON Test                  |
   -----------------------------------------
    {
        "descricao" : "Grupo_13",
        "fatorCobranca" : 9.24
    }

    select * from grupo_bairro;
*/

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GrupoBairroDTO {

    private Long id;

    @NotNull(message = "{name.not.null}")
    @NotEmpty(message = "{parameter.missing}")
    @Size(max = 50)
    private String descricao;

    @NotNull(message = "{name.not.null}")
    @NotEmpty(message = "{parameter.missing}")
    @Pattern(regexp = "^[0-9]+(\\.[0-9]{1,2})?$", message = "{parameter.format.invalid}")
    private String fatorCobranca;
}
