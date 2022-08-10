package com.javatrainer;

public class Chien extends Canin {

    public Chien(){
        super();

    }
    public Chien(int poids, String couleur) {
        super(poids, couleur);
    }

    @Override
    void crier() {
        System.out.println("j'aboie fortementr");
    }
}
