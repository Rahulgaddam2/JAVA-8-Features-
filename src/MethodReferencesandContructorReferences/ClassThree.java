package MethodReferencesandContructorReferences;

public class ClassThree {
    public static void main(String[] args) {

        // If we have an instance method we need to create an object of the class where the abstract method is present
        Employee employee = new Employee();

        // Now use the object name - objectname::methodname;
        SeniorValidation senior = employee::isTheEmployeeIsSeniorOrNot;

        Employee emp1 = new Employee();
        emp1.setSalary(81000);

        System.out.println(senior.isTheEmployeeIsSeniorOrNot(emp1));

        Employee emp2 = new Employee();
        emp2.setSalary(20000);

        System.out.println(senior.isTheEmployeeIsSeniorOrNot(emp2));
    }
}
