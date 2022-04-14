package Secao6;

import java.util.Scanner;

public class Exercicios3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //1
//        int numero;
//        System.out.println("Qual numero?");
//        numero = sc.nextInt();
//
//        if (numero < 0) {
//            System.out.println("NEGATIVO");
//        }
//        else {
//            System.out.println("NAO NEGATIVO");
//        }

        //2
//        int N;
//        System.out.println("Qual numero?");
//        N = sc.nextInt();
//
//        if (N % 2 == 0) {
//            System.out.println("PAR");
//        }
//        else {
//            System.out.println("IMPAR");
//        }

        //3
//        int A = sc.nextInt();
//        int B = sc.nextInt();
//
//        if (A % B == 0 || B % A == 0) {
//            System.out.println("Sao multiplos");
//        }
//        else {
//            System.out.println("Não sao Multiplos");
//        }

        //4
//        int horaInicial = sc.nextInt();
//        int horafinal = sc.nextInt();
//        int duracao;
//
//        if (horafinal < horafinal) {
//            duracao = horafinal - horaInicial;
//        }
//        else {
//            duracao = 24 - horaInicial + horafinal;
//        }
//        System.out.println("O jogo durou " + duracao + " hora(s)");

        //5
//        int codigo = sc.nextInt();
//        int quantidade = sc.nextInt();
//
//        double total;
//        if (codigo == 1) {
//            total = quantidade * 4.0;
//        }
//        else if (codigo == 2) {
//            total = quantidade * 4.5;
//        }
//        else if (codigo == 3) {
//            total = quantidade * 5.0;
//        }
//        else if (codigo == 4) {
//            total = quantidade * 2.0;
//        }
//        else {
//            total = quantidade * 1.5;
//        }
//
//        System.out.printf("Total: R$ %.2f%n", total);

        //6
//        double numero = sc.nextDouble();
//
//        if (numero < 0.0 || numero > 100.0) {
//            System.out.println("Fora de intervalo");
//        }
//        else if (numero <= 25.0) {
//            System.out.println("Intervalo [0,25]");
//        }
//        else if (numero <= 50.0) {
//            System.out.println("Intervalo (25,50]");
//        }
//        else if (numero <= 75.0) {
//            System.out.println("Intervalo (50,75]");
//        }
//        else {
//            System.out.println("Intervalo (75,100]");
//        }

        //7
//        double x = sc.nextDouble();
//        double y = sc.nextDouble();
//
//        if (x == 0.0 && y == 0.0) {
//            System.out.println("Origem");
//        }
//        else if (x == 0.0) {
//            System.out.println("Eixo Y");
//        }
//        else if (y == 0.0) {
//            System.out.println("Eixo X");
//        }
//        else if (x > 0.0 && y > 0.0) {
//            System.out.println("Q1");
//        }
//        else if (x < 0.0 && y > 0.0) {
//            System.out.println("Q2");
//        }
//        else if (x < 0.0 && y < 0.0) {
//            System.out.println("Q3");
//        }
//        else {
//            System.out.println("Q4");
//        }

        //8
        double salario = sc.nextDouble();

        double imposto;
        if (salario <= 2000.0) {
            imposto = 0.0;
        }
        else if (salario <= 3000.0) {
            imposto = (salario - 2000.0) * 0.08;
        }
        else if (salario <= 4500.0) {
            imposto = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;
        }
        else {
            imposto = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
        }

        if (imposto == 0.0) {
            System.out.println("Isento");
        }
        else {
            System.out.printf("R$ %.2f%n", imposto);
        }

        sc.close();
    }
}
