package com.javatrainer;

import java.util.Objects;

public class Ville {
   protected String nomVille;
  protected    String nomPays;
  protected    int nbHabitants;
  protected char categorie;

    public Ville(String nomVille, String nomPays, int nbHabitants) {
        this.nomVille = nomVille;
        this.nomPays = nomPays;
        this.nbHabitants = nbHabitants;
        this.setCategorie();
    }

    private char setCategorie() {
        return 0;
    }

    public Ville() {

    }

    public int hashCode(){
        return Objects.hash(categorie, nbHabitants, nomPays, nomVille);
    }

    public String getNomVille() {
        return nomVille;
    }

    public void setNomVille(String nomVille) {
        this.nomVille = nomVille;
    }

    public String getNomPays() {
        return nomPays;
    }

    public void setNomPays(String nomPays) {
        this.nomPays = nomPays;
    }

    public int getNbHabitants() {
        return nbHabitants;
    }

    public void setNbHabitants(int nbHabitants) {
        this.nbHabitants = nbHabitants;
    }

    public char getCategorie() {
        return categorie;
    }

    public void setCategorie(char categorie) {
        int borneSuperieure [] = {0, 100, 1000, 10000};
        char categories[] = {'A', 'B', 'c', 'D'};

        int i = 0;

        while (i < borneSuperieure.length && this.nbHabitants > borneSuperieure[i]){
            i++;

        }
        this.categorie = categories[i];
    }


    public String comparer(Ville ville){
        String str = new String();
        if (ville.getNbHabitants() > this.nbHabitants ){
            str = ville.getNomVille()+ " est une ville peuplee";
        }else {
            str = this.nomVille + " est une ville plus peuplee que "+ville.getNomVille();
        }

        return str;
    }

    @Override
    public String toString() {
        return "Ville{" +
                "nomVille='" + nomVille + '\'' +
                ", nomPays='" + nomPays + '\'' +
                ", nbHabitants=" + nbHabitants +
                ", categorie=" + categorie +
                '}';
    }
}
