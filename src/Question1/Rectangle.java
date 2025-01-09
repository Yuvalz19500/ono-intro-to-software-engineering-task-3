package Question1;

public class Rectangle extends Shape {
    private final int length;
    private final int width;

    public Rectangle() {
        length = 4;
        width = 4;
    }

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void draw() {
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
