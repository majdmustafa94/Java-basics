package Abstract;

public class Main {

    public static void main(String[] args) {

        Square s = new Square(1, "square", 5);
        Rectangel r = new Rectangel(2, "rectangel", 5, 6);

        s.print();
        r.print();

    }
}
