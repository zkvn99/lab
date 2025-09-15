package org.example.study.week1.question2;

import org.example.study.week1.question1.Vehicle;

public class Rectangle extends Shape implements Resizable {

  int width;
  int height;

  public Rectangle(String color) {
    super(color);
  }

  public Rectangle(int width, int height, String color) {
    super(color);
    this.width = width;
    this.height = height;
  }

  @Override
  public void draw() {
    System.out.println("Draw Rectangle");
  }

  @Override
  public void resize(double factor) {
    System.out.println("Resize Rectangle");
    System.out.println("width: " + this.width);
    System.out.println("height: " + this.height);
    this.width = (int) (factor * this.width);
    this.height = (int) (factor * this.height);
    System.out.println("width: " + this.width);
    System.out.println("height: " + this.height);
  }
}
