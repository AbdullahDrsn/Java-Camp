package calismalar;

public class calisma2 {

    public static void arrayÇalışması() {
        double[] sayılar = {1.2, 10.3, 5.6, 8.5};
        double total = 0;
        double max = sayılar[0];
        for (double sayı : sayılar) {
            total = total + sayı;
            System.out.println(sayı);
            if (max < sayı) {
                max = sayı;
            }
        }
        System.out.println(total);
        System.out.println(max);
    }

    public static void çokBoyutluArrayÇalışması() {
        String[][] şehirler = new String[3][3];

        şehirler[0][0] = "İstanbul";
        şehirler[0][1] = "Bursa";
        şehirler[0][2] = "Balıkesir";
        şehirler[1][0] = "Ankara";
        şehirler[1][1] = "Konya";
        şehirler[1][2] = "Kayseri";
        şehirler[2][0] = "Diyarbakır";
        şehirler[2][1] = "Şanlıurfa";
        şehirler[2][2] = "Gaziantep";

        for (int i = 0; i <= 2; i++) {
            System.out.println("----------------------");
            for (int j = 0; j <= 2; j++) {
                System.out.println(şehirler[i][j]);
            }
        }
    }
}
