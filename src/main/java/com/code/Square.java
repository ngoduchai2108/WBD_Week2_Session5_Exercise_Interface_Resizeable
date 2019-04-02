package com.code;

public class Square extends Rectangle {
    Square() {
    }

    Square(double size) {
        super(size, size);
    }

    Square(String color_, boolean filled_, double size) {
        super(color_,filled_,size,size);
    }
    private double getSize(){
        return getWidth_();
    }
    private void setSize(double size){
        setWidth_(size);
        setHeight_(size);
    }
//
//    @Override
//    public void setWidth_(double width_) {
//        setSize(width_);
//    }

//    @Override
//    public void setHeight_(double height_) {
//        setSize(height_);
//    }

    @Override
    public void setWidth_(double width_) {
        super.setWidth_(width_);
    }

    @Override
    public void setHeight_(double height_) {
        super.setHeight_(height_);
    }

    @Override
    public String toString() {
        return "A Square with size = " +getSize() + ", which is subclass of "+ super.toString();
    }

    @Override
    public void resize(double percent) {
        setSize(getSize()*(1+percent/100));
    }
}
