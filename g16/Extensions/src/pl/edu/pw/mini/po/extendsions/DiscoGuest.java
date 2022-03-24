package pl.edu.pw.mini.po.extendsions;

import java.util.Random;

public class DiscoGuest {
	private int age;
	private String name;
	
	public DiscoGuest(String name) {
		this.name = name;
		this.age = 16 + new Random().nextInt(15);
	}

	public int getAge() {
		return age;
	}
	
}
