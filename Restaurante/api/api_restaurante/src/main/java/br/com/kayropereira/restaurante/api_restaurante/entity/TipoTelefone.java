package br.com.kayropereira.restaurante.api_restaurante.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "tipo_telefone")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TipoTelefone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tp_tf_id")
    private Integer id;

    @Column(nullable = false, length = 50, name = "tp_tf_descricao")
    private String descricao;
}
