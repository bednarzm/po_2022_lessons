package pl.edu.pw.mini.po.interfaces;

public class WrapperDemonstrator {

	public static void main(String[] args) {
		int myInt = 0;
		
		Integer integer = Integer.valueOf(100);
		String firstInt = "2";
		String secondInt = "2";
		System.out.println(firstInt + secondInt);
		
		int firstParsed = Integer.parseInt(firstInt);
		int secondParsed = Integer.parseInt(secondInt);
	
		int result = firstParsed + secondParsed;
		
		Integer singleInteger = 4;
		int singlePrimitive = singleInteger;
		
		
		
		System.out.println(result);
		
	
	}
	
	

}
