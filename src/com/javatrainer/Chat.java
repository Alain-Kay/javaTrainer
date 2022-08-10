package com.javatrainer;

public class Chat extends  Felin{

    public Chat(){

    }

    public Chat(int poids, String couleur){
        this.poids = poids;
        this.couleur = couleur;
    }

    @Override
    void crier() {
        System.out.println("je miole fort");
    }
}
