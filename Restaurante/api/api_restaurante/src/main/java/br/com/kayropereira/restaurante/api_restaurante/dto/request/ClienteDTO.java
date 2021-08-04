package br.com.kayropereira.restaurante.api_restaurante.dto.request;

import lombok.AllArgsConstructor;
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
        "nome" : "teste",
        "senha" : "Pedepano21@@",
        "dataNascimento" : "11-11-1211",
        "telefones" : [
            {
                "numero" : "81998877633",
                "tipoTelefone" : 3
            }
        ]
    }

    select usr.usr_id, usr.usr_nome, usr.usr_senha, usr.usr_data_criacao, cl.cl_id, cl.cl_data_criacao, cl.cl_data_nascimento, tf.tf_id, tf.tf_numero, ttf.tp_tf_descricao
    from usuario usr
        inner join cliente cl
        on usr.usr_id = cl.usr_id
        inner join cliente_telefone clt
        on clt.cl_id = cl.cl_id
        inner join telefone tf
        on clt.tf_id = tf.tf_id
        inner join tipo_telefone ttf
        on ttf.tp_tf_id = tf.tp_tf_id;
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClienteDTO extends UsuarioDTO{

    private Long id;

    @Valid
    @Temporal(TemporalType.DATE)
    @NotEmpty
    @NotNull
    private String dataCriacaoCl = DateTimeFormatter.ofPattern("dd-MM-YYYY").format(LocalDateTime.now());

    @NotEmpty
    @NotNull
    private String dataNascimento;

    @NotEmpty
    @NotNull
    private List<TelefoneDTO> telefones;
}