package Abstract;

public class Rectangel extends Shape {

    public double width;

    public Rectangel(int id, String name, double length, double width) {
        super(id, name, length);
        this.width = width;
    }

    @Override
    public double area() {
        return width * getLength();
    }

    @Override
    public double perimeter() {
        return 2 * (width + getLength());
    }

    public void print() {
        super.print();
        System.out.println(" " + width + " " + area() + " " + perimeter());
    }
}
