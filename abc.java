import java.util.Scanner;

class Employee {
    protected int employee_id;
    protected String name;
    protected double basicSalary;

    public Employee(int employee_id, String name, double basicSalary) {
        this.employee_id = employee_id;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    public void showDetails() {
        System.out.println("Employee ID: " + employee_id);
        System.out.println("Name: " + name);
    }

    public double calculateGrossSalary() {
        return basicSalary;
    }

    public double calculateNetSalary() {
        return calculateGrossSalary();
    }
}

class Manager extends Employee {
    private double petrolAllowance;
    private double foodAllowance;
    private double otherAllowance;

    public Manager(int employee_id, String name, double basicSalary) {
        super(employee_id, name, basicSalary);
        calculateAllowances();
    }

    private void calculateAllowances() {
        petrolAllowance = 0.08 * basicSalary;
        foodAllowance = 0.13 * basicSalary;
        otherAllowance = 0.03 * basicSalary;
    }

    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("Designation: Manager");
        System.out.println("Petrol Allowance: " + petrolAllowance);
        System.out.println("Food Allowance: " + foodAllowance);
        System.out.println("Other Allowance: " + otherAllowance);
        System.out.println("Gross Salary: " + calculateGrossSalary());
        System.out.println("Net Salary: " + calculateNetSalary());
    }

    @Override
    public double calculateGrossSalary() {
        return basicSalary + petrolAllowance + foodAllowance + otherAllowance;
    }
}

class MarketingExecutive extends Employee {
    private int kilometersTravelled;
    private double tourAllowance;
    private double telephoneAllowance;

    public MarketingExecutive(int employee_id, String name, double basicSalary, int kilometersTravelled) {
        super(employee_id, name, basicSalary);
        this.kilometersTravelled = kilometersTravelled;
        calculateAllowances();
    }

    private void calculateAllowances() {
        tourAllowance = 5 * kilometersTravelled;
        telephoneAllowance = 1500;
    }

    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("Designation: Marketing Executive");
        System.out.println("Kilometers Travelled: " + kilometersTravelled);
        System.out.println("Tour Allowance: " + tourAllowance);
        System.out.println("Telephone Allowance: " + telephoneAllowance);
        System.out.println("Gross Salary: " + calculateGrossSalary());
        System.out.println("Net Salary: " + calculateNetSalary());
    }

    @Override
    public double calculateGrossSalary() {
        return basicSalary + tourAllowance + telephoneAllowance;
    }
}

public class abc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter details for Manager:");
        int managerId = getInput(scanner, "Employee ID");
        String managerName = getInput(scanner, "Name");
        double managerSalary = getInput(scanner, "Basic Salary");

        Employee employee1 = new Manager(managerId, managerName, managerSalary);

        System.out.println("Enter details for Marketing Executive:");
        int executiveId = getInput(scanner, "Employee ID");
        String executiveName = getInput(scanner, "Name");
        double executiveSalary = getInput(scanner, "Basic Salary");
        int kilometersTravelled = getInput(scanner, "Kilometers Travelled");

        Employee employee2 = new MarketingExecutive(executiveId, executiveName, executiveSalary, kilometersTravelled);

        showDetails(employee1);
        System.out.println("----------------------");
        showDetails(employee2);

        scanner.close();
    }

    public static void showDetails(Employee employee) {
        employee.showDetails();
    }

    public static int getInput(Scanner scanner, String prompt) {
        System.out.print(prompt + ": ");
        return scanner.nextInt();
    }

    public static double getInput(Scanner scanner, String prompt) {
        System.out.print(prompt + ": ");
        return scanner.nextDouble();
    }

    public static String getInput(Scanner scanner, String prompt) {
        System.out.print(prompt + ": ");
        return scanner.next();
    }
}
