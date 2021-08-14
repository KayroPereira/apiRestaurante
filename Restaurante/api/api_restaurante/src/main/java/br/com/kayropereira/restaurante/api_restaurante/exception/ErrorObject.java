package br.com.kayropereira.restaurante.api_restaurante.exception;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class ErrorObject {

    private String message;
    private String field;
    private String parameter;
}
