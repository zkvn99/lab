package org.example.study.week1.question4;

public class Application {

  public static void main(String[] args) {
    Order order = new Order("orderId", "product", OrderStatus.NEW);
    System.out.println(order);
  }
}
