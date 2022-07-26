import java.util.Scanner;

public class Fak {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int total = 1;

        for(int i = 0; i <= n; i++) {
            total = total * i;
        }
        System.out.println(total);
    }
}
