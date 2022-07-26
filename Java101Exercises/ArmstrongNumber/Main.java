import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz : ");
        int number = input.nextInt();
        int busNumber = 0, tempNum = number;
        int basValue;
        int result = 0;
        int basPow;

        while (tempNum != 0){
            tempNum /= 10;
            busNumber++;

        }

        tempNum = number;
        while (tempNum != 0){
            basValue = tempNum % 10;
            basPow = 1;
            for (int i = 1; i <= busNumber; i++){
                basPow *= basValue;
            }
            result += basPow;
            tempNum /= 10;
        }

        if (result == number){
            System.out.println(number + " sayısı bir Armstrong sayıdır.");
        } else{
            System.out.println(number + " sayısı bir Armstrong sayı değildir.");
        }


        /*

        //BASAMAK SAYISI BULMA
        int a = 2451, basamakSayisi = 0, numberCounter = 0;
        // 2451 / 10 = 245
        // 245 / 10 = 24
        // 24 / 10 = 2
        // 2 / 10 = 0

        while (a != 0){
            a = a / 10; // a /= 10
            numberCounter++;

        }
        System.out.println(numberCounter);

         */
    }
}
