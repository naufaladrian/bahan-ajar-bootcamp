public class StarLv1 {
   static private void sayHello(){
        System.out.println("Hello World");
    }
    public static void main(String[] args) {

    StarLv1 meth = new StarLv1();
    meth.sayHello();


        for (int i= 1;i<=4;i++){

            for (int j=4;j>=i;j--){
                System.out.print(" ");
            }

            for (int j=1;j<=(i*2)-1;j++){
                System.out.print("*");
            }

            System.out.print("\n");
        }




    }
}
