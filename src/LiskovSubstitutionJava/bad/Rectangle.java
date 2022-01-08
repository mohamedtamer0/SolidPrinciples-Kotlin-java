package LiskovSubstitutionJava.bad;

import java.util.Locale;

public class Rectangle {
    protected double width;
    protected double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return String.format(Locale.ENGLISH, "Rectangle width = %.1f, height = %.1f", width, height);
    }
}


class ShapeUtils {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 30);
        System.out.println("Old " + rectangle.toString());

        Rectangle newRectangle = extendRectangleWidth(rectangle, 2);
        System.out.println("New " + newRectangle.toString());
    }

    public static Rectangle extendRectangleWidth(Rectangle rectangle, int times) {
        double newWidth = rectangle.getWidth() * times;
        rectangle.setWidth(newWidth);
        return rectangle;
    }
}