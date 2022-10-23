import java.util.Scanner;
public class BurcBulma {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int month, day;

        System.out.print("Hangi ay'da doğdunuz: ");
        month = scan.nextInt();
        System.out.print("Hangi gün doğdunuz: ");
        day = scan.nextInt();

        switch (month){
            case 1:
                // Ocak
                if(day <= 21){
                    System.out.println("Oğlak");
                }else {
                    System.out.println("Kova");
                }
                break;
            case 2:
                // Şubat
                if(day <= 19){
                    System.out.println("Kova");
                }else {
                    System.out.println("Valık");
                }
                break;
            case 3:
                // Mart
                if(day <= 20){
                    System.out.println("Balık");
                }else {
                    System.out.println("Koç");
                }
                break;
            case 4:
                // Nisan
                if(day <= 20){
                    System.out.println("Koç");
                }else {
                    System.out.println("Boğa");
                }
                break;
            case 5:
                // Mayıs
                if(day <= 22){
                    System.out.println("Boğa");
                }else {
                    System.out.println("İkizler");
                }
                break;
            case 6:
                // Haziran
                if(day <= 22){
                    System.out.println("İkizler");
                }else {
                    System.out.println("Yengeç");
                }
                break;
            case 7:
                // Temmuz
                if(day <= 23){
                    System.out.println("Yengeç");
                }else {
                    System.out.println("Aslan");
                }
                break;
            case 8:
                // Ağustos
                if(day <= 22){
                    System.out.println("ASlan");
                }else {
                    System.out.println("Başak");
                }
                break;
            case 9:
                // Eylül
                if(day <= 22){
                    System.out.println("Başak");
                }else {
                    System.out.println("Terazi");
                }
                break;
            case 10:
                // Ekim
                if(day <= 22){
                    System.out.println("Terazi");
                }else {
                    System.out.println("Akrep");
                }
                break;
            case 11:
                // Kasım
                if(day <= 21){
                    System.out.println("Akrep");
                }else {
                    System.out.println("Yay");
                }
                break;
            case 12:
                // Aralık
                if(day <= 21){
                    System.out.println("Yay");
                }else {
                    System.out.println("Oğlak");
                }
                break;
        }
    }
}
