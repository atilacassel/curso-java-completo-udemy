package entities;

import entities.enums.OrderStatusAula133;

import java.util.Date;

public class OrderAula133 {

    private Integer id;
    private Date moment;
    private OrderStatusAula133 status;

    public OrderAula133() {
    }

    public OrderAula133(Integer id, Date moment, OrderStatusAula133 status) {
        this.id = id;
        this.moment = moment;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatusAula133 getStatus() {
        return status;
    }

    public void setStatus(OrderStatusAula133 status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Order_Aula133{" +
                "id=" + id +
                ", moment=" + moment +
                ", status=" + status +
                '}';
    }
}
