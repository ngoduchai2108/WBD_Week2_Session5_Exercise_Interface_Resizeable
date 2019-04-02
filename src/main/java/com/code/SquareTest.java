package com.code;

public class SquareTest {
    public static void main(String[] args) {
        Square[] squares = new Square[3];
        squares[0] = new Square();
        squares[1] = new Square(2.3);
        squares[2] = new Square("red",true,4.5);
        //pre-resizeable
        System.out.println("Pre-resizeable:");
        for (Square square:squares){
            System.out.println(square);
        }
        //resizeable
        for (Square square:squares){
            square.resize(50);
        }
        //after-resizeable
        System.out.println("After-resizeable:");
        for (Square square:squares){
            System.out.println(square);
        }
    }
}
