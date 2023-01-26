package tester;

import java.util.Scanner;

import com.app.org.EmpidOutOfBoundException;
import com.app.org.Employee;
import com.app.org.Manager;
import com.app.org.Worker;

public class TestOrganization {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of employees");
		Employee [] employee = new Employee[sc.nextInt()];
		int ch;
		int count=0;
		System.out.println("1. Hire Manager");
		System.out.println("2. Hire Worker ");
		System.out.println("3. Display information of all employees ");
		System.out.println("4. Update basic salary");
		System.out.println("10 Exit");
		
		do {
		System.out.println("Enter the choice");
		ch = sc.nextInt();
		switch(ch)
		{
		case 1:
			System.out.println("Enter First name, last name, basic, deptid, perfbonus");
		employee[count]= new Manager(sc.next(),sc.next(), sc.nextDouble(), sc.nextInt(),sc.nextDouble());
		count++;
		break;
		
		case 2:
			System.out.println("Enter First name, last name, basic, deptid, hoursWorked,hourlyRate");
		employee[count]= new Worker(sc.next(),sc.next(),  sc.nextInt(),sc.nextDouble(),sc.nextInt(),sc.nextInt());
		count++;
		break;
		
		case 3:
			for(Employee emp:employee)
			{
				System.out.println(emp.toString());
				System.out.println(emp.NetSalary());
			}
		break;
		
		case 4:
			try {
					System.out.println("Enter Employee Id and Salary Increment");
				
				int id=sc.nextInt();
				double incr=sc.nextDouble();			
			if(id>count)
			{	
				throw new EmpidOutOfBoundException("Invalid Employee ID");
//				double prev_basic=employee[id-1].getBasic();
//				employee[id-1].setBasic(prev_basic+incr);
			}
			else
			{
				double update_basic;
			    update_basic=employee[id-1].getBasic()+incr;
				employee[id-1].setBasic(update_basic);
			}
			
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
			break;
		case 10:
			System.out.println("Thank You!!");
			break;
		
		}//switch

		}while(ch!=10);//do-while
	}// main

}// class
