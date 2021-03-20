package pl.edu.pw.mini.po.fourth.hierarchy;

public class LoveLetter extends Letter {

	public String getSerialNumber() {
		return "Love serial number" + super.getSerialNumber();
	}

	@Override
	public String toString() {
		return "LoveLetter";
	}
	
}
