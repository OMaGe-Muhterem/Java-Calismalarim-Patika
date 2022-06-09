import java.util.Scanner;

public class NotOrtalamaHesapla {

    public static void main(String[] args) {


        int matematik, turkce, kimya, fizik;

        Scanner not_gir = new Scanner(System.in);
        System.out.println("Matematik Notu: ");
        matematik = not_gir.nextInt();

        System.out.println("Türkçe Notu: ");
        turkce = not_gir.nextInt();

        System.out.println("Kimya  Notu: ");
        kimya = not_gir.nextInt();

        System.out.println("Fizik Notu: ");
        fizik = not_gir.nextInt();

        Double ortalama = (matematik + turkce + kimya + fizik)/4.0;
        String sonuc = "Matematik: " + matematik + "\n" +
                "Türkçe: " + turkce + "\n" +
                "Kimya: " + kimya + "\n" +
                "Fizik: " + fizik + "\n" + "yukarıdaki notlarınızın ortalaması = " + ortalama + " olup bu sonuca göre;";
        System.out.println(sonuc);
        String karne = ortalama >= 55 ? "Sınıfı geçtiniz..." : "Malesef kaldınız...";
        System.out.println(karne);
    }
}