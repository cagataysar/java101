import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sicaklik;

        Scanner inp = new Scanner(System.in);
        System.out.print("Sıcaklık giriniz : ");
        sicaklik = inp.nextInt();

        if (sicaklik < 5){
            System.out.println("Kayak yapmak için ne güzel bir hava");
        } else if ((sicaklik >= 5) && (sicaklik <= 15)) {
            System.out.println("Vizyondaki filmleri gördün mü?");
        } else if ((sicaklik >= 15) && (sicaklik <= 25)){
            System.out.println("Piknik zamanı!");
        } else if (sicaklik >= 25) {
            System.out.println("Biraz serinlesek ya");
        }
    }
}
