package com.code;

public class CircleTest extends Circle implements Resizeable{
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle();
        circles[1] = new Circle(2.3);
        circles[2] = new Circle("red",true,3.4);
        //pre-resizeable
        System.out.println("Pre-resizeable: ");
        for (Circle circle:circles){
            System.out.println(circle);
        }
        //resizeable
        for (Circle circle:circles){
            circle.resize(50);
        }
        //after-resizeable
        System.out.println("After-resizeable: ");
        for (Circle circle:circles){
            System.out.println(circle);
        }
    }
}
