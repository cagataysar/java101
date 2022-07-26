import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, num1=0, num2=1, num3;

        Scanner input = new Scanner(System.in);
        System.out.print("Eleman sayısını girin : ");
        a = input.nextInt();

        for (int i=1; i<a; i++){
            System.out.println(num1 + " ");

            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
        }
    }
}
