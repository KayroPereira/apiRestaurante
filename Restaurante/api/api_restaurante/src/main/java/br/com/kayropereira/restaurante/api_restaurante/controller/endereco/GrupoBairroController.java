package br.com.kayropereira.restaurante.api_restaurante.controller.endereco;

import br.com.kayropereira.restaurante.api_restaurante.dto.request.endereco.GrupoBairroDTO;
import br.com.kayropereira.restaurante.api_restaurante.dto.response.MessageResponseDTO;
import br.com.kayropereira.restaurante.api_restaurante.dto.update.endereco.GrupoBairroUpdateDTO;
import br.com.kayropereira.restaurante.api_restaurante.exception.GrupoBairroNotFoundException;
import br.com.kayropereira.restaurante.api_restaurante.service.endereco.GrupoBairroService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1/grupobairro")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class GrupoBairroController {

    private GrupoBairroService grupoBairroService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MessageResponseDTO createGrupoBairro(@RequestBody @Valid GrupoBairroDTO grupoBairroDTO){
        return grupoBairroService.createGrupoBairro(grupoBairroDTO);
    }

    @GetMapping
    public List<GrupoBairroDTO> listAll(){
        return grupoBairroService.listAll();
    }

    @GetMapping("/{id}")
    public GrupoBairroDTO findById(@PathVariable @Valid Long id) throws GrupoBairroNotFoundException {
        return grupoBairroService.findById(id);
    }

    @GetMapping("/page/{line}/{size}")
    public Page<GrupoBairroDTO> findAllByPage(@PathVariable @Valid  Integer line, @PathVariable @Valid Integer size) {
        return grupoBairroService.findAllByPage(line, size);
    }

    @DeleteMapping("/{id}")
    public MessageResponseDTO deleteById(@PathVariable @Valid Long id) throws GrupoBairroNotFoundException {
        return grupoBairroService.deleteById(id);
    }

    @PatchMapping("/{id}")
    public MessageResponseDTO updateByIdPartial(@PathVariable @Valid Long id, @RequestBody @Valid GrupoBairroUpdateDTO grupoBairroUpdateDTO) throws GrupoBairroNotFoundException {
        return grupoBairroService.updateByIdPartial(id, grupoBairroUpdateDTO);
    }

    @PutMapping("/{id}")
    public MessageResponseDTO updateById(@PathVariable @Valid  Long id, @RequestBody @Valid GrupoBairroDTO grupoBairroDTO) throws GrupoBairroNotFoundException {
        return grupoBairroService.updateById(id, grupoBairroDTO);
    }
}
