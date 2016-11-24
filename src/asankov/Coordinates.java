package asankov;

import java.util.Scanner;

public class Coordinates {
	private double longtitude;
	private double latitude;
	
	public Coordinates(double longtitude, double latitude){
		setLongtitude(longtitude);
		setLatitude(latitude);
	}
	
	//setters
	public void setLongtitude(double longtitude){
		if (longtitude >= 0){
			this.longtitude = longtitude;
		} else {
			setLongtitude();
		}
	}
	
	public void setLatitude(double latitude){
		if (latitude >= 0){
			this.latitude = latitude;
		} else {
			setLatitude();
		}
	}
	
	public void setLatitude(){
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.print("Please enter latitude: ");
			 latitude = scanner.nextDouble();
			 scanner.reset();
		} while (latitude < 0);
		
		scanner.close();
	}
	
	public void setLongtitude(){
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.print("Please enter latitude: ");
			 longtitude = scanner.nextDouble();
			 scanner.reset();
		} while (longtitude < 0);
		
		scanner.close();
	}
	
	//getters
	public double getLongtitude() {
		return longtitude;
	}
	
	public double getLatitude() {
		return latitude;
	}
	
	
	
}
