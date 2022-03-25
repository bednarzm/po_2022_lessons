package pl.edu.pw.mini.po.extensions.postman;

public abstract class Parcel {
	private int postNumber;
	private boolean pririty;
	
	public Parcel(int postNumber) {
		this.postNumber = postNumber;
	}

	public Parcel(int postNumber, boolean pririty) {
		this.postNumber = postNumber;
		this.pririty = pririty;
	}

	public abstract void openParcel();
}
