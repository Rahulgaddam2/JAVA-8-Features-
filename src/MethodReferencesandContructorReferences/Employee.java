package MethodReferencesandContructorReferences;

public class Employee {

    private int ID;
    private String name;
    private int rollNumber;
    private double salary;

    public Employee() {
        System.out.println("This is employee constructor with no data");
    }

    public Employee(int ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    public Employee(int ID){
        this.ID = ID;
    }

    //Static Method
    static boolean isAnValidEmployee(Employee employee){

        if(employee.getID() != 0 && employee.getName() != null){
            System.out.println("Employee is available");
            return true;
        }else {
            System.out.println("Employee is not available");
        }

        return false;
    }

    // instance method
    public boolean isTheEmployeeIsSeniorOrNot(Employee employee){
        int seniorSalary = 80000;
        if(employee.getSalary() > seniorSalary){
            System.out.println("He is an senior employee");
            return true;
        }else {
            System.out.println("he is an junior employee");
        }
        return false;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }




}
