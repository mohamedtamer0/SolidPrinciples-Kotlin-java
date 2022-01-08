package LiskovSubstitutionJava.bad;

public class Square extends Rectangle {

    public Square(double sideLength) {
        super(sideLength, sideLength);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        height = width;
    }

    @Override
    public void setHeight(double height) {
        super.setHeight(height);
        width = height;
    }
}
