package classes;

public  class ClassParent {
    String fieldParent1 = "fieldParent1";
    String fieldParent2= "fieldParent2";
//    Method ini tidak bisa di override
    final public void sayHello(){
        System.out.println("Hello World from class parent");
    };
}
