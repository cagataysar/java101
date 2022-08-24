import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        PrimeNumber pn = new PrimeNumber();
        System.out.print("Pozitif bir tam sayı girin: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //pn.isPrime(n);
        pn.countNumberOfPrimesUpTo(n);
    }

    boolean isPrime(int n) {
        boolean prime = true;
        int i = 2;
        int upperBound = (int) (Math.sqrt(n) + 1);
        for (; i < upperBound; i++) {
            if (n % i == 0) {
                prime = false;
                break;
            }
        }
        /*if (prime) {
            System.out.println(n + " is prime!");
        } else {

            System.out.println("İlk bölen: " + i);
        }*/
        return prime;

    }

    void countNumberOfPrimesUpTo(int n) {
        int numberOfPrimes = 0;
        for (int i = 2; i < n; i++) {
            boolean prime = isPrime(i);
            if (prime) {
                numberOfPrimes++;
            }
        }
        System.out.println(n + " sayısına kadar " + numberOfPrimes + " tane asal sayı var. ");
    }
}
