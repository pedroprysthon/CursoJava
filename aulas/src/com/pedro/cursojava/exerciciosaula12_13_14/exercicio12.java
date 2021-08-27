package com.pedro.cursojava.exerciciosaula12_13_14;

import java.util.Locale;
import java.util.Scanner;

public class exercicio12 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Informe sua altura:");
        double altura = scan.nextDouble();

        double pesoIdeal = 72.7 * altura - 58;
        System.out.println("Seu peso ideal é: " + pesoIdeal);
    }
}

