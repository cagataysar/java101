import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num1,num2,secim;

        Scanner i = new Scanner(System.in);
        System.out.print("İlk sayıyı girin : ");
        num1 = i.nextInt();

        System.out.print("İkinci sayıyı girin : ");
        num2 = i.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiminiz : ");
        secim = i.nextInt();

        if (secim == 1){
            System.out.println("Toplam : " +(num1+num2));
        } else if(secim == 2){
            System.out.println("Çıkarma : " +(num1-num2));
        } else if (secim == 3) {
            System.out.println("Çarpma : " +(num1 * num2));
        } else if (secim == 4) {
            if (num2 != 0){
                System.out.println("Bölme : " +(num1 / num2));
            } else {
                System.out.println("Bir sayı sıfıra bölünemez! ");
            }

        } else {
            System.out.println("Yanlış seçim! ");
        }
    }
}
