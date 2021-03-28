package pl.edu.pw.mini.po.fourth;

import java.math.BigInteger;
import java.util.Random;

public class Demonstrator {

	public static void main(String[] args) throws InterruptedException {
		
		String myString1 = new String("aaaa");
		String myString2 = new String("aaaa1");
		
		if(myString1.equals(myString2)) {
			System.out.println("Rowny :)");
		} else {
			System.out.println("Nie rowny :( ");
		}
		
		System.out.println("Nowe porownanie");
		
		myString1 = "aaaa";
		myString2 = "aaaa12";
		
		if(myString1 == myString2) {
			System.out.println("Rowny :)");
		} else {
			System.out.println("Nie rowny :( ");
		}
		
		String myString3 = null;// = "something";
		//compareSth(myString3);
		//demonstrateOtherClasses();
		//doSth();
		//presentUsefulClasses();
		//multiConcatenate();
		
		//hack();
		
	}
	
	private static void hack() {
		Integer first = Integer.valueOf(300);
		Integer second = Integer.valueOf(300);
		
		
		
		if(first == second) {
			System.out.println("Equal");
		} else {
			System.out.println("Not equal");
		}
		
	}
	
	private static void compareSth(String value) {
		//abc 
		
		if(value != null & value.equals("abc") ) {
			System.out.println("Compare :)");
		} else {
			System.out.println("Not :)");
		}
		
		if("abc".equals(value)) {
			System.out.println("Compare :)");
		} else {
			System.out.println("Not :)");
		}
		
	}
	
	private static void demonstrateOtherClasses() {
		
		Integer myInteger = Integer.valueOf(10);
		myInteger = 1;
		myInteger = Integer.valueOf(19);
		int myPrimitive = 2;
		
		if(myInteger.equals(123)) {
			
		}
		
		check("123a");
		
		Double myDouble;
		Long myLong;
		Boolean myBoolean;
		
		int[]myArray;
		
		int changedValue; 
		
		Integer oftenChangedValue; //Kazda zmiana Integer.
		
		
		
		
	}
	
	private static void doSth() {
		Object object = new Object(); 
		object.toString();
		System.out.println("Object: " + object);
		
		MyObject myObject = new MyObject();
		System.out.println("MyObject: " + myObject);
		
		
		
		
	}
	
	private static void presentUsefulClasses() {
		Random random = new Random();
		for(int i = 0;i<3;i++) {
			System.out.println("Number " + i + " " + random.nextInt(10) + 100);
		}
		
		System.out.println("Div: " + 4/3.0);
		
		BigInteger bigInteger;
		
	}
	
	private static void multiConcatenate() throws InterruptedException {
		
		System.out.println("First " + "Second " + "Third");
		
		String result = ""; 
		
		long before = System.currentTimeMillis();
		for(int i=0;i<500_00;i++) {
			result += "Additional";//result = result + "Additional";//"".concat()
		}
		long after = System.currentTimeMillis();
		System.out.println("Total time for classic concatenation: " + (after - before)/1000.0 + "s.");
		
		StringBuffer stringBuffer = new StringBuffer("");
		before = System.currentTimeMillis();
		for(int i=0;i<500_000;i++) {
			stringBuffer.append("Additional");//result = result + "Additional";
		}
		result = stringBuffer.toString();
		after = System.currentTimeMillis();
		System.out.println("Total time for concatenation using StringBuffer: " + (after - before)/1000.0 + "s.");
		//System.out.println("Result: " + result);
		
		StringBuilder stringBuilder = new StringBuilder("");
		before = System.currentTimeMillis();
		for(int i=0;i<500_0000;i++) {
			stringBuilder.append("Additional");//result = result + "Additional";
		}
		result = stringBuilder.toString();
		after = System.currentTimeMillis();
		System.out.println("Total time for concatenation using StringBuilder: " + (after - before)/1000.0 + "s.");
		//System.out.println("Result: " + result);
		
	}
	
	private static void check(String value) {
		int parsedInt = Integer.parseInt(value);
		if(parsedInt == 123) {
			System.out.println("Wow!");
		}
	}
	
	
	
}
