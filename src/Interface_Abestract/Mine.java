package Interface_Abestract;

public class Mine {
    public static void main(String[] args) {

        Conttract c = new Conttract(1, "majd", 400, 0.2);
        c.allowance(100);
        c.discount(50);
        c.netSalary();

        System.out.println(c);

    }
}
