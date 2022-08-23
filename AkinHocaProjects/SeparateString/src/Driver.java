import java.util.Arrays;

public class Driver {

    public static void main(String[] args) {
        Driver driver = new Driver();
        driver.separeteString("JAVA");
    }

    public void separeteString(String text) {
        String arr[] = text.split("");
//      System.out.println(Arrays.toString(arr));
        for (int i = 0; i < text.length() - 1; i++) {
            System.out.print(arr[i] + " * ");
            if (i == (text.length() - 2)) {
                System.out.print(arr[i + 1]);
                break;
            }
        }
    }
}
