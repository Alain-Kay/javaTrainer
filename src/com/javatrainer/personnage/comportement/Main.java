package com.javatrainer.personnage.comportement;

public class Main {
    public static void main(String[] args) {

        Personnage []personnages = {new Geurier(), new Civil(), new Medecin()};
        for (int i = 0; i < personnages.length; i++){
            System.out.println("Instance de "+ personnages[i].getClass().getName());

            System.out.println("*************************************************");
            personnages[i].combattre();
            personnages[i].seDeplacer();
            personnages[i].soigner();
        }
    }
}
