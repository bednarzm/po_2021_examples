package pl.edu.pw.mini.po.task1b.solution.mineryobject;

import java.util.Random;

public class Uraninitium extends RadioactiveMineryObject {

	protected UranitiumType uranitiumType;

	public Uraninitium(float basicMarketValue) {
		super(basicMarketValue);
		Random random = new Random();
		int randomValue = random.nextInt(3);
		switch (randomValue) {
		case 0:
			uranitiumType = UranitiumType.FOURMARIERYT;
			break;
		case 1:
			uranitiumType = UranitiumType.TORBERNIT;
			break;
		case 2:
			uranitiumType = UranitiumType.URANOFAN;
			break;
		}
	}

	@Override
	public double getModifiedMarketValue() {
		return basicMarketValue * uranitiumType.getFactor();
	}

}
