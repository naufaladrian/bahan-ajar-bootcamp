package classes;

public class ClassImplents implements MethodInterface{
    @Override
    public void driver(String name) {
        System.out.println("Hello "+name);
    }

    @Override
    public int tier() {
        return 4;
    }
}
