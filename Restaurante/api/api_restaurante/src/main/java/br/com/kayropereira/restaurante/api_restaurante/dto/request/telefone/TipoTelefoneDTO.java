package br.com.kayropereira.restaurante.api_restaurante.dto.request.telefone;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

/*
   -----------------------------------------
   |            JSON Test                  |
   -----------------------------------------
    {
        "descricao" : "Celular"
    }

    select * from tipo_telefone;
*/

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TipoTelefoneDTO {

    private Integer id;

    @NotEmpty
    @Size(max = 50)
    private String descricao;
}