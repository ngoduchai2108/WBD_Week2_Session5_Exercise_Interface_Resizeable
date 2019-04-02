package com.code;

public class Rectangle extends Shape implements Resizeable{
    private double width_;
    private double height_;

    public Rectangle() {
    }

    public Rectangle(double width_, double height_) {
        this.width_ = width_;
        this.height_ = height_;
    }

    public Rectangle(String color_, boolean filled_, double width_, double height_) {
        super(color_, filled_);
        this.width_ = width_;
        this.height_ = height_;
    }

    public double getWidth_() {
        return width_;
    }

    public void setWidth_(double width_) {
        this.width_ = width_;
    }

    public double getHeight_() {
        return height_;
    }
    public void setHeight_(double height_) {
        this.height_ = height_;
    }

    public double getArea(){
        return width_* height_;
    }

    public double getPrimeeter(){
        return 2*(width_+height_);
    }

    @Override
    public String toString() {
        return "A Rectangle with width = "+ getWidth_()+", height_ = "+ getHeight_()+", Which is a subclass of "+ super.toString();
    }


    @Override
    public void resize(double percent) {
        setWidth_(getWidth_()*(1+percent/100));
        setHeight_(getHeight_()*(1+percent/100));
    }
}
