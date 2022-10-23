import java.util.Scanner;
public class BolunenSayilarinOrtalamasi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number, temp = 0, count = 0;

        System.out.print("Bir sayi giriniz: ");
        number = scan.nextInt();

        for(int i = 1; i <= number; i++){
            if(i % 3 == 0 || i % 4 == 0){
                temp += i;
                count++;
                System.out.println(count + ". Sayi: " + i);
            }
        }
        System.out.println("\nToplam: " + temp + "\tOrtalama: " + temp/count);
    }
}
