package no.hvl.dat100ptc.oppgave2;

import no.hvl.dat100ptc.TODO;
import no.hvl.dat100ptc.oppgave1.GPSPoint;


public class GPSDataConverter {

	// konverter tidsinformasjon i gps data punkt til antall sekunder fra midnatt
	// dvs. ignorer information om dato og omregn tidspunkt til sekunder
	// Eksempel - tidsinformasjon (som String): 2017-08-13T08:52:26.000Z
    // skal omregnes til sekunder (som int): 8 * 60 * 60 + 52 * 60 + 26 
	
	private static int TIME_STARTINDEX = 11; // startindex for tidspunkt i timestr

	public static int toSeconds(String timestr) {
		
		
		int hr = Integer.parseInt(timestr.substring(12,13));
		int min = Integer.parseInt(timestr.substring(14,16));
		int sec= Integer.parseInt(timestr.substring(17,19));
		
		
		// TODO
		// OPPGAVE - START
		int secs = hr*60*60+min*60+sec;
		
		// OPPGAVE - SLUTT
		return secs;
	}

	public static GPSPoint convert(String timeStr, String latitudeStr, String longitudeStr, String elevationStr) {

		GPSPoint gpspoint;

		// TODO - START ;
		gpspoint = convert("31946", "60.385390", "5.217217", "61.9");
		

		// OPPGAVE - SLUTT ;
	    return gpspoint;
	}
	
}
