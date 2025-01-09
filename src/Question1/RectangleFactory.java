package Question1;

public class RectangleFactory extends ShapeFactory {
    @Override
    public Shape createAndDrawShape() {
        Rectangle rectangle = new Rectangle();
        rectangle.draw();
        return rectangle;
    }
}
