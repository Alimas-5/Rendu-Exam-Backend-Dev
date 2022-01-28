package com.example.demo;

public class véhicule {
    private String Marque;
    private String Annéedeconstruction;
    private Long Numérodeplaque;

    véhicule(String Marque, String Annéedeconstruction, Long Numérodeplaque) {

        this.Marque = Marque;
        this.Annéedeconstruction = Annéedeconstruction;
        this.Numérodeplaque = Numérodeplaque;
    }

    public String getmarque() {
        return this.Marque;
    }

    public String getannéedecons() {
        return this.Annéedeconstruction;
    }

    public Long getnumérodeplaque() {
        return this.Numérodeplaque;
    }

}
