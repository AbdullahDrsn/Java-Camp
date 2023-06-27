package calismalar;

public class calisma1 {

    public static void enBuyukSayi() {
        int sayi1 = 50;
        int sayi2 = 46;
        int sayi3 = 48;
        int enBuyuk = sayi1;

        if (enBuyuk < sayi2) {
            if (sayi2 < sayi3) {
                System.out.println(sayi3);
            } else {
                System.out.println(sayi2);
            } //math.max() komutu yukarıdaki if else işlemini otomatik yapar. Onu da kullanabilirsin.
        } else {
            System.out.println(sayi1);
        }
    }

    public static void switchBloklari() {
        char grade = 'A';

        switch (grade) {


            case 'A':
                System.out.println("Mükooo");
                break;
            case 'B':
                System.out.println("iş yapar bro");
                break;
            case 'C':
                System.out.println("eh işte");
                break;
            case 'F':
                System.out.println("köyüne dön");
                break;
            default: //burada default belirtilen değerler hariç bir karakter belirtilirse diye kullanılır.
                System.out.println("Geçerli not gir lo");
                break;
                /*eğer birden fazla case de aynı sonuç istiyorsan alt alta yazabilirsin

                örn:
                        case 'C':
                        case 'F':
                System.out.println("köyüne dön");
                break;
                 */
        }
    }

}
