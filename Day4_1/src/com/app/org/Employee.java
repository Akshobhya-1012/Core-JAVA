package com.app.org;

public abstract class Employee {
	
	
	private static int empid_incr;
	private String firstname, lastname;
	private int deptid,empid;
	private double basic;
	
	static
	{
		empid_incr=1;
	}
	
	public Employee(String firstname, String lastname, int deptid, double basic) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.deptid = deptid;
		this.basic = basic;
		this.empid=empid_incr;
		empid_incr++;
	}//para constructor

	@Override
	public String toString() {
		return "Employee [firstname=" + firstname + ", lastname=" + lastname +
				" Empid= "+empid+", deptid=" + deptid + ", basic=" + basic
				+ "]";
	}//toString
	
	public void setBasic(double basic) {
		this.basic = basic;
	}

	public abstract double NetSalary();
	public double getBasic() {
		return basic;
	}


} //class
