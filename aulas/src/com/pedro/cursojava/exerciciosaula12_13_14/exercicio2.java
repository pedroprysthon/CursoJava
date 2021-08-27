package com.pedro.cursojava.exerciciosaula12_13_14;

import java.util.Locale;
import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite um número inteiro ");
        int numero = scan.nextInt();
        System.out.println("O número informado foi " + numero);
    }
}

