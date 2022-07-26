import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Değişkenleri oluşturalım
        double pi,r,cevre,alan;
        int merkezAci;

        Scanner i = new Scanner(System.in);

        System.out.print("Merkez Açı giriniz : ");
        merkezAci = i.nextInt();

        pi = 3.14;
        //Kullanıcıdan yarıçap alalım

        System.out.print("Yarıçap giriniz : ");
        r = i.nextDouble();

        cevre = 2 * pi * r;
        System.out.println("Dairenin Çevresi " +cevre);

        /*
        alan = pi * r * r;
        System.out.println("Dairenin Alanı " + alan);
        */

        alan = (pi * (r * r) * merkezAci) / 360;
        System.out.println("Merkez Açısı verilen dairenin alanı : " +alan);

    }
}
