package com.javatrainer.personnage.comportement;

public class Geurier extends Personnage{
    public Geurier(){
        this.espritCombatif = new CombatPistolet();
    }

    public Geurier(EspritCombatif espritCombatif, Soin soin, Deplacement deplacement) {
        super(espritCombatif, soin, deplacement);
    }
}
