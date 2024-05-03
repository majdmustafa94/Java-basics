package Interface;

public class Main {
    public static void main(String[] args) {

        Emp majd = new Emp(7, "Majd", 500, 0.2);
        majd.allowance(100);
        majd.discount(50);

        System.out.println(majd);

    }
}
