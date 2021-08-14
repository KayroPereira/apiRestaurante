package br.com.kayropereira.restaurante.api_restaurante.controller.usuario;

import br.com.kayropereira.restaurante.api_restaurante.dto.request.usuario.UsuarioDTO;
import br.com.kayropereira.restaurante.api_restaurante.dto.response.MessageResponseDTO;
import br.com.kayropereira.restaurante.api_restaurante.service.usuario.UsuarioService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1/usuario")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class UsuarioController {

    private UsuarioService usuarioService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MessageResponseDTO createUsuario(@RequestBody @Valid UsuarioDTO usuarioDTO){
        return usuarioService.createtUsuario(usuarioDTO);
    }
}
