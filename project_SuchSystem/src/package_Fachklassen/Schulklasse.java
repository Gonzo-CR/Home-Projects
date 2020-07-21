package package_Fachklassen;

import java.util.ArrayList;

public class Schulklasse extends Gruppierung
{
	private ArrayList<Schueler> klassenliste = new ArrayList();
	
	// Super-Konstruktor zur erstellung einer Schulklasse mit Bezeichnung
	public Schulklasse (String bezeichnung) {
		super(bezeichnung);
	}
	
	
	// ArrayList Methoden zur speicherung von Schülern einer Klasse
	public void addSchuler(Schueler pSchueler) {
		klassenliste.add(pSchueler);
	}
	
	public Schueler getSchueler(int index) {
		return klassenliste.get(index);
	}
	
	public int getKlassenlistenLaenge() {
		return klassenliste.size();
	}
}
