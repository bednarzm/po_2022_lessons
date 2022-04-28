package pl.edu.pw.mini.po.files;

import java.io.File;
import java.io.IOException;

public class FilesDemonstrator {

	public static void demonstrateAll() throws IOException {
		//demonstrateFileWithNonRelativePath();
		//demonstrateNamedFile();
		//demonstrateFileWithGeneralRelativePath();
		//demonstrateFileWithRelativePathToFile();
		
	}

	private static void demonstrateNamedFile() {
		File file = new File("myFile1.txt");
		demonstrateBasicFileInformation(file);
	}
	
	/**
	 * Sciezka bezwzgledna - powinna byc dostarczana spoza aplikacji.
	 */
	private static void demonstrateFileWithNonRelativePath() {
		File fileWithNonRelativePath = new File(
				"C:\\maciekfiles\\teaching\\PO\\robo\\myprivatedirectory\\myFavouriteFile.txt");//Sciezka charakterystyczna dla mojej lokalizacji
		demonstrateBasicFileInformation(fileWithNonRelativePath);
	}

	private static void demonstrateFileWithGeneralRelativePath() {
		File currentWorkingDirectoryfile = new File(".");
		System.out.println("Demonstrate for the current working directory: '.'");
		demonstrateBasicFileInformation(currentWorkingDirectoryfile);

		System.out.println("\n##############################################################\n");
		//File subfolderfile = new File("./files-resource"); //Uzywamy separatora systemowego jak w linijce nizej
		File subfolderfile = new File("." + File.separator + "myResource");
		System.out.println("Demonstrate for the subfolder of current working directory: './myResource'");
		demonstrateBasicFileInformation(subfolderfile);

		System.out.println("\n##############################################################\n");
		File oneLevelHigherfile = new File("..");
		System.out.println("Demonstrate for the one level higher than current working directory: '..'");
		demonstrateBasicFileInformation(oneLevelHigherfile);

	}

	public static void demonstrateFileWithRelativePathToFile() {
		//File currentWorkingDirectoryfile = new File("./myFile1.txt");//Uzywamy separatora systemowego jak w linijce nizej
		File currentWorkingDirectoryfile = new File("." + File.separator + "myNiceFile1.txt");

		System.out.println("Demonstrate for the file in the current working directory: './myNiceFile1.txt'");
		demonstrateBasicFileInformation(currentWorkingDirectoryfile);//currentWorkingDirectoryfile.getCanonicalPath()

		System.out.println("\n##############################################################\n");
		//File subfolderfile = new File("./files-resource/myFile2.txt");//Uzywamy separatora systemowego jak w linijce nizej
		File subfolderfile = new File("." + File.separator + "my-files-resources" + File.separator + "myFile5.txt");
		System.out.println("Demonstrate for the file located in a subfolder of the current working directory: './my-files-resources/myFile2.txt'");
		demonstrateBasicFileInformation(subfolderfile);

		//myFile3.txt trzeba wstawic poza katalogiem roboczym 
		System.out.println("\n##############################################################\n");
		//File oneLevelHigherfile = new File("../additional-resources/myFile3.txt");//Uzywamy separatora systemowego jak w linijce nizej
		File oneLevelHigherfile = new File(".." + File.separator + "additional-resources" + File.separator + "myFile3.txt");
		System.out.println("Demonstrate for the one level higher than the current working directory: '../additional-resources/myFile3.txt'");
		demonstrateBasicFileInformation(oneLevelHigherfile);

	}

	/**
	 * Metoda prezentuje co ciekawsze informacje ktore mozna wydobyc z instancji klasy File.
	 */
	private static void demonstrateBasicFileInformation(File file) {
		
		try {
			System.out.println("DOES IT EXIST: " + file.exists());
			System.out.println("Absolute path: " + file.getAbsolutePath());
			System.out.println("Canonical path: " + file.getCanonicalPath());
			System.out.println("Path: " + file.getPath());
			System.out.println("Is it a Directory: " + file.isDirectory());
			System.out.println("Is it a File: " + file.isFile());

			System.out.println("Listed files: ");
			if (file.listFiles() != null) {
				for (File listedFile : file.listFiles()) {
					System.out.println(listedFile.getName());
				}
			}
			
			System.out.println("Path separator: " + File.pathSeparator);
			System.out.println("File separator: " + File.separator);// Linux

			System.out.println("user.dir: " + System.getProperty("user.dir"));
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private static void demonstrateBasicFileAbilities(File file) {
		
		try {
			System.out.println("Create new file: " + file.createNewFile());
			System.out.println("Path: " + file.mkdir());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
