package br.com.kayropereira.restaurante.api_restaurante.dto.request.endereco;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

/*
   -----------------------------------------
   |            JSON Test                  |
   -----------------------------------------
    {
        "idBairro": "2",
        "idTipoEndereco": "2",
        "logradouro": "Rua teste 2",
        "numero": "22",
        "cep": "11442355",
        "complemento": "Teste 2"
    }

    select endr.end_id, endr.end_logradouro, endr.end_numero, endr.end_cep, endr.end_complemento, endr.end_data_criacao, endr.end_data_atualizacao,
    brr.brr_nome, cid.cid_nome, tp_end.tp_end_descricao
    from endereco endr
        inner join bairro brr on endr.brr_id = brr.brr_id
        inner join tipo_endereco tp_end on tp_end.tp_end_id = endr.tp_end_id
        inner join cidade cid on brr.cid_id = cid.cid_id;
*/

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EnderecoDTO {

    private Long id;

    @NotEmpty
    @NotNull
    @Pattern(regexp = "^[0-9]+$")
    private String idBairro;

    @NotEmpty
    @NotNull
    @Pattern(regexp = "^[0-9]+$")
    private String idTipoEndereco;

    @NotEmpty
    @NotNull
    @Size(max = 150)
    private String logradouro;

    @NotEmpty
    @NotNull
    @Pattern(regexp = "^[0-9]+$")
    private String numero;

    @Size(max = 150)
    private String cep;

    @Size(max = 150)
    private String complemento;

    @NotEmpty
    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    private String dataCriacao = LocalDateTime.now().toString();
//    private String dataCriacao = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss").format(LocalDateTime.now());

    @NotEmpty
    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    private String dataAtualizacao = LocalDateTime.now().toString();
//    private String dataAtualizacao = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss").format(LocalDateTime.now());
}
