import java.util.Scanner;

public class Rectangle implements Shape {
    private double a;
    private double b;

    @Override
    public void askParameters() {
        System.out.print("a: ");
        Scanner askParameters = new Scanner(System.in);
        this.a = askParameters.nextInt();
        System.out.print("b: ");
        askParameters = new Scanner(System.in);
        this.b = askParameters.nextInt();
    }

    @Override
    public double calculateArea() {
        double s = a * b;
        return s;
    }

    @Override
    public double calculatePerimeter() {
        double p = 2 * (a + b);
        return p;
    }
}
