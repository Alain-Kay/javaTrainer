package com.javatrainer;

public abstract class Canin extends Animal {
    public Canin(int poids, String couleur) {
        super(poids, couleur);
    }

    public Canin() {
        super();
    }

    void deplacement(){
        System.out.println("je me deplace seul");
    }

}
