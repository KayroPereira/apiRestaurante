package br.com.kayropereira.restaurante.api_restaurante.controller;

import br.com.kayropereira.restaurante.api_restaurante.dto.request.ClienteAvulsoDTO;
import br.com.kayropereira.restaurante.api_restaurante.dto.response.MessageResponseDTO;
import br.com.kayropereira.restaurante.api_restaurante.entity.ClienteAvulso;
import br.com.kayropereira.restaurante.api_restaurante.service.ClienteAvulsoService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1/cliente_avulso")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class ClienteAvulsoController {

    private ClienteAvulsoService clienteAvulsoService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MessageResponseDTO createClienteAvulso(@RequestBody @Valid ClienteAvulsoDTO clienteAvulsoDTO){
        System.out.println(clienteAvulsoDTO);
        return clienteAvulsoService.createClienteAvulso(clienteAvulsoDTO);
    }


//    public MessageResponseDTO createClienteAvulso(@RequestBody @Valid ClienteAvulso clienteAvulsoDTO){
//        System.out.println(clienteAvulsoDTO);
//        return clienteAvulsoService.createClienteAvulso(clienteAvulsoDTO);
//    }
}
