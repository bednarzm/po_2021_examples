package pl.edu.pw.mini.po.third;

import pl.edu.pw.mini.po.third.demonstrable.Human;
import pl.edu.pw.mini.po.third.demonstrable.InitialClass;

public class ObjectsDemonstrator {
	
	public static void main(String[] args) {
		
		//demonstrateBasics();
		demonstrateConstructors();
	}
	
	private static void demonstrateConstructors() {
		
		//keep the count
		
		Human firstHuman = new Human(26, "Jan", "Kowalski");
		System.out.println("First human: " + firstHuman.staticGetCounter() + " " + firstHuman.getId() + " " + firstHuman.getName()); 
		
		Human secondHuman = new Human(25, "Piotr", "Nowak");
		System.out.println("Second human: "+ secondHuman.staticGetCounter() + " " + secondHuman.getId() + " " + secondHuman.getName()); 
		
		firstHuman.nonStaticMessage();
		System.out.println("Static: " + firstHuman.staticGetCounter());
		
		System.out.println("Static: " + Human.staticGetCounter());
		
	}
	
	private static void demonstrateBasics() {
		Object myObject = new Object();
		myObject = null;
		System.out.println(myObject);
		
		TheSamePackageClass myTheSamePackageClass = new TheSamePackageClass();
		//Ctrl + Shif + o - the organization of imports
		
		myTheSamePackageClass.goodClass = true;
		myTheSamePackageClass.protectedValue = 12;
		
		System.out.println("The public value of: " + myTheSamePackageClass.goodClass);
		System.out.println("The value of: " + myTheSamePackageClass.defaultField);
		System.out.println("The value of: " + myTheSamePackageClass.localInitialClass);
	
		myTheSamePackageClass.printSomething();
		System.out.println(" The result: " + myTheSamePackageClass.calculate(3, 6));
	
		System.out.println(" The multi calc: " + myTheSamePackageClass.calculate(1,2,3,4,5,6,7));
	
		//Constructors
	}
	
}
