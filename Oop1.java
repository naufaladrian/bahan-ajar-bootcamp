import classes.*;


public class Oop1 {
    public static void main(String[] args) {

//        ClassPrivate objectPrivate = new ClassPrivate();
//        objectPrivate.setName("naufal"); //mengubah value "name"
//        System.out.println(objectPrivate.getName());
//
//        objectPrivate.ubahSaldo(10000);
//        System.out.println(objectPrivate.getSaldo());

        Interface2 interface2 = new ClassImplementInterface2();
        interface2.displayHello();
        System.out.println(interface2.addName());

        interface2.greet("naufal");

    }
}

