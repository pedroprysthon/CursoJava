package com.pedro.cursojava.exerciciosaula12_13_14;

import java.util.Locale;
import java.util.Scanner;

public class exercicio13 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Quanto você ganha por hora? ");
        double ganhoPorHora = scan.nextDouble();

        System.out.println("Quantas horas você trabalha por mês? ");
        double horasTrabalhadasPMes = scan.nextDouble();

        double salarioBruto = ganhoPorHora * horasTrabalhadasPMes;
        double inss = salarioBruto * 0.08;
        double sindicato = salarioBruto * 0.05;
        double ir =  salarioBruto * 0.11;
        double descontos = salarioBruto*0.24;
        double salarioLiquido = salarioBruto - descontos;

        System.out.println("Seu salário bruto nesse mês é de R$" + salarioBruto);
        System.out.println("Você pagou R$" + inss + " ao INSS");
        System.out.println("Você pagou R$" + sindicato + " ao Sindicato");
        System.out.println("Você pagou R$" + ir+ " ao Imposto de Renda");
        System.out.println("Você pagou R$" + descontos + " em descontos");

        System.out.println("Seu salário líquido é R$" + salarioLiquido);


    }
}

