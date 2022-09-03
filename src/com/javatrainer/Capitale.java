package com.javatrainer;


public class Capitale extends Ville {
    private String monument;

    public Capitale(String nomVille, String nomPays, int nbHabitants, String monument) throws NombreHabitantException {
        super(nomVille, nomPays, nbHabitants);
        this.monument = monument;
    }

    public Capitale(String monument) {
        this.monument = monument;
    }

    public Capitale(){
        super();
        monument = "poste";

    }

    public String getMonument() {
        return monument;
    }

    public void setMonument(String monument) {
        this.monument = monument;

    }



    @Override
    public String toString() {
        return "Capitale{" +
                "monument='" + monument + '\'' +
                ", nomVille='" + nomVille + '\'' +
                ", nomPays='" + nomPays + '\'' +
                ", nbHabitants=" + nbHabitants +
                ", categorie=" + categorie +
                '}';
    }

}
