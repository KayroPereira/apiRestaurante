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

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FuncionarioDTO extends UsuarioDTO{

    private Long id;

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
    @NotEmpty
    @NotNull
    private String CPF;

    @NotEmpty
    @NotNull
    private List<TelefoneDTO> telefones;
}
