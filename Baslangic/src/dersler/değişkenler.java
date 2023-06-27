package dersler;

public class değişkenler {

    public static void degiskenTanimla()
    {
        //her zaman yorum satırı kullan!!
        String yazı = "Sa sa sa";
        System.out.println(yazı);
        //int maxint = 2147483647; //max tutabildiği sayı
        double asfadas = 20.6555555555555555555555555;
        System.out.println(asfadas);
        double dolarDun = 23.65;
        double dolarBugun = 23.63;
        boolean dolarDustuMu = true;
        dolarDustuMu = dolarDun < dolarBugun;
        String okYonu = "";
        if (dolarDustuMu) { //true
            okYonu = "down.svg";
            System.out.println(okYonu);
                            } else if (dolarBugun == dolarDun) {
            okYonu = "equal.svg";
            System.out.println(okYonu);
        }
        else {    //false
            okYonu = "up.svg";
            System.out.println(okYonu);
             }

    }
}
