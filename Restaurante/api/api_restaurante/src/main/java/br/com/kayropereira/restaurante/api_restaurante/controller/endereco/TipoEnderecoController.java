package br.com.kayropereira.restaurante.api_restaurante.controller.endereco;

import br.com.kayropereira.restaurante.api_restaurante.dto.request.endereco.TipoEnderecoDTO;
import br.com.kayropereira.restaurante.api_restaurante.dto.response.MessageResponseDTO;
import br.com.kayropereira.restaurante.api_restaurante.entity.endereco.TipoEndereco;
import br.com.kayropereira.restaurante.api_restaurante.service.endereco.TipoEnderecoService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1/tipoendereco")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class TipoEnderecoController {

    private TipoEnderecoService tipoEnderecoService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MessageResponseDTO createTipoEndereco(@RequestBody @Valid TipoEnderecoDTO tipoEnderecoDTO){
        return tipoEnderecoService.createTipoEndereco(tipoEnderecoDTO);
    }

    @GetMapping
    public List<TipoEnderecoDTO> listAll(){
        return tipoEnderecoService.listAll();
    }
}
