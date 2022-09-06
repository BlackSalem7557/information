package com.microservice.information.repository;

import com.microservice.information.dto.ClientDto;
import com.microservice.information.entity.ClientEntity;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Repository
public class ClientRepository {

    private static final Map<Integer, ClientEntity> mapClients = new HashMap<>();
    private static final Integer id = 23445322;

    @PostConstruct
    public void init(){
        ClientEntity clientNumberOne = new ClientEntity(id,
                                                        "C",
                                                        "Juan",
                                                        "Alexander",
                                                        "Valencia",
                                                        "Becerra",
                                                        "3002263836",
                                                        "Cra 5B # 48 N 45 sur",
                                                        "Bogota");
        mapClients.put(id, clientNumberOne);
    }
    public Optional<ClientEntity> getClient(ClientDto clientDto){
        return Optional.ofNullable(mapClients.get(clientDto.getId()));
    }
}
