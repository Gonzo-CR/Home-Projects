package package_Fachklassen;

import java.util.ArrayList;
import java.util.concurrent.SynchronousQueue;

public class Sprecher {

	private String position;
	private ArrayList<Spezial> klassensprecherliste = new ArrayList();
	private ArrayList<Spezial> schuelersprecherliste = new ArrayList();

	
	public Sprecher (String position) {
		this.position = position;
	}
	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}
	public void addKlassensprecher(Spezial pSpezial) {
		 klassensprecherliste.add(pSpezial); 
	}
	public Spezial getKlassensprecher(int index) {
		return klassensprecherliste.get(index);
	}
	public void addSchuelersprecher(Spezial pPersonen) {
		schuelersprecherliste.add(pPersonen);
	}
	public Spezial getSchuelersprecher(int pIndex) {
		return schuelersprecherliste.get(pIndex);
	}
	public int getListLengthKS() {
		return klassensprecherliste.size();
	}
	public int getListLengthSS() {
		return schuelersprecherliste.size();
	}
	
	public void showKlassensprecher() {
		for(int i = 0; i < klassensprecherliste.size(); i++) {
			System.out.println("Klassensprecherliste:");
			System.out.println(" " + klassensprecherliste.get(i).getName());
			System.out.println(" " + klassensprecherliste.get(i).getNachname());
			System.out.println(" " + klassensprecherliste.get(i).getAlter());
			System.out.println(" " + klassensprecherliste.get(i).getKlasse().getBezeichnung());
			System.out.println("");
			
		}
	}
	public void showSchuelersprecher() {
		for(int i = 0; i < schuelersprecherliste.size(); i++) {
			System.out.println("Schülersprecherliste:");
			System.out.println(" " + schuelersprecherliste.get(i).getName());
			System.out.println(" " + schuelersprecherliste.get(i).getNachname());
			System.out.println(" " + schuelersprecherliste.get(i).getAlter());
			System.out.println(" " + schuelersprecherliste.get(i).getKlasse().getBezeichnung());
			System.out.println("");
			
		}
	}
	
}
