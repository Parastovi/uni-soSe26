package Übungsblatt5;
import java.util.ArrayList;
import java.util.Iterator;

public class MeasurementContainer19c implements Iterable<Measurement19b> {
	
	private final ArrayList<Measurement19b> measurements = new ArrayList<Measurement19b>();
	
	public void addMeasurement(Measurement19b m) {
		measurements.add(m);
	}
	
	public void removeMeasurement(Measurement19b m) {
		measurements.remove(m);
	}

	@Override
	public Iterator<Measurement19b> iterator() {
		return measurements.iterator();
	}

}
