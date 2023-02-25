package classes;

public interface Interface2 {

    void displayHello();
    String addName();

    default void greet(String nama){
        System.out.println("Selamat pagi "+nama);
    }

}
