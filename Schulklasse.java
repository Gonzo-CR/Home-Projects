package package_Fachklassen;

import java.util.ArrayList;

public class Schulklasse {

	private String bezeichnung;
	private ArrayList<Schueler> schuelerliste = new ArrayList();

	public Schulklasse(String bezeichnung){
		this.bezeichnung = bezeichnung;
	}
	public String getBezeichnung() {
		return bezeichnung;
	}

	public void setBezeichnung(String bezeichnung) {
		this.bezeichnung = bezeichnung;
	}
	public void addSchueler(Schueler pSchueler)
	{
		schuelerliste.add(pSchueler);
	}
	
	public Schueler getSchueler (int pIndex)
	{
		return schuelerliste.get(pIndex);
	}
	public int getListenLaenge()
	{
		return schuelerliste.size();
	}

}
