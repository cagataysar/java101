import java.util.Arrays;

public class RectangleArray {

    public static void main(String[] args) {
        RectangleArray r = new RectangleArray();
        r.drawRectangle(5,7);
    }

    void drawRectangle(int a, int b) {
        int[][] rectangle = new int[a][b];
        System.out.println(Arrays.toString(rectangle));
        for (int i = 0; i < rectangle.length; i++) {
            for (int j = 0; j < i; j++) {
                System.out.println("*");
            }
        }
    }
}



