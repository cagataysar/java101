import java.util.Scanner;

public class Circle {
    double result;

    public void choose() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Which operation do you want to perform: \n" +
                "Peform Area (1)\n" +
                "Perform Perimeter (2)\n");

        int ch = sc.nextInt();

        if (ch == 1) calculateArea();
        if (ch == 2) calculatePerimeter();

    }

    public void calculateArea() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        double r = sc.nextDouble();
        result = Math.PI * r * r;
        System.out.println("Area of circle: " + result);
    }

    public void calculatePerimeter() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        double r = sc.nextDouble();
        result = 2 * Math.PI * r;
        System.out.println("Perimeter of circle: " + result);
    }

}
