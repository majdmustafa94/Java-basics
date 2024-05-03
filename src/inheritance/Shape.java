package inheritance;

public class Shape {

    public int id;
    protected String name;
    private double lenght;

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public Shape() {

    }

    public Shape(int id, String name, double lenght) {
        this.id = id;
        this.name = name;
        setLenght(lenght);
    }

    public void print() {
        System.out.print(id + " " + name + " " + lenght);
    }

}
