package dersler;

public class döngüler {

    public static void forDongusu() {

        for (int i = 1; i < 10; i++) { //i++ 1 er 1 er artırıyor mesela ikişer ikişer artırmak istesek i+=2 diyebiliriz.
            System.out.println(i);
        }
        System.out.println("döngü bitti");
    }

    public static void whileDongusu() {
        int i=1;
        while ( i<10){
            System.out.println(i);
            i++; //döngü içerisinde nasıl ilerlemek istediğimizi yazarız. Burada birer birer arttır dedik.
        }
        System.out.println("döngü bitti");
    }

    public static void doWhileDongusu() {
       int j=100;
        do { //burada while daki koşul sağlanmasa bile do içerisindeki ilk işlem gerçekleştirilir.
                System.out.println(j);
                j++;
        }while ( j<10);
        System.out.println("döngü bitti");
    }
}

