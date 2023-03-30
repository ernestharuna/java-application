package Question_2;

public class Manager extends MonthlyEmployee {
    private double bonus;

    public Manager(String name, double salary) {
        super(name, salary);
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double getSalary() {
        return super.getSalary() + bonus;
    }
}
