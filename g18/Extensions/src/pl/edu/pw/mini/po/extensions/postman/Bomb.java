package pl.edu.pw.mini.po.extensions.postman;

public class Bomb  extends Parcel {

	public Bomb(int postNumber, boolean pririty) {
		super(postNumber, pririty);
	}

	public Bomb(int postNumber) {
		super(postNumber);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void openParcel() {
		System.out.println("BUM!!!");
	}

}
