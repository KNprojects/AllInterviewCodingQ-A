package main.java.PrototypePattern;



public class ProtoTypeDemoMain {

    //this class usses the ShapeCache to get the clone of the shapes and store in HashTable
    public static void main(String[] args) {
    ShapeCache.loadCache();
        Shape cloneShape1 = (Shape) ShapeCache.getShape("1");
        System.out.println("Shape::" + cloneShape1.getType());

        Shape cloneShape2 = (Shape) ShapeCache.getShape("2");
        System.out.println("Shape::" + cloneShape2.getType());

        Shape cloneShape3 = (Shape) ShapeCache.getShape("3");
        System.out.println("Shape::" + cloneShape3.getType());

    }

}
