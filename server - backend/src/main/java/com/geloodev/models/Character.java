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

    public Character() {

    }

    public Character(String name, int strength, int dexterity, int constitution, int intelligence, int winsdom, int charisma,
        Race race, CharacterClass characterClass, Weapon weapon) {
            this.setName(name);
            this.strength = strength;
            this.dexterity = dexterity;
            this.constitution = constitution;
            this.intelligence = intelligence;
            this.winsdom = winsdom;
            this.charisma = charisma;
            this.race = race;
            this.characterClass = characterClass;
            this.weapon = weapon;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getConstitution() {
        return constitution;
    }

    public void setConstitution(int constitution) {
        this.constitution = constitution;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getWinsdom() {
        return winsdom;
    }

    public void setWinsdom(int winsdom) {
        this.winsdom = winsdom;
    }

    public int getCharisma() {
        return charisma;
    }

    public void setCharisma(int charisma) {
        this.charisma = charisma;
    }

    public Race getRace() {
        return race;
    }

    public void setRace(Race race) {
        this.race = race;
    }

    public CharacterClass getCharacterClass() {
        return characterClass;
    }

    public void setCharacterClass(CharacterClass characterClass) {
        this.characterClass = characterClass;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}
