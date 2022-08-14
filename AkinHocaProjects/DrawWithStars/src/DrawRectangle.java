import java.util.Scanner;

public class DrawRectangle {

    public static void main(String[] args) {
        DrawRectangle r = new DrawRectangle();
        r.drawVoidRectangle();
    }

    public void drawVoidRectangle() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Length: ");
        int len = scanner.nextInt();
        System.out.print("Width: ");
        int wid = scanner.nextInt();

        for (int i = 1; i < len; i++) {
            System.out.print("* ");
            /*if (i == uu-1) {
                System.out.println("*");
            }*/
        }
        for (int j = 0; j < wid; j++) {
            System.out.println("*");
            if (j == (wid - 2)) {
                for (int i = 1; i < len; i++) {
                    System.out.print("* ");
                }
            }
        }
    }
}
