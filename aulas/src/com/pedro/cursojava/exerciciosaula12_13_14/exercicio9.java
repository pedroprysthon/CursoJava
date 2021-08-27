package com.pedro.cursojava.exerciciosaula12_13_14;

import java.util.Locale;
import java.util.Scanner;

public class exercicio9 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Qual o valor da temperatura em Fahrenheit?");
        double fahrenheint = scan.nextDouble();

        double celsius = 5*(fahrenheint-32)/9;
        System.out.println("A temperatura em Celsius é de " + celsius + "ºC");
    }
}

