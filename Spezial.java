package package_Fachklassen;

public class Spezial extends Person {

	private Sprecher stellung;

	public Spezial(String name, String nachname, int alter, Schulklasse klasse, Sprecher stellung) {
		super(name, nachname, alter, klasse);
		this.stellung = stellung;
	}
	
	public Sprecher getStellung() {
		return stellung;
	}

	public void setStellung(Sprecher stellung) {
		this.stellung = stellung;
	}

}
