package br.com.kayropereira.restaurante.api_restaurante.service.usuario;

import br.com.kayropereira.restaurante.api_restaurante.dto.request.usuario.ClienteDTO;
import br.com.kayropereira.restaurante.api_restaurante.dto.response.MessageResponseDTO;
import br.com.kayropereira.restaurante.api_restaurante.entity.usuario.Cliente;
import br.com.kayropereira.restaurante.api_restaurante.mapper.usuario.ClienteMapper;
import br.com.kayropereira.restaurante.api_restaurante.repository.usuario.ClienteRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class ClienteService {

    private ClienteRepository clienteRepository;

    private final ClienteMapper clienteMapper = ClienteMapper.INSTANCE;

    public MessageResponseDTO createCliente(ClienteDTO clienteDTO){
        System.out.println(clienteDTO);
//        System.out.println(clienteDTO.getNome() + " - " + clienteDTO.getSenha());

        Cliente cliente = clienteMapper.toModel(clienteDTO);

        System.out.println(cliente);
        System.out.println("Nome: " + cliente.getNome() + " Id: " + cliente.getId() + " Senha: " + cliente.getSenha());

        Cliente clienteSalvar = clienteRepository.save(cliente);
        return createMessageResponse(clienteSalvar.getId(), "Cliente criado com Id ");
    }

    private MessageResponseDTO createMessageResponse(Long id, String mensagem) {
        return MessageResponseDTO.builder()
                .message(mensagem + id)
                .build();
    }
}
