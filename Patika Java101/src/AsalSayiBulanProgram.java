import java.util.Scanner;
public class AsalSayiBulanProgram {

    /*static int asal(int number){
        int temp = number - 1;
        while (temp > 1){
            if(number % temp-- == 0) return 0;
        }
        return 1;
    }*/

    static boolean asal(int number, int index){
        if(number % index == 0){
            return false;
        } else if (index < number) {
            return true;
        }
        return asal(number,index+1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Sayı giriniz: ");
        int number = scan.nextInt();

        //System.out.println(asal(number));

        if(asal(number,2)){
            System.out.println(number+" sayısı asaldır!");
        }
        else{
            System.out.println(number+" sayısı asal değildir!");
        }

    }
}
