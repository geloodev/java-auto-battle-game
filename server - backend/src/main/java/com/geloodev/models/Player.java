package com.geloodev.models;

import java.util.UUID;

import jakarta.persistence.*;

@Entity
@Table(name = "player")
public class Player extends Base {

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;
}
