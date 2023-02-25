package classes;

public abstract class ClassChild extends ClassParent {
    public String karyawan ;
    public String address;

    public ClassChild(String karyawan, String address) {
        this.karyawan = karyawan;
        this.address = address;
    }

    public ClassChild() {
    }

    public void sayHello(){
        System.out.println("child 1");
    }

    @Override
    public String toString() {
        return "ClassChild{" +
                "karyawan='" + karyawan + '\'' +
                ", address='" + address + '\'' +
                ", fieldParent1='" + fieldParent1 + '\'' +
                ", fieldParent2='" + fieldParent2 + '\'' +
                '}';
    }
}
