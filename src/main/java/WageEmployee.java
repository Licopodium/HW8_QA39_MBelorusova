class WageEmployee extends Employee implements Salary {
    private double hourWage;
    private double hours;

    public WageEmployee(int id, String name, int age, double hourWage, double hours) {
        super(id, name, age);
        this.hourWage = Math.max(Salary.minHourWage, hourWage);
        this.hours = Math.min(Salary.maxHours, hours);
    }

    @Override
    public double calcSalary() {
        return hours * hourWage;
    }

    @Override
    public String toString() {
        return super.toString() + ", Salary: " + calcSalary();
    }
}