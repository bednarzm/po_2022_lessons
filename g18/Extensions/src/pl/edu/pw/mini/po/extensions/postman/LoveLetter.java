package pl.edu.pw.mini.po.extensions.postman;

public class LoveLetter  extends Letter {

	@Override
	public void openParcel() {
		super.openParcel();
		System.out.println("My dear!");
	}

}
