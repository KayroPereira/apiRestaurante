package br.com.kayropereira.restaurante.api_restaurante.dto.request.telefone;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.function.Predicate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TelefoneDTO {

    private Integer id;

    @NotNull
    @NotEmpty
    private String numero;

    @NotNull
    @NotEmpty
    @JsonProperty("tipoTelefone")
    private Long idTipoTelefone;

    static Predicate<TelefoneDTO> elementEmpty = e -> {
        if(e.getIdTipoTelefone() == null || e.getNumero() == null){
            return true;
        }
        return false;
    };

    public static boolean hasElementsEmpy(List<TelefoneDTO> telefonesDTO){

        for(TelefoneDTO elementDTO: telefonesDTO){
            if(elementEmpty.test(elementDTO))
                return true;
        }
        return false;
    }
}