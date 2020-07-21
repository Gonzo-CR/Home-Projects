package package_Fachklassen;

public abstract class Gruppierung
{

	private String bezeichnung;
	
	// Super-Konstruktor für die Erstellung von Objekten mit Bezeichnungen
	public Gruppierung (String bezeichnung) {
		this.bezeichnung = bezeichnung;
	}
	
	
	// Set- und Get-Methoden
	public void setBezeichnung(String pBezeichnung) {
		bezeichnung = pBezeichnung;
	}
	
	public String getBezeichnung() {
		return bezeichnung;
	}
}
