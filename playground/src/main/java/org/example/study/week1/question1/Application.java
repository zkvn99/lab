package org.example.study.week1.question1;

public class Application {

  public static void main(String[] args) {
    Vehicle[] vehicles = new Vehicle[2];

    vehicles[0] = new Car("KIA");
    vehicles[1] = new Bike("HONDA");

    for (Vehicle vehicle : vehicles) {
      System.out.println(vehicle.toString());
      vehicle.move();
    }
  }
}
