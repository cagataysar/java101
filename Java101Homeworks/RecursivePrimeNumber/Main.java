import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = input.nextInt();

        if (isPrime(number, 2)){
            System.out.println(number + " is a Prime number!");
        }else {
            System.out.println(number + " is not a Prime number!");
        }

    }

    static boolean isPrime(int number, int a) {

        if (number <= 1) return false;
        if (number == a) return true;
        if (number % a == 0) return false;

        return isPrime(number, a+1);
    }



}
