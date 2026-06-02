//(15 min) Datenklasse: Punkte für Positionen
package kap02;

public class Point {

	// 1. Schritt: Modellierung in UML (Klassenkarten)
	// 2. Schritt: Implementierung der Klassenkarten in Java

	// Datenkomponenten = Attribute: sind grundsätzlich privat -> kein direkter
	// Zugriff möglich
	// als Variablen in der ganzen Klasse benutzbar
	private int x;
	private int y;

	// Konstruktoren: bieten verschiedene Initialsierungsmöglichkeiten
	public Point(int x, int y) {
		// Nutze set-Methoden (siehe unten): kein doppelter Code
		setX(x);
		setY(y);
	}

	// Kopierkonstruktor: neues Objekt mit gleichen Attributwerten wie original
	public Point(Point original) {
		// Nutze get-Methoden (siehe unten) zur Abfrage der Werte von original
		setX(original.getX());
		setY(original.getY());
	}

	// get-Methode: gibt Attributwert zurück
	public int getX() {
		return x;
	}

	// set-Methode: setzt Attributwert (this.x) auf übergebenen Wert (x)
	// Eingabeparameter heißt wie das Attribut: Verständlichkeit
	public void setX(int x) {
		// x = Eingabeparameter
		// this.x = Attributwert dieses Objekts (this object)
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
}
