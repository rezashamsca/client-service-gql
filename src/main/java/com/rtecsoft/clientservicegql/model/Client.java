package com.rtecsoft.clientservicegql.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table(name = "client")
@Getter @Setter
public class Client {
    @Id @GeneratedValue
    private UUID id;
    private String name;
}
