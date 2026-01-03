package Lab5;


class Unemployed extends Person {
    private double governmentAid;
 
    public Unemployed(String name, int age, double governmentAid) {
this.name = name;
        this.age = age;
        this.governmentAid = governmentAid;
    }
 
    @Override
    public double calculateSalary() {
        return governmentAid;
    }
}