public class DrawTriangle {

    public static void main(String[] args) {
        DrawTriangle t = new DrawTriangle();
        t.drawTriangle(10,19);
    }

    public void drawTriangle(int height, int base) {

        for (int i = 1; i < height; i++) {
            System.out.println("*");
            for (int a = 0; a < i; a++) {
                System.out.print("**");
            }
            if ((i + 1) == height) {
                for (int j = 0; j < base; j++) {
                    System.out.print("*");
                    break;
                }
            }
        }
    }
}
