package pl.edu.pw.mini.po.seventh.coutries;

public class NiceCountryCapitalInformer extends CountryCapitalInformer {

	@Override
	public String getCapital(String country) {
		return getCapitalName(country);
	}

}
