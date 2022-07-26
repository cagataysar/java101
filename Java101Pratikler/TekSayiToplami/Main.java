import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, sum = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Çıkmak için '0' a basın. ");

        do {
            System.out.print("Bir sayı girin : ");
            n = input.nextInt();
            if (n == 0){
                break;
            } else if (n % 2 == 1) {
                sum += n;
            }
        }while (n > 0);

        System.out.println("Toplam : " +sum);
    }
}
