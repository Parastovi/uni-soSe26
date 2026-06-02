package Übungsblatt5;
import java.time.*;

public final class Measurement19b {

	private final LocalDateTime zeitpunkt;
	private final String sensorBezeichnung;
	private final double messwert;
	
	private Measurement19b (LocalDateTime zeitpunkt, String sensorBezeichnung, double messwert) {
		this.zeitpunkt = zeitpunkt;
		this.sensorBezeichnung = sensorBezeichnung;
		this.messwert = messwert;
	}
	
	public LocalDateTime getZeipunkt() {
		return zeitpunkt;
	}
	
	public String getSensorBezeichnung() {
		return sensorBezeichnung;
	}
	
	public double getMesswert() {
		return messwert;
	}
	
	public static Measurement19b of (LocalDateTime zeitpunkt, String sensorBezeichnung, double messwert) {
		return new Measurement19b(zeitpunkt, sensorBezeichnung, messwert);
	}

}
