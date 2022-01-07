package OpenClosedjava.good;

public class GoodEx {
}


interface Shape {

     double calculateArea();

}

class Rectangle implements Shape {

    Double length;
    Double width;

    public double calculateArea() {

        return length * width;
    }
}

class Circle implements Shape {

    public Double radius;

    public double calculateArea() {

        return (22 / 7) * radius * radius;
    }
}


class Square implements Shape {

    Double length;
    Double width;

    @Override
    public double calculateArea() {
        return length * width;
    }
}
