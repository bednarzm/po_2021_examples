package pl.edu.pw.mini.po.task1b.solution.mineryobject;

public abstract class MineryObject implements MineryObjectEvaluator {

	protected float basicMarketValue;

	public MineryObject(float basicMarketValue) {
		super();
		this.basicMarketValue = basicMarketValue;
	}

	@Override
	public String toString() {
		return String.valueOf(basicMarketValue);
	}

}
