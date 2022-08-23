package com.javatrainer;

public class Chien extends Canin implements Rintintin {

    public Chien(){
        super();

    }
    public Chien(int poids, String couleur) {
        super(poids, couleur);
    }

    @Override
    void crier() {
        System.out.println("j'aboie fortementrj");
    }

    /**
     *
     */
    @Override
    public void faireCalin() {
        System.out.println("je te fais un gros calin");
    }

    /**
     *
     */
    @Override
    public void faireLechouille() {
        System.out.println("je te fais de gros Lechouille");

    }

    /**
     *
     */
    @Override
    public void faiteLeBeau() {
        System.out.println("je te fais le beau");
    }
}
