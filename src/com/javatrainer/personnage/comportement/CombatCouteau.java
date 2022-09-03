package com.javatrainer.personnage.comportement;

public class CombatCouteau implements EspritCombatif{
    public boolean combat(){
        System.out.println("je combat au couteau");
        return false;
    }
}
