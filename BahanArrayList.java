import java.util.ArrayList;

public class BahanArrayList {
    public static void main(String[] args) {
        String[] arr = new String[5]; //Array biasa statis
        arr[0]="item1";
        System.out.println("panjang arr biasa :"+arr.length);
        System.out.println(arr[0]);

        System.out.println("--------------------------------------------");

        ArrayList<String> arrProducts = new ArrayList<String>(); //ArrayList dinamis
        arrProducts.add("product1"); // add untuk tambah isi array
        arrProducts.add("product2");
        arrProducts.add(0,"productPertama");

        arrProducts.set(1,"sabun"); //set untuk mengubah isi array

        System.out.println(arrProducts.get(0)); //get untuk mendapat isi array

        arrProducts.remove(1); //menghapus isi dari index tertentu

        System.out.println("panjang arr list :"+arrProducts.size()); // size() mendapat ukuran array

        arrProducts.clear(); //menghapus semua isi array

        System.out.println("panjang arr list :"+arrProducts.size());

        for (String e : arrProducts){
            System.out.println(e);
        }



    }
}
