package com.javatrainer;

public abstract class Felin extends Animal{
    public Felin(int poids, String couleur) {
        super(poids, couleur);
    }

    public Felin(){

    }

    void deplacement(){
        System.out.println("je me deplace en muet");

    }

}
