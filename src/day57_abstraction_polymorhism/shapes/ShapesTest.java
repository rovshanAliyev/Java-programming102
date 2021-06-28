package day57_abstraction_polymorhism.shapes;

import java.util.ArrayList;
import java.util.List;

public class ShapesTest {
    public static void main(String[] args) {
        Shape triangle = new Triangle();
        Shape circle = new Circle();
        Shape square = new Square();
        triangle.draw();
        circle.draw();
        square.draw();

        Shape shape = new Triangle();
        shape.draw();
        shape = new Circle();
        shape.draw();
        shape = new Square();
        shape.draw();

        List<Shape> shapes = new ArrayList<>();
        shapes.add(triangle);
        shapes.add(new Square());
        shapes.add(new Square());
        shapes.add(new Circle());
        shapes.add(new Circle());
        shapes.add(new Triangle());
        shapes.add(new Triangle());

        for (Shape each : shapes) {
            each.draw();

        }

        drawShape(new Circle());
        drawShape(new Triangle());
        drawShape(new Square());

    }

    public static void drawShape(Shape shape) {
        System.out.println("drawing new stuff");
        shape.draw();
    }
}
