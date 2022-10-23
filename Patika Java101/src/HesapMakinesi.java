import java.util.Scanner;
public class HesapMakinesi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select, n1, n2;

        System.out.print("İki sayıyla işlem yapan hesap makinesi.\n\nİşlemler;\nToplama --> 1\nÇıkarma --> 2\nÇarpma --> 3\nBölme --> 4\n\nBir işlem seçiniz: ");
        select = scan.nextInt();

        System.out.print("Birinci sayıyı giriniz: ");
        n1 = scan.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        n2 = scan.nextInt();

        switch (select){
            case 1:
                // toplama
                System.out.println("Toplam: " + (n1 + n2));
                break;
            case 2:
                // çıkarma
                System.out.println("Çıkarma: " + (n1 - n2));
                break;
            case 3:
                // çarpma
                System.out.println("Çarpım: " + (n1 * n2));
                break;
            case 4:
                // bölme
                System.out.println("Bölüm: " + (n1 / n2));
                break;
        }
    }
}
