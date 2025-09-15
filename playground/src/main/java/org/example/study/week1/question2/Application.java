package org.example.study.week1.question2;

public class Application {

  public static void main(String[] args) {
    Circle circle = new Circle(15, "red");
    Rectangle rectangle = new Rectangle(20, 15, "blue");

    circle.draw();
    rectangle.draw();
    circle.resize(4);
    rectangle.resize(4);
  }
}
