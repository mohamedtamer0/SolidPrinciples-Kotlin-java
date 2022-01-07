package OpenClosedjava;

public class BadEx {
}


class Rectangle {

    public Double length;
    public Double width;
}



class Circle {

    public Double radius;
}




class AreaCalculator {

    public Double calculateRectangleArea(Rectangle rectangle) {

        return rectangle.length * rectangle.width;
    }

    public Double calculateCircleArea(Circle circle) {

        return (22 / 7) * circle.radius * circle.radius;

    }


}