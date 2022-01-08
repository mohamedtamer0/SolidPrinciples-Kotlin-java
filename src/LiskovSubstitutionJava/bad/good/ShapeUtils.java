package LiskovSubstitutionJava.bad.good;

import LiskovSubstitutionJava.bad.Rectangle;
import LiskovSubstitutionJava.bad.Square;

public class ShapeUtils {

    public static void main(String[] args) {

        //Bad
        Square square = new Square(10);
        System.out.println("Old " + square.toString());



        // Good
        Rectangle newRectangle = extendRectangleWidth(square, 2);
        System.out.println("New " + newRectangle.toString());



    }

    public static Rectangle extendRectangleWidth(Rectangle rectangle, int times) {
        double newWidth = rectangle.getWidth() * times;
        rectangle.setWidth(newWidth);
        return rectangle;
    }
}