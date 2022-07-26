import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Değişkenleri Oluşturalım
        double ucret,km,kmTutar = 2.20,acilisTutar = 10.0,minTutar = 20.0;

        //Kullanıcıdan gittiği km'yi alalım
        Scanner kmInput = new Scanner(System.in);
        System.out.print("Gidilen KM : ");
        km = kmInput.nextDouble();

        ucret = acilisTutar + (km * kmTutar) ;
        ucret = (ucret < 20) ? 20 : ucret;
        System.out.println("Ödeyeceğiniz Ücret : " + ucret);


    }
}
