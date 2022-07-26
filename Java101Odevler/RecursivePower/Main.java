import java.util.Scanner;

public class Main {

    static int recursivePower(int a, int b){
        if (b == 0) return 1;

        return a*recursivePower(a,b-1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true){
            System.out.print("Enter a number : ");
            int a = scan.nextInt();
            System.out.print("Enter exponent : ");
            int b = scan.nextInt();
            System.out.println("Result : " + recursivePower(a,b));


        }
    }

}
