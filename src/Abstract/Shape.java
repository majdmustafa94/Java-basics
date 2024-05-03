package Abstract;

public abstract class Shape {
    public int id;
    protected String name;
    private double length;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public Shape(int id, String name, double length) {
        this.id = id;
        this.name = name;
        setLength(length);
    }

    public abstract double area();

    public abstract double perimeter();

    public void print() {
        System.out.print(id + " " + name + " " + length);
    }

}
