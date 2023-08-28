class Manager extends SalaryEmployee {
    private double bonuses;

    public Manager(int id, String name, int age, double salary, double bonuses) {
        super(id, name, age, salary);
        this.bonuses = Math.min(Salary.maxBonuses, bonuses);
    }

    @Override
    public double calcSalary() {
        return super.calcSalary() + super.calcSalary() * bonuses;
    }

    @Override
    public String toString() {
        return super.toString() + calcSalary();
    }
}