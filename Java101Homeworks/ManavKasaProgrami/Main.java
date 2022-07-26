import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Değişkenleri tanımlayalım
        double armut,elma,domates,muz,patlican,Tutar;
        double armutTutar=6.45,elmaTutar=4.00,domatesTutar=8.25,muzTutar=14.50,patlicanTutar=12.99;

        //Kullanıcıdan aldığı ürünlerin miktarını isteyelim
        Scanner girdi = new Scanner(System.in);

        System.out.print("Kaç kilo armut aldınız : ");
        armut = girdi.nextDouble();

        System.out.print("Kaç kilo elma aldınız : ");
        elma = girdi.nextDouble();

        System.out.print("Kaç kilo domates aldınız : ");
        domates = girdi.nextDouble();

        System.out.print("Kaç kilo muz aldınız : ");
        muz= girdi.nextDouble();

        System.out.print("Kaç kilo patlıcan aldınız : ");
        patlican = girdi.nextDouble();

        Tutar = (armut * armutTutar) + (elma * elmaTutar) + (domatesTutar * domates) + (muzTutar*muz) + (patlicanTutar*patlican);
        System.out.println("Toplam ödenecek tutar : " +Tutar);


    }
}
