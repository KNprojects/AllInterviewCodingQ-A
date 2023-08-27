package main.java.PrototypePattern;


import java.util.Hashtable;

//class to get the concrete classes from the database
public class ShapeCache {

    private static Hashtable<String,Shape> shapeMap=new Hashtable<String,Shape>();

    public static Shape getShape(String shapeID){
        Shape cachedShape=shapeMap.get(shapeID);
        return (Shape) cachedShape.clone();
    }

    /* for each shape run database query and create shape
     shapeMap.put(shapeKey, shape);
     for example, we are adding three shapes
*/
    public static void loadCache(){
        Circle circle=new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(),circle);


        Square square=new Square();
        square.setId("2");
        shapeMap.put(square.getId(),square);

        Rectangle rectangle=new Rectangle();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(),rectangle);


    }


}
