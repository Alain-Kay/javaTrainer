package com.javatrainer;

public class Lion extends Felin {

    public Lion(){

    }

    public Lion(int poids, String couleur){
        this.poids = poids;
        this.couleur = couleur;
    }

    @Override
    void crier() {
        System.out.println("je rugis dans la savane");
    }
}
