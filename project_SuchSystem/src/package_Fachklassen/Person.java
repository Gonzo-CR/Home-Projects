package package_Fachklassen;

public abstract class Person
{

	private String name;
	private String nachname;
	private Schulklasse klasse;
	private Schulklasse klasse2;
	
	//Konstruktor für Schüler und Lehrer mit 2 Schulklassen
	public Person (String name, String nachname, Schulklasse klasse)
	{
		this.name = name;
		this.nachname = nachname;
		this.klasse = klasse;
	}
	
	//Konstruktor für Lehrer mit 2 Schulklassen
	public Person(String name, String nachname, Schulklasse klasse, Schulklasse klasse2) {
		this.name = name;
		this.nachname = nachname;
		this.klasse = klasse;
		this.klasse2 = klasse2;
	}
	
	// Set - und Get - Methoden
	public void setName(String pName)
	{
		name = pName;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setNachname(String pNachname)
	{
		nachname = pNachname;
	}
	
	public String getNachname()
	{
		return nachname;
	}
	
	public void setKlasse_1(Schulklasse pKlasse) {
		klasse = pKlasse;
	}
	
	public Schulklasse getKlasse_1() {
		return klasse;
	}
	
	public void setKlasse_2(Schulklasse pKlasse2) {
		klasse2 = pKlasse2;
	}
	
	public Schulklasse getKlasse_2() {
		return klasse2;
	}
}
