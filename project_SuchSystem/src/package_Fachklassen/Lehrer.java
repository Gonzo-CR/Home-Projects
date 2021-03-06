package package_Fachklassen;

import java.util.ArrayList;

public class Lehrer extends Person
{
	private String kuerzel;
	private Fach fach;
	private Fach fach2;
	private boolean mehrerefaecher;
	private boolean mehrereklassen;
	

	//Lehrer der nur 1 Schulklasse betreut und 2 F�cher unterrichtet
	public Lehrer(String name, String nachname, Schulklasse klasse,
			String kuerzel, Fach fach, Fach fach2, boolean mehrerefaecher,
			boolean mehrereklassen)
	{
		super(name, nachname, klasse);
		this.kuerzel = kuerzel;
		this.fach = fach;
		this.fach2 = fach2;
		this.mehrerefaecher = mehrerefaecher;
		this.mehrereklassen = mehrereklassen;
	}
	
	// Lehrer der nur 1 Schulklasse betreut und 1 Fach unterrichtet
	public Lehrer(String name, String nachname, Schulklasse klasse,
			String kuerzel, Fach fach, boolean mehrerefaecher,
			boolean mehrereklassen)
	{
		super(name, nachname, klasse);
		this.kuerzel = kuerzel;
		this.fach = fach;
		this.mehrerefaecher = mehrerefaecher;
		this.mehrereklassen = mehrereklassen;
	}


	// Lehrer der 2 Schulklassen betreut und 2 F�cher unterrichtet
	public Lehrer(String name, String nachname, Schulklasse klasse, Schulklasse klasse2,
			String kuerzel, Fach fach, Fach fach2, boolean mehrerefaecher,
			boolean mehrereklassen)
	{
		super(name, nachname, klasse, klasse2);
		this.kuerzel = kuerzel;
		this.fach = fach;
		this.fach2 = fach2;
		this.mehrerefaecher = mehrerefaecher;
		this.mehrereklassen = mehrereklassen;
	}
	
	// Lehrer der 2 Schulklassen betreut und 1 Fach unterrichtet
	public Lehrer(String name, String nachname, Schulklasse klasse, Schulklasse klasse2,
			String kuerzel, Fach fach, boolean mehrerefaecher,
			boolean mehrereklassen)
	{
		super(name, nachname, klasse, klasse2);
		this.kuerzel = kuerzel;
		this.fach = fach;
		this.mehrerefaecher = mehrerefaecher;
		this.mehrereklassen = mehrereklassen;
	}

	// Set - und Get-Methoden der Klasse Lehrer
	public String getKuerzel()
	{
		return kuerzel;
	}

	public void setKuerzel(String kuerzel)
	{
		this.kuerzel = kuerzel;
	}

	public Fach getFach()
	{
		return fach;
	}

	public void setFach(Fach fach)
	{
		this.fach = fach;
	}

	public Fach getFach2()
	{
		return fach2;
	}

	public void setFach2(Fach fach2)
	{
		this.fach2 = fach2;
	}

	public boolean isMehrerefaecher()
	{
		return mehrerefaecher;
	}

	public void setMehrerefaecher(boolean mehrerefaecher)
	{
		this.mehrerefaecher = mehrerefaecher;
	}

	public boolean isMehrereklassen()
	{
		return mehrereklassen;
	}

	public void setMehrereklassen(boolean mehrereklassen)
	{
		this.mehrereklassen = mehrereklassen;
	}

}
