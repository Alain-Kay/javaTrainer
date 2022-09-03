package com.javatrainer.personnage.comportement;

public class Pacifiste implements EspritCombatif{
    public boolean combat(){
        System.out.println("je ne combats jamais");
        return false;
    }
}
