package week1.day1;

public class Car {
	
	public void applyBreak()
	
	{
		System.out.println("After applied break the car should stop");
		
	}
	

	public void applyGear()
	
	{
		System.out.println("To apply gear the gear should be in  nutral");
	}
	
	public void switchonAC()
	
	{
		System.out.println("Switchon the AC once starts the car");
	}
	
	public void applyAcclerate()
	
	{
		System.out.println("once accelerate applied car starts moving");
		
			}
	
	public static void main(String[] args)
	
	{
		Car bmw = new Car();
		
		bmw.applyBreak();
		bmw.applyAcclerate();
		bmw.applyGear();
		bmw.switchonAC();
	}
		
	}



