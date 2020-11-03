package no.hvl.dat100ptc.oppgave1;

import no.hvl.dat100ptc.TODO;

public class GPSPoint {

	// TODO - objektvariable
	private int time;
	private double latitude;
	private double longtitude;
	private double elevation;
	
	public GPSPoint(int time, double latitude, double longitude, double elevation) {

		// TODO - konstruktør
		this.time = time;
		this.latitude = latitude;
		this.longtitude = longitude;
		this.elevation = elevation;
	}

	// TODO - get/set metoder X
	public int getTime() {
		
		return time;
		
	}

	public void setTime(int time) {
				
		this.time = time;

	}

	public double getLatitude() {
		
		return latitude;
		
	}

	public void setLatitude(double latitude) {
		
		this.latitude = latitude;
		
	}

	public double getLongitude() {
		
		return longtitude;
		
	}

	public void setLongitude(double longtitude) {
		
		this.longtitude = longtitude;
		
	}

	public double getElevation() {
		
		return elevation;
		
	}

	public void setElevation(double elevation) {
		
		this.elevation = elevation;
		
	}
	
	public String toString() {
		
		
		String str = "";
		
		// TODO - start
str = time + " (" + latitude + "," + longtitude + ") " + elevation + "\n";
		// TODO - slutt
		return str;
	}
}
