import java.util.Scanner;

public class Main {

    static int sum(int a, int b){
        int result = a + b;
        System.out.println("Result of Addition : " + result);
        return result;
    }

    static int sub(int a, int b){
        int result = a - b;
        System.out.println("Result of Subtraction : " + result);
        return result;
    }
    static int times(int a, int b){
        int result = a * b;
        System.out.println("Result of Multiplication : " + result);
        return result;
    }

    static int division(int a, int b){
        if (b == 0){
            return 0;
        }
        int result = a / b;
        System.out.println("Result of Division : "+result);
        return result;
    }

    static int power(int a, int b){
        int result = 1;
        for (int i = 1; i <= b; i++){
            result *= a;
        }
        return result;
    }

    static int mod(int a, int b){
        return a % b;
    }

    static void rectangle(int a, int b){
        System.out.println("Perimeter : " + (2 * (a+b)));
        System.out.println("Area : " + ( a * b));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int select;

        String menu =
                "1- Addition\n" +
                "2- Subtraction\n" +
                "3- Multiplication\n" +
                "4- Division\n" +
                "5- Exponentiation\n" +
                "6- Modding Process\n" +
                "7- Rectangular Area and Perimeter\n" +
                "0- Exit";

        System.out.println(menu);
        while (true){
            System.out.print("Select the action : ");
            select = input.nextInt();
            if (select == 0){
                System.out.println("Bye Jack!");
                break;
            }
            System.out.print("First Number : ");
            int a = input.nextInt();
            System.out.print("Second Number : ");
            int b = input.nextInt();

            switch (select){
                case 1:
                    sum(a,b);
                    break;
                case 2:
                    sub(a,b);
                    break;
                case 3:
                    times(a,b);
                    break;
                case 4:
                    if (division(a,b) == 0){
                        System.out.println("The second number cannot equal to zero!");
                    }
                    break;
                case 5:
                    System.out.println("Result of Exponentiation : "+power(a,b));
                    break;
                case 6:
                    System.out.println("Result of Modding Process : " + mod(a,b));
                    break;
                case 7:
                    rectangle(a,b);
                    break;
                default:
                    System.out.println("Invalid Operation!");

            }
        }
    }
}
