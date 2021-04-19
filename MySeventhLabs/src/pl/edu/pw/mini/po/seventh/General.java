package pl.edu.pw.mini.po.seventh;

import java.util.List;

public class General {

	private List<BattleTeam> battleTeams = List.of(new TankTeam(), new SoldiersTeam());

	public void doTheWar() throws WarImpossibleException {

		try {
			for (BattleTeam battleTeam : battleTeams) {
				battleTeam.fight();
			}
		} catch (TankException tankException) {
			//ukradliCzolgException.printStackTrace();
			throw new WarImpossibleException("Wojna niemozliwa", tankException);
		}
	}

}
