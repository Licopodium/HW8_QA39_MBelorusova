class MainEmployee {
    public static void main(String[] args) {

    WageEmployee we1 = new WageEmployee(867, "Alice", 25, 40, 400);
    WageEmployee we2 = new WageEmployee(763, "Eve", 28, 38, 420);
    SalaryEmployee se1 = new SalaryEmployee(567, "John", 30, 7000);
    SalaryEmployee se2 = new SalaryEmployee(456, "Bob", 35, 8000);
    Manager m1 = new Manager(223, "Mike", 40, 9000, 0.4);
    Manager m2 = new Manager(264, "Sara", 32, 8500, 0.3);

    Employee[] employees = new Employee[10];
    employees[0] = we1;
    employees[1] = we2;
    employees[2] = se1;
    employees[3] = se2;
    employees[4] = m1;
    employees[5] = m2;

        print(employees);
    }


    public static void print(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.println("Employee" + (i + 1) + ": " + employees[i].toString());
            }
        }
    }
}