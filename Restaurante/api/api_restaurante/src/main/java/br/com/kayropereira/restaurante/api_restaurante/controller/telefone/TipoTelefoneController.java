package br.com.kayropereira.restaurante.api_restaurante.controller.telefone;

import br.com.kayropereira.restaurante.api_restaurante.dto.request.telefone.TipoTelefoneDTO;
import br.com.kayropereira.restaurante.api_restaurante.dto.response.MessageResponseDTO;
import br.com.kayropereira.restaurante.api_restaurante.service.telefone.TipoTelefoneService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1/tipo_telefone")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class TipoTelefoneController {

    private TipoTelefoneService tipoTelefoneService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MessageResponseDTO createTipoTelefone(@RequestBody @Valid TipoTelefoneDTO tipoTelefoneDTO){
        return tipoTelefoneService.createTipoTelefone(tipoTelefoneDTO);
    }
}
