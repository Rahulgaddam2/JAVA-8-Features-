package MethodReferencesandContructorReferences;

import java.util.Arrays;

public class ClassFour {
    public static void main(String[] args) {
        String[] names = {"rahul" , "yashwanth" ,"vishnu" ,"test" , "adhvay"};

        // here i used lambda expression
        Arrays.sort(names , (a,b) -> a.compareToIgnoreCase(b));
        // (a,b) -> a.compareToIgnoreCase(b) this is comparator (we can use lambda expression here )

        System.out.println(Arrays.toString(names));

        // now we will use method references

        Integer[] score = {1,45,78,90,23,6,0,65,23,78};

        // here I used method reference rather than lambda expression
        Arrays.sort(score , Integer::compareTo);

        for(Integer val : score){
            System.out.println(val);
        }

        // Employee employee = new Employee();
        // Using Constructor Reference to create Employee instances
        // Employee::new refers to Employee(int, String) constructor
        GetEmployeeInstance employee = Employee::new;

        //Calling getEmployee() which internally calls the constructor Employee(int, String)
        Employee emp = employee.getEmployee(3,"Rahul");

        System.out.println(emp.getID());
        System.out.println(emp.getName());

        // example with single parameter constructor

        GetEmployeeInstanceTwo employeeTwo = Employee::new;
        Employee emp2 = employeeTwo.getEmployeeTwo(4);

        System.out.println(emp2.getID());




    }
}
