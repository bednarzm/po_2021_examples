package pl.edu.pw.mini.po.fourth.hierarchy.letter;

import pl.edu.pw.mini.po.fourth.hierarchy.WeightInterface;

public abstract class Letter implements WeightInterface {
	
	private static int counter;
	protected int serialNumber = counter++;
	protected String text;
	protected int weight;
	protected Address address;

	public Letter(int a, String text) {
		this.address = new Address(a);
		this.text = text;
	}
	
	public String getSerialNumber() {
		return String.valueOf(serialNumber);
	}
	
	@Override
	public String toString() {
		return "Letter";
	}

	public String getText() {
		return text;
	}
	
	public Address getAddress() {
		return address;
	}

	public int getWeight() {
		return weight;
	}

}
