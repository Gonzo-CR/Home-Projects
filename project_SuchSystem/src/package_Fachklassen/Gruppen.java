package package_Fachklassen;

import java.util.ArrayList;

public class Gruppen
{
	public ArrayList<Lehrer> lehrerliste = new ArrayList<>();
	public ArrayList<Schueler> schuelerliste = new ArrayList<>();
	public ArrayList<Fach> faecherliste = new ArrayList<>();
	
	public void addLehrer(Lehrer pLehrer) {
		lehrerliste.add(pLehrer);
	}
	
	public Lehrer getLehrer(int pIndex) {
		return lehrerliste.get(pIndex);
	}
	
	public int getLehrereListenLaenge() {
		return lehrerliste.size();
	}
	
	public void addSchueler(Schueler pSchueler) {
		schuelerliste.add(pSchueler);
	}
	
	public Schueler getSchueler(int pIndex) {
		return schuelerliste.get(pIndex);
	}
	
	public int getSchuelerListenLaenge() {
		return schuelerliste.size();
	}
	
	public void addFach(Fach pFach) {
		faecherliste.add(pFach);
	}
	
	public Fach getFaecher(int pIndex) {
		return faecherliste.get(pIndex);
	}
	
	public int getFaecherListenLaenge() {
		return faecherliste.size();
	}
	
}
