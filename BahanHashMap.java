import java.util.HashMap;

public class BahanHashMap {
    public static void main(String[] args) {

        HashMap<String,String> dummyObject= new HashMap<String,String>();
        dummyObject.put("name","naufal"); //menambah properties/key dan value
        dummyObject.put("address","semarang");

        System.out.println("name : "+dummyObject.get("name")); //mendapat value dari key tertentu
        System.out.println("address : "+dummyObject.get("address"));

        System.out.println("full isi dummyObject : "+dummyObject); //mendapat semua isi

    }
}
