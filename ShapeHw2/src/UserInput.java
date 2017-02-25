import java.util.Scanner;

public class UserInput {
    Shape f;

    public Shape shapeInput() {
        System.out.println("Choose your shape:");
        System.out.println("1 - Square");
        System.out.println("2 - Rectangle");
        System.out.print("Your choice is: ");
        Scanner shape = new Scanner(System.in);
        String shapeStr = shape.next();
        //UNDONE:validate if this is a digit
        int shapeInt = Integer.parseInt(shapeStr);
        switch (shapeInt) {
            case 1:
                f = new Square();
                break;
            case 2:
                f = new Rectangle();
                break;
        }
        f.askParameters();
        return f;
    }

    public void sOrP() {

        System.out.println("S - Square");
        System.out.println("P - perimeter");
        System.out.print("Your choice is: ");
        Scanner sOrPScanner = new Scanner(System.in);
        String sOrPScannerStr = sOrPScanner.next();

        if (sOrPScannerStr.equalsIgnoreCase("s")) {
            f.calculateArea(); //NullPointerException
        } else if (sOrPScannerStr.equalsIgnoreCase("p")) {
            f.calculatePerimeter(); //NullPointerException
        }

    }
}
