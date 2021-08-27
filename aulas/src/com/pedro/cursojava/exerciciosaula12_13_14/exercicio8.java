package com.pedro.cursojava.exerciciosaula12_13_14;

import java.util.Locale;
import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Quanto você ganha por hora? ");
        double ganhoPorHora = scan.nextDouble();

        System.out.println("Quantas horas você trabalha por mês? ");
        double horasTrabalhadasPMes = scan.nextDouble();

        double salario = ganhoPorHora * horasTrabalhadasPMes;
        System.out.println("Seu salário nesse mês é de R$" + salario );
    }
}

