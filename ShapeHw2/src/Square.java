import java.util.Scanner;

public class Square implements Shape {
    private double a;

    @Override
    public void askParameters() {
        System.out.print("a: ");
        Scanner askParameters = new Scanner(System.in);
        this.a = askParameters.nextInt();
        UserInput userInput = new UserInput();
        userInput.sOrP();
    }

    @Override
    public double calculateArea() {
        double s = a * a;
        return s;
    }

    @Override
    public double calculatePerimeter() {
        double p = 4 * a;
        return p;
    }
}
