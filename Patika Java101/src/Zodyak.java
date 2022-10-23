import java.util.Scanner;
public class Zodyak {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int year, result;

        System.out.print("Doğum yılınızı giriniz: ");
        year = scan.nextInt();

        result = year % 12;

        switch (result){
            case 0:
                // Maymun
                System.out.println("Çin Zodyağı Burcunuz: Maymun");
                break;
            case 1:
                // Horoz
                System.out.println("Çin Zodyağı Burcunuz: Horoz");
                break;
            case 2:
                // Köpek
                System.out.println("Çin Zodyağı Burcunuz: Köpek");
                break;
            case 3:
                // Domuz
                System.out.println("Çin Zodyağı Burcunuz: Domuz");
                break;
            case 4:
                // Fare
                System.out.println("Çin Zodyağı Burcunuz: Fare");
                break;
            case 5:
                // Öküz
                System.out.println("Çin Zodyağı Burcunuz: Öküz");
                break;
            case 6:
                // Kaplan
                System.out.println("Çin Zodyağı Burcunuz: Kaplan");
                break;
            case 7:
                // Tavşan
                System.out.println("Çin Zodyağı Burcunuz: Tavşan");
                break;
            case 8:
                // Ejderha
                System.out.println("Çin Zodyağı Burcunuz: Ejderha");
                break;
            case 9:
                // Yılan
                System.out.println("Çin Zodyağı Burcunuz: Yılan");
                break;
            case 10:
                // At
                System.out.println("Çin Zodyağı Burcunuz: At");
                break;
            case 11:
                // Koyun
                System.out.println("Çin Zodyağı Burcunuz: Koyun");
                break;
        }
    }
}
