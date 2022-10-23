import java.util.Scanner;
public class TekSayiAlanProgram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number, temp = 0;

        do{
            System.out.print("Bir Sayi giriniz: ");
            number = scan.nextInt();

            if(number % 4 == 0){
                temp += number;
            }
        }while(number % 2 == 0);
        System.out.println("4'e Bolunen sayilerin toplami: " + temp);
    }
}
