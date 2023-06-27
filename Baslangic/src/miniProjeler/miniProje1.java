package miniProjeler;

public class miniProje1 {

    public static void asalSayi() {
        int number = 23;
        // int remainder = number % 2;
        boolean asal = true;

        if (number == 1) {
            System.out.println(number + " sayısı asal değildir.");
            return;
        }

        if (number < 1) {
            System.out.println("Geçersiz sayı");
            return;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                asal = false;
                break;
            }
        }
        if (asal) {
            System.out.println(number + " asal sayıdır.");
        } else {
            System.out.println(number + " asal sayı değildir.");
        }

    }
}


