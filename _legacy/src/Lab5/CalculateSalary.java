package Lab5;

class CalculateSalary {
    public static void calculateAndPrintSalary(Person p) {
System.out.println("Name: " + p.name + ", Age: " + p.age);
        System.out.println("Final Salary: " + p.calculateSalary());
    }
}