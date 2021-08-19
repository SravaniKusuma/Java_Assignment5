package sravanikusuma.assignment.singleton;

public class Singleton {
	
	String name;
	public static Singleton setValue(String n)
	{
		// cannot be done as static methods can access only static variables
		name=n;
		Singleton d=new Singleton();
		return d;
	}
	public void printString()
	{
		System.out.println("The value in string is : "+name);
	}

}
