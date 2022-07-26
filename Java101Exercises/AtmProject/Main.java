import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName, password;
        int right = 3;
        int balance = 1500, select;

        while (right > 0 ){
            System.out.print("Kullanıcı adınızı girin : ");
            userName = input.nextLine();

            System.out.print("Parolanız : ");
            password = input.nextLine();
            if (userName.equals("patika") && (password.equals("dev123"))){
                System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz! ");
                do {
                    System.out.println(
                            "1- Para Çekme\n" +
                            "2- Para Yatırma\n" +
                            "3- Bakiye Sorgulama\n" +
                            "4- Çıkış Yap" );
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçin : ");
                    select = input.nextInt();
                    if (select == 1){
                        System.out.print("Yatırılacak para miktarı : ");
                        int price = input.nextInt();
                        balance += price;
                        System.out.println("Güncel Bakiyeniz " + balance);
                    } else if (select == 2) {
                        System.out.print("Çekmek istediğiniz miktarı girin : ");
                        int price = input.nextInt();
                        if (price > balance){
                            System.out.println("Yetersiz Bakiye!");
                        }else {
                            balance -= price;
                            System.out.println("Güncel Bakiyeniz " + balance);
                        }
                    } else if (select == 3) {
                        System.out.println("Bakiyeniz " +balance);
                    }
                }while (select != 4);
                System.out.println("Tekrar görüşmek üzere...");
                break;
            }else {
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre!");
                if (right == 0){
                    System.out.println("Hesabınız bloke olmuştur lütfen en yakın şubeye gidim. ");
                }else {
                    System.out.println("Kalan hakkınız : " + right);
                }
            }
        }






    }

}
