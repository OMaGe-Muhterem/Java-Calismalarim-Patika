import java.util.Scanner;

public class DaireCevreAlan {
    public static void main(String[] args) {

        Scanner giris = new Scanner(System.in);
        double pi = 3.14;
        System.out.print("Dairenin yarıçapı = ");
        double yaricap = giris.nextDouble();
        System.out.print("Daire diliminin merkez açısı = ");
        double alfa = giris.nextDouble();
        double cevre = 2 *pi * yaricap;
        double alan = pi * yaricap * yaricap;
        String sonuc = "Yarıçapı " + yaricap + " br olan tüm dairenin çevresi : " + cevre +
        "\nmerkez açısı " + alfa + " derece olan (tüm alan : " + alan +
        ")\n daire diliminin alanı : " + alan * alfa / 360.0;
        System.out.println(sonuc);
    }
}
