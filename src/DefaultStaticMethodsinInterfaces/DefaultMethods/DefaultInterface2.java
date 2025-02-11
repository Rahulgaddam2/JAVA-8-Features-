package DefaultStaticMethodsinInterfaces.DefaultMethods;

public interface DefaultInterface2 {

    default void DefaultMethodTwo(){
        System.out.println("This is the 2nd Interface with contains an other default method");
    }

    default void methodthree(){
        System.out.println("i am method 3 in interface two");
    }
}
