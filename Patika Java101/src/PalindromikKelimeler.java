import java.util.Scanner;

public class PalindromikKelimeler {
    static boolean palindromik(String word){
        int i = 0, length = word.length() - 1;

        while (i < length){
            if(word.charAt(i++) != word.charAt(length--)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Bir kelime giriniz: ");
        String word = scan.nextLine();

        if(palindromik(word)){
            System.out.println(word + "\tkelimesi palindromiktir.");
        }else {
            System.out.println(word + "\tkelimesi palindromik degildir.");
        }
    }
}
