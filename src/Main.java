import entities.Order;
import entities.OrderStatus;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Order order = new Order(1000, new Date(), OrderStatus.PROCESSING);

        System.out.println(order);
    }
}