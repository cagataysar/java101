public class DrawRectangle {

    public static void main(String[] args) {
        DrawRectangle r = new DrawRectangle();
        r.drawVoidRectangle(10,8    );
    }

    public void drawVoidRectangle(int wid, int len) {
        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Length: ");
        int len = scanner.nextInt();
        System.out.print("Width: ");
        int wid = scanner.nextInt();*/

        for (int i = 0; i < wid; i++) {
            for (int j = 0; j < len; j++) {
                if (i == 0 | i == wid - 1) {
                    System.out.print("*");
                    if (j == len - 1) {
                        System.out.println();
                    }
                }
                else {
                    if (j == 0) {
                        System.out.print("*");
                    }
                    else if (j == len - 1) {
                        System.out.println("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
            }
        }

    }
}