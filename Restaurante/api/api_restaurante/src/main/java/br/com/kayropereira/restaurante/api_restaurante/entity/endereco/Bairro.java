package br.com.kayropereira.restaurante.api_restaurante.entity.endereco;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Bairro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "brr_id")
    private Long id;

    @Column(name = "cid_id", nullable = false)
    private Long idCidade;

    @Column(name = "grp_brr_id", nullable = false)
    private Long idGrupo;

    @Column(name = "brr_nome", nullable = false)
    private String nome;
}
