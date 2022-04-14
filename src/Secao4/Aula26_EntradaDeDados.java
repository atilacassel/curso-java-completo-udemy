package Secao4;

import java.util.Scanner;

public class Aula26_EntradaDeDados {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); //Fazer entrada de dados

//        String x;
//        x = sc.next();
//        System.out.println("Voce digitou: " + x);

//        int x;
//        x = sc.nextInt();
//        System.out.println("Voce digitou: " + x);

//        double x;
//        x = sc.nextDouble();//Double pega o localidade, '.' ou ',' dependendo do local (usar Locale para alterar a lingua)
//        System.out.println("Voce digitou: " + x);

//        char x;
//        x = sc.next().charAt(1);//Vai pegar o caracter conforme o numero informado, 0 é o primeiro, 1 o segundo, etc
//        System.out.println("Voce digitou: " + x);

//        String x;
//        int y;
//        double z;
//        x = sc.next();
//        y = sc.nextInt();
//        z = sc.nextDouble();
//        System.out.println("Dados digitados: ");
//        System.out.println(x);
//        System.out.println(y);
//        System.out.println(z);

        int x;
        String s1, s2, s3;

        x = sc.nextInt();
        sc.nextLine();//para consumir a quebra de linha realizada pelo nextInt que ficou pendente
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        System.out.println("Dados digitados: ");
        System.out.println(x);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        sc.close();//encerrar objeto sc
    }
}
