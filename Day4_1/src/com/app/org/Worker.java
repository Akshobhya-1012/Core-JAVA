package com.app.org;

public class Worker extends Employee {
	
	private int hoursWorked,hourlyRate;

	public Worker(String firstname, String lastname, int deptid, double basic, int hoursWorked, int hourlyRate) 
	{
		super(firstname, lastname, deptid, basic);
		this.hoursWorked = hoursWorked;
		this.hourlyRate = hourlyRate;
	}//para const
	
	@Override
	public String toString() {
		return "Worker [hoursWorked=" + hoursWorked + ", hourlyRate=" + hourlyRate + ", toString()=" + super.toString()
				+ "]";
	}
	
	@Override
	public double NetSalary()
	{
		double NetSalary = getBasic()+(hoursWorked*hourlyRate);
		return NetSalary;
	}
	

}
