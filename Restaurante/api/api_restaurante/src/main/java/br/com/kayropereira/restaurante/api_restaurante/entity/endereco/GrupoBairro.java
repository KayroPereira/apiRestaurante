package br.com.kayropereira.restaurante.api_restaurante.entity.endereco;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Digits;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GrupoBairro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "grp_brr_id", nullable = false)
    private Long id;

    @Column(name = "grp_brr_descricao", nullable = false)
    private String descricao;

    @Column(name = "grp_brr_fator", nullable = false)
    @Digits(fraction = 2, integer = 6)
    private Float fatorCobranca;
}
