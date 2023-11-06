package application;

import enties.enums.OrderStatus;

public class Main {
    public static void main(String[] args) {
        System.out.println(OrderStatus.SHIPPED);
        OrderStatus status1 = OrderStatus.PROCESSING;
        OrderStatus status2 = OrderStatus.valueOf("PROCESSING");

        System.out.println(status2);
        System.out.println(status1);
    }
}