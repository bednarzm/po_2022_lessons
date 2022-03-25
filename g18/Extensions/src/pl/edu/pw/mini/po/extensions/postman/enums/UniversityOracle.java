package pl.edu.pw.mini.po.extensions.postman.enums;

public class UniversityOracle {

	public static int getFacultyStudents(String faculty) {
		int result = 0;
		
		switch(faculty) {
		case "MiNI":
			result = 500;
			break;
		case "Elka":
			result = 700;
			break;
			//
		}
		
		return result;
	}

	public static int getFacultyStudents(Faculty faculty) {
		int result = 0;
		
		switch(faculty) {
		case ELKA:
			System.out.println(faculty.getExtendedNams());
			result = 500;
			break;
		case FTIMS:
			result = 700;
			break;
		case MINI:
			result = 700;
			break;
		}
		
		return result;
	}
	
}
