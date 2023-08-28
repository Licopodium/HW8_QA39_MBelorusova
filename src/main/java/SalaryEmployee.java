class SalaryEmployee extends Employee{
    private double salary;

    public SalaryEmployee(int id, String name, int age, double salary) {
        super(id, name, age);
        this.salary = Math.max(Salary.minSalary, salary);
    }

    @Override
    public double calcSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return super.toString() + ", Salary: " + calcSalary();
    }
}
