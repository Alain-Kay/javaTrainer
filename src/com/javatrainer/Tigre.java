package com.javatrainer;

public class Tigre extends Felin{

    public Tigre(){

    }

    public Tigre(int poids, String couleur){
        this.poids = poids;
        this.couleur = couleur;

    }

    @Override
    void crier() {
        System.out.println("je grogne tres fort");
    }
}
