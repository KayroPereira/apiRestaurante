package br.com.kayropereira.restaurante.api_restaurante.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@PrimaryKeyJoinColumn(name = "usr_id")
public class Cliente extends Usuario{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cl_id")
    private Long id;

    @Column(name = "cl_data_criacao", nullable = false)
    private LocalDate dataCriacaoCl;

    @Column(name = "cl_data_nascimento", nullable = false)
    private LocalDate dataNascimento;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(name = "cliente_telefone",
            joinColumns = @JoinColumn(name = "cl_id"),
            inverseJoinColumns = @JoinColumn(name = "tf_id"))
    @Column(nullable = false)
    private List<Telefone> telefones;
}
