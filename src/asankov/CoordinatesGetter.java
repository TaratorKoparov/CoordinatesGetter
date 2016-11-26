package asankov;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CoordinatesGetter {

	public static void main(String[] args) {
		CoordinatesArray car = new CoordinatesArray(10.0, 15.0, 20.0, 25.0); 
		
		String fileName = "geoJSON.json";
		Path filePath = Paths.get(fileName);
		
		try {
			if (!Files.exists(filePath)) {
				Files.createFile(filePath);
			}
			String textToBeWritten = car.getGEOJSON();
			Files.write(filePath, textToBeWritten.getBytes());
			System.out.println("Successfully written to file.");
		} catch (IOException ioe) {
			System.out.println("Cannot write to file." + ioe);
		}
	}
	
	public static double[] inputCoorinates(){
		Scanner scanner = new Scanner();
		System.out.print('Input north west end point: ');
	}
}

}
