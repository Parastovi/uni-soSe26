// (30 min) Programmklasse: Circle-Klasse testen
package kap02;

public class Circletest {

	public static void main(String[] args) {

		// Point-Objekt anlegen
		// Konstruktor reserviert Speicher im Heap und legt dort die Attributwerte
		// (=Inhalt des Objekt) ab
		// Objekt ist adresswertig und referenziert Inhalt im Heap
		Point p1;
		p1 = new Point(10, 40);
		// X-Koordinate ausgeben mit getX (Objektmethode!)
		System.out.println("x-Koordinate von p1:");		
		System.out.println(p1.getX());

		// Circle-Objekt anlegen
		Circle circle1;
		circle1 = new Circle(20, p1);
		// Radius ausgeben mit getRadius (Objektmethode!)
		System.out.println("Radius von circle1:");		
		System.out.println(circle1.getRadius());
		// xKoordinate ausgeben der Position (Objektmethode!)
		System.out.println("x-Koordinate der Position von circle1:");		
		System.out.println(circle1.getPosition().getX());

		// Circle-Objekt als Kopie anlegen
		// circle1 und circle2 sind verschiedene Objekte, haben aber den gleichen Inhalt
		Circle circle2;
		circle2 = new Circle(circle1);
		System.out.println("Radius und x-Koordinate der Position von circle2:");		
		System.out.println(circle2.getRadius());
		System.out.println(circle2.getPosition().getX());

		// Radius neu setzen
		circle1.setRadius(100);
		System.out.println("Neuer Radius von circle1:");		
		System.out.println(circle1.getRadius());

		// Wertzuweisung an Objekt = Referenz ändern (Objekt referenziert anderen/keinen
		// Inhalt)
		// circle2 und circle1 sind Referenzen auf denselben Speicherbereich
		circle2 = circle1;
		// Der ehemalige Inhalt von circle2 wird nicht mehr referenziert
		// Garbage-Collection: Nicht referenzierter Speicher im Heap wird automatisch
		// freigegeben
		// Seiteneffekt: Über circle1 Inhalt von circle2 ändern (auch umgekehrt
		// möglich!)
		circle1.setRadius(200);
		System.out.println("Neuer Radius von circle2:");		
		System.out.println(circle2.getRadius());

		// null-Referenz: Objekt hat keinen Inhalt
		circle1 = null;
		// Auf der null-Referenz können keine Methoden aufgerufen werden!
		// circle1.setRadius(200);? (Löst Programmabbruch aus, da kein Inhalt vorhanden)

		// Klassenmethoden testen
		System.out.println("Werte von dimension und step:");		
		System.out.println(Circle.getDimension());
		System.out.println(Circle.getStep());
	}
}
