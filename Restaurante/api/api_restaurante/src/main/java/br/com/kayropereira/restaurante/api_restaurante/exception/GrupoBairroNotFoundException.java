package br.com.kayropereira.restaurante.api_restaurante.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class GrupoBairroNotFoundException extends Exception {

    public GrupoBairroNotFoundException(Long id){
        super("Grupo Bairro não encontrado ID " + id);
    }
}