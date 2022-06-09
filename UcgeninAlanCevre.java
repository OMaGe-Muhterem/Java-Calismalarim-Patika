import java.util.Scanner;

public class UcgeninAlanCevre {
    public static void main(String[] args) {

        Scanner giris = new Scanner(System.in);
        System.out.print("1. kenar uzunluğu: ");
        Double kenar1 = giris.nextDouble();
        System.out.print("2. kenar uzunluğu: ");
        Double kenar2 = giris.nextDouble();
        System.out.print("3. kenar uzunluğu: ");
        Double kenar3 = giris.nextDouble();
        Double cevre = kenar1 + kenar2 + kenar3;
        Double u_hesapla = cevre / 2;
        Double alan = Math.sqrt((u_hesapla * (u_hesapla - kenar1) * (u_hesapla - kenar2) * (u_hesapla - kenar3)));
        String sonuc = "Kenar uzunlukları: " + kenar1 + " , " + kenar2 + " ve " + kenar3 +
                " olan \nüçgenin çevre uzunluğu = " + cevre +
                "\nüçgenin alanı = " + alan;
        System.out.println(sonuc);
    }
}
