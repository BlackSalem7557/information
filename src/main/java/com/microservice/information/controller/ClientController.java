package com.microservice.information.controller;

import com.microservice.information.dto.ClientDto;
import com.microservice.information.entity.ClientEntity;
import com.microservice.information.repository.ClientRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@RestController
@RequestMapping("/client")
public class ClientController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ClientController.class);

    @Autowired
    private ClientRepository clientRepository;

    @GetMapping
    public ResponseEntity<ClientEntity> getClientByIdAndIdType(@Valid ClientDto clientDto) {

        Optional<ClientEntity> clientOptional;

        try {
            clientOptional = clientRepository.getClient(clientDto);
            return clientOptional.isPresent() ? ResponseEntity.ok(clientOptional.get()) : ResponseEntity.notFound().build();
        } catch (Exception exception) {
            System.out.println("ex: " + exception);
            LOGGER.error(exception.getMessage());
            return ResponseEntity.internalServerError().build();
        }
    }
}
