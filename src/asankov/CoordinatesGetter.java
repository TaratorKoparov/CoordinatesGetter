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
		CoordinatesArray car = new CoordinatesArray(inputCoorinates()); 
		
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
		double northWest, southWest, southEast, northEast,
		Scanner scanner = new Scanner();
		
		System.out.print('Input north west end point: ');
		northWest = scanner.nextDouble();
		
		System.out.print('Input south west end point: ');
		southWest = scanner.nextDouble();
		
		System.out.print('Input south east end point: ');
		southEast = scanner.nectDouble();
		
		System.out.print('Input north east end pointL ');
		northEast = scanner.nextDouble();
		
		return [northWest, southWest, southEast, northEast];
	}
}

}
