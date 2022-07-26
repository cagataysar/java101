import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Kullanıcıdan bazı bilgileri alalım
        int mesafe,yas,yon,toplamTutar;
        double normTutar,yasIndirimi,yasIndirimOrani,indirimliFiyat,ciftYonIndirim;

        Scanner input = new Scanner(System.in);

        System.out.print("Gideceğiniz mesafeyi KM olarak girin : ");
        mesafe = input.nextInt();

        if (mesafe <= 0){
            System.out.println("Mesafe sıfırdan küçük olamaz!");
        }

        System.out.print("Yaşınızı girin : ");
        yas = input.nextInt();

        if (yas <= 0){
            System.out.println("Yaş sıfırdan küçük olamaz!");
        }

        //Burada yas hatalı girilse dahi program çalışmaya devam ediyor. Nasıl düzeltilir öğren

        System.out.println("Yolculuk tipini seçin : ");
        System.out.print("1 => Tek Yön, 2 => Gidiş-Dönüş : ");
        yon = input.nextInt();

        if (yas < 12){
            yasIndirimOrani = 0.50;
        } else if (yas > 12 && yas < 24) {
            yasIndirimOrani = 0.10;
        } else if (yas > 24 && yas < 65) {
            yasIndirimOrani = 1;
        } else{
            yasIndirimOrani = 0.30;
        }



        normTutar = mesafe * 0.10;
        yasIndirimi = normTutar * yasIndirimOrani;
        indirimliFiyat = normTutar - yasIndirimi;
        ciftYonIndirim = indirimliFiyat * 0.20;

        toplamTutar = (int) ((indirimliFiyat - ciftYonIndirim) * 2);

        System.out.println(toplamTutar);









    }
}
