package Lab5;


public class Q1_Main {
    public static void main(String[] args) {
        
        Employee emp = new Employee("Yash", 30, 50000, 10);
        Unemployed unemp = new Unemployed("Dash", 28, 8000);
        SelfEmployed selfEmp = new SelfEmployed("Pash", 35, 60000, 15);
 
       
        CalculateSalary.calculateAndPrintSalary(emp);
        CalculateSalary.calculateAndPrintSalary(unemp);
        CalculateSalary.calculateAndPrintSalary(selfEmp);
    }
}