package package_Fachklassen;

public class Schueler extends Person
{
	private int alter;
	
	// Super-Konstruktor zur erstellung eines Schülers
	public Schueler(String name, String nachname, int alter, Schulklasse klasse)
	{
		super(name,nachname, klasse);
		this.alter = alter;
	}
	
	// Set - und Get - Methoden
	public void setAlter(int pAlter) {
		alter = pAlter;
	}
	
	public int getAlter() {
		return alter;
	}
	
}
