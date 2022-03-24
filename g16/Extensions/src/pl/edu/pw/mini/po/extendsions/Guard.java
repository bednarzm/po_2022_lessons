package pl.edu.pw.mini.po.extendsions;

public class Guard {
	public boolean checkGuest(DiscoGuest discoGuest) {
		boolean result = false;

		if(discoGuest.getAge() > 18) {
			result = true;
		}
		
		return result;
	}
}
