package com.company.models;

public class Usuario {

    public static boolean verificarIdade(int idade) {
        if(idade >=18) {
            System.out.println("é maior de idade");
            return true;
        } else {
            System.out.println("nao é maior de idade");
        }
        return false;
    }

    public static boolean verificarNacionalidade(boolean nacionalidade) {
        if(nacionalidade){
            System.out.println("O usuario é brasileiro");
            return true;
        } else{
            System.out.println("O usuario nao é brasileiro");
            return false;
        }
    }

    public  boolean cadastrar(int idade, boolean nacionalidade) {
        if(verificarIdade(idade)){
            if(verificarNacionalidade(nacionalidade)){
                System.out.println("Voce  foi cadastrado");
                return true;
            }
        }
        System.out.println("Voce n foi cadastrado");
        return false;
    }
}
