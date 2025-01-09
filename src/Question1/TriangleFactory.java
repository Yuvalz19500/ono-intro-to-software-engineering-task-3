package Question1;

public class TriangleFactory extends ShapeFactory {
    @Override
    public Shape createAndDrawShape() {
        Triangle triangle = new Triangle();
        triangle.draw();
        return triangle;
    }
}
