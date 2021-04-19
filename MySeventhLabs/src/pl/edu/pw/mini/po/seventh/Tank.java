package pl.edu.pw.mini.po.seventh;

import java.util.Random;

public class Tank {
	public void fight() throws TankOurOfOrderException {
		if((new Random()).nextInt(100)==0) {
			throw new TankOurOfOrderException("Wyspreglik polecial");
		} else {
			System.out.println("BOOOM!");
		}
	}
}
