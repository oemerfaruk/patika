import java.util.Scanner;
import java.util.SortedMap;

public class powOfFourAndFive {
    public static void main(String[] args) {
        int number;
        Scanner scan = new Scanner(System.in);

        System.out.print("Bir sayi giriniz: ");
        number = scan.nextInt();

        for(int i = 1; i <= number; i*=4){
            System.out.println("4'un kuvveti: " + i);
        }
        for(int i = 1; i <= number; i*=5){
            System.out.println("5'in kuvveti: " + i);
        }
    }
}
