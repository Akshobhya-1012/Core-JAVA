package Lab5;

class SelfEmployed extends Person {
    private double income;
    private double businessTax;
 
    public SelfEmployed(String name, int age, double income, double businessTax) {
this.name = name;
        this.age = age;
        this.income = income;
        this.businessTax = businessTax;
    }
 
    @Override
    public double calculateSalary() {
        return income - (income * businessTax / 100);
    }
}