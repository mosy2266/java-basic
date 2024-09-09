package oop1.ex;

public class Rectangle {
    int width;
    int height;
    int area;
    int perimeter;
    boolean square;

    void calculateArea() {
        area = width * height;
    }

    void calculatePerimeter() {
        perimeter = 2 * (height + width);
    }

    void isSquare() {
        if (height == width) {
            square = true;
        } else {
            square = false;
        }
    }
}
