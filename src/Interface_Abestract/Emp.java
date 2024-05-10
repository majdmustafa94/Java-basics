package Interface_Abestract;

public abstract class Emp {

    public int id;
    public String name;
    private double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Emp(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        setSalary(salary);
    }

    public abstract void netSalary();

    @Override
    public String toString() {
        return id + " " + name + " " + getSalary();
    }
}
