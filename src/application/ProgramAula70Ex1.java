package application;

import entities.Rectangle;

import java.util.Scanner;

public class ProgramAula70Ex1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Rectangle rect = new Rectangle();

        System.out.println("Enter rectangle width and height: ");
        rect.width = sc.nextDouble();
        rect.height = sc.nextDouble();

        System.out.printf("Area = %.2f%n", rect.area());
        System.out.printf("Perimeter = %.2f%n", rect.perimeter());
        System.out.printf("Diagonal = %.2f%n", rect.diagonal());

        sc.close();
    }
}
