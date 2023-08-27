package main.java.SingletonDesignPatternExmp;

public class SingleObject {

    //create an object for singleObject
    private static  SingleObject singleObject=new SingleObject();

    //make a constructor as private so this class can not be initatiated
    private  SingleObject(){
        //Constructor
    }

    //get the only object
    public static SingleObject getInstance(){
        return  singleObject;
    }

    public void showMessage(){
        System.out.println("Hellow World!!!");
    }



}
