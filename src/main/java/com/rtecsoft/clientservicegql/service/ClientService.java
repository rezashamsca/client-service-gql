package com.rtecsoft.clientservicegql.service;

import com.rtecsoft.clientservicegql.model.Client;
import com.rtecsoft.clientservicegql.service.repository.ClientRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public class ClientService {
    private final ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public List<Client> findAll() {
        return clientRepository.findAll();
    }

    public Optional<Client> findById(UUID id) { return clientRepository.findById(id); }

    public Optional<Client> findByName(String name) { return clientRepository.findByName(name); }
}
