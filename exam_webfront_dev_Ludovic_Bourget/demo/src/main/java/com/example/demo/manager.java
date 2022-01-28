package com.example.demo;

public class manager {

    private String prénom;
    private String nom;
    private Long numérofix;
    private Long numéropor;

    manager(String prénom, String nom, Long numérofix, Long numéropor) {

        this.prénom = prénom;
        this.nom = nom;
        this.numérofix = numérofix;
        this.numéropor = numéropor;
    }

    public String getId() {
        return this.prénom;
    }

    public String getadresse() {
        return this.nom;
    }

    public Long getName() {
        return this.numérofix;
    }

    public Long getprix() {
        return this.numéropor;
    }

}
