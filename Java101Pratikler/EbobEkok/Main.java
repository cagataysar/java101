import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, ebob=1;

        System.out.print("İlk sayıyı girin : ");
        num1 = input.nextInt();

        System.out.print("İkinci sayıyı girin : ");
        num2 = input.nextInt();

        /*for (int i = 1; i <= num1; i++){
            if ((num1%i == 0) && (num2%i == 0)){
                ebob = i;
            }
        }*/
        for (int k = num1; k >= 1; k--){
            if ((num1 % k == 0) && (num2 % k == 0)){
                ebob = k;
                System.out.println("EBOB : "+ebob);
                break;
            }
        }

        for (int i = 1; i <= (num1*num2); i++){
            if ((i%num1 == 0 ) && (i % num2 == 0 )){
                System.out.println("EKOK : "+i);
                break;
            }
        }


    }
}
