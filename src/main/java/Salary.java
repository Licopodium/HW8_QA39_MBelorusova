interface Salary {
    double minHourWage = 35;
    double maxHours = 480;
    double minSalary = 6000;
    double maxBonuses = 30;

    public abstract double calcSalary();
}
