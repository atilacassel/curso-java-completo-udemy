package Secao6;

import java.util.Scanner;

public class Aula50_For {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        int N = sc.nextInt();
//        int soma = 0;
//
//        for (int i=0; i<N; i++) {     //'i++' é a mesma coisa que se botasse i=i+1
//            int x = sc.nextInt();
//            soma = soma + x;
//        }
//
//        System.out.println(soma);

//        for (int i=0; i<5; i++) {
//            System.out.println("Valor de i: " + i);
//        }

        for (int i=4; i>=0; i--) {
            System.out.println("Valor de i :" + i);
        }

        sc.close();
    }
}
