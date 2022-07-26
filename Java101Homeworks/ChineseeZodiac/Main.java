import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int year;
        String sign;

        Scanner input = new Scanner(System.in);


        System.out.print("Enter yout year of birth : ");
        year = input.nextInt();

        if ((year % 12) == 0){
            sign = "Monkey";
            System.out.println("Your Chinese Zodiac Sign : " + sign);
        } else if ((year % 12) == 1) {
            sign = "Rooster";
            System.out.println("Your Chinese Zodiac Sign : " + sign);
        } else if ((year % 12) == 2) {
            sign = "Dog";
            System.out.println("Your Chinese Zodiac Sign : " + sign);
        } else if ((year % 12) == 3) {
            sign = "Pig";
            System.out.println("Your Chinese Zodiac Sign : " + sign);
        } else if ((year % 12) == 4) {
            sign = "Rat";
            System.out.println("Your Chinese Zodiac Sign : " + sign);
        } else if ((year % 12) == 5) {
            sign = "Ox";
            System.out.println("Your Chinese Zodiac Sign : " + sign);
        } else if ((year % 12) == 6) {
            sign = "Tiger";
            System.out.println("Your Chinese Zodiac Sign : " + sign);
        } else if ((year % 12) == 7) {
            sign = "Rabbit";
            System.out.println("Your Chinese Zodiac Sign : " + sign);
        } else if ((year % 12) == 8) {
            sign = "Dragon";
            System.out.println("Your Chinese Zodiac Sign : " + sign);
        } else if ((year % 12) == 9) {
            sign = "Snake";
            System.out.println("Your Chinese Zodiac Sign : " + sign);
        } else if ((year % 12) == 10) {
            sign = "Horse";
            System.out.println("Your Chinese Zodiac Sign : " + sign);
        } else if ((year % 12) == 11) {
            sign = "Goat";
            System.out.println("Your Chinese Zodiac Sign : " + sign);
        } else {
            System.out.println("Enter a real year!");
        }

        //Switch ile deneyelim
        switch (case = 1)


    }
}
