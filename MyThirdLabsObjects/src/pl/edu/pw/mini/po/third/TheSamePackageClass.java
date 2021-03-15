package pl.edu.pw.mini.po.third;

import pl.edu.pw.mini.po.third.demonstrable.InitialClass;

public class TheSamePackageClass {
	public boolean goodClass; 
	
	private int number;
	private int factor = 10;
	public InitialClass localInitialClass;
	
	protected short protectedValue; 
	byte defaultField;
	
	
	public void printSomething() {
		System.out.println("Hello!");
	}
	
	public TheSamePackageClass() {
		
	}
	
	public TheSamePackageClass(int number) {
		this.number = number;
	}
	
	/**
	 * This is my wonderful method!!!
	 * @param value
	 * @return 
	 */
	public int calculate(int... value) {
		int result = 0;
		//My comment 
		/*
		for(int i=0;i<value.length;i++) {
			result += value[i];
		}
		*/
		return result;
	}
	
	public int calculate(int a, int b, int c) {
		return 0;
	}
	
	public int calculate(int a, int b) {
		inform();
		return (a + b) * factor;
	}
	
	private void inform() {
		System.out.println("The method has started...");
	}
	
}
