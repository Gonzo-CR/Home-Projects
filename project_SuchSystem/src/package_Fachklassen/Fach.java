package package_Fachklassen;

import java.util.ArrayList;

public class Fach extends Gruppierung
{
	private ArrayList<Lehrer> fachlehrerliste = new ArrayList();

	// Konstruktor zur Erstellung eines Fachs
	public Fach(String bezeichnung)
	{
		super(bezeichnung);
	}
	
	// ArrayList Methoden: Den Fächern werden ihre Fachlehrer zugeteilt
	public void addFachLehrer (Lehrer pLehrer) {
		fachlehrerliste.add(pLehrer);
	}
	
	public Lehrer getFachLehrer (int pIndex) {
		return fachlehrerliste.get(pIndex);
	}
	
	public int getFachLehrerListenLaenge () {
		return fachlehrerliste.size();
	}
}
