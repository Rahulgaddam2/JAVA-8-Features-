package FunctionalInterfaces;

import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {

        // requirement : age > 25 years or not (Condition)

        // here we are using Predicate functional interface which have an abstract method test
        Predicate<Integer> age = a -> a>25;

        boolean result = age.test(28); // test is the abstract method
        boolean result2 = age.test(11);

        System.out.println(result);
        System.out.println(result2);

        Predicate<Integer> salary = s -> s>25000;

        boolean result3 = salary.test(22000);

        System.out.println(result3);

        Employee emp = new Employee();

        emp.setId(1);
        emp.setSalary(2500000);
        emp.setName("Sushma");
        emp.setGender("female");
        Employee emp2 = new Employee();
        emp2.setId(2);
        emp2.setSalary(25000000);
        emp2.setName("Rahul");
        emp2.setGender("male");

        Predicate<Employee> salaryTest = employee -> emp.getSalary() > 25000;

        boolean test = salaryTest.test(emp);

        System.out.println(test);

        // salary should be greater than 25000 and the employee should be female (here we can we and default method from predicate interface)
        Predicate<Employee> femaleCheck = employee ->
                employee.isGender().equalsIgnoreCase("female");


        boolean result5 = salaryTest.and(femaleCheck).test(emp);

        System.out.println(result5);

        // Here I am using or default method
        boolean result6 = salaryTest.or(femaleCheck).test(emp2);

        System.out.println(result6);

        // here I am using negate default method where if the result is true it becomes false and if its false it becomes true

        boolean result7 = salaryTest.negate().test(emp);

        System.out.println(result7);

    }
}
