import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int countNum, num;
        int max = 0, min = 0;

        System.out.print("Kaç tane sayı gireceksiniz : ");
        countNum = input.nextInt();

        for (int i = 1; i <= countNum; i++){
            System.out.print(i +". sayıyı girin : ");
            num = input.nextInt();

            if (i == 0){
                max=num;
                min=num;

            }else {
                if (num>max){
                    max=num;
                } else if (num<min) {
                    min=num;
                }
            }

        }
        System.out.println("En büyük sayı : "+max);
        System.out.println("En küçük sayı : "+min);
    }
}
