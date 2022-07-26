import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        for(int i = 0 ; i <= num; i++) {
            i++;
            System.out.println(i);
        }

    }
}
