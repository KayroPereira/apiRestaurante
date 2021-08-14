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
public class TipoEndereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tp_end_id", nullable = false)
    private Long id;

    @Column(name = "tp_end_descricao", nullable = false)
    private String descricao;
}
