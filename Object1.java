import java.util.Scanner;

class Rectangle {
    private double length;
    private double width;

    // Assign the rectangle dimensions
    void setDimensions(double l, double w) {
        length = l;
        width = w;
    }

    // Calculate the area
    double calculateArea() {
        return length * width;
    }
}

public class Object1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the rectangle length: ");
        double rectLength = input.nextDouble();

        System.out.print("Enter the rectangle width: ");
        double rectWidth = input.nextDouble();

        Rectangle rectangle = new Rectangle();
        rectangle.setDimensions(rectLength, rectWidth);

        System.out.println("Rectangle Area: " + rectangle.calculateArea());

        input.close();
    }
}
