package com.geloodev.models;

import jakarta.persistence.*;

@Entity
@Table(name = "weapon")
public class Weapon extends Base {
    
    @Column(name = "dammage")
    private String dammage;

    @Column(name = "category")
    private String category;

    public String getDammage() {
        return dammage;
    }

    public void setDammage(String dammage) {
        this.dammage = dammage;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
