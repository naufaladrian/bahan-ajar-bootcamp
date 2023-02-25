import classes.ProtectedClass;

public class ProtectedClassChild extends ProtectedClass{

    public static void main(String[] args) {

        ProtectedClassChild dummyObject = new ProtectedClassChild();

        dummyObject.ppublic1="test";
        dummyObject.protected1="test";
    }
}
