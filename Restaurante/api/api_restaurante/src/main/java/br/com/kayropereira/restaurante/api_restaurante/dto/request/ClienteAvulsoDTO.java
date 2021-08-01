package br.com.kayropereira.restaurante.api_restaurante.dto.request;

import br.com.kayropereira.restaurante.api_restaurante.entity.Telefone;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ClienteAvulsoDTO {

    private Long id;

    @Valid
    @NotEmpty
    @NotNull
    @JsonProperty("data_criacao")
    private String dataCriacao;

    @NotEmpty
    @NotNull
    private List<TelefoneDTO> telefones;
}
