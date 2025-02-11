package DefaultStaticMethodsinInterfaces.DefaultMethods;

public class DefaultClass1 {
    
    public static void main(String[] args){

       Implementation Default = new Implementation();
       // we can call the default methods using implemented class
       Default.defaultMethod();
       int value = Default.addNumbers();
       System.out.println(value);



    }
}
