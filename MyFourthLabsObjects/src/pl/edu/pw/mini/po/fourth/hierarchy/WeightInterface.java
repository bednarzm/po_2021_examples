package pl.edu.pw.mini.po.fourth.hierarchy;

import java.util.Random;

public interface WeightInterface extends InterfaceA, InterfaceB{
	int getWeight();
	default int getRand() {
		return new Random().nextInt(10);
	}
}
