package com.pedro.cursojava.exerciciosaula12_13_14;

import java.util.Locale;
import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Diga a temperatura em Celsius");
        double celsius = scan.nextDouble();

        double fahrenheit = celsius*1.8+32;
        System.out.println("A temperatura em Fahrenheit é de: " + fahrenheit + "ºF");
    }
}

