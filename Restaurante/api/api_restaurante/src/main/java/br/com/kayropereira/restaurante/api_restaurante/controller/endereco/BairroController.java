package br.com.kayropereira.restaurante.api_restaurante.controller.endereco;

import br.com.kayropereira.restaurante.api_restaurante.dto.request.endereco.BairroDTO;
import br.com.kayropereira.restaurante.api_restaurante.dto.response.MessageResponseDTO;
import br.com.kayropereira.restaurante.api_restaurante.service.endereco.BairroService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/bairro")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class BairroController {

    private BairroService bairroService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
//    public MessageResponseDTO createBairro(@RequestBody @Valid BairroDTO bairroDTO){
    public MessageResponseDTO createBairro(@RequestBody BairroDTO bairroDTO){
        System.out.println(bairroDTO);
        return bairroService.createBairro(bairroDTO);
    }
}
