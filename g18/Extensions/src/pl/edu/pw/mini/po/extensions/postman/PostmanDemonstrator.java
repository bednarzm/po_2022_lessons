package pl.edu.pw.mini.po.extensions.postman;

public class PostmanDemonstrator {

	public static void main(String[] args) {
		
		Parcel parcel = new Bomb();
		
		doJob(parcel);
		
	}

	private static void doJob(Parcel parcel) {
		Postman postman = new Postman();
		
		postman.putParcel(parcel);
		
		Receiver receiver = new Receiver();
		//after time...
		postman.passParcel(receiver);
		
		receiver.openParcel();
	}
	
}
