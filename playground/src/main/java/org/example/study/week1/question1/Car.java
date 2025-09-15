package org.example.study.week1.question1;

public class Car extends Vehicle implements VehicleService{

  public int numberOfDoors;

  public Car(String brand) {
    super(brand);
  }

  @Override
  public void move() {
    System.out.println("Car is moving");
  }

  @Override
  public void startEngine() {
    System.out.println("Car is starting");
  }

  @Override
  public void stopEngine() {
    System.out.println("Car is stopping");
  }
}
