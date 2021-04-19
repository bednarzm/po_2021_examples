package pl.edu.pw.mini.po.task1b.solution.miner;

import pl.edu.pw.mini.po.task1b.solution.mineryobject.MineryObject;

public class Miner {

	protected float income;

	protected MineryObject[][] mineryObjects;

	public Miner(MineryObject[][] mineryObjects) {
		income = 0;
		this.mineryObjects = mineryObjects;
	}

	public void goMiner() {
		for (int i = 0; i < mineryObjects.length; i++) {
			for (int j = 0; j < mineryObjects[0].length; j++) {
				income += mineryObjects[i][j].getModifiedMarketValue();
				mineryObjects[i][j] = null;
			}
		}
	}

}
