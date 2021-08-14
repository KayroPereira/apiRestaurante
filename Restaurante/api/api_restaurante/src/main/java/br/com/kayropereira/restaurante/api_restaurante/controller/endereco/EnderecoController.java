package br.com.kayropereira.restaurante.api_restaurante.controller.endereco;

import br.com.kayropereira.restaurante.api_restaurante.dto.request.endereco.EnderecoDTO;
import br.com.kayropereira.restaurante.api_restaurante.dto.response.MessageResponseDTO;
import br.com.kayropereira.restaurante.api_restaurante.service.endereco.EnderecoService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1/endereco")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class EnderecoController {

    private EnderecoService enderecoService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MessageResponseDTO createEndereco(@RequestBody @Valid EnderecoDTO enderecoDTO){
        return enderecoService.createEndereco(enderecoDTO);
    }
}
