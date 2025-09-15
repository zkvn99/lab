package org.example.study.week1.question1;

public class Bike extends Vehicle implements VehicleService {

  boolean hasCarrier;

  public Bike(String brand) {
    super(brand);
  }

  @Override
  public void move() {
    System.out.println("Bike is moving");
  }

  @Override
  public void startEngine() {
    System.out.println("Bike is starting");
  }

  @Override
  public void stopEngine() {
    System.out.println("Bike is stopping");
  }
}
