package com.example.demo;

public class techniciens {

    private String prénom;
    private String nom;

    techniciens(String prénom, String nom) {

        this.prénom = prénom;
        this.nom = nom;

    }

    public String getId() {
        return this.prénom;
    }

    public String getadresse() {
        return this.nom;
    }

}
