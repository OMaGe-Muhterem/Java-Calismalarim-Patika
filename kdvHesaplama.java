import java.util.Scanner;

public class kdvHesaplama {
    public static void main(String[] args) {

        Scanner giris = new Scanner(System.in);
        System.out.println("Ürünün fiyatını giriniz: ");

        int urun_fiyat = giris.nextInt();

        Double kdv = urun_fiyat >= 1000 ? 0.08 : 0.18;
        Double kdvli_fiyat = urun_fiyat * (1 + kdv);
        String sonuc = "KDV siz fiyatı " + urun_fiyat + " TL olan ürünün \n(KDV oranı : "
                + kdv + ") \nKDV li fiyatı = " + kdvli_fiyat + " TL dir.";
        System.out.println(sonuc);
    }
}