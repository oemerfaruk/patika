import java.util.Scanner;

public class VucutKitleIndeksi {
    public static void main(String[] args) {
        float boy, kilo,indeks;

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz: ");
        boy = input.nextFloat();

        System.out.print("Lütfen kilonuzu giriniz: ");
        kilo = input.nextFloat();

        indeks = kilo / (boy * boy);
        System.out.print("Vücut Kitle İndeksiniz: " + indeks);
    }
}
