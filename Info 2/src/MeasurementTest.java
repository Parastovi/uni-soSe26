package Übungsblatt5;

import java.time.LocalDateTime;
import java.util.Scanner;

public class MeasurementTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Sensor name: ");
        String sensor = scanner.nextLine();

        MeasurementContainer19c container = new MeasurementContainer19c();

        System.out.println("Enter measurements (any non-numeric input will stop the program):");

        while (scanner.hasNextDouble()) {
            double value = scanner.nextDouble();
            Measurement19b m = Measurement19b.of(LocalDateTime.now(), sensor, value);
            container.addMeasurement(m);
        }

        double sum = 0.0;
        int count = 0;
        for (Measurement19b m : container) {
            sum = sum + m.getMesswert();
            count++;
        }

        if (count == 0) {
            System.out.println("No measurements registered.");
            return;
        }

        double mean = sum / count;

        System.out.println("Mean of " + count + " Measurements: " + mean);
    }
}