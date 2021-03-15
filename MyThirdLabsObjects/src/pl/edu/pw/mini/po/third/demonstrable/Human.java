package pl.edu.pw.mini.po.third.demonstrable;
/**
 * Funny class.
 * @author mabd
 * 
 */
public class Human {
	private static int counter;
	
	private int id;
	
	private int age;
	private String name;
	private String surname;
	private String concatenatedNameAndSurname;
	private String comment;
	private int anyParam;
	
	public Human(int age, String name, String surname) {
		this(1);
		
		this.id = counter++;
		
		if(age < 30) {
			comment = "young!";
		} else {
			comment = "very old!";
		}
		
		concatenatedNameAndSurname = name+surname;
		
		this.age = age;
		this.name = name;
		this.surname = surname;
		
		
	}
	
	public Human(String comment) {
		super();
		this.comment = comment;
	}

	private Human(int anyParam) {
		this.anyParam = anyParam;
	}
	
	public static int staticGetCounter() {
		return counter;
	}
	
	public static void staticSetCounter(int newCounter) {
		counter = newCounter;
	}
	
	public void nonStaticMessage() {
		System.out.println("Hello!");
	}
	
	public int getId() {
		return id;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}
	
}
