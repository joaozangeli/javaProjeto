package com.company;

import com.company.models.Usuario;

public class Main {

    public static void main(String[] args) {
        Usuario usuario = new Usuario();
        usuario.cadastrar(20, true);
    }
}