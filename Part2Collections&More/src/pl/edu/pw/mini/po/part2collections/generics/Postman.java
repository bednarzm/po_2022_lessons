package pl.edu.pw.mini.po.part2collections.generics;

public class Postman <T extends Pack> {
	
	private T stuffToDeliver;

	public void setStuffToDeliver(T stuffToDeliver) {
		this.stuffToDeliver = stuffToDeliver;
	}

	public void deliverTo(T stuff) {
		this.stuffToDeliver = stuff;
	}

	public static <K extends Pack> void doSomething(K k){
		
	}

	

}
