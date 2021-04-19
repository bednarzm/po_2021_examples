package pl.edu.pw.mini.po.seventh;

public abstract class BattleTeam {

	/**
	 * 
	 * @throws UkradliCzolgException when there is no more than 1 tank in the garage
	 */
	public abstract void fight() throws TankException;

}
