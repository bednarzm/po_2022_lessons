package pl.edu.pw.mini.po.extensions.postman;

public class Receiver {
	
	private Parcel parcel;
	
	public boolean putParcel(Parcel parcel) {
		boolean result = false;
		
		if(this.parcel == null) {
			this.parcel = parcel;
			result = true;
		}
		
		return result;
	}
	
	public void openParcel() {
		if(this.parcel != null) {
			this.parcel.openParcel();
		}
	}
	
}
