package MethodReferencesandContructorReferences;

public class ClassTwo {
    public static void main(String[] args) {

        // Static methods - accessed by class name
        EmployeeValidation valid = Employee::isAnValidEmployee;
        // Here it is static method that is why we are using classname::methodname;

        // validating employee details
        Employee emp = new Employee();
        emp.setID(1);
        emp.setName("Rahul");

        System.out.println(valid.isAnValidEmployee(emp));  // gives output as true

        Employee emp2 = new Employee();
        // i have not set any values for this employee

        System.out.println(valid.isAnValidEmployee(emp2));
    }
}
