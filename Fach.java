package package_Fachklassen;

import java.util.ArrayList;

public class Fach {
	
	private String fachbezeichnung;
	public ArrayList<Lehrer> fachliste = new ArrayList();
	public ArrayList<Lehrer> lehrerliste = new ArrayList();
	
	public Fach(String bezeichnung){
		this.fachbezeichnung = bezeichnung;
	}

	public void addLehrer(Lehrer pLehrer) {
		fachliste.add(pLehrer);
	}
	public Lehrer getLehrer(int index) {
		return fachliste.get(index);
	}
	public int getListLength() {
		return fachliste.size();
	}
	public void addLeherList(Lehrer pLehrer) {
		lehrerliste.add(pLehrer);
	}
	public Lehrer getLehrerliste(int index) {
		return lehrerliste.get(index);
	}
	public int getListenLaengeLehrerListe() {
		return lehrerliste.size();
	}

	public String getFachbezeichnung() {
		return fachbezeichnung;
	}

	public void setFachbezeichnung(String fachbezeichnung) {
		this.fachbezeichnung = fachbezeichnung;
	}
	public void alleLehrer13_1()
	{
		int a = 1;
		for(int i = 0; i < lehrerliste.size(); i++)
		{
				
				if(lehrerliste.get(i).isMehrereklassen() && lehrerliste.get(i).isMehrereklassen())
				{
					System.out.println("Ihr " + i  +". " + "Lehrer:");
					System.out.println(" Name:		" + lehrerliste.get(i).getName() + " " + lehrerliste.get(i).getNachname());
					System.out.println(" Kürzel:	" + lehrerliste.get(i).getKuerzel());
					System.out.println(" 1. Klasse:	" + lehrerliste.get(i).getKlasse().getBezeichnung());
					System.out.println(" 2. Klasse:	" + lehrerliste.get(i).getKlass2().getBezeichnung());
					System.out.println(" 1. Fach:	" + lehrerliste.get(i).getFach().getFachbezeichnung());
					System.out.println(" 2. Fach:	" + lehrerliste.get(i).getFach2().getFachbezeichnung());
					System.out.println("-------------------------------------------------------");
				}
				else if(lehrerliste.get(i).isMehrerefaecher() == false || lehrerliste.get(i).isMehrereklassen())
				{
					System.out.println("Ihr " + i  +". " + "Lehrer:");
					System.out.println(" Name:		" + lehrerliste.get(i).getName() + " " + lehrerliste.get(i).getNachname());
					System.out.println(" Kürzel:	" + lehrerliste.get(i).getKuerzel());
					System.out.println(" 1. Klasse:	" + lehrerliste.get(i).getKlasse().getBezeichnung());
					System.out.println(" 2. Klasse:	" + lehrerliste.get(i).getKlass2().getBezeichnung());
					System.out.println(" Fach:		" + lehrerliste.get(i).getFach().getFachbezeichnung());
					System.out.println("-------------------------------------------------------");
				}
//			if(lehrerliste.get(arg0))
					
		
			}
		}
	}

