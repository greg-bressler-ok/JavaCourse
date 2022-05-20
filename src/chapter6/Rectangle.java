package chapter6;

public class Rectangle {
    //this is a Blueprint, thus we are NOT calling methods defined here
    //as such, there is no MAIN method
    private double length;
    private double width;

    public Rectangle(){
        length = 0;
        width = 0;
    }

    public Rectangle(double length, double width){
        //can be set this way
        this.length = length;

        //or can be set this way. these are only different here to demo alternative options
        setWidth(width);
    }

    public double getLength(){
        return length;
    }

    public void setLength(double length){
        this.length = length;
    }

    public double getWidth(){
        return width;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public double calculatePerimeter(){
        return (2 * length) + (2 * width);
    }

    public double calculateArea(){
        return length * width;
    }
}