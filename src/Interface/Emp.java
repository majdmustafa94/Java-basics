package Interface;

public class Emp implements EmpSalaries, EmpSalaryOp {
    public int id;
    public String name;
    private double salary;
    private double tax;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public Emp() {
        this(1, "known", 0.0, 0.0);
    }

    public Emp(int id, String name, double salary, double tax) {
        this.id = id;
        this.name = name;
        setSalary(salary);
        setTax(tax);
    }

    public Emp(String name, double salary, int id, double tax) {
        this.id = id;
        this.name = name;
        setSalary(salary);
        setTax(tax);
    }


    @Override
    public double yearlySalary() {
        return 12 * salary;
    }

    @Override
    public double netSalary() {
        return salary - salary * tax;
    }

    @Override
    public void allowance(double a) {
        salary = salary + a;
    }

    @Override
    public void discount(double d) {
        salary = salary - d;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + salary + " " + yearlySalary() + " " + tax + " " + netSalary();
    }
}
