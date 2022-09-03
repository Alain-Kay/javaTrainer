package com.javatrainer.personnage.comportement;

public class CombatPistolet implements EspritCombatif{
    public boolean combat(){
        System.out.println("je combats au pistolet ");
        return false;
    }
}
