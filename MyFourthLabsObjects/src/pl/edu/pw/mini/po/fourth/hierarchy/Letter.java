package pl.edu.pw.mini.po.fourth.hierarchy;

public class Letter {
	
	private static int counter;
	protected int serialNumber = counter++;
	private String text;
	
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
	
}
