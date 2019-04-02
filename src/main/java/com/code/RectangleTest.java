package com.code;

public class RectangleTest extends Shape {
    public static void main(String[] args) {
        Rectangle[] rectangles = new Rectangle[3];
        rectangles[0] = new Rectangle();
        rectangles[1] = new Rectangle(2.3,4.5);
        rectangles[2] = new Rectangle("red",true,6.7,8.3);
        //Pre-resizeable
        System.out.println("Pre-resizeable");
        for (Rectangle rectangle:rectangles){
            System.out.println(rectangle);
        }
        //resizeable
        for (Rectangle rectangle:rectangles){
            rectangle.resize(50);
        }
        //after-resizeable
        System.out.println("After-resizeable");
        for (Rectangle rectangle:rectangles){
            System.out.println(rectangle);
        }
    }
}
