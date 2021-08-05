package br.com.kayropereira.restaurante.api_restaurante.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

//@Entity
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//@PrimaryKeyJoinColumn(name = "usr_id")
public class Funcionario extends Usuario{

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "fncr_id")
//    private Long id;
//
//    @Column(name = "fncr_data_criacao", nullable = false)
//    private LocalDate dataCriacaoFn;
//
//    @Column(name = "fncr_data_nascimento", nullable = false)
//    private LocalDate dataNascimento;
//
//    @Column(name = "fncr_cpf", nullable = false)
//    private String CPF;
//
//    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//    @JoinTable(name = "funcionario_telefone",
//            joinColumns = @JoinColumn(name = "fncr_id"),
//            inverseJoinColumns = @JoinColumn(name = "tf_id"))
//    @Column(nullable = false)
//    private List<Telefone> telefones;
}