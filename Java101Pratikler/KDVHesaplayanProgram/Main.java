import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double tutar,kdvOran = 0.18;
        Scanner i = new Scanner(System.in);
        System.out.print("Tutar giriniz : ");
        tutar = i.nextDouble();

        double kdvTutar = tutar * kdvOran;
        double kdvliTutar = tutar + kdvTutar;


        if (tutar < 1000) {
            System.out.println("KDV Oranı : " + kdvOran);
            System.out.println("KDV Tutarı : " +kdvTutar);
            System.out.println("KDV'li Tutar : " +kdvliTutar);
        } else if (tutar > 1000) {
            kdvOran = 0.08;
            System.out.println("KDV Oranı : " + kdvOran);
            System.out.println("KDV Tutarı : " +kdvTutar);
            System.out.println("KDV'li Tutar : " +kdvliTutar);
        }
    }
}
