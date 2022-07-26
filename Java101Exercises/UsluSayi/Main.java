import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, k;

        Scanner scan = new Scanner(System.in);
        System.out.print("Üssü alınacak sayıyı girin : ");
        n = scan.nextInt();

        System.out.print("Üs olacak sayı : ");
        k = scan.nextInt();
        int total = 1, i;

        for (i = 1; i <= k; i++){
            total *= n;
        }
        System.out.println("Cevap : " + total);

        /*
        //While döngüsü ile
        int i = 1;
        while (i <= k){
            total *= n;
            i++;
        }

        System.out.println("Cevap : " + total);*/


    }
}
