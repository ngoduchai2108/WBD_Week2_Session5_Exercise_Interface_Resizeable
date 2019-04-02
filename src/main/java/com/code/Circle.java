package com.code;

public class Circle extends Shape implements Resizeable{
    private double radius_ = 1.0;

    Circle() {
    }

    Circle(double radius_) {
        this.radius_ = radius_;
    }

    Circle(String color_, boolean filled_, double radius_) {
        super(color_, filled_);
        this.radius_ = radius_;
    }

    private double getRadius_() {
        return radius_;
    }

    public void setRadius_(double radius_) {
        this.radius_ = radius_;
    }

    private double getArea(){
        return this.radius_*this.radius_*Math.PI;
    }

    private double getPerimeter(){
        return 2*Math.PI*radius_;
    }

    @Override
    public String toString() {
        return "A Circle with radius = "+ getRadius_()+",Area of Circle = "+getArea()+", Perimeter of Circle = "+getPerimeter()+" , Which is subclass of "+ super.toString();
    }

    @Override
    public void resize(double percent) {
        setRadius_(getRadius_()*(1+percent/100));
    }
}
