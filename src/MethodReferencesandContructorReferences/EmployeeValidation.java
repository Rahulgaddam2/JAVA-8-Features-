package MethodReferencesandContructorReferences;

@FunctionalInterface
public interface EmployeeValidation {

    // taking employee details and checking id and name if he/she is available or not
    boolean isAnValidEmployee(Employee employee);
}
