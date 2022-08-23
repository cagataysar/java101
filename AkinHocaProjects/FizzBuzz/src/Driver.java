import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {
        Driver driver = new Driver();
        driver.fizzBuzz(32);
    }

    public void fizzBuzz(int num) {

        for (int i = 1; i < num; i++) {
            if (i % 15 == 0) {
                System.out.print("FizzBuzz, ");
            } else if (i % 5 == 0) {
                System.out.print("Buzz, ");
            } else if (i % 3 == 0) {
                System.out.print("Fizz, ");
            } else {
                System.out.print(i + ", ");
            }
        }
    }
}




