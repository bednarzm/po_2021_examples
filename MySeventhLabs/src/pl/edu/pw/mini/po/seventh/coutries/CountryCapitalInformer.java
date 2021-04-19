package pl.edu.pw.mini.po.seventh.coutries;

public class CountryCapitalInformer {
	
	protected String getEnumCapitalName(Countries country) {
		String result;
		
		result = country.getCapital();
		
		return result;
	}
	
	public String getCapitalName(String country) {
		String result;

		country = country.toUpperCase();
		switch (country) {
		case "POLAND":
			result = "Warsaw";
			break;
		case "FRANCE":
			result = "Paris";
			break;
		case "GERMANY":
			result = "Berlin";
			break;
		default:
			result = "";
		}

		return result;
	}
	
	/**
	 * Method serves three cases only: POLAND, FRANCE, GERMANY
	 * @param country
	 * @return
	 */
	 public String getCapital(String country) throws ContryUnknownException{
		 String result = getCapitalName(country);
		 
			if("".equals(result)) {
				throw new ContryUnknownException("No nie ma kraju i tyle");
			} 
			
			return result;
	}
}
