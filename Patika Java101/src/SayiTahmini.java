import java.util.Random;
import java.util.Scanner;

public class SayiTahmini {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int number = rand.nextInt(100);
        int right = 5;
        int selected;

        while(right > 0){
            do {
                System.out.print("Lutfen 0-100 arasinda tahmininizi giriniz: ");
                selected = input.nextInt();
            }while (selected > 100 || selected < 0);

            if (selected == number){
                System.out.println("Tebrikler, dogru bildiniz.\nKalan hak: " + right + "Sayi: " + selected);
                break;
            } else if (selected < number) {
                System.out.println("Tahmin ettiginiz sayi kucuktur. Daha buyuk bir sayi deneyin.\nKalan hakkiniz: " + --right);
            } else if (selected > number) {
                System.out.println("Tahmin ettiginiz sayi buyuktur. Daha kucuk bir sayi deneyin.\nKalan hakkiniz: " + --right);
            }

            if (right == 0){
                System.out.println("Hakkınız bitti :(\nSayi: " + number);
            }


        }

    }
}
