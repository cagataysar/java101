import java.util.Scanner;

public class DrawFilledRectangle {

    public static void main(String[] args) {
        DrawFilledRectangle r = new DrawFilledRectangle();
        r.drawFilledRectangle(8,5);
    }

    public void drawFilledRectangle(int len, int wid) {
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.print("Length: ");
        int len = scanner.nextInt();
        System.out.print("Width: ");
        int wid = scanner.nextInt();
        */

        for (int a = 0; a < wid; a++) {
            for (int i = 0; i < len; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
