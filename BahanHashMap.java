import java.util.HashMap;

public class BahanHashMap {
    public static void main(String[] args) {

        HashMap<String,String> dummyObject= new HashMap<String,String>();
        dummyObject.put("name","naufal");
        dummyObject.put("address","semarang");

        System.out.println("name : "+dummyObject.get("name"));
        System.out.println("address : "+dummyObject.get("address"));

    }
}
