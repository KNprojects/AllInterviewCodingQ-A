package main.java.EncapsulationExample;

public class Employee {
/*
   *Encapsulation describes the ability of hiding data and methods of object.
   * we set all fields of class as private, so no other code outside
    of this class can not access private variables.
   *By using getter methods, we can make read-only and wise versa for write-only.
*/

    private String name;
    private String location;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
