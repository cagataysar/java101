import java.util.Scanner;

public class New {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2;
            boolean result = true, mistake=false;

        System.out.print("İlk sayıyı girin : ");
        num1 = input.nextInt();

        System.out.print("İkinci sayıyı girin : ");
        num2 = input.nextInt();

        if (num2 > num1){
            System.out.println(result);
        }else if (num2 == num1){
            System.out.println("-1");
        }else {
            System.out.println(mistake);
        }
    }
}
