package pl.edu.pw.mini.po.seventh;

import java.util.ArrayList;
import java.util.List;

public class TankTeam extends BattleTeam {

	private List<Tank> tanks = new ArrayList<>();

	public TankTeam() {
		tanks.add(new Tank());
	}

	@Override
	public void fight() throws TankException {

		if (tanks.size() >= 2) {
			for (Tank tank : tanks) {
				tank.fight();
			}
		} else {
			throw new UkradliCzolgException("Nie ma wiec ukradli!");
		}

	}

}
