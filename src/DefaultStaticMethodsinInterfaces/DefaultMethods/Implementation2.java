package DefaultStaticMethodsinInterfaces.DefaultMethods;

public class Implementation2 implements DefaultInterface, DefaultInterface2 {
    @Override
    public void printNames() {

    }

    @Override
    public int getPhoneNumbers() {
        return 0;
    }

    public void methodthree(){
        DefaultInterface.super.methodthree();
        DefaultInterface2.super.methodthree();
    }


}
