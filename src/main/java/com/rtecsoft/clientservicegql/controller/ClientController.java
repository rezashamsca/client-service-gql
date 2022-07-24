package com.rtecsoft.clientservicegql.controller;

import com.rtecsoft.clientservicegql.model.Client;
import com.rtecsoft.clientservicegql.service.ClientService;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Controller
public class ClientController {
    private final ClientService clientService;
    private final DiscoveryClient discoveryClient;

    public ClientController(ClientService clientService, DiscoveryClient discoveryClient) {
        this.clientService = clientService;
        this.discoveryClient = discoveryClient;
    }

    @SchemaMapping(typeName = "Query", value="allClients")
    @CircuitBreaker(name = "client-service", fallbackMethod = "allClientsFallback")
    public List<Client> allClients() {
        return clientService.findAll();
    }

    private List<Client> allClientsFallback(Exception e) {
        log.info(e.getLocalizedMessage());
        return new ArrayList<Client>();
    }
}
