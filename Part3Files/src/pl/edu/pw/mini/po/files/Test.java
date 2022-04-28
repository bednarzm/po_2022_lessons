package pl.edu.pw.mini.po.files;

import java.io.IOException;
import java.io.InputStream;

public class Test {

	public static void main(String[] args) {
		Test test = new Test();
		test.aaa();
	}
	
	private void aaa() {
		try {
			//InputStream inputStreamFromClassLoaderLocation = FirstClass.class.getClassLoader().getResourceAsStream("myFile1.txt");
			InputStream inputStreamFromClassLoaderLocation = getClass().getResourceAsStream("/myFile1.txt");
			
			if (inputStreamFromClassLoaderLocation != null) {
				System.out.println("Uda sie bo jestesmy w katalogu roboczym ");
				readBytes(inputStreamFromClassLoaderLocation);
				inputStreamFromClassLoaderLocation.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void readBytes(InputStream inputStream) {

		try {
			System.out.println("Available: " + inputStream.available());
			byte[] readBytes = inputStream.readAllBytes();
			System.out.print("Read bytes: ");
			for (int i = 0; i < readBytes.length; i++) {
				System.out.print(readBytes[i]);
			}
			System.out.println("");
		} catch (IOException ioException) {
			ioException.printStackTrace();
		}

	}

}
