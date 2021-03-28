package pl.edu.pw.mini.po.fourth.hierarchy.letter;

public class LoveLetter extends Letter {

	public String getSerialNumber() {
		return "Love serial number" + super.getSerialNumber();
	}
	
	public LoveLetter(int i, String text) {
		super(i, text);
	}
	
	@Override
	public String toString() {
		return "LoveLetter";
	}
	
}
