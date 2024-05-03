package inheritance;

public class Rect extends Shape {

    private double width;


    public double getWidth() {

        return width;
    }

    public void setWidth(double width) {

        this.width = width;
    }

    public Rect(int id, String name, double lenght, double width) {
        super(id, name, lenght);
        this.width = width;
    }

    public double area() {
        return width * getLenght();
    }

    public void print() {
        super.print();
        System.out.println(" " + width + " " + area());
    }

}
