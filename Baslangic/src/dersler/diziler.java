package dersler;

import java.util.Arrays;

public class diziler {

    public static void arrays () {
        String öğrenci1 = "Abdullah";
        String öğrenci2 = "Ahmet";
        String öğrenci3 = "Mehmet";

        System.out.println(öğrenci1);
        System.out.println(öğrenci2);
        System.out.println(öğrenci3);
    }

    public static void arraysKolayYazımı () {
        String[] öğrenciler = new String[3];
        öğrenciler[0] ="Abdullah";
        öğrenciler[1] ="Ahmet";
        öğrenciler[2] ="Mehmet";

        for (int i=0; i<öğrenciler.length;i++){
            System.out.println(öğrenciler[i]);
        }
       // System.out.println(Arrays.toString(öğrenciler));  // Array içerisinde hepsini yanyana yazdırmak istersen bunu kullanabilirsin. Ya da  System.out.print(öğrenciler[i]+", "); bu şekilde


       /* for (String öğrenci:öğrenciler){
            System.out.println(öğrenci); */ //buradaki for döngüsü yukarıdaki ile aynı işi yapar. Burada öğrenci diyerek öğrenciler arrayi içerisindeki her bir elemanı keseriz. ve onları tek tek for döngüsü içerisinde yazdırırız.
        }
    }


