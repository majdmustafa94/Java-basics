package Abstract;

public class Square extends Shape {

    public Square(int id, String name, double length) {
        super(id, name, length);
    }

    @Override
    public double area() {
        return getLength() * getLength();
    }

    @Override
    public double perimeter() {
        return 4 * getLength();
    }

    public void print() {
        super.print();
        System.out.println(" " + area() + " " + perimeter());
    }
}
