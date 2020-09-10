package com.dao;

import java.io.Serializable;

public class Client implements Serializable {
    private String nom;
    private String prenom;
    private Compte compte;

    public Client() {
    }

    public Client(String nom, String prenom, Compte compte) {
        this.nom = nom;
        this.prenom = prenom;
        this.compte = compte;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Compte getCompte() {
        return compte;
    }

    public void setCompte(Compte compte) {
        this.compte = compte;
    }
}
