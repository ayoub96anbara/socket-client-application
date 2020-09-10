package com.dao;

import java.io.Serializable;


public class Compte implements Serializable {
    private String numCompte;
    private double solde;

    public Compte() {
    }

    public Compte(String numCompte, double solde) {
        this.numCompte = numCompte;
        this.solde = solde;
    }

    public String getNumCompte() {
        return numCompte;
    }

    public void setNumCompte(String numCompte) {
        this.numCompte = numCompte;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }
}
