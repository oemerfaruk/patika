import java.util.Scanner;

public class HavaDurumunaGoreEtkinlik {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int heat;

        System.out.print("Hava sıcaklığını giriniz: ");
        heat = scan.nextInt();

        if(heat < 5){
            // Kayak
            System.out.println("Kayak yapabilirsiniz.");
        } else if (heat <= 15) {
            // Sinema
            System.out.println("Sinemaya gidebilirsiniz.");
        } else if (heat <= 25) {
            // Piknik
            System.out.println("Pikniğe gidebilirsiniz.");
        } else {
            // Yüzme
            System.out.println("Yüzmeye gidebilirsiniz.");
        }

    }
}
