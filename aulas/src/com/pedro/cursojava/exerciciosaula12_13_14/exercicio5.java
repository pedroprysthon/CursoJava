package com.pedro.cursojava.exerciciosaula12_13_14;

import java.util.Locale;
import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite o valor em metros");
        double metros = scan.nextDouble();

        double centimetros = metros * 100;
        System.out.println("O valor em centímetros é " + centimetros +  " centímetros");
    }
}

