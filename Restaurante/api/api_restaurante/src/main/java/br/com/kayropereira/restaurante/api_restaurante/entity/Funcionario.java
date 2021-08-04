package br.com.kayropereira.restaurante.api_restaurante.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Funcionario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "fncr_id")
    private Long id;

    @Column(name = "fncr_data_criacao", nullable = false)
    private LocalDate dataCriacao;

    @Column(name = "fncr_data_nascimento", nullable = false)
    private LocalDate dataNascimento;

    @Column(name = "fncr_cpf")
    private String CPF;
}
