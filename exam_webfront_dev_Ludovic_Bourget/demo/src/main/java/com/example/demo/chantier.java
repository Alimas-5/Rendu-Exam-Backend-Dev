package com.example.demo;

import java.util.Set;

public class chantier {

    private String name;
    private String adresse;
    private String prix;
    private Long id;

    @ManyToMany
    Set<manager> iManagers;

    chantier(String name, String adresse, String prix) {

        this.name = name;
        this.adresse = adresse;
        this.prix = prix;
    }

    public Long getId() {
        return this.id;
    }

    public String getadresse() {
        return this.name;
    }

    public String getName() {
        return this.adresse;
    }

    public String getprix() {
        return this.prix;
    }

}
