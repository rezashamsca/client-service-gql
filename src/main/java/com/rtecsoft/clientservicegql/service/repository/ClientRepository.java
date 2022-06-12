package com.rtecsoft.clientservicegql.service.repository;

import com.rtecsoft.clientservicegql.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import java.util.UUID;

public interface ClientRepository extends JpaRepository<Client, UUID> {
}
