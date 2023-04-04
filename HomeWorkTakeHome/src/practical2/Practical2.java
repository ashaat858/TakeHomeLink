package practical2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Practical2 {

	public static void main(String[] args) {

		doesFileExist("PRACTICAL2 DICTIONARY\\DICTIONARY.txt");
	}

	public static void doesFileExist(String path) {
		File file = new File(path);
		try {
			if (file.exists()) {
				System.out.println("File exists at " + path);
				readWordsFromFile(file);
			} else {
				System.out.println("File does not exist at " + path);
			}
		} catch (IOException e) {
			System.out.println("Error reading file: " + e.getMessage());
		}
	}

	private static void readWordsFromFile(File file) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader(file));
		String line;
		while ((line = reader.readLine()) != null) {
			String[] words = line.split("line ");
			for (String word : words) {
				System.out.println("Word: " + word);

			}
		}
		reader.close();
	}

}
