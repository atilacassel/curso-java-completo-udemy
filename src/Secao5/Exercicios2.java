package Secao5;

import java.util.Scanner;

public class Exercicios2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //1
//        int x;
//        int y;
//        double SOMA;
//        x = sc.nextInt();
//        y = sc.nextInt();
//        SOMA = x + y;
//        System.out.println("SOMA = " + SOMA);

        //2
//        double raio;
//        double pi = 3.14159;
//        double area;
//        double raio2;
//        raio = sc.nextDouble();
//        raio2 = Math.pow(raio, 2.0);
//        area = pi * raio2;
//        System.out.printf("A=%.4f%n", area);

        //3
//        int A, B, C, D, dif;
//        A = sc.nextInt();
//        B = sc.nextInt();
//        C = sc.nextInt();
//        D = sc.nextInt();
//        dif = A * B - C * D;
//        System.out.println("DIFERENCA = " + dif);

        //4
//        int numero, horas;
//        double valorHora, salario;
//
//        numero = sc.nextInt();
//        horas = sc.nextInt();
//        valorHora = sc.nextDouble();
//
//        salario = horas * valorHora;
//
//        System.out.println("NUMBER = " + numero);
//        System.out.printf("SALARY = U$ %.2f%n", salario);

        //5
//        int peca1, numeroPecas1, peca2, numeroPecas2;
//        double valorPeca1, valorPeca2, valor;
//
//        peca1 = sc.nextInt();
//        numeroPecas1 = sc.nextInt();
//        valorPeca1 = sc.nextDouble();
//        peca2 = sc.nextInt();
//        numeroPecas2 = sc.nextInt();
//        valorPeca2 = sc.nextDouble();
//
//        valor = numeroPecas1 * valorPeca1 + numeroPecas2 * valorPeca2;
//        System.out.printf("VALOR A PAGAR: R$ %.2f%n", valor);

        //6
        double A, B, C, triangulo, circulo, trapezio, quadrado, retangulo;

        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        triangulo = A * C / 2.0;
        circulo = 3.14159 * C * C;
        trapezio = (A + B) / 2.0 * C;
        quadrado = B * B;
        retangulo = A * B;

        System.out.printf("TRIANGULO: %.3f%n", triangulo);
        System.out.printf("CIRCULO: %.3f%n", circulo);
        System.out.printf("TRAPEZIO: %.3f%n", trapezio);
        System.out.printf("QUADRADO: %.3f%n", quadrado);
        System.out.printf("RETANGULO: %.3f%n", retangulo);

        sc.close();
    }
}
