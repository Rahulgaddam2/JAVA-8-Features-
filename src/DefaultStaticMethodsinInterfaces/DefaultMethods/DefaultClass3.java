package DefaultStaticMethodsinInterfaces.DefaultMethods;

public class DefaultClass3 {
    public static void main(String[] args) {
        Implementation2 Default = new Implementation2();

        Default.getPhoneNumbers();
        Default.defaultMethod();
        Default.DefaultMethodTwo();// we can access all the defaults methods from different Interfaces which are implemented by one class

        Default.methodthree();
    }
}
