import java.util.Scanner;

public class HipotenusBulanProgram {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a, b;
        double c;


        System.out.print("A kenarının uzunluğunu giriniz: ");
        a = inp.nextInt();

        System.out.print("B kenarının uzunluğunu giriniz: ");
        b = inp.nextInt();

        c = Math.sqrt((a * a) + (b * b));

        System.out.println("Hipotenüs'ün uzunluğu: " + c);
    }
}
