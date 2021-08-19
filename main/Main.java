package sravanikusuma.assignment.main;
import sravanikusuma.assignment.data.*;
import sravanikusuma.assignment.singleton.*;
public class Main {

	public static void main(String[] args) {
		
		Data obj =new Data();
		//instance variables get default values
		obj.printDetails();
		//local variables which are not initialized does not get any default values
		obj.display();
		//static methods can be called without creating an object of  the class
		Singleton singleton= Singleton.setValue("Sravani");
		singleton.printString();
				

		
	}

}
