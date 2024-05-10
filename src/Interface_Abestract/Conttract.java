package Interface_Abestract;

public class Conttract extends Emp implements EmpSalaryOp {

    private double tax;

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public Conttract(int id, String name, double salary, double tax) {
        super(id, name, salary);
        setTax(tax);
    }

    @Override
    public void netSalary() {
        double s = getSalary() - getSalary() * tax;
        setSalary(s);
    }

    @Override
    public void allowance(double a) {
        double s = getSalary() + a;
        setSalary(s);
    }

    @Override
    public void discount(double d) {
        double s = getSalary() - d;
        setSalary(s);
    }

    @Override
    public String toString() {
        return super.toString() + " " + tax;
    }
}
