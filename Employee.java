public class Employee extends Person {
    private int ID;
    private double payRate;

    /**
     * @param name
     * @param ID
     * @param payRate
     */
    public Employee(String name, int ID, double payRate) {
        super(name);
        this.ID = ID;
        this.payRate = payRate;
    }

    public double pay() {
        return payRate;
    }

    @Override
    public String toString() {
        return super.toString() + "\nID: " + ID + "\nPay Rate: " + payRate;
    }
}

/*
 * Employee, that extends Person, and has: two additional instance variables, ID
 * and payRate; and an additional method, pay, that returns the payRate.
 * Override the toString method accordingly.
 */
