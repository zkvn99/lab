package org.example;

import java.util.HashMap;
import org.example.study.week1.question1.Bike;
import org.example.study.week1.question1.Car;
import org.example.study.week1.question1.Vehicle;
import org.example.study.week1.question5.Book;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Book> books = new HashMap<>();
        books.put("book1", new Book("book1", "book 1"));
    }
}