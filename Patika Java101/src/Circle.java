import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double pi = 3.14, r, distance, area;

        System.out.print("Çemberin Yarı çapını giriniz: ");
        r = inp.nextDouble();
        area = pi * r * r;
        distance = 2 * pi * r;

        System.out.println("Çemberin alanı: " + area + "\nÇemberin çevresi: " + distance);

    }
}
