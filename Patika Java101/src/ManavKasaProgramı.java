import java.util.Scanner;

public class ManavKasaProgramı {
    public static void main(String[] args) {
        float armut = 2.14f, elma = 3.67f, domates = 1.11f, muz = 0.95f, patlican = 5.00f;
        float kgArmut, kgElma, kgDomates, kgMuz, kgPatlican;

        Scanner input = new Scanner(System.in);

        System.out.print("Armut Kaç Kilo ? : ");
        kgArmut = input.nextFloat();
        System.out.print("Elma Kaç Kilo ? : ");
        kgElma = input.nextFloat();
        System.out.print("Domates Kaç Kilo ? : ");
        kgDomates = input.nextFloat();
        System.out.print("Muz Kaç Kilo ? : ");
        kgMuz = input.nextFloat();
        System.out.print("Patlıcan Kaç Kilo ? : ");
        kgPatlican = input.nextFloat();

        float tutar = kgArmut * armut + kgElma * elma + kgDomates * domates + kgMuz * muz + kgPatlican * patlican;
        System.out.println("Toplam Tutar: " + tutar);

    }
}
