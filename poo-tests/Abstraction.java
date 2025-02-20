abstract class Employee {
    protected String name;
    protected double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public abstract double calculateSalary();
}

class EmployeeClt extends Employee {
    public EmployeeClt(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    public double calculateSalary() {
        return baseSalary * 1.2;
    }
}

class EmployeeCnpj extends Employee {
    public EmployeeCnpj(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    public double calculateSalary() {
        return baseSalary;
    }
}

public class Abstraction {
    public static void main(String[] args) {
        EmployeeClt clt = new EmployeeClt("Gabriel Carvalho", 1800);
        EmployeeCnpj cnpj = new EmployeeCnpj("Diogo Espindola", 1800);

        System.out.println(clt.calculateSalary());
        System.out.println(cnpj.calculateSalary());
    }
}