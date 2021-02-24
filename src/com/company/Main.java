package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entradaDeDados = new Scanner(System.in);

        String tituloDoLivro;


        System.out.println("Digite nome do livro");
        tituloDoLivro = entradaDeDados.nextLine();

        System.out.println("Digitado: " + tituloDoLivro);
    }
}
