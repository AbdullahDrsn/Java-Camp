package miniProjeler;

public class miniProje2 {

    public static void sesliHarfler() {
        char harf = 'A';
        switch (harf) {
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Kalın sesli harf");
                break;
            default:
                System.out.println("İnce sesli harf");
        }
    }
}
