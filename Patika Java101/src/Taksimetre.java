import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        double distance, price;

        System.out.print("Yolculuk mesafesini giriniz: ");
        distance = inp.nextDouble();

        price = 10 + (distance * 2.20);

        boolean tutarSorgulama = price < 20;
        price = tutarSorgulama ? 20.0 : price;

        System.out.println("Taksimetre Tutar: " + price);

    }
}
