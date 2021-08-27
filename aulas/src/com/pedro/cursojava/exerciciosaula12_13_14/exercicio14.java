package com.pedro.cursojava.exerciciosaula12_13_14;

import java.util.Locale;
import java.util.Scanner;

public class exercicio14 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Qual é o tamanho do arquivo em MB?");
        double tamanhoArquivo = scan.nextDouble();

        System.out.println("Qual é a velocidade do seu link de internet em Mpbs?");
        double velocidadeInternet = scan.nextDouble();

        double tempo = tamanhoArquivo/velocidadeInternet;
        System.out.println("O tempo estimado de download é de: " + tempo + " minutos");
    }
}

