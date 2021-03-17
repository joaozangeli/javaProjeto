package com.company;

import com.company.models.Usuario;

public class Main {

    public static void main(String[] args) {
        Usuario usuario = new Usuario(17, true);
        usuario.setIdade(12);
        System.out.println(usuario.getIdade());
    }
}
