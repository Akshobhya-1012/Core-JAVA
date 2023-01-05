package com.app.fruits;

public class Fruit {
	private String colour;
	private String name;
	private double weight;
	private boolean fresh = false;
	
	public Fruit(String colour, String name, double weight)
	{
		super();
		this.colour=colour;
		this.name=name;
		this.weight=weight;
		this.fresh=true;
	}//constructor
	
	public boolean isFresh() {
		return fresh;
	}

	public void setFresh(boolean fresh) {
		this.fresh = fresh;
	}

	public String toString()
	{
		return "colour= "+this.colour+" name= "+this.name+" weight= "+this.weight+" gms";
	}//tostring
	///////////////////////////////////////////
	//getters
	public String getColour()
	{
		return  this.colour;
	}
	public String getName() {
		return name;
	}
	public double getWeight() {
		return weight;
	}
	//////////////////////////////////////
	public String taste()
	{
		return "No specific taste";
	}

}
