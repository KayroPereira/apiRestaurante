package br.com.kayropereira.restaurante.api_restaurante.dto.request.usuario;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioDTO {

    private Long id;

    @NotEmpty
    @NotNull
    @Size(min = 2, max = 200)
    private String nome;

    @NotEmpty
    @NotNull
    @Pattern(regexp = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}", message = "Formato de senha inválido")
    private String senha;

    @Valid
    @NotEmpty
    @NotNull
    private String dataCriacao = DateTimeFormatter.ofPattern("dd-MM-yyyy").format(LocalDateTime.now());
}