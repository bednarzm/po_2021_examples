package pl.edu.pw.mini.po.fourth.hierarchy.letter;

public class NormalLetter extends Letter  {
	
	public NormalLetter() {
		super(1, "");
	}

	public NormalLetter(int a, String text) {
		super(a, text);
	}


	@Override
	public String toString() {
		return "NormalLetter";
	}

}
