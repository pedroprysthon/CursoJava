package com.pedro.cursojava.exerciciosaula12_13_14;

import java.util.Locale;
import java.util.Scanner;

public class exercicio11 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Diga um número inteiro:");
        int numerointeiro1 = scan.nextInt();

        System.out.println("Diga outro número inteiro:");
        int numerointeiro2 = scan.nextInt();

        System.out.println("Diga um número real:");
        double numeroReal = scan.nextDouble();

        int resultado1 = (numerointeiro1*2)*(numerointeiro2/2);
        double resultado2 = numerointeiro1*3+numeroReal;
        double resultado3 = Math.pow(numeroReal,3);

        System.out.println("O produto do dobro do primeiro com metade do segundo é: " + resultado1);
        System.out.println("A soma do triplo do primeiro com o terceiro é: " + resultado2);
        System.out.println("O terceiro elevado ao cubo é: " + resultado3 );
    }
}

