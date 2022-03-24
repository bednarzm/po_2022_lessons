package pl.edu.pw.mini.po.extensions.control;

public class DrivingLicense {
	private int age;
	private String name;

	public DrivingLicense(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	@Override
	public String toString() {
		return "DrivingLicense [age=" + age + ", name=" + name + "]";
	}

}
