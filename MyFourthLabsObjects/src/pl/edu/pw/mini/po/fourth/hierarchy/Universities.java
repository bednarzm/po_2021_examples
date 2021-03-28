package pl.edu.pw.mini.po.fourth.hierarchy;

public enum Universities {
	
	PW("Politechnka "), UW("Uniwersytet"), AGH(""), PK(""), UJ("");
	
	private String fullName;
	
	private Universities(String fullName) {
		this.fullName = fullName;
	}
	
	public String getFullName() {
		return fullName;
	}

}
