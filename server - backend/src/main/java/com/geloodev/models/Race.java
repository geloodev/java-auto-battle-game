package com.geloodev.models;

import jakarta.persistence.*;

@Entity
@Table(name = "race")
public class Race extends Base {

    @Column(name = "strength_modifier")
    private int strengthModifier;

    @Column(name = "dexterity_modifier")
    private int dexterityModifier;

    @Column(name = "constitution_modifier")
    private int constitutionModifier;

    @Column(name = "intelligence_modifier")
    private int intelligenceModifier;

    @Column(name = "winsdom_modifier")
    private int winsdomModifier;

    @Column(name = "charisma_modifier")
    private int charismaModifier;
}
