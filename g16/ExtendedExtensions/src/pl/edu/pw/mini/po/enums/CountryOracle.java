package pl.edu.pw.mini.po.enums;

public class CountryOracle {

	public static int checkCountry(String name) {
		int result = 0;

		switch (name) {
		case "Polska":
			result = 37000;
			break;
		case "Argentyna":
			result = 100000000;
		}

		return result;
	}
	
	public static int checkNarrowedCountry(Country country) {
		int result = 0;

		switch (country) {
		case POLAND:
			break;
		case ARGENTINA:
		
		}

		return result;
	}
	
}
