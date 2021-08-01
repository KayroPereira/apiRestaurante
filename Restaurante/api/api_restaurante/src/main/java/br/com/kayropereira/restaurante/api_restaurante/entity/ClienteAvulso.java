package br.com.kayropereira.restaurante.api_restaurante.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "cliente_avulso")
//@PrimaryKeyJoinColumn(name = "id")
//@JsonIdentityInfo(
//        generator = ObjectIdGenerators.PropertyGenerator.class,
//        property = "id")
public class ClienteAvulso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private LocalDate dataCriacao;

//    @ManyToMany(targetEntity = Telefone.class, cascade = CascadeType.ALL)


//    @ManyToMany(targetEntity = Telefone.class, cascade = CascadeType.ALL)
//    @JoinTable(name = "cliente_avulso_telefone",
////    joinColumns = {@JoinColumn(name = "fk_cliente_avulso_id", nullable = false, updatable = false)},
////    inverseJoinColumns = {@JoinColumn(name = "fk_telefone_id", nullable = false, updatable = false)})
//    joinColumns = @JoinColumn(name = "fk_cliente_avulso_id"),
//    inverseJoinColumns = @JoinColumn(name = "fk_telefone_id"))

//    @ManyToMany(targetEntity = Telefone.class, cascade = CascadeType.ALL)
//    @JoinTable(name = "cliente_avulso_telefone",
//    joinColumns = @JoinColumn(name = "fk_cliente_avulso_id"),
//    inverseJoinColumns = @JoinColumn(name = "fk_telefone_id"))
//    @Column(nullable = false)


    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(name = "cliente_avulso_telefone",
    joinColumns = @JoinColumn(name = "fk_cliente_avulso_id"),
    inverseJoinColumns = @JoinColumn(name = "fk_telefone_id"))
    @Column(nullable = false)
    private List<Telefone> telefones;
}
