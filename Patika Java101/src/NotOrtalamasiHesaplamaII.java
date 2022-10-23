import java.util.Scanner;

public class NotOrtalamasiHesaplamaII {
    public static void main(String[] args) {
        // Değişkenleri oluştur
        int mat, fizik, kimya, turkce, tarih, muzik;


        // Scanner sınıfımızı tanımladık
        Scanner inp = new Scanner(System.in);

        // Kullanıcıdan değer al
        System.out.print("Matematik notunuz: ");
        mat = inp.nextInt();

        System.out.print("Fizik notunuz: ");
        fizik = inp.nextInt();

        System.out.print("Kimya notunuz: ");
        kimya = inp.nextInt();

        System.out.print("Türkçe notunuz: ");
        turkce = inp.nextInt();

        System.out.print("Tarih notunuz: ");
        tarih = inp.nextInt();

        System.out.print("Müzik notunuz: ");
        muzik = inp.nextInt();


        int toplam = 0, count = 0;
        if(mat > 0 && mat < 100){
            toplam += mat;
            count += 1;
        }
        if(fizik > 0 && fizik < 100){
            toplam += fizik;
            count += 1;
        }
        if(kimya > 0 && kimya < 100){
            toplam += kimya;
            count += 1;
        }
        if(turkce > 0 && turkce < 100){
            toplam += turkce;
            count += 1;
        }
        if(tarih > 0 && tarih < 100){
            toplam += tarih;
            count += 1;
        }
        if(muzik > 0 && muzik < 100){
            toplam += muzik;
            count += 1;
        }


        double sonuc = toplam / count;
        System.out.println("Ortalamanız: " + sonuc);

        if(sonuc <= 55) {
            System.out.println("Sınıfta kaldınız, seneye görüşmek üzere!");
        }else {
            System.out.println("Tebrikler, sınıfı geçtiniz!");
        }
        System.out.println("Ortalamanız: " + sonuc);
    }
}
