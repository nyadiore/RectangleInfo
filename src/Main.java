import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double width = 0;
        double height = 0;

        // Get the width of the rectangle
        do {
            System.out.print("Enter the width of the rectangle (positive number): ");
            if (scanner.hasNextDouble()) {
                width = scanner.nextDouble();
                if (width <= 0) {
                    System.out.println("Please enter a positive value.");
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
            }
        } while (width <= 0);

        // Get the height of the rectangle
        do {
            System.out.print("Enter the height of the rectangle (positive number): ");
            if (scanner.hasNextDouble()) {
                height = scanner.nextDouble();
                if (height <= 0) {
                    System.out.println("Please enter a positive value.");
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
            }
        } while (height <= 0);

        // Calculate the area, perimeter, and diagonal of the rectangle
        double area = width * height;
        double perimeter = 2 * (width + height);
        double diagonal = Math.sqrt((width * width) + (height * height)); // Pythagorean theorem

        // Print the results
        System.out.println("The area of the rectangle is: " + area);
        System.out.println("The perimeter of the rectangle is: " + perimeter);
        System.out.println("The length of the diagonal is: " + diagonal);


    }
}
