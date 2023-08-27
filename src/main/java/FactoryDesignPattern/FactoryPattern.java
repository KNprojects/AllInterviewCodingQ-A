package main.java.FactoryDesignPattern;

public class FactoryPattern {

    public static void main(String[] args) {
    ShapeFactory shapeFactory=new ShapeFactory();

    //get an object of the circal and call its draw method
    Shape shape1= shapeFactory.getShape("CIRCLE");

    //call draw method of circle
        shape1.draw();


        //get an object of the Rectangle and call its draw method
        Shape shape2= shapeFactory.getShape("RECTANGLE");

        //call draw method of circle
        shape2.draw();


        //get an object of the Square and call its draw method
        Shape shape3= shapeFactory.getShape("SQUARE");

        //call draw method of circle
        shape3.draw();


    }



}
