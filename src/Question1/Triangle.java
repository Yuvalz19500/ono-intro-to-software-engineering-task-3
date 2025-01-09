package Question1;

import Question3.Prototype;

public class Triangle extends Shape {
    private final int height;

    public Triangle() {
        height = 4;
    }

    public Triangle(int height) {
        this.height = height;
    }

    @Override
    public void draw() {
        for (int i = 1; i <= height; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    @Override
    public Triangle clone() {
        return new Triangle(height);
    }
}
