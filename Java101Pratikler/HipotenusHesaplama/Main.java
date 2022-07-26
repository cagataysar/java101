import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Değişkenler
        int a,b;
        double c,cevre,alan;

        //Kullanıcıdan veri alalım
        Scanner input = new Scanner(System.in);
        System.out.print("1.Kenarı Giriniz : ");
        a = input.nextInt();
        System.out.print("2.Kenarı Giriniz : ");
        b = input.nextInt();

        c = Math.sqrt((a * a) + (b * b));
        System.out.println("Hipotenüs : " +c);

        //Çevre ve Alan hesaplama
        cevre = a + b + c;
        System.out.println("Üçgenin Çevresi " + cevre);

        alan = a * b / 2;
        System.out.println("Üçgenin Alanı " +alan);
    }
}
