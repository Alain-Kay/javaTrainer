package com.javatrainer.personnage.comportement;

public class Civil extends Personnage{
    public Civil() {
    }

    public Civil(EspritCombatif espritCombatif, Soin soin, Deplacement deplacement) {
        super(espritCombatif, soin, deplacement);
    }
}
