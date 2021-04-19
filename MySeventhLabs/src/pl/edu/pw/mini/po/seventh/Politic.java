package pl.edu.pw.mini.po.seventh;

public class Politic {
	
	private General general = new General();
	
	public void startTheWar() {
		
		try {
			general.doTheWar();
		} catch (WarImpossibleException generalException) {
			generalException.printStackTrace();
			generalException.getCause();
		}
	
	}
	
}
