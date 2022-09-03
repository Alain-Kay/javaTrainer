package com.javatrainer;

public class NombreHabitantException extends Exception{
    public NombreHabitantException(){
        System.out.println("vous essayez d'instancier une classe Ville avec un nombre d'habitants negatifs");
    }


}
