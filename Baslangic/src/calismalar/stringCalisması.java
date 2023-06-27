package calismalar;

public class stringCalisması {

    public static void stringler() {
        String mesaj = "Bugün hava çok güzel.";

        /* System.out.println(mesaj);

        System.out.println("Eleman sayısı : " +mesaj.length()); //toplam karakter sayısını verir

        System.out.println("5.eleman : " +mesaj.charAt(4)); //5.sıradaki charı verir. 4 yazmasının sebebi 0'dan başlamış olması

        System.out.println(mesaj.concat("Yaşasın!")); // Anlık olarak yazıyı ve sonrasına eklemek istediğimizi yazıyoruz.

        System.out.println(mesaj.startsWith("B")); // True false döndürür. Stringin ne ile başladığına bakar. Küçük büyük harfe duyarlıdır.
        System.out.println(mesaj.endsWith("."));   // True false döndürür. Stringin ne ile bittiğine bakar. Küçük büyük harfe duyarlıdır.

        char[] karakterler =new char[5];
        mesaj.getChars(0,5,karakterler,0); //Stringteki belirli bir kısmı almak için kullanırız. Sık kullanılan bir işlem değil.
        System.out.println(karakterler);

        System.out.println(mesaj.indexOf("av")); //aradığımız karakterin ilk kaçıncı sırada kullanıldığına bakar. Aramaya soldan başlar.
        System.out.println(mesaj.lastIndexOf('a')); //aradığımız karakterin ilk kaçıncı sırada kullanıldığına bakar. Aramaya sağdan başlar.
     */
        System.out.println(mesaj.replace("gün"," ay")); //String içerisindeki ifadeyi belirlediğimiz ifade ile değiştirir.

        String yeniMesaj =mesaj.replace("gün","ay"); //Bu şekilde yeni mesaj kaydedilir. İstediğimiz zaman değişkeni kullanabiliriz.
        System.out.println(yeniMesaj);

        System.out.println(mesaj.substring(2,5)); //mesajı 0 dan başlayarak charlara böler ve belirttiğimiz yerden öncesini keserek kalanı ekrana yazdırır. 0 dan başlar. buradaki örnekte 2 den başlıyor 5 te kesiyor.


        for (String kelime : mesaj.split(" ")){
            System.out.println(kelime);
        }; //Burada split işlemi bizim Stringimizde ilgili yerlerden parçalama işlemi yapar.


        System.out.println(mesaj.toLowerCase()); //bütün harfleri küçük harfe çevirir.
        System.out.println(mesaj.toUpperCase()); //bütün harfleri büyük harfe çevirir.

        System.out.println(mesaj.trim()); //baştaki ve sondaki boşlukları atar.
    }

}
