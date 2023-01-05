package com.app.fruits;

public class Apple extends Fruit{
	
	public Apple(String colour, String name, double weight)
	{
		super(colour,name,weight);
		
	}
	
	
	public String taste()
	{
		return "Sweet and Sour";
	}
	public void jam()
	{
		System.out.println("Name: "+super.getName()+" Making Jam");
	}
}
