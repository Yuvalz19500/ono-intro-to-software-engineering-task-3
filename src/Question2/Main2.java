package Question2;

import Question1.Rectangle;
import Question1.Square;
import Question1.Triangle;

public class Main2 {
    public static void main(String[] args) {
        Drawing drawing1 = new DrawingBuilder("Sunset").build();
        System.out.println(drawing1);

        Drawing drawing2 = new DrawingBuilder("Mountain View")
                .setPainterName("John Doe")
                .setCost(500.75)
                .setLength(100)
                .setWidth(50)
                .build();
        System.out.println(drawing2);

        Drawing drawing3 = new DrawingBuilder("Abstract Art")
                .setPainterName("Jane Smith")
                .setCost(300.00)
                .build();
        System.out.println(drawing3);
    }
}