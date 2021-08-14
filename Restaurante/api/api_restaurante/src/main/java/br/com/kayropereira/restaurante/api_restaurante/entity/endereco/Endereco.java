package br.com.kayropereira.restaurante.api_restaurante.entity.endereco;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "end_id")
    private Long id;

    @Column(name = "brr_id", nullable = false)
    private Long idBairro;

    @Column(name = "tp_end_id", nullable = false)
    private Long idTipoEndereco;

    @Column(name = "end_logradouro", nullable = false)
    private String logradouro;

    @Column(name = "end_numero", nullable = false)
    private Integer numero;

    @Column(name = "end_cep", nullable = false)
    private String cep;

    @Column(name = "end_complemento", nullable = false)
    private String complemento;

    @Column(name = "end_data_criacao", nullable = false)
    private LocalDateTime dataCriacao;

    @Column(name = "end_data_atualizacao", nullable = false)
    private LocalDateTime dataAtualizacao;
}
