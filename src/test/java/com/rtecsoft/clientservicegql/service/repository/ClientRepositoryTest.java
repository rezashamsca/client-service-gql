package com.rtecsoft.clientservicegql.service.repository;

import com.rtecsoft.clientservicegql.model.Client;
import com.rtecsoft.clientservicegql.service.ClientService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ActiveProfiles("test")
@EnableJpaRepositories
class ClientRepositoryTest {
    @Autowired
    private ClientService clientService;

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    public void TestSelectAll() {
        List<Client> clients = this.clientService.findAll();
        assertThat(clients).isNotNull();
        assertThat(clients.size()).isGreaterThan(0);
    }

    @Test
    public void TestSelect() {
        final String name = "Bill Gates";
        Optional<Client> client = this.clientService.findByName(name);
        assertThat(client.isEmpty()).isFalse();
        Client value = client.get();
        assertThat(value.getName()).isEqualTo(name);
    }
}