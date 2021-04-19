package pl.edu.pw.mini.po.task1b.solution.mineryobject;

import java.util.Random;

public abstract class RadioactiveMineryObject extends MineryObject {

	protected int radioactivity;

	public RadioactiveMineryObject(float basicMarketValue) {
		super(basicMarketValue);
		radioactivity = 700 + (new Random()).nextInt(250);
	}

	@Override
	public double getModifiedMarketValue() {
		return basicMarketValue;
	}

}
