package pl.edu.pw.mini.po.part4.threads.race;

public class ThoughtsHolder {

	private StringBuffer stringBuffer = new StringBuffer();
	
	public void append(String stringToAppend) {
		stringBuffer.append(stringToAppend);
	}
	
	public void printFinalString(String name) {
		System.out.println("Thread: " + name + " " + stringBuffer.toString());
	}
	
}
