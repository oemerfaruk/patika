import java.util.Scanner;
public class DeseneGoreMetotOlusturma {

    static void desen(int n){
        int temp = n;

        System.out.print(temp + " ");

        do {
            temp = temp - 5;
            System.out.print(temp + " ");
        }while (temp > 0);

        do {
            temp = temp + 5;
            System.out.print(temp + " ");
        }while (temp < n);

    }
    static void desen(int n, int temp, int select){
        if(n > 0 && select == 0){
            System.out.print(temp + " ");
            n -= 5;
            desen(n, temp,0);
        } else if (n == 0 || n < 0){
            System.out.print(temp + " ");
            n += 5;
            desen(n, temp,1);
        } else if (n > 0 && n <= temp && n ==1){
            System.out.print(temp + " ");
            n += 5;
            desen(n, temp,1);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("N sayisi: ");
        int n = scan.nextInt();

        desen(n);
        //desen(n,n,0);
    }
}
