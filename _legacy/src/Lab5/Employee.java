package Lab5;


class Employee extends Person {
    private double baseSalary;
    private double taxPercent;
 
    public Employee(String name, int age, double baseSalary, double taxPercent) {
        this.name = name;
        this.age = age;
        this.baseSalary = baseSalary;
        this.taxPercent = taxPercent;
    }
 
    @Override
    public double calculateSalary() {
        return baseSalary - (baseSalary * taxPercent / 100);
    }
}
 