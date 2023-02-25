public class BahanEquals {
    public static void main(String[] args) {
        int angkaPrimitif1 = 5;
        int angkaPrimitif2 = 5;

        System.out.println("perbandingan biasa : "+(angkaPrimitif1==angkaPrimitif2));

        String kata1 = "Gajah";
        kata1 += " Africa";
        System.out.println(kata1);
        System.out.println("perbandingan string \"==\" "+(kata1=="Gajah Africa")); //membaca var hanya saat deklarasi
        System.out.println("perbandingan string \"equals\" "+kata1.equals("Gajah Africa"));//membaca perubahan terakhir
    }
}
