package com.geloodev.models;

import jakarta.persistence.*;

@Entity
@Table(name = "weapon")
public class Weapon extends Base {
    
    @Column(name = "dammage")
    private String dammage;

    @Column(name = "category")
    private String category;
}
