package org.example.study.week1.question2;

public class Circle extends Shape implements Resizable {

  int radius;

  public Circle(String color) {
    super(color);
  }

  public Circle(int radius, String color) {
    super(color);
    this.radius = radius;
  }

  @Override
  public void draw() {
    System.out.println("Draw Circle");
  }

  @Override
  public void resize(double factor) {
    System.out.println("Resize Circle");
    System.out.println("before radius: " + this.radius);
    this.radius = (int) (factor * this.radius);
    System.out.println("after radius: " + this.radius);
  }
}
