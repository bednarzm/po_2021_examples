package pl.edu.pw.mini.po.secondlabs;

public class SecondClass {

	public static void main(String[] args) {
		
		System.out.println("Hello!");
		
		boolean value = false;
		value = true; 
		
		byte myFlag = 127;
		short myAge = 39;
		int highValue = 2000000;
		long maxValue = 1000000000;
		float length = 1.5f;
		double height = 2.29d;
		
		//System.out.println("Our values: " + myFlag);
		int newValue = 1000;
		myFlag = (byte)newValue;
		
		//System.out.println("Byte value after casting: " + myFlag);
		
		int[] myArray = new int[20]; 
		myArray[0] = 10;
		myArray[1] = 20;
		myArray[2] = 30;
		
		//System.out.println("My array: " + myArray.length);

		int[] fastArray = {91, 2, 7, 8};
		
		//System.out.println("My fast array: " + fastArray.length);
		//System.out.println("Value under index 1: " + fastArray[0]);
		
		System.out.println("Out of bound: " + fastArray[3]);
		
		int[][] multiDimArray = new int[10][10]; 
		int[][][][] plentyOfDimensions = new int[10][10][10][10];
		System.out.println("Multi dev array: " + multiDimArray[6][9] );
		System.out.println("Multi dev array: " + multiDimArray[6] );
		
		int[][] another = {{1,2}, {3,4}};
		
		boolean testValue = true;
		if(testValue) {
			System.out.println("Yeah!");
		} else if(4 == 5) {
			
		} else {
			
		}
		
		int i;
		for(i=0;i<10;i++) {
			System.out.println("Petla: " + i);
		}
		
		System.out.println();
		for(int k=0;k<fastArray.length;k++) {
			System.out.print(fastArray[k] + ";");
			
		}
		
	}

}


