import classes.*;


public class Oop1 {
    public static void main(String[] args) {

        //membuat object dari class ClassPrivate
        ClassPrivate objectPrivate = new ClassPrivate();
        //mengubah value "name"
        objectPrivate.setName("naufal");
        //mendapat value "name" lalu ditampilkan
        System.out.println(objectPrivate.getName());
        //mengubah value "saldo"
        objectPrivate.setSaldo(10000);
        //mendapat value "name" lalu ditampilkan
        System.out.println(objectPrivate.getSaldo());

        //membuat object dari class Class ClassImplementInterface2
        ClassImplementInterface2 interface2 = new ClassImplementInterface2();
        interface2.displayHello();
        System.out.println(interface2.addName());
        interface2.greet("naufal");


        // object dari outer class "BahanInnerClass"
        BahanInnerClass objectTest = new BahanInnerClass();
        objectTest.company="PT XYZ";
        // object dari inner class "Employee"
        BahanInnerClass.Employee karyawan = objectTest.new Employee();
        karyawan.name="naufal";

    }
}

