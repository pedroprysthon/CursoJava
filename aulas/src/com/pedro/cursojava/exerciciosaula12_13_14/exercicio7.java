package com.pedro.cursojava.exerciciosaula12_13_14;

import java.util.Locale;
import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Diga o lado do quadrado");
        double lado = scan.nextDouble();

        double area = Math.pow(lado, 2);

        System.out.println("A área é: " + area);
        System.out.println("O dobro da área é: " + (2 * area));
    }
}

