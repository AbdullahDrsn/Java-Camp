package miniProjeler;

public class miniProje3 {

    public static void mükemmelSayi() {
        int number = 496;
        int bölünenToplam = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                bölünenToplam = bölünenToplam + i;
            }
        }
        if (bölünenToplam == number) {
            System.out.println(number + " sayısı mükemmel sayıdır.");
        } else {
            System.out.println(number + " sayısı mükemmel sayı değildir.");
        }
    }
}