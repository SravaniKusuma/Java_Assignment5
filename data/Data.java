package sravanikusuma.assignment.data;

public class Data {
	
	int age;
	char value;
	public void printDetails()
	{
		System.out.println("The age is : "+age);
		System.out.println("The character is : "+value);
	}
	public void display()
	{
		//we cannot print local variables without initializing them
		int num1,num2;
		System.out.println("The value of num1 is : "+num1);
		System.out.println("The value of num2 is : "+num2);
	}

}
