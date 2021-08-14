package br.com.kayropereira.restaurante.api_restaurante.controller.usuario;

import br.com.kayropereira.restaurante.api_restaurante.dto.request.usuario.FuncionarioDTO;
import br.com.kayropereira.restaurante.api_restaurante.dto.response.MessageResponseDTO;
import br.com.kayropereira.restaurante.api_restaurante.service.usuario.FuncionarioService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1/funcionario")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class FuncionarioController {

    private FuncionarioService funcionarioService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MessageResponseDTO createFuncionario(@RequestBody @Valid FuncionarioDTO funcionarioDTO){
        return funcionarioService.createFuncionario(funcionarioDTO);
    }
}
