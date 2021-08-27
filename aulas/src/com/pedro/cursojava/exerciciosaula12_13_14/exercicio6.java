package com.pedro.cursojava.exerciciosaula12_13_14;

import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Diga o valor do raio do círculo: ");
        double raio = scan.nextDouble();

        double area = Math.pow(raio, 2) * Math.PI;
        System.out.println("O valor da área do círculo é " + area);
    }
}

