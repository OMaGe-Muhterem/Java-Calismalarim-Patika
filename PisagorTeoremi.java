import java.util.Scanner;

public class PisagorTeoremi {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        System.out.print("1. dik kenar uzunluğu: ");
        int dik_kenar1 = giris.nextInt();
        System.out.print("2. dik kenar uzunluğu: ");
        int dik_kenar2 = giris.nextInt();
        Double hipotenus = Math.sqrt(dik_kenar1 * dik_kenar1 + dik_kenar2 * dik_kenar2);
        String sonuc = "Dik kenar uzunlukları: " + dik_kenar1 + " ve " + dik_kenar2 +
        " olan \nüçgenin hipotenüs uzunluğu = " + hipotenus;
        System.out.println(sonuc);
    }
}
