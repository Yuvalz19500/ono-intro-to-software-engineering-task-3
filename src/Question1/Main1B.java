package Question1;

import java.util.Scanner;

public class Main1B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a shape to create:");
        System.out.println("1. Square");
        System.out.println("2. Rectangle");
        System.out.println("3. Triangle");

        int choice = scanner.nextInt();

        ShapeFactory shapeFactory;

        switch (choice) {
            case 1 -> shapeFactory = new SquareFactory();
            case 2 -> shapeFactory = new RectangleFactory();
            case 3 -> shapeFactory = new TriangleFactory();
            default -> {
                System.out.println("Invalid choice");
                return;
            }
        }

        shapeFactory.createAndDrawShape();

        /* This solves the problem because:
        * 1. The abstract ShapeFactory class centralizes the object creation logic.
        * 2. New shapes can be added by simply creating a new factory subclass, without modifying the main program logic.
        * 3. The main program follows the Open/Closed Principle, making it scalable and easier to maintain.
        * */
    }
}
