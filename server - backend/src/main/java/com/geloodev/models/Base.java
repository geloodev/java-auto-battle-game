package com.geloodev.models;

import java.util.UUID;

import jakarta.persistence.*;

@MappedSuperclass
public abstract class Base {

    @Id
    @Column(name = "id")
    private UUID id;

    @Column(name = "name")
    private String name;
}
