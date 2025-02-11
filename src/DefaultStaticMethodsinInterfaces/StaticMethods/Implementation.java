package DefaultStaticMethodsinInterfaces.StaticMethods;

public class Implementation implements InterfaceOne{

    @Override
    public void printNames() {
        InterfaceOne.staticMethodTwo();
        InterfaceOne.staticMethodTwo();
        System.out.println("Rahul");
    }
}
