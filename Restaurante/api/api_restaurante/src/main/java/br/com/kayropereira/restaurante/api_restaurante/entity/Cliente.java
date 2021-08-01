package br.com.kayropereira.restaurante.api_restaurante.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty
    @NotNull
    @Column(name = "data_criacao")
    private LocalDate dataCriacao;

    @NotEmpty
    @NotNull
    @Column(name = "data_nascimento")
    private LocalDate dataNascimento;

    @NotEmpty
    @NotNull
    @Column(name = "fk_usuario_id")
    private Long fkIdUsuario;
}
