package com.dao;

import java.io.Serializable;

public class Reglement implements Serializable {
    private int key;
    private double montant;

    public Reglement(int key, double montant) {
        this.key = key;
        this.montant = montant;
    }

    public Reglement() {
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }
}
