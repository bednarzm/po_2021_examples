package pl.edu.pw.mini.po.task1b.solution.mineryobject;

public enum UranitiumType {

	URANOFAN(1), TORBERNIT(1.5), FOURMARIERYT(2);

	private double factor;

	private UranitiumType(double factor) {
		this.factor = factor;
	}

	public double getFactor() {
		return factor;
	}

}
