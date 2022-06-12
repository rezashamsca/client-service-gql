package com.rtecsoft.clientservicegql.controller;

import com.rtecsoft.clientservicegql.model.Client;
import com.rtecsoft.clientservicegql.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.util.List;

@Controller
public class ClientController {
    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @SchemaMapping(typeName = "Query", value="allClients")
    public List<Client> allClients() {
        return clientService.findAll();
    }
}
