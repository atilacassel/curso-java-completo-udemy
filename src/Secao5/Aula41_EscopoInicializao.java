package Secao5;

public class Aula41_EscopoInicializao {

    public static void main(String[] args) {

        double price = 400.00;
        double discount;
        
        if (price > 200.00) {
            discount = price * 0.1; //pode ser que essa variavel discount não seja iniciada, então não poderia usar para imprimir ela
        }
        else {
            discount = 0; //Usamos o else com a variavel discount para o caso de o if ser falso, dai ela seria iniciada aqui e podemos usar para imprimir
        }

        System.out.println(discount);
    }
}
