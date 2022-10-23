import java.util.Scanner;

public class KDVTutarHesaplayanProgram {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        double fiyat, sonFiyat, tutarKDV , KDV = 1.8;


        System.out.print("Ürünün fiyatını giriniz: ");
        fiyat = inp.nextDouble();

        tutarKDV = fiyat * KDV / 10;
        sonFiyat = fiyat + tutarKDV;

        System.out.println("KDV'siz fiyat: " + fiyat);
        System.out.println("KDV'li fiyat: " + sonFiyat);
        System.out.println("KDV Tutarı: " + tutarKDV);

    }
}
