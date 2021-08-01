package br.com.kayropereira.restaurante.api_restaurante.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import javax.validation.Valid;
import javax.validation.constraints.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioDTO {

    private Long id;

    @NotEmpty
    @Size(min = 2, max = 200)
    private String nome;

    @NotEmpty
    @Pattern(regexp = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}", message = "Formato de senha inválido")
    private String senha;

    @Valid
    @NotEmpty
    @JsonProperty("data_criacao")
    private String dataCriacao;
}
