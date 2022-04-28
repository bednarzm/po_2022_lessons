package pl.edu.pw.mini.po.files;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import pl.edu.pw.mini.po.disco.Student;
import pl.edu.pw.mini.po.disco.Studentka;
import pl.edu.pw.mini.po.disco.Uczestnik;
import pl.edu.pw.mini.po.files.a.FirstClass;
import pl.edu.pw.mini.po.files.b.SecondClass;

public class StreamDemonstrator {

	public static void demonstrateAll() {
			demonstrateLookingForResources();
		//demonstratePureInputStream();
		//demonstrateBufferedInputStream();
		//demonstrateReader();
		//demonstrateReader();
			demonstrateBufferedInputStreamWithEncodingIssues();
		//demonstrateScanner1();
		//demonstrateScanner2();
		//serializationDemonstrator();
		//demonstrateSerialization();
	}

	public static void demonstrateLookingForResources() {

		try {
			InputStream inputStreamFromFirstClass = FirstClass.class.getResourceAsStream("firstClassFile.txt");
			System.out.println("1. Uda sie");

			if (inputStreamFromFirstClass != null) {
				readBytes(inputStreamFromFirstClass);
				inputStreamFromFirstClass.close();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("#################################");

		try {
			InputStream inputStreamFromSecondClass = SecondClass.class.getResourceAsStream("firstClassFile.txt");
			System.out.println("2. Nie uda sie bo przy klasie SecondClass nie ma pliku.");
			if (inputStreamFromSecondClass != null) {
				readBytes(inputStreamFromSecondClass);
				inputStreamFromSecondClass.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("#################################");
		try {
			InputStream inputStreamFromFirstClassLocation = FirstClass.class.getResourceAsStream("myFile1.txt");
			System.out.println("3. Nie uda sie bo przy klasie FirstClass nie ma pliku. Jest on w katalogu roboczym. ");
			if (inputStreamFromFirstClassLocation != null) {
				readBytes(inputStreamFromFirstClassLocation);
				inputStreamFromFirstClassLocation.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("#################################");
		try {
			//InputStream inputStreamFromClassLoaderLocation = FirstClass.class.getClassLoader().getResourceAsStream("myFile1.txt");
			InputStream inputStreamFromClassLoaderLocation = StreamDemonstrator.class.getResourceAsStream("/myFile3.txt");
			
			if (inputStreamFromClassLoaderLocation != null) {
				System.out.println("4. Uda sie bo jestesmy w katalogu roboczym ");
				readBytes(inputStreamFromClassLoaderLocation);
				inputStreamFromClassLoaderLocation.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("#################################");
		try {
			//InputStream inputStreamFromClassLoaderLocation = FirstClass.class.getClassLoader().getResourceAsStream("myFile1.txt");
			InputStream inputStreamFromClassLoaderLocation = StreamDemonstrator.class.getResourceAsStream("/files-resources/myFile2.txt");
			
			if (inputStreamFromClassLoaderLocation != null) {
				System.out.println("5. Uda sie bo jestesmy w katalogu roboczym ");
				readBytes(inputStreamFromClassLoaderLocation);
				inputStreamFromClassLoaderLocation.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("#################################");
		try {
			//InputStream inputStreamFromClassLoaderLocation = FirstClass.class.getClassLoader().getResourceAsStream("myFile1.txt");
			InputStream inputStreamFromClassLoaderLocation = StreamDemonstrator.class.getResourceAsStream("/external.txt");
			
			if (inputStreamFromClassLoaderLocation != null) {
				System.out.println("6. Uda sie bo jestesmy w katalogu roboczym ");
				readBytes(inputStreamFromClassLoaderLocation);
				inputStreamFromClassLoaderLocation.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("#################################");
	}

	private static void readBytes(InputStream inputStream) {

		try {
			System.out.println("Available: " + inputStream.available());
			byte[] readBytes = inputStream.readAllBytes();
			System.out.print("Read bytes: ");
			for (int i = 0; i < readBytes.length; i++) {
				System.out.print(readBytes[i]);
			}
			System.out.print(" --> " + new String(readBytes, "UTF-8"));
			System.out.println("");
		} catch (IOException ioException) {
			ioException.printStackTrace();
		}

	}

	private static void demonstratePureInputStream() {
		
		InputStream inputStream = FirstClass.class.getResourceAsStream("/external.txt");
		try {
			System.out.println(inputStream.available());
			byte[] bytes = inputStream.readAllBytes();// Mozemy na raty 
			String s = new String(bytes, "UTF-8");// Kodowanie pliku,
			System.out.println("Read: " + s);
			inputStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private static void demonstrateBufferedInputStream() {

		InputStream inputStream = FirstClass.class.getResourceAsStream("/external.txt");
		try {
			BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
			System.out.println(bufferedInputStream.available());
			byte[] bytes = bufferedInputStream.readAllBytes();
			String s = new String(bytes, "UTF-8");
			System.out.println("Read: " + s);
			bufferedInputStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private static void demonstrateCloseableBufferedInputStream() {

		InputStream inputStream = FirstClass.class.getResourceAsStream("/external.txt");
		try (BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream)) {//tutaj autozamykanie
			System.out.println(bufferedInputStream.available());
			byte[] bytes = bufferedInputStream.readAllBytes();
			String s = new String(bytes, "UTF-8");
			System.out.println("Read: " + s);
			bufferedInputStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	private static void demonstrateReader() {
		InputStream inputStream = FirstClass.class.getResourceAsStream("/generated_weapon.txt");
		
		try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream))) {
			String line;
			while((line = bufferedReader.readLine()) != null){
				System.out.println("Read line: " + line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void demonstrateBufferedInputStreamWithEncodingIssues() {
		//System.setProperty("file.encoding", "UTF-8");
		System.out.println(System.getProperty("file.encoding", "UTF-8"));
		InputStream inputStream = FirstClass.class.getResourceAsStream("/encoding_issues.txt");
		try {
			BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
			System.out.println(bufferedInputStream.available());
			byte[] bytes = bufferedInputStream.readAllBytes();
			String s = new String(bytes, "UTF-8");
			System.out.println("Read: " + s);
			bufferedInputStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private static void demonstrateScanner1() {
		String string = "129-maciek-1.78-aaa";
		Scanner scanner = new Scanner(string);
		scanner.useDelimiter("-");
		
		while(scanner.hasNextLine()) {
			//System.out.print(" " + scanner.next());
			System.out.print(" " + scanner.nextInt() + " " + scanner.next() + " " + scanner.nextDouble() + " " + scanner.next());
		}
		scanner.close();
	}
	
	private static void demonstrateScanner2() {
		Scanner scanner = new Scanner(StreamDemonstrator.class.getResourceAsStream("/generated_weapon.txt"));
		scanner.useDelimiter(";");
		
		while(scanner.hasNextLine()) {
			//System.out.print(" " + scanner.next());
			System.out.print(" " + scanner.next());
		}
		scanner.close();
	}
	
	private static void serializationDemonstrator() {
		
		String stringToWrite = new String("Hello");
		
		try (FileOutputStream file = new FileOutputStream("C:\\maciekfiles\\teaching\\PO\\robo\\serialize\\serialized1")) {
			ObjectOutputStream out = new ObjectOutputStream(file);
			out.writeObject(stringToWrite);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
        
		try(FileInputStream fileInputStream = new FileInputStream("C:\\maciekfiles\\teaching\\PO\\robo\\serialize\\serialized1")){
			ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
			Object readObject = objectInputStream.readObject();
			if(readObject instanceof String) {
				String readString = (String)readObject;
				System.out.println("Read string: " + readString);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}

	
	private static void demonstrateSerialization() {
		Student student = new Student("Tomasz", "20", "K");
		Studentka studentka = new Studentka("Alicja", "20", "M");
		
		uczestnikSerializator(student, "student.txt");
		uczestnikSerializator(studentka, "studentka.txt");
		
		
		
		Uczestnik deserialized = uczestnikDeerializator("student.txt");
		printDeserializedUczestnik(deserialized);
		deserialized = uczestnikDeerializator("studentka.txt");
		printDeserializedUczestnik(deserialized);
		
	}
	
	private static void printDeserializedUczestnik(Uczestnik uczestnik) {
		if(uczestnik instanceof Student) {
			Student readStudent = (Student)uczestnik;
			System.out.println("Read string: " + readStudent + " " + readStudent.getJakisParametr());
		} else if(uczestnik instanceof Studentka) {
			Studentka readStudentka = (Studentka)uczestnik;
			System.out.println("Read string: " + readStudentka + "  " + readStudentka.getJakiesInfo());
		}
	}
	
	private static void uczestnikSerializator(Uczestnik uczestnik, String fileName) {
		try (FileOutputStream file = new FileOutputStream("C:\\maciekfiles\\teaching\\PO\\robo\\serialize\\" + fileName)) {
			ObjectOutputStream out = new ObjectOutputStream(file);
			out.writeObject(uczestnik);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	private static Uczestnik uczestnikDeerializator(String fileName) {
		Uczestnik result = null;
		try(FileInputStream fileInputStream = new FileInputStream("C:\\maciekfiles\\teaching\\PO\\robo\\serialize\\" + fileName)){
			ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
			
			Object readObject = objectInputStream.readObject();
			if(readObject instanceof Uczestnik) {
				result = (Uczestnik)readObject;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return result;
	}
	
}
