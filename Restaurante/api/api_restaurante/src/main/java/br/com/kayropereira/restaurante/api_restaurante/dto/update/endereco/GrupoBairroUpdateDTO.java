package br.com.kayropereira.restaurante.api_restaurante.dto.update.endereco;

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
public class GrupoBairroUpdateDTO {

    private Long id;

    @Size(max = 50)
    @Pattern(regexp = "\\S+")
    private String descricao;

    @Pattern(regexp = "(^[0-9]+(\\.[0-9]{1,2})?$)|(null)", message = "{parameter.format.invalid}")
    private String fatorCobranca;
}
