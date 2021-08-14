package br.com.kayropereira.restaurante.api_restaurante.entity.usuario;

import br.com.kayropereira.restaurante.api_restaurante.entity.telefone.Telefone;
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
@PrimaryKeyJoinColumn(name = "usu_usr_id")
public class Cliente extends Usuario{

    @Column(name = "cl_data_criacao", nullable = false)
    private LocalDate dataCriacaoCl;

    @Column(name = "cl_data_nascimento", nullable = false)
    private LocalDate dataNascimento;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(name = "cliente_telefone",
            joinColumns = @JoinColumn(name = "usu_usr_id", referencedColumnName = "usu_usr_id"),
            inverseJoinColumns = @JoinColumn(name = "tf_id", referencedColumnName = "tf_id"))
    @Column(nullable = false)
    private List<Telefone> telefones;
}