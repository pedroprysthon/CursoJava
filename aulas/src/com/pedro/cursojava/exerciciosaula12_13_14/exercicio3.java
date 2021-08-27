package com.pedro.cursojava.exerciciosaula12_13_14;

import java.util.Locale;
import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite um número inteiro: ");
        int numero1 = scan.nextInt();

        System.out.println("Digite outro número inteiro: ");
        int numero2 = scan.nextInt();

        int resultado = numero1 + numero2;
        System.out.println("A soma dos números é igual a " + resultado);

    }
}

