import java.util.Arrays;
import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dizi boyutu: ");
        int length = scanner.nextInt();

        int[] list = new int[length];

        for (int i=0; i < length; i++) {
            System.out.print("Dizinin elemanlarını giriniz: ");
            list[i] = scanner.nextInt();
        }

        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
    }
}
