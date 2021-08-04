package br.com.kayropereira.restaurante.api_restaurante.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "cliente_avulso")
public class ClienteAvulso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "clt_av_id")
    private Long id;

    @Column(nullable = false, name = "clt_av_data_criacao")
    private LocalDate dataCriacao;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(name = "cliente_avulso_telefone",
        joinColumns = @JoinColumn(name = "clt_av_id"),
        inverseJoinColumns = @JoinColumn(name = "tf_id"))
    @Column(nullable = false)
    private List<Telefone> telefones;
}