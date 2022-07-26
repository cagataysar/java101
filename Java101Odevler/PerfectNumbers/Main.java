import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number, i, sum=0;

        System.out.print("Bir sayı girin : ");
        number = input.nextInt();

        for (i = 1; i < number; i++){
            if ((number % i )== 0){
                sum += i;
            }

        }
        if (sum == number){
            System.out.println(number+" is a perfect number!");
        }else{
            System.out.println(number+" is not a perfect number!");
        }
    }
}
