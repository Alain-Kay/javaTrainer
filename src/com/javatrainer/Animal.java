package com.javatrainer;

import java.util.Objects;

//comprendre les notions de classe abstraite
abstract class Animal {

    protected int poids;
    protected String couleur;

    public Animal(int poids, String couleur) {
        this.poids = poids;
        this.couleur = couleur;
    }

    public Animal() {

    }

    public int getPoids() {
        return poids;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public void setPoids(int poids) {
        this.poids = poids;
    }

    public void manger(){
        System.out.println("je mage la viande");

    }

    public void boire(){
        System.out.println("je bois de l'eau");

    }

    abstract void deplacement();

    abstract void crier();

    @Override
    public String   toString() {
        return "Animal{" +
                "poids=" + poids +
                ", couleur='" + couleur + '\'' +
                '}';
    }
}
