import java.util.Scanner;

public class Palindrom {
    static boolean isPalindrom(int number){
        int temp = number, reverseNumber = 0, lastNumber;

        while (temp != 0){
            lastNumber  = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;
        }
        if(number == reverseNumber){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        int number;
        Scanner scan = new Scanner(System.in);

        System.out.print("Bir sayi giriniz: ");
        number = scan.nextInt();

        System.out.println(isPalindrom(number));


    }
}
