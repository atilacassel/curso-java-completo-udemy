package Secao5;

import java.util.Scanner;

public class Aula39_SwitchCase {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        String dia = "";

//        if (x == 1) {
//            dia = "Domingo";
//        }
//        else if (x == 2) {
//            dia = "Segunda";
//        }
//        else if (x == 3) {
//            dia = "Terça";
//        }
//        else if (x == 4) {
//            dia = "Quarta";
//        }
//        else if (x == 5) {
//            dia = "Quinta";
//        }
//        else if (x == 6) {
//            dia = "Sexta";
//        }
//        else if (x == 7) {
//            dia = "Sábado";
//        }
//        else {
//            dia = "Valor inválido";
//        }

        //Ou podemos usar switch case

        switch (x) {
            case 1:
                dia = "domingo";
                break;
            case 2:
                dia = "segunda";
                break;
            case 3:
                dia = "terça";
                break;
            case 4:
                dia = "quarta";
                break;
            case 5:
                dia = "quinta";
                break;
            case 6:
                dia = "sexta";
                break;
            case 7:
                dia = "sabado";
                break;
            default:
                dia = "valor inválido";
                break;
        }

        System.out.println("Dia da semana: " + dia);
        sc.close();
    }
}
