package pl.edu.pw.mini.po.extensions.postman;

public class Letter extends Parcel {
	
	public Letter(int postNumber) {
		super(postNumber, true);
	}

	@Override
	public void openParcel() {
		System.out.println("Hello!");
	}
	
}
