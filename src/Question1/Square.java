package Question1;

public class Square extends Shape {
    private final int side;

    public Square() {
        side = 4;
    }

    public Square(int side) {
        this.side = side;
    }

    @Override
    public void draw() {
        for (int i = 0; i < side; i++) {
            for (int j = 0; j < side; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
