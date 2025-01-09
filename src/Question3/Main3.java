package Question3;

import Question1.Shape;
import Question1.Square;
import Question1.Rectangle;
import Question1.Triangle;

public class Main3 {
    public static void main(String[] args) {
        // Create an array of 10 shapes
        Shape[] shapes10 = new Shape[]{
                new Square(3),
                new Square(4),
                new Rectangle(3, 5),
                new Rectangle(4, 6),
                new Triangle(3),
                new Triangle(4),
                new Square(5),
                new Rectangle(2, 7),
                new Triangle(5),
                new Square(6)
        };

        // Create an array to store the cloned shapes
        Shape[] shapes10_clone = new Shape[shapes10.length];

        // Clone each shape and store it in the cloned array
        for (int i = 0; i < shapes10.length; i++) {
            shapes10_clone[i] = (Shape) shapes10[i].clone();
        }

        // Iterate over the cloned array and draw each shape
        for (Shape shape : shapes10_clone) {
            shape.draw();
            System.out.println();
        }

        /*
        Without the Prototype Pattern, if we wanted to create new objects similar to existing ones, we would need to recreate each object manually, which can be time-consuming and error-prone.
        Using the clone() method We can easily create copies of existing objects.
        */
    }
}
