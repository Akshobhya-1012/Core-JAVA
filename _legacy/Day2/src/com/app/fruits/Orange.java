package com.app.fruits;

public class Orange extends Fruit{
	
	public Orange(String colour, String name, double weight)
	{
		super(colour,name,weight);
		
	}
	public String taste()
	{
		return "Sour";
	}
	
	public void juice()
	{
		System.out.println("Name: "+super.getName()+" Weight: "+super.getWeight()+"gms"+"Extracting Juice!!");
	}
}
