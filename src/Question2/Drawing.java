package Question2;

public class Drawing {
    private final String paintingName;
    private final String painterName;
    private final double cost;
    private final int length;
    private final int width;

    public Drawing(DrawingBuilder builder) {
        this.paintingName = builder.paintingName;
        this.painterName = builder.painterName;
        this.cost = builder.cost;
        this.length = builder.length;
        this.width = builder.width;
    }

    @Override
    public String toString() {
        return "Drawing{" +
                "paintingName='" + paintingName + '\'' +
                ", painterName='" + painterName + '\'' +
                ", cost=" + cost +
                ", length=" + length +
                ", width=" + width +
                '}';
    }
}
