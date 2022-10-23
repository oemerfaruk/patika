import java.util.Scanner;
public class UsHesabiYapanProgram {

    static int us(int taban, int us){
        if(us > 1){
            return taban * (us(taban, us-1));
        } else if (us == 0) {
            return 1;
        }
        return taban;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Taban değerini giriniz: ");
        int taban = scan.nextInt();
        System.out.print("Üs değerini giriniz: ");
        int us = scan.nextInt();

        System.out.println("Sonuç: " + us(taban,us));

    }
}
