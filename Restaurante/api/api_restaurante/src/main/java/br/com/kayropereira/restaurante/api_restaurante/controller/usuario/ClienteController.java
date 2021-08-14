package br.com.kayropereira.restaurante.api_restaurante.controller.usuario;

import br.com.kayropereira.restaurante.api_restaurante.dto.request.usuario.ClienteDTO;
import br.com.kayropereira.restaurante.api_restaurante.dto.response.MessageResponseDTO;
import br.com.kayropereira.restaurante.api_restaurante.service.usuario.ClienteService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1/cliente")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class ClienteController {

    private ClienteService clienteService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MessageResponseDTO createCliente(@RequestBody @Valid ClienteDTO clienteDTO){
        System.out.println(clienteDTO);
        return clienteService.createCliente(clienteDTO);
    }
}
