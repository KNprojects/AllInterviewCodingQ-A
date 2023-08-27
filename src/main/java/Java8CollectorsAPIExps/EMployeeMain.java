package main.java.Java8CollectorsAPIExps;

import java.util.*;
import java.util.stream.Collectors;

import java.util.stream.Collectors.*;

public class EMployeeMain {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(100, "Sundar", 47, "North America", 450000));
        employeeList.add(new Employee(200, "Pichai", 25, "North America", 50000));
        employeeList.add(new Employee(300, "Larry", 30, "Asia", 450000));
        employeeList.add(new Employee(400, "Page", 59, "Africa", 450000));

        //Collect the all employee details using Collectors.tolist()
        List<String> nameList = employeeList.stream().map(e -> e.getName()).collect(Collectors.toList());
        System.out.println(" Employee dtails bye their names using the toList() ::" + nameList);

        //toSet() collector is used for collecting all Stream elements into a Set instance.
        //Example to collect all the regions into Set.

        Set<String> empRegion = employeeList.stream().map(e -> e.getRegion()).collect(Collectors.toSet());
        System.out.println("regions into Set Using toSet() ::" + empRegion);

       /* toUnmodifiableSet() method works similar to the toSet() but this set can not be modified.
        The returned collector does not allow null values.
         Set<Double> unmodifiedSet = employeeList.stream().map(e -> e.getSal()).collect(Collectors.toUnmodifiableSet());
        System.out.println(unmodifiedSet);*/


        //collect the names into LinkedList as opposed to default List implementation.
        List<String> namesLinkedList = employeeList.stream().map(e -> e.getName()).collect(Collectors.toCollection(LinkedList::new));
        System.out.println(namesLinkedList);    //o/p-  1[Sundar, Pichai, Larry, Page]

        //Collect the region into treeset o/p will get in the sorted order
        Set<String> religionTreeSet = employeeList.stream().map(e -> e.getRegion()).collect(Collectors.toCollection(TreeSet::new));
        System.out.println(religionTreeSet); //o/p- [Africa, Asia, North America]



    }
}