package MethodReferencesandContructorReferences;

public class ClassOne {
    public static void main(String[] args) {
        UpperCase upper = (name) -> {
            return name.toUpperCase();
        };

        String result = upper.covertToUppercase("Rahul");

        System.out.println(result);

        // Method reference (as toUpperCase() is an existing method we can use method references here)

                           // Re-using/executing a predefined method from String class
                           // assigning that method reference to class
        UpperCase upper2 = String::toUpperCase;
        String result2 = upper2.covertToUppercase("Using Method reference");
        System.out.println(result2);
    }
}
