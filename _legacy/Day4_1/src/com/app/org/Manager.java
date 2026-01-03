package com.app.org;

public class Manager extends Employee {
	private double perfbonus;
	public Manager(String firstname,String lastname,double basic,int deptid,double perfbonus)
	{
		super(firstname,lastname,deptid,basic);
		this.perfbonus = perfbonus;
	}//para const
@Override
public double NetSalary()
{
	 double NetSalary = getBasic() + perfbonus;
	 return NetSalary;
}
@Override
public String toString() {
	return "Manager [perfbonus=" + perfbonus + ", NetSalary()=" + NetSalary() + ", toString()=" + super.toString()
			+ "]";
}







}//class
