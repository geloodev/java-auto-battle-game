package com.geloodev.models;

import jakarta.persistence.*;

@Entity
@Table(name = "character_class")
public class CharacterClass extends Base {
    
    @Column(name = "description")
    private String description;

    @Column(name = "health_points")
    private int healthPoints;

    @Column(name = "mana_points")
    private int manaPoints;
}
