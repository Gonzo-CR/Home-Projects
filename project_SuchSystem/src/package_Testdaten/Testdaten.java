package package_Testdaten;

import java.util.ArrayList;
import java.util.Collections;

import package_Fachklassen.*;

public class Testdaten 

{

	private ArrayList<Lehrer> lehrerliste = new ArrayList<>();
	private ArrayList<Schueler> schuelerliste = new ArrayList<>();
	private ArrayList<Fach> faecherliste = new ArrayList<>();
	
	public void erzeugeTestdaten() {
		
		Gruppen gruppen = new Gruppen();
		ArrayList<Fach> faecherliste = new ArrayList<>();
		// Schulklassen Objekte
		Schulklasse sk1, sk2;
		sk1 = new Schulklasse("WG 13-1");			// 0
		sk2 = new Schulklasse("WG 13-2");			// 1
		
		// Fächer Objekte
		Fach M, D, E, BWL, VWL, Sp, GS, Inf, S, Fr, GGK, Eth, EVR, KR, Ch, Phy, Bio2, Bio4, Psy, Semi, WiGeo, Faecher;
		M = new Fach("Mathe"); 						// 0
		D = new Fach("Deutsch"); 					// 1
		E = new Fach("Englisch"); 					// 2
		BWL = new Fach("BWL"); 						// 3	
		VWL = new Fach("VWL"); 						// 4
		Sp = new Fach("Sport"); 					// 5
		GS = new Fach("Global Studies");			// 6
		Inf = new Fach("Informatik");				// 7
		S = new Fach("Spanisch");					// 8
		Fr = new Fach("Französisch");				// 9
		GGK = new Fach("GGK");						// 10
		Eth = new Fach("Ethik");					// 11
		EVR = new Fach("Evangelische Religion");	// 12
		KR = new Fach("Katholische Religion");		// 13
		Ch = new Fach("Chemie");					// 14
		Phy = new Fach("Physik");					// 15
		Bio2 = new Fach("Biolige-2");				// 16
		Bio4 = new Fach("Biologie-4");				// 17
		Psy = new Fach("Psychologie");				// 18
		Semi = new Fach("Seminarkurs");				// 19
		WiGeo = new Fach("Wirtschaftsgeografie");	// 20
		Faecher = new Fach("Alle Fächer");			// 21
		
		//Fächer in die Faecherliste zuteilen
		faecherliste.add(M); faecherliste.add(D); faecherliste.add(E); faecherliste.add(BWL);
		
	
		//Lehrer Objekte
		Lehrer l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13, l14, l15, l16, l17, l18, l19, l20, l21, l22, l23, l24, l25, l26, l27;
		l1 = new Lehrer("Gert", "Galinski", sk1, sk2, "Ga", M, Phy, true, true);				// 0
		l2 = new Lehrer("Alex", "Scheller", sk1, sk2, "Sr", M, Bio2, true, true);				// 1
		l3 = new Lehrer("Stefan", "Rapp", sk1, sk2, "Ra", D, Sp, true, true);					// 2
		l4 = new Lehrer("Kristina", "Grimm", sk1, sk2, "Gr", D, false, true);					// 3
		l5 = new Lehrer("Tina", "Windisch", sk1, sk2, "Wi", M, false, true);					// 4
		l6 = new Lehrer("Sandra", "Wöhrle", sk1, sk2, "Wö", D, false, true);					// 5
		l7 = new Lehrer("Julia", "Ites", sk1, sk2, "It", E, false, true);						// 6
		l8 = new Lehrer("Wolfram", "Speck", sk1, sk2, "Sk", E, false, true);					// 7
		l9 = new Lehrer("Christina", "Weingärtner", sk1, sk2, "Wg", E, Fr, true, true);			// 8
		l10 = new Lehrer("Beate", "Guss-Tropper", sk1, sk2, "Gt", GS, WiGeo, true, true);		// 9
		l11 = new Lehrer("Lydia", "Gräter", sk1, sk2, "Gä", S, false, true);					// 10
		l12 = new Lehrer("Noemi", "Potthoff", sk1, sk2, "Ph", Bio4, false, true);				// 11
		l13 = new Lehrer("Charlotte", "Maier", sk1, sk2, "Mi", Ch, false, true);				// 12
		l14 = new Lehrer("Uwe", "Bögershausen", sk1, sk2,"Bö", KR, false, true);				// 13
		l15 = new Lehrer("Carolin", "Günzel", sk1, sk2, "Gz", EVR, false, true);				// 14
		l16 = new Lehrer("Ann-Sophie", "Adelhelm", sk1, sk2, "Ad", Eth, false, true);			// 15
		l17 = new Lehrer("Ulrike", "Becker", sk1, sk2, "Be", Sp, false, true);					// 16
		l18 = new Lehrer("Norbert", "Müller", sk1, sk2, "Mü", Sp, false, true);					// 17
		l19 = new Lehrer("Kosnick", "Kosnick", sk1, sk2, "Ko", Psy, false, true);				// 18
		l20 = new Lehrer("Isabell", "Jaitner", sk1, sk2, "Ja", Semi, BWL, true, true);			// 19
		l21 = new Lehrer("Rainer", "Denz", sk1, sk2, "Dz", Semi, false, true);					// 20
		l22 = new Lehrer("Regina", "Schobar", sk1, "So", BWL, GGK, true, false);				// 21
		l23 = new Lehrer("Julia", "Leonberger",sk2, "Lo", VWL, false, false);					// 22
		l24 = new Lehrer("Anett", "Herchenbach", sk1, "Hr", VWL, false, false);					// 23
		l25 = new Lehrer("Maciej", "Garpiel", sk1, sk2, "Gp", Inf, false, true);				// 24
		l26 = new Lehrer("Gernot", "Hege", sk1, sk2, "He", Inf, false, true);					// 25
		l27 = new Lehrer("Rebekka", "Renn", sk1, "Re", GGK, false, false);						// 26
		
		//Lehrer-Objekte in Lehrerliste zuweisen
		Collections.addAll(lehrerliste, l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13, l14, l15, l16, l17, l18, l19, l20, l21, l22, l23, l24, l25, l26, l27);
		
		//Lehrer-Objekte den Fächern zuweisen
		
		//Mathe				 //Deutsch			  //Englisch
		M.addFachLehrer(l1); D.addFachLehrer(l3); E.addFachLehrer(l7);
		M.addFachLehrer(l2); D.addFachLehrer(l4); E.addFachLehrer(l8);
		M.addFachLehrer(l5); D.addFachLehrer(l6); E.addFachLehrer(l9);  
		
		//Global Studies		//Französisch	  	 //Spanisch
		GS.addFachLehrer(l10); Fr.addFachLehrer(l9); S.addFachLehrer(l11);
			
		//Bio 2-Stündig			//Bio 4
		Bio2.addFachLehrer(l2); Bio4.addFachLehrer(l12);
		
		//Chemie				//Physik
		Ch.addFachLehrer(l13); Phy.addFachLehrer(l1);
		
		//KR					//EVR					//Ethik
		KR.addFachLehrer(l14); EVR.addFachLehrer(l15); Eth.addFachLehrer(l16);
			
		//Sport					//Psychologie			//Seminarkurs
		Sp.addFachLehrer(l17); Psy.addFachLehrer(l19); Semi.addFachLehrer(l20);
		Sp.addFachLehrer(l3); 						   Semi.addFachLehrer(l21);
		Sp.addFachLehrer(l18);
			
		//BWL					//VWL
		BWL.addFachLehrer(l20); VWL.addFachLehrer(l23);
		BWL.addFachLehrer(l22); VWL.addFachLehrer(l24);
			
		//WiGeo					   //Informatik			   //GGK
		WiGeo.addFachLehrer(l10); Inf.addFachLehrer(l25); GGK.addFachLehrer(l27);
								  Inf.addFachLehrer(l26); GGK.addFachLehrer(l22);
			
		// Schüler der WG 13-1
		
		Schueler s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22;
		s1 = new Schueler("Gonzalo", "Cofre Real", 18, sk1);			// 0
		s2 = new Schueler("Swaastika", "Yogeswaran", 20, sk1);			// 1
		s3 = new Schueler("Derin", "Sipahi", 19, sk1);					// 2
		s4 = new Schueler("Henry", "Reinhold", 19, sk1);				// 3
		s5 = new Schueler("Sara", "Perkovic", 19, sk1);					// 4
		s6 = new Schueler("Honia", "Aref", 19, sk1);					// 5
		s7 = new Schueler("Finn", "Bollheimer", 17, sk1);				// 6
		s8 = new Schueler("Karoline", "Gakos", 18, sk1);				// 7
		s9 = new Schueler("Hannah", "Hirth", 18, sk1);					// 8
		s10 = new Schueler("Sarah", "Schwarz", 18, sk1);				// 9
		s11 = new Schueler("Rüveyda", "Yildiz", 20, sk1);				// 10
		s12 = new Schueler("Jibi", "Saji", 18, sk1);					// 11
		s13 = new Schueler("Rida", "Jaffari", 18, sk1);					// 12
		s14 = new Schueler("Patrick", "Bruhn", 18, sk1);				// 13
		s15 = new Schueler("Andre", "Rosenau", 19, sk1);				// 14
		s16 = new Schueler("Irini", "Parassidou", 19, sk1);				// 15
		s17 = new Schueler("Xenia", "Aschenbrenner", 19, sk1);			// 16
		s18 = new Schueler("Kristina", "Jokic", 19, sk1);				// 17
		s19 = new Schueler("Yavuz", "Salik", 21, sk1);					// 18
		s20 = new Schueler("Zvonimir", "Jelusic", 19, sk1);				// 19
		s21 = new Schueler("Adelisa", "Skenderi", 19, sk1);				// 20
		s22 = new Schueler("Niveethika", "Krishnakumar", 20, sk1);		// 21
		
		// Schüler der WG 13-1 in die ArrayList zuweisen
		sk1.addSchuler(s1);  sk1.addSchuler(s2);  sk1.addSchuler(s3);
		sk1.addSchuler(s4);  sk1.addSchuler(s5);  sk1.addSchuler(s6);
		sk1.addSchuler(s7);  sk1.addSchuler(s8);  sk1.addSchuler(s9);
		sk1.addSchuler(s10); sk1.addSchuler(s11); sk1.addSchuler(s12);
		sk1.addSchuler(s13); sk1.addSchuler(s14); sk1.addSchuler(s15);
		sk1.addSchuler(s16); sk1.addSchuler(s17); sk1.addSchuler(s18);
		sk1.addSchuler(s19); sk1.addSchuler(s20); sk1.addSchuler(s21);
		sk1.addSchuler(s22);
		
		
		// Schüler der Klasse WG 13-2
		Schueler ss1, ss2, ss3, ss4, ss5, ss6, ss7, ss8, ss9, ss10, ss11, ss12, ss13, ss14, ss15, ss16, ss17, ss18, ss19 , ss20;
		ss1 = new Schueler("Nadja", "Scheckenbach", 20, sk2);
		ss2 = new Schueler("Sanije", "Bislimi", 19, sk2);
		ss3 = new Schueler("Cem", "YildiZ", 20, sk2);
		ss4 = new Schueler("Naomi", "Vegueria Schmidt", 20, sk2);
		ss5 = new Schueler("Leonita", "Musollaj", 19, sk2);
		ss6 = new Schueler("Selina", "Musollaj", 19, sk2);
		ss7 = new Schueler("Kevin", "Weldebruk", 20, sk2);
		ss8 = new Schueler("Dragana", "Stankovic", 20, sk2);
		ss9 = new Schueler("Jasmine", "Jashari", 19, sk2);
		ss10 = new Schueler("Vincent", "Wolters", 19, sk2);
		ss11 = new Schueler("Niclas", "Grolik", 19, sk2);
		ss12 = new Schueler("Valentina", "Preda", 19, sk2);
		ss13 = new Schueler("Manuel", "Grad", 19, sk2);
		ss14 = new Schueler("Jana", "Kissel", 20, sk2);
		ss15 = new Schueler("Anna", "Kurs", 19, sk2);
		ss16 = new Schueler("Sabrina", "Pereira Matos", 19, sk2);
		ss17 = new Schueler("Hannah", "Arendt", 20, sk2);
		ss18 = new Schueler("Fatima", "Baba", 19, sk2);
		ss19 = new Schueler("Lusijana", "Milenov", 19, sk2);
		ss20 = new Schueler("Yehia", "El Seify", 20, sk2);

		// Schüler der WG 13-2 in die ArrayList zuweisen
		sk2.addSchuler(ss1);  sk2.addSchuler(ss2);  sk2.addSchuler(ss3);
		sk2.addSchuler(ss4);  sk2.addSchuler(ss5);	sk2.addSchuler(ss6);
		sk2.addSchuler(ss7);  sk2.addSchuler(ss8);  sk2.addSchuler(ss9);
		sk2.addSchuler(ss10); sk2.addSchuler(ss11); sk2.addSchuler(ss12);
		sk2.addSchuler(ss13); sk2.addSchuler(ss14); sk2.addSchuler(ss15);
		sk2.addSchuler(ss16); sk2.addSchuler(ss17); sk2.addSchuler(ss18);
		sk2.addSchuler(ss19); sk2.addSchuler(ss20);
		
		//Schüler in die Liste zuweisen
		
		Collections.addAll(schuelerliste, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, ss1, ss2, ss3, ss4, ss5, ss6, ss7, ss8, ss9, ss10, ss11, ss12, ss13, ss14, ss15, ss16, ss17, ss18, ss19 , ss20);
	}
	public ArrayList getSchulerliste()
	{
		return schuelerliste;
	}
//	
//	public void addFach(Fach pFach) {
//		faecherliste.add(pFach);
//	}
//	
	public Fach getFaecher(int pIndex) {
		return faecherliste.get(pIndex);
	}
//	
//	public int getFaecherListenLaenge() {
//		return faecherliste.size();
//	}
	
	public void addSchueler(Schueler pSchueler) {
		schuelerliste.add(pSchueler);
	}
	
	public Schueler getSchueler(int pIndex) {
		return schuelerliste.get(pIndex);
	}
	
	public int getSchuelerListenLaenge() {
		return schuelerliste.size();
	}
	
	public void addLehrer(Lehrer pLehrer) {
		lehrerliste.add(pLehrer);
	}
	
	public Lehrer getLehrer(int pIndex) {
		return lehrerliste.get(pIndex);
	}
	
	public int getLehrereListenLaenge() {
		return lehrerliste.size();
	}
}
