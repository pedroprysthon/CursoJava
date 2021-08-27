package com.pedro.cursojava.exerciciosaula12_13_14;

import java.util.Locale;
import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite a primeira nota ");
        double primeiranota = scan.nextDouble();

        System.out.println("Digite a segunda nota ");
        double segundanota = scan.nextDouble();

        System.out.println("Digite a terceira nota ");
        double terceiranota = scan.nextDouble();

        System.out.println("Digite a quarta nota ");
        double quartanota = scan.nextDouble();

        double media = (primeiranota+segundanota+terceiranota+quartanota)/4;
        System.out.println("Sua média é " + media);


    }
}

