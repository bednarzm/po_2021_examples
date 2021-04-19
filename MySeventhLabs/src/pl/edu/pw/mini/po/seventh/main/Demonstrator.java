package pl.edu.pw.mini.po.seventh.main;

import pl.edu.pw.mini.po.seventh.coutries.ContryUnknownException;
import pl.edu.pw.mini.po.seventh.coutries.Countries;
import pl.edu.pw.mini.po.seventh.coutries.CountryCapitalInformer;
import pl.edu.pw.mini.po.seventh.coutries.NiceCountryCapitalInformer;

public class Demonstrator {

	public static void main(String[] args) throws ContryUnknownException {
		
		
		//testCountryCapitalInformer();
		testNiceCountryInformer();
		String gotValue = "POLANDa";
		Countries country = Countries.fromString(gotValue);
	}
	
	
	private static void testNiceCountryInformer() throws ContryUnknownException {
		/*
		NiceCountryCapitalInformer niceCountryCapitalInformer = new NiceCountryCapitalInformer();
		System.out.println("Nice: " + niceCountryCapitalInformer.getCapital("GERMANY"));
		*/
		
		CountryCapitalInformer countryCapitalInformer = new NiceCountryCapitalInformer();
		countryCapitalInformer.getCapital("HH");
		
	}

	private static void testCountryCapitalInformer() {
		CountryCapitalInformer countryCapitalInformer = new CountryCapitalInformer();
		try {
			countryCapitalInformer.getCapital("POLANDx");
		} catch(ContryUnknownException contryUnknownException) {
			contryUnknownException.printStackTrace();
			System.out.println("What happened?: " + contryUnknownException.getMessage());
		}
	}
	
}
