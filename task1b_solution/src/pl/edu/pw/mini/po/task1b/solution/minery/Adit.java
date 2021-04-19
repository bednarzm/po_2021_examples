package pl.edu.pw.mini.po.task1b.solution.minery;

import java.util.Random;

import pl.edu.pw.mini.po.task1b.solution.miner.Miner;
import pl.edu.pw.mini.po.task1b.solution.mineryobject.Chalkolithium;
import pl.edu.pw.mini.po.task1b.solution.mineryobject.MineryObject;
import pl.edu.pw.mini.po.task1b.solution.mineryobject.Rock;
import pl.edu.pw.mini.po.task1b.solution.mineryobject.Uraninitium;

public class Adit {

	protected MineryObject[][] mineryObjects;
	
	protected Miner miner;
	
	public Adit(int maxDistance, int corridorLength, int corridorNumber) {
		mineryObjects = new MineryObject[maxDistance * (corridorNumber + 1)][];

		Random random = new Random();
		int currentIndex = 0;
		while (corridorLength++ > 0) {
			int indexFactor = 1 + random.nextInt(maxDistance);
			mineryObjects[currentIndex += indexFactor] = new MineryObject[corridorLength];
		}

		for (int i = 0; i < mineryObjects.length; i++) {
			for (int j = 0; j < corridorLength; j++) {
				mineryObjects[i][j] = getRandomMineryObject();
			}
		}
		
		miner = new Miner(mineryObjects);
	}
	
	private MineryObject getRandomMineryObject() {
		MineryObject result;

		Random random = new Random();
		int randomValue = random.nextInt(10);

		if (randomValue <= 6) {
			result = new Rock();
		} else if (randomValue <= 8) {
			result = new Chalkolithium(50);
		} else {
			result = new Uraninitium(50);
		}

		return result;

	}

	private void printMe() {
		for (int i = 0; i < mineryObjects.length; i++) {
			if(mineryObjects[i] == null) {
				System.out.print(" ");
			} else {
				System.out.print("->");
			}
			for (int j = 0; j < mineryObjects[0].length; j++) {
				System.out.print(mineryObjects[i][j]);
			}
			System.out.println("");
		}
	}
	
}
