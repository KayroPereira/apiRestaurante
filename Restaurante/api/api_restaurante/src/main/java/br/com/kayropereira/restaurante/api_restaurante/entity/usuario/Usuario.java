package br.com.kayropereira.restaurante.api_restaurante.entity.usuario;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "usr_id")
    private Long id;

    @Column(nullable = false, name = "usr_nome")
    private String nome;

    @Column(nullable = false, name = "usr_senha")
    private String senha;

    @Column(name = "usr_data_criacao", nullable = false)
    private LocalDate dataCriacao;
}