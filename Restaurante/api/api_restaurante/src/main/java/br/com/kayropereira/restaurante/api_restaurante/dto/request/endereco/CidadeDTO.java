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
        "nome": "{{cidadeNome}}"
    }

    select * from cidade;
*/

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CidadeDTO {

    private Long id;

    @NotEmpty
    @NotNull
    @Size(max = 150)
    private String nome;
}
