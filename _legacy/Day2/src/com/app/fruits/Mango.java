package com.app.fruits;

public class Mango extends Fruit {

	public Mango(String colour,String name,double weight)
	{	
		super(colour,name,weight);
		
	}
	
	public String taste()
	{
		return "Sweet";
	}
	
	public void pulp()
	{
		System.out.println("Name: "+super.getName()+" Colour: "+super.getColour()+" Creating Pulp!!");
		//System.out.println(super.toString()+" Creating Pulp!!");
		
		
	}
	
}
