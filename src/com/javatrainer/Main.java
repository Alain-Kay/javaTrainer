package com.javatrainer;



public class Main {
    public static void main(String[] args) {
//        System.out.println("************** I, j'appprends le JAVA ! **************");
//
//        Ville ville1 = new Ville("lushi","rdc",170);
//        Ville ville2 = new Ville("kinshasa","rdc",160);
//        Ville v = new Ville();
//        v.comparer(ville2);
//        System.out.println(ville1.comparer(ville2));
//        System.out.println();
//        System.out.println(v.getCategorie());
//        System.out.println(ville1.comparer(ville2));
//
//        System.out.println("***************************************************************************");
//
//        Capitale capitale = new Capitale("likasi", "ghana",456,"tembo");
//        System.out.println(capitale.toString());
//
//        System.out.println("***********************************");

//       Chien chien = new Chien(20,"BLANCHE" );
//       chien.faireCalin();
//       chien.boire();
//       chien.manger();
//       chien.faireLechouille();
//       chien.faiteLeBeau();
//       chien.crier();
//        System.out.println(chien.toString());
//
//        System.out.println("--------------------------------");
//        Felin f = new Chat(23,"rouge");
//        System.out.println(f);


//        try {
//            Ville ville =new Ville("lushi","rdc",-1200);
//            System.out.println(ville);
//        }catch (NombreHabitantException e){
//
//        }

    for (Langage langage : Langage.values()){
        if (Langage.JAVA.equals(langage)){
            System.out.println("j'aime le : "+ langage);
        }else {
            System.out.println(langage);
        }
    }












    }
}