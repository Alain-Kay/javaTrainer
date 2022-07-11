package com.javatrainer;

public class Rectangle {

    private double hauteur = 0;
    private double largeur = 0;

    public Rectangle(double h, double l) {
        this.hauteur = h;
        this.largeur = l;
    }

    public Rectangle() {

    }

    public double getHauteur() {
        return hauteur;
    }

    public void setLongeur(double largeur) {
        this.largeur = largeur;
    }

    public double getLargeur() {
        return largeur;
    }

    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }

    public   double surface(){
        return hauteur * largeur;
    }


}
