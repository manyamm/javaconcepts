package FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) throws FileNotFoundException {

		try {
			File file = new File("myfile.txt");
			Scanner input;
			input = new Scanner(file);
			while (input.hasNextLine()) {
				String line = input.nextLine();
				System.out.println(line);
			}
			input.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
			e.printStackTrace();
		}

		/*
		 * for(int i = 0; i <=3; i++) {
		 * 
		 * Scanner input = new Scanner(System.in);
		 * System.out.println("Enter some Text"); String enteredText = input.nextLine();
		 * System.out.println(enteredText); }
		 */

	}

}
