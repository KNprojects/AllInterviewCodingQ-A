package main.java.CollectionsProg;

public class Vector {

    public static void main(String[] args) {
        //Object Creation
        java.util.Vector v1=new java.util.Vector();
        v1.add("ravi");
        v1.add("qqe");
        v1.add(" ");
        v1.add("10");
        v1.add(0,"ravi");
        v1.add(1,"qqe");
        v1.add(2,"ravi");
        v1.add(3,"qqe");
        v1.add("AA");
        v1.add("SS");

        v1.contains("ravi");
        System.out.println("========================");
        v1.iterator();

        System.out.println(v1);
        System.out.println("size"+v1.size());
        System.out.println("size"+v1.capacity());
    }
}
