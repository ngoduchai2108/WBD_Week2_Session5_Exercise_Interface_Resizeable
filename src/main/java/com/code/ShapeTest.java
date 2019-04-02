package com.code;

public class ShapeTest {
    public static void main(String[] args) {
        //constructor with not parameters
        Shape shape = new Shape();
        System.out.println(shape);
        // constructor with parameters
        shape = new Shape("red",false);
        System.out.println(shape);
    }
}
