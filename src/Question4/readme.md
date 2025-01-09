### Question 4

1. The Prototype Pattern is the most suitable solution to address this problem.
Picasso paintings have fixed attributes (price and dimensions), which makes them identical for each new Drawing object.
Instead of creating a new Drawing object and initializing its attributes from scratch each time, we can create one Drawing object and clone it whenever we need a new instance.

Example code:

```java
// Prototype Picasso Drawing
Drawing picassoPrototype = new DrawingBuilder("Picasso")
        .setPainterName("Pablo Picasso")
        .setCost(1_000_000)
        .setLength(120)
        .setWidth(120)
        .build();

// Clone the prototype to create new Picasso paintings
Drawing picasso1 = picassoPrototype.clone();
Drawing picasso2 = picassoPrototype.clone();
```

2. The Singleton Pattern ensures that only one instance of a class is created and provides a global access point to that instance. This pattern is suitable for classes that manage shared resources or provide utility functions.
In this exercise, ShapeFactory is a good candidate for the Singleton Pattern. That is because:
   * The ShapeFactory class is responsible for creating shape objects.
   * There is no need to create multiple instances of the factory, as one instance can serve the entire program.
   * By making ShapeFactory a Singleton, we ensure that the factory is shared across the program and only one instance exists

Example shapeFactory Singleton implementation:

```java
public class ShapeFactory {
    private static ShapeFactory instance;

    // Private constructor to prevent instantiation
    private ShapeFactory() {}

    // Static method to get the single instance of ShapeFactory
    public static ShapeFactory getInstance() {
        if (instance == null) {
            instance = new ShapeFactory();
        }
        return instance;
    }

    // Factory method to create shapes
    public Shape createShape(String shapeType) {
        return switch (shapeType.toLowerCase()) {
            case "square" -> new Square();
            case "rectangle" -> new Rectangle();
            case "triangle" -> new Triangle();
            default -> throw new IllegalArgumentException("Unknown shape type: " + shapeType);
        };
    }
}
```