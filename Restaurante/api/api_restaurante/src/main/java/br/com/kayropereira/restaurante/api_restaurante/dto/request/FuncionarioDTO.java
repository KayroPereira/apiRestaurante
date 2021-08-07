package br.com.kayropereira.restaurante.api_restaurante.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.Column;
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
        "cpf" : "00999618490",
        "telefones" : [
            {
                "numero" : "81998877633",
                "tipoTelefone" : 2
            },
            {
                "numero" : "81911223344",
                "tipoTelefone" : 3
            }
        ]
    }

    select usr.usr_id, usr.usr_nome, usr.usr_senha, usr.usr_data_criacao,
    fncr.usu_usr_id, fncr.fncr_data_criacao, fncr.fncr_data_nascimento, fncr.fncr_cpf,
    tf.tf_id, tf.tf_numero, ttf.tp_tf_descricao
        from usuario usr
            inner join funcionario fncr
            on usr.usr_id = fncr.usu_usr_id
            inner join funcionario fncrt
            on fncrt.usu_usr_id = fncr.usu_usr_id
            inner join telefone tf
            on fncrt.usu_usr_id = tf.tf_id
            inner join tipo_telefone ttf
            on ttf.tp_tf_id = tf.tp_tf_id;
*/

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FuncionarioDTO extends UsuarioDTO{

//    private Long id;

    @Valid
    @Temporal(TemporalType.DATE)
    @NotEmpty
    @NotNull
    private String dataCriacaoFn = DateTimeFormatter.ofPattern("dd-MM-yyyy").format(LocalDateTime.now());

//    @Temporal(TemporalType.DATE)
    @NotEmpty
    @NotNull
    private String dataNascimento;

    @Valid
    @CPF
    @NotEmpty
    @NotNull
    private String CPF;

    @NotEmpty
    @NotNull
    private List<TelefoneDTO> telefones;
}
