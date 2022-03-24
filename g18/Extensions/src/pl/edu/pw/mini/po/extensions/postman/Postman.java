package pl.edu.pw.mini.po.extensions.postman;

public class Postman {
	
	private Parcel parcel;
	
	public boolean putParcel(Parcel parcel) {
		boolean result = false;
		
		if(parcel != null) {
			this.parcel = parcel;
			result = true;
		}
		
		return result;
	}
	
	public void passParcel(Receiver receiver) {
		if(parcel != null) {
			receiver.putParcel(parcel);
			this.parcel = null;
		}
	}
	
}
