package asankov;

public class CoordinatesArray {
	// variable 
	static Coordinates northWest;
	static Coordinates southWest;
	static Coordinates southEast;
	static Coordinates northEast;
	// four variables ot type Coordinates
	// each for every point of the end point of the square
	
	// constructor for each of the four variables
	CoordinatesArray(double startLongtitude, double startLatitude, double finalLongtitude, double finalLatitude){
		northWest = new Coordinates(startLongtitude, startLatitude);
		southWest = new Coordinates(startLongtitude, finalLatitude);
		southEast = new Coordinates(finalLongtitude, finalLatitude);
		northEast = new Coordinates(finalLongtitude, startLatitude);
	}
	
	public static String getGEOJSON(){
		StringBuilder sb = new StringBuilder();
		
		// just some text needed for the GEOJSON file
		final String TYPE = "\"type\"";
		final String POLYGON = "\"Polygon\"";
		final String COORDINATES = "\"coordinates\"";
		final char COLON = ':';
		final char COMA = ',';
		final char NEW_LINE = '\n';
		final char OPEN_BRACKET = '[';
		final char CLOSE_BRACKET = ']';
		final char OPEN_BIG_BRACKET = '{';
		final char CLOSE_BIG_BRACKET = '}';
		
		sb.append(OPEN_BIG_BRACKET);
		sb.append(NEW_LINE);
		sb.append(TYPE);
		sb.append(COLON);
		sb.append(POLYGON);
		sb.append(COMA);
		sb.append(COORDINATES);
		sb.append(COLON);
		sb.append(OPEN_BRACKET);
		sb.append(NEW_LINE);
		sb.append(OPEN_BRACKET);
		sb.append(NEW_LINE);
		sb.append(OPEN_BRACKET);
		sb.append(NEW_LINE);
		
		sb.append(northWest.getLongtitude());
		sb.append(COMA);
		sb.append(NEW_LINE);
		sb.append(northWest.getLatitude());
		sb.append(NEW_LINE);
		sb.append(CLOSE_BRACKET);
		sb.append(COMA);
		sb.append(NEW_LINE);
		sb.append(OPEN_BRACKET);
		sb.append(NEW_LINE);
		
		sb.append(southWest.getLongtitude());
		sb.append(COMA);
		sb.append(NEW_LINE);
		sb.append(southWest.getLatitude());
		sb.append(NEW_LINE);
		sb.append(CLOSE_BRACKET);
		sb.append(COMA);
		sb.append(NEW_LINE);
		sb.append(OPEN_BRACKET);
		sb.append(NEW_LINE);
		
		sb.append(southEast.getLongtitude());
		sb.append(COMA);
		sb.append(NEW_LINE);
		sb.append(southEast.getLatitude());
		sb.append(NEW_LINE);
		sb.append(CLOSE_BRACKET);
		sb.append(COMA);
		sb.append(NEW_LINE);
		sb.append(OPEN_BRACKET);
		sb.append(NEW_LINE);
		
		sb.append(northEast.getLongtitude());
		sb.append(COMA);
		sb.append(NEW_LINE);
		sb.append(northEast.getLatitude());
		sb.append(NEW_LINE);
		sb.append(CLOSE_BRACKET);
		sb.append(COMA);
		sb.append(NEW_LINE);
		sb.append(OPEN_BRACKET);
		sb.append(NEW_LINE);
		
		sb.append(northWest.getLongtitude());
		sb.append(COMA);
		sb.append(NEW_LINE);
		sb.append(northWest.getLatitude());
		sb.append(NEW_LINE);
		sb.append(CLOSE_BRACKET);
		sb.append(NEW_LINE);
		sb.append(CLOSE_BRACKET);
		sb.append(NEW_LINE);
		sb.append(CLOSE_BRACKET);
		sb.append(NEW_LINE);
		sb.append(CLOSE_BIG_BRACKET);

		return sb.toString(); // returns the ready GEOJSON text
		
		
	}
}
