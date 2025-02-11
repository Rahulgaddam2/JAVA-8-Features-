package DefaultStaticMethodsinInterfaces.StaticMethods;

public class StaticClassOne  {
    public static void main(String[] args) {
        Implementation StaticMethod = new Implementation();

        InterfaceOne.staticMethodOne(); // Here we called using the interface name not the class object
        InterfaceOne.staticMethodTwo(); // we can not access the static methods with the class object
    }
}
