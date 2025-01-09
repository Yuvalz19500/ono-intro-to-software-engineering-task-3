package Question1;

public class Main1A {
    public static void main(String[] args) {
        System.out.println("Enter the name of the shape you want to create (Square, Triangle, Rectangle):");
        String shapeName = System.console().readLine();

        switch (shapeName.toLowerCase()) {
            case "square" -> {
                Square square = new Square();
                square.draw();
            }
            case "triangle" -> {
                Triangle triangle = new Triangle();
                triangle.draw();
            }
            case "rectangle" -> {
                Rectangle rectangle = new Rectangle(4, 5);
                rectangle.draw();
            }
            default -> {
                System.out.println("Invalid shape name");
            }
        }

        /*
        The problem with this code in terms of software engineering is that it violates the Open/Closed
        Principle and Requires modifying main() for new shapes.
         */
    }
}