package br.com.kayropereira.restaurante.api_restaurante.dto.request.endereco;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/*
   -----------------------------------------
   |            JSON Test                  |
   -----------------------------------------
    {
        "idCidade": "1",
        "idGrupo": "1",
        "nome": "Centro"
    }

    select brr.brr_id, brr.brr_nome, cid.cid_nome, grp_brr.grp_brr_descricao
    from bairro brr
        inner join grupo_bairro grp_brr on grp_brr.grp_brr_id = brr.grp_brr_id
        inner join cidade cid on cid.cid_id = brr.cid_id;
*/

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BairroDTO {

    private Long id;

    @NotEmpty
    @NotNull
    @Pattern(regexp = "^[0-9]+$")
    private String idCidade;

    @NotEmpty
    @NotNull
    @Pattern(regexp = "^[0-9]+$")
    private String idGrupo;

    @NotEmpty
    @NotNull
    @Size(max = 100)
    private String nome;
}