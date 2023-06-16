package com.geloodev.models;

import jakarta.persistence.*;

@Entity
@Table(name = "character")
public class Character extends Base {

    @Column(name = "strength")
    int strength;
    
    @Column(name = "dexterity")
    int dexterity;

    @Column(name = "constitution")
    int constitution;

    @Column(name = "intelligence")
    int intelligence;

    @Column(name = "winsdom")
    int winsdom;

    @Column(name = "charisma")
    int charisma;

    @ManyToOne
    @JoinColumn(name = "race_id")
    Race race;

    @ManyToOne
    @JoinColumn(name = "character_class_id")
    CharacterClass characterClass;

    @ManyToOne
    @JoinColumn(name = "weapon_id")
    Weapon weapon;

    @ManyToOne
    @JoinColumn(name = "player_id")
    Player player;

    public void setAttributes(int strength, int dexterity, int constitution, int intelligence, int winsdom, int charisma) {
        this.strength = strength;
        this.dexterity = dexterity;
        this.constitution = constitution;
        this. intelligence = intelligence;
        this.winsdom = winsdom;
        this.charisma = charisma;
    }

    public void setRace(Race race) {
        this.race = race;
    }

    public void setCharacterClass(CharacterClass characterClass) {
        this.characterClass = characterClass;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
}
