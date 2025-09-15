package org.example.study.week1.question1;

public abstract class Vehicle {
  public String brand;

  public Vehicle(String brand) {
    this.brand = brand;
  }

  @Override
  public String toString() {
    return "브랜드 : " + brand;
  }

  public abstract void move();
}
