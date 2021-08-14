package br.com.kayropereira.restaurante.api_restaurante.controller.endereco;

import br.com.kayropereira.restaurante.api_restaurante.dto.request.endereco.CidadeDTO;
import br.com.kayropereira.restaurante.api_restaurante.dto.response.MessageResponseDTO;
import br.com.kayropereira.restaurante.api_restaurante.service.endereco.CidadeService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1/cidade")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class CidadeController {

    private CidadeService cidadeService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MessageResponseDTO createCidade(@RequestBody @Valid CidadeDTO cidadeDTO){
        return cidadeService.createCidade(cidadeDTO);
    }
}
