import java.util.Scanner;
public class UcakBiletiFiyati {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int age, distance, type;
        /*
        ppd --> Price Per Distance
        fad --> First age discount for 0-12 age
        sad --> Second age discount for 12-24 age
        tad --> Third age discount for over 65 age
        t2              --> Gidiş Dönüş indirimi
        nD  --> no Discount
        */
        double ppd = 0.1, fad = 0.5, sad = 0.1, tad = 0.3, t2 = 0.2, nD = 0;
        /*
        price           --> Normal Tutar
        secondPrice     --> İndirimli Tutar
        firstDiscount   --> Yaş indirimi
        secondDiscount  --> Gidiş Dönüş Bilet İndirimi
        totalPrice      --> Toplam Tutar
        */
        double price, secondPrice, firstDiscount, secondDiscount, totalPrice;

        System.out.print("Mesafeyi KM türünden giriniz: ");
        distance = scan.nextInt();
        System.out.print("Yaşınızı giriniz: ");
        age = scan.nextInt();
        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        type = scan.nextInt();

        if((distance <= 0) || (age < 0) || (type < 1 || type > 2)){
            System.out.println("Hatalı veri girdiniz !");
        }else {
            System.out.println("...");
            price = distance * ppd;
            if(age <= 12){
                firstDiscount = price * fad;
            } else if (age <= 24) {
                firstDiscount = price * sad;
            } else if (age >= 65) {
                firstDiscount = price * tad;
            } else {
                firstDiscount = price * nD;
            }

            secondPrice = price - firstDiscount;

            if(type == 2){
                secondDiscount = secondPrice * t2 ;
                totalPrice = 2 * (secondPrice - secondDiscount);
            }else{
                secondDiscount = secondPrice * nD;
                totalPrice = secondPrice - secondDiscount;
            }


            System.out.println("Toplam Tutar: " + totalPrice);

        }

    }
}
