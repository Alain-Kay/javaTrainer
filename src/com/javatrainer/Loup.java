package com.javatrainer;

public class Loup extends Canin {

    public Loup(){

    }

    public Loup(int poids, String couleur){
        this.poids = poids;
        this.couleur = couleur;
    }

    @Override
    void crier() {
        System.out.println("je hurle grave a la lune");
    }
}
