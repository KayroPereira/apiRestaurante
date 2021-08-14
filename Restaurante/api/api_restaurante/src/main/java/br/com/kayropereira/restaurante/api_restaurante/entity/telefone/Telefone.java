package br.com.kayropereira.restaurante.api_restaurante.entity.telefone;

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
@Table(name = "telefone")
public class Telefone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tf_id")
    private Integer id;

    @Column(nullable = false, name = "tf_numero")
    private String numero;

    @Column(name = "tp_tf_id", nullable = false)
    private Long idTipoTelefone;

//    @ManyToMany(mappedBy = "telefones", fetch = FetchType.LAZY)
//    @JsonIgnoreProperties("telefones")
//    private List<ClienteAvulso> clientesAvulsos;
}
