package br.com.kayropereira.restaurante.api_restaurante.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

/*
   -----------------------------------------
   |            JSON Test                  |
   -----------------------------------------
    {
        "telefones" : [
            {
                "numero" : "81998877633",
                "tipoTelefone" : 1
            },

            {
                "numero" : "81982771743",
                "tipoTelefone" : 2
            },

            {
                "numero" : "81123456789",
                "tipoTelefone" : 3
            }
        ]
    }

    select cla.clt_av_id, cla.clt_av_data_criacao, tf.tf_id, tf.tf_numero, ttf.tp_tf_descricao
    from cliente_avulso cla
        inner join cliente_avulso_telefone clat
        on clat.clt_av_id = cla.clt_av_id
        inner join telefone tf
        on clat.tf_id = tf.tf_id
        inner join tipo_telefone ttf
        on ttf.tp_tf_id = tf.tp_tf_id;
 */

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ClienteAvulsoDTO {

    private Long id;

    @Valid
    @Temporal(TemporalType.DATE)
    @NotEmpty
    @NotNull
    private String dataCriacao = DateTimeFormatter.ofPattern("dd-MM-YYYY").format(LocalDateTime.now());

    @NotEmpty
    @NotNull
    private List<TelefoneDTO> telefones;
}