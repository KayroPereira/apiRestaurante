package br.com.kayropereira.restaurante.api_restaurante.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "telefone")
//@JsonIdentityInfo(
//        generator = ObjectIdGenerators.PropertyGenerator.class,
//        property = "id")
public class Telefone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String numero;

    @Column(name = "fk_tipo_telefone_id", nullable = false)
    private Long idTipoTelefone;

//    @ManyToMany(targetEntity = ClienteAvulso.class, cascade = CascadeType.ALL)
////    @ManyToMany(targetEntity = ClienteAvulso.class, mappedBy = "telefones", cascade = CascadeType.ALL)
////    @ManyToMany(fetch = FetchType.LAZY, cascade = {CascadeType.REMOVE, CascadeType.MERGE, CascadeType.PERSIST})
////    @OneToMany(fetch = FetchType.LAZY)
//    @JoinTable(name = "cliente_avulso_telefone",
//    joinColumns = @JoinColumn(name = "fk_telefone_id"),
//    inverseJoinColumns = @JoinColumn(name = "fk_cliente_avulso_id"))
//    private List<ClienteAvulso> clientesAvulsos = new ArrayList<>();

    @ManyToMany(mappedBy = "telefones", fetch = FetchType.LAZY)
    @JsonIgnoreProperties("telefones")
    private List<ClienteAvulso> clientesAvulsos;
}
