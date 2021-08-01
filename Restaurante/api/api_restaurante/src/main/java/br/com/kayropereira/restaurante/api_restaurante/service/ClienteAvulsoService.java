package br.com.kayropereira.restaurante.api_restaurante.service;

import br.com.kayropereira.restaurante.api_restaurante.dto.request.ClienteAvulsoDTO;
import br.com.kayropereira.restaurante.api_restaurante.dto.request.TelefoneDTO;
import br.com.kayropereira.restaurante.api_restaurante.dto.response.MessageResponseDTO;
import br.com.kayropereira.restaurante.api_restaurante.entity.ClienteAvulso;
import br.com.kayropereira.restaurante.api_restaurante.mapper.ClienteAvulsoMapper;
import br.com.kayropereira.restaurante.api_restaurante.repository.ClienteAvulsoRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class ClienteAvulsoService {

    private ClienteAvulsoRepository clienteAvulsoRepository;

    private final ClienteAvulsoMapper clienteAvulsoMapper = ClienteAvulsoMapper.INSTANCE;

    public MessageResponseDTO createClienteAvulso(ClienteAvulsoDTO clienteAvulsoDTO){
        System.out.println("Service - clienteAvulsoDTO " + clienteAvulsoDTO);

        if(TelefoneDTO.hasElementsEmpy(clienteAvulsoDTO.getTelefones())){
            System.out.println("return");
            return createMessageResponse(404L, "Elementos vazios");
        }

        ClienteAvulso clienteAvulso = clienteAvulsoMapper.toModel(clienteAvulsoDTO);

        System.out.println("Service - clienteAvulso " + clienteAvulso);

        ClienteAvulso clienteAvulsoSalvar = clienteAvulsoRepository.save(clienteAvulso);
        return createMessageResponse(clienteAvulsoSalvar.getId(), "Criado cliente avulso com Id ");
    }

//    public MessageResponseDTO createClienteAvulso(ClienteAvulso clienteAvulsoDTO){
////        ClienteAvulso clienteAvulso = clienteAvulsoMapper.toModel(clienteAvulsoDTO);
//
//        ClienteAvulso clienteAvulsoSalvar = clienteAvulsoRepository.save(clienteAvulsoDTO);
//        return createMessageResponse(clienteAvulsoSalvar.getId(), "Criado cliente avulso com Id ");
//    }

    private MessageResponseDTO createMessageResponse(Long id, String mensagem) {
        return MessageResponseDTO.builder()
                .message(mensagem + id)
                .build();
    }
}
