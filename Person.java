package package_Fachklassen;

public abstract class Person {
	
	private String name;
	private String nachname;
	private int alter;
	private Schulklasse klasse;
	private Schulklasse klass2;
	public Person(String name, String nachname, int alter, Schulklasse klasse) {
		this.name = name;
		this.nachname = nachname;
		this.alter = alter;
		this.klasse = klasse;
	}

	public Person(String name, String nachname, Schulklasse klasse) {
		this.name = name;
		this.nachname = nachname;
		this.klasse = klasse;
	}

	public Person(String name, String nachname, Schulklasse klasse, Schulklasse klasse2) {
		this.name = name;
		this.nachname = nachname;
		this.klasse = klasse;
		this.klass2 = klasse2;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNachname() {
		return nachname;
	}
	public void setNachname(String nachname) {
		this.nachname = nachname;
	}
	public int getAlter() {
		return alter;
	}
	public void setAlter(int alter) {
		this.alter = alter;
	}
	public Schulklasse getKlasse() {
		return klasse;
	}
	public void setKlasse(Schulklasse klasse) {
		this.klasse = klasse;
	}

	public Schulklasse getKlass2() {
		return klass2;
	}

	public void setKlass2(Schulklasse klass2) {
		this.klass2 = klass2;
	}

}
