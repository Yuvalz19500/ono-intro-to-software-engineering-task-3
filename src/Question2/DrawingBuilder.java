package Question2;

public class DrawingBuilder {
    // Mandatory attribute
    public final String paintingName;

    // Optional attributes
    public String painterName = "Unknown";
    public double cost = 0.0;
    public int length = 0;
    public int width = 0;

    // Constructor for the mandatory attribute
    public DrawingBuilder(String paintingName) {
        this.paintingName = paintingName;
    }

    // Setter methods for optional attributes
    public DrawingBuilder setPainterName(String painterName) {
        this.painterName = painterName;
        return this;
    }

    public DrawingBuilder setCost(double cost) {
        this.cost = cost;
        return this;
    }

    public DrawingBuilder setLength(int length) {
        this.length = length;
        return this;
    }

    public DrawingBuilder setWidth(int width) {
        this.width = width;
        return this;
    }

    public Drawing build() {
        return new Drawing(this);
    }
}
