import java.util.Scanner;
public class KullaniciGirisi {
    public static void main(String[] args) {
        String userName = "patika", password = "java123", inputUserName, inputPassword,select;

        Scanner scan = new Scanner(System.in);

        System.out.print("Kullanıcı adınızı giriniz: ");
        inputUserName = scan.nextLine();
        System.out.print("Kullanıcı parolanızı giriniz: ");
        inputPassword = scan.nextLine();

        if(inputUserName.equals(userName) && inputPassword.equals(password)){
            System.out.println("Giriş yaptınız.");
        }else{
            System.out.println("Bilgileriniz yanlış.\nParolanız yanlış, sıfırlamak ister misiniz? e/h\t");
            select = scan.nextLine();

            if(select.equals("e") || select.equals("E")){
                System.out.print("Yeni kullanıcı parolanızı giriniz (Eski parola ile yeni parola aynı olamaz): ");
                inputPassword = scan.nextLine();
                if(inputPassword.equals(password)){
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz." );
                }else{
                    System.out.println("Şifre oluşturuldu");
                }
            }

        }
    }
}
