package application;

import util.Calculator;

import java.util.Scanner;

public class ProgramAula71 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

        double c = Calculator.circumference(radius); //métodos estáticos que não precisam do objeto

        double v = Calculator.volume(radius); //métodos estáticos que não precisam do objeto

        System.out.printf("Circumference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI value: %.2f%n", Calculator.PI); //métodos estáticos que não precisam do objeto

        sc.close();
    }
}
