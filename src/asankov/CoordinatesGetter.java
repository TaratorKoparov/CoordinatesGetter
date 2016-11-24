package asankov;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;

public class CoordinatesGetter {

	public static void main(String[] args) {
		CoordinatesArray car = new CoordinatesArray(10.0, 15.0, 20.0, 25.0);
		
		String json = car.getGEOJSON();
		
		System.out.println(json);
	}

}
