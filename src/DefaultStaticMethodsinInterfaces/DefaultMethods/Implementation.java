package DefaultStaticMethodsinInterfaces.DefaultMethods;

public class Implementation implements DefaultInterface {
    @Override
    public void printNames() {
        System.out.println("Rahul");
    }

    @Override
    public int getPhoneNumbers() {
        defaultMethod(); // we can access the defaultMethod from the implement class directly
        return 0;
    }

    public void defaultMethod(){
        System.out.println("I have override the method");
    }
}
