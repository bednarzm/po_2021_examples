package pl.edu.pw.mini.po.seventh.coutries;

public enum Countries {
	
	POLAND("WARSAW"), GERMANY("BERLIN"), FRANCE("PARIS");
	
	private Countries(String capital) {
		this.capital = capital;
	}

	private String capital;

	public String getCapital() {
		return capital;
	}
	
	
	public static Countries fromString(String stringValue) throws ContryUnknownException {
		Countries result;
		
		stringValue = stringValue.toUpperCase();
		switch (stringValue) {
			case "POLAND":
				result = POLAND;
				break;
			case "FRANCE":
				result = FRANCE;
				break;
			case "GERMANY":
				result = GERMANY;
				break;
			default:
				throw new ContryUnknownException("Nie ma!");
		}
		
		return result;
	}
	
}
