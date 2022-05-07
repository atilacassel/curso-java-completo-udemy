package secao13;

import entities.OrderAula133;
import entities.enums.OrderStatusAula133;

import java.util.Date;

public class ProgramAula133Enumeracoes {

    public static void main(String[] args) {

        OrderAula133 order = new OrderAula133(1080, new Date(), OrderStatusAula133.PENDING_PAYMENT);

        System.out.println(order);

        OrderStatusAula133 os1 = OrderStatusAula133.DELIVERED;

        OrderStatusAula133 os2 = OrderStatusAula133.valueOf("DELIVERED");

        System.out.println(os1);
        System.out.println(os2);
    }
}
