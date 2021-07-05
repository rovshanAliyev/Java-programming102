package day59_polymorphism_exceptions;

import day56_abstraction.drivable.Plane;
import day57_abstraction_polymorhism.shapes.Circle;
import day57_abstraction_polymorhism.shapes.Shape;
import day57_abstraction_polymorhism.shapes.Square;

public class InstanceOf {
    public static void main(String[] args) {
        Shape shape = new Square();
        System.out.println(shape instanceof Circle);
        System.out.println(shape instanceof Square);
        if (shape instanceof Circle) {
            System.out.println("It is a Circle object");
        } else if (shape instanceof Square) {
            System.out.println("It is a Square object");
        }

        System.out.println(shape.getClass().getSimpleName());
        System.out.println(shape.getClass().getName());
        if (shape.getClass().getSimpleName().equals("Square")) {
            System.out.println("It is a square object");
        }
        System.out.println(shape.getClass().getDeclaredMethods().length);


        WebElement el = new Link();
        System.out.println("onject class name of el variable = " + el.getClass().getSimpleName());

        System.out.println(el.getClass());

    }
}
