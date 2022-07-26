import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName,password;

        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı adınız : ");
        userName = input.nextLine();

        System.out.print("Şifreniz : ");
        password = input.nextLine();

        if (userName.equals("patika") && password.equals("java123")){
            System.out.println("Giriş başarılı");
        } else {
            System.out.println("Kullanıcı adı veya şifre yanlış!");
        }

    }
}
