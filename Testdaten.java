package package_GUI;

import java.util.ArrayList;

import package_Fachklassen.Fach;
import package_Fachklassen.Lehrer;
import package_Fachklassen.Schueler;
import package_Fachklassen.Schulklasse;
import package_Fachklassen.Spezial;
import package_Fachklassen.Sprecher;

public class Testdaten {
	
	private ArrayList<Fach> fachlisteNeu = new ArrayList();
	private ArrayList<Schulklasse> schuelerliste = new ArrayList<>();
//	private ArrayList<Lehrer> lehrerliste2 = new ArrayList<>();
	private ArrayList<Sprecher> spezialschueler = new ArrayList<>();
	private ArrayList<String> schlusselworte = new ArrayList();
	
	public void erzeugeTestdaten() {
		boolean mehrereFaecher = true;
		boolean mehrereKlassen = true;
		
		// TODO Auto-generated method stub
		//Schulklassen erstellen
		Schulklasse sk1, sk2;
		sk1 = new Schulklasse("WG 13-1");
		sk2 = new Schulklasse("WG 13-2");
		schuelerliste.add(sk1);
		schuelerliste.add(sk2);

		
		//Sprecher-Klassen erstellen
		Sprecher ks1, sss1;
		ks1 = new Sprecher("Klassensprecher");
		sss1 = new Sprecher("Schülersprecher");
		spezialschueler.add(ks1);
		spezialschueler.add(sss1);
		
		//Fächer Objekte erstellen
		Fach M, D, E, GS, F, S, Bio2, Bio4, Ch, Phy, KR, EVR, Eth, Sp, Psy, Semi, BWL, VWL,  WiGeo, Inf, GGK, LL;
		M = new Fach("Mathe");	
		D = new Fach("Deutsch");
		E = new Fach("Englisch");
		GS = new Fach("Global Studies");
		F = new Fach("Französisch");
		S = new Fach("Spanisch");
		Bio2 = new Fach("Biologie-2");
		Bio4 = new Fach("Biologie-4");
		Ch = new Fach("Chemie");
		Phy = new Fach("Physik");
		KR = new Fach("Katholische Religion");
		EVR = new Fach("Evangelische Religion");
		Eth = new Fach("Ethik");
		Sp = new Fach("Sport");
		Psy = new Fach("Psychologie");
		Semi = new Fach("Seminarkurs");
		BWL = new Fach("BWL");
		VWL = new Fach("VWL");
		WiGeo = new Fach("Wirtschaftsgeografie");
		Inf = new Fach("Informatik");
		GGK = new Fach("GGK");
		LL = new Fach("Lehrerliste");
		fachlisteNeu.add(LL);//0
		fachlisteNeu.add(D);//1
		fachlisteNeu.add(E);//2
		fachlisteNeu.add(M);//3
		fachlisteNeu.add(GS);//4
		fachlisteNeu.add(F);//5
		fachlisteNeu.add(S);//6
		fachlisteNeu.add(Bio2);//7
		fachlisteNeu.add(Bio4);//8
		fachlisteNeu.add(Ch);//9
		fachlisteNeu.add(Phy);//10
		fachlisteNeu.add(KR);//11
		fachlisteNeu.add(EVR);//12
		fachlisteNeu.add(Eth);//13
		fachlisteNeu.add(Sp);//14
		fachlisteNeu.add(Psy);//15
		fachlisteNeu.add(Semi);//16
		fachlisteNeu.add(BWL);//17
		fachlisteNeu.add(VWL);//18
		fachlisteNeu.add(WiGeo);//19
		fachlisteNeu.add(Inf);//20
		fachlisteNeu.add(GGK);//21
		
		
		//Lehre Objekte erstellen
		Lehrer l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13, l14, l15, l16, l17, l18, l19, l20, l21, l22, l23, l24, l25, l26, l27;
		l1 = new Lehrer("Gert", "Galinski", sk1, sk2, "Ga", M, Phy, true, true);
		l2 = new Lehrer("Alex", "SCheller", sk1, sk2, "Sr", M, Bio2, true, true);
		l3 = new Lehrer("Stefan", "Rapp", sk1, sk2, "Ra",D, false, true);
		l4 = new Lehrer("Kristina", "Grimm", sk1, sk2, "Gr" , D, false, true);
		l5 = new Lehrer("Tina", "Windisch", sk1, sk2, "Wi", M, false, true);
		l6 = new Lehrer("Sandra", "Wöhrle", sk1, sk2, "Wö", D, false, true);
		l7 = new Lehrer("Julia", "Ites", sk1, sk2, "It", E, false, true);
		l8 = new Lehrer("Wolfram", "Speck", sk1, sk2, "Sk", E, false, true);
		l9 = new Lehrer("Christina", "Weingärtner", sk1, sk2, "Wg", E, F, true, true);
		l10 = new Lehrer("Beate", "Guss-Tropper", sk1, sk2, "Gt", GS, WiGeo, true, true);
		l11 = new Lehrer("Lydia", "Gräter", sk1, sk2, "Gä", S, false, true);
		l12 = new Lehrer("Noemi", "Potthoff", sk1, sk2, "Ph", Bio4, false, true);
		l13 = new Lehrer("Charlotte", "Maier", sk1, sk2, "Mi", Ch, false, true);
		l14 = new Lehrer("Uwe", "Bögershausen", sk1, sk2,"Bö", KR, false, true);
		l15 = new Lehrer("Carolin", "Günzel", sk1, sk2, "Gz", EVR, false, true);
		l16 = new Lehrer("Ann-Sophie", "Adelhelm", sk1, sk2, "Ad", Eth, false, true);
		l17 = new Lehrer("Ulrike", "Becker", sk1, sk2, "Be", Sp, false, true);
		l18 = new Lehrer("Norbert", "Müller", sk1, sk2, "Mü", Sp, false, true);
		l19 = new Lehrer("Kosnick", "Kosnick", sk1, sk2, "Ko", Psy, false, true);
		l20 = new Lehrer("Isabell", "Jaitner", sk1, sk2, "Ja", Semi, BWL, true, true);
		l21 = new Lehrer("Rainer", "Denz", sk1, sk2, "Dz", Semi, false, true);
		l22 = new Lehrer("Regina", "Schobar", sk1, "So", BWL, GGK, true, false);
		l23 = new Lehrer("Julia", "Leonberger",sk2, "Lo", VWL, false, false);
		l24 = new Lehrer("Anett", "Herchenbach", sk1, "Hr", VWL, false, false);
		l25 = new Lehrer("Marciek", "Garpiel", sk1, sk2, "Gp", Inf, false, true);
		l26 = new Lehrer("Gernot", "Hege", sk1, sk2, "He", Inf, false, true);
		l27 = new Lehrer("Rebekka", "Renn", sk1, "Re", GGK, false, false);
		
		//Lehrer zuweisen
		
		
		
		//Lehrer Objekte einfügen
			//Mathe
		M.fachliste.add(l1);
		M.fachliste.add(l2);
		M.fachliste.add(l5);
			//Deutsch
		D.fachliste.add(l3);
		D.fachliste.add(l4);
		D.fachliste.add(l6);
			//Englisch
		E.fachliste.add(l7);
		E.fachliste.add(l8);
		E.fachliste.add(l9);
			//Global Studies
		GS.fachliste.add(l10);
			//Französisch
		F.fachliste.add(l9);
			//Spanisch
		S.fachliste.add(l11);
			//Bio 2-Stündig
		Bio2.fachliste.add(l2);
			//Bio 4
		Bio4.fachliste.add(l12);
			//Chemie
		Ch.fachliste.add(l13);
			//Physik
		Phy.fachliste.add(l1);
			//KR
		KR.fachliste.add(l14);
			//EVR
		EVR.fachliste.add(l15);
			//Ethik
		Eth.fachliste.add(l16);
			//Sport
		Sp.fachliste.add(l17);
		Sp.fachliste.add(l3);
		Sp.fachliste.add(l18);
			//Psychologie
		Psy.fachliste.add(l19);
			//Seminarkurs
		Semi.fachliste.add(l20);
		Semi.fachliste.add(l21);
			//BWL
		BWL.fachliste.add(l20);
		BWL.fachliste.add(l22);
			//VWL
		VWL.fachliste.add(l23);
		VWL.fachliste.add(l24);
			//WiGeo
		WiGeo.fachliste.add(l10);
			//Informatik
		Inf.fachliste.add(l25);
		Inf.fachliste.add(l26);
			//GGK
		GGK.fachliste.add(l27);
		GGK.fachliste.add(l22);
		
		//Lehrer Objekte in die Lehrerlsite hinzufügen
		LL.lehrerliste.add(l1);
		LL.lehrerliste.add(l2);
		LL.lehrerliste.add(l3);
		LL.lehrerliste.add(l4);
		LL.lehrerliste.add(l5);
		LL.lehrerliste.add(l6);
		LL.lehrerliste.add(l7);
		LL.lehrerliste.add(l8);
		LL.lehrerliste.add(l9);
		LL.lehrerliste.add(l10);
		LL.lehrerliste.add(l11);
		LL.lehrerliste.add(l12);
		LL.lehrerliste.add(l13);
		LL.lehrerliste.add(l14);
		LL.lehrerliste.add(l15);
		LL.lehrerliste.add(l16);
		LL.lehrerliste.add(l17);
		LL.lehrerliste.add(l18);
		LL.lehrerliste.add(l19);
		LL.lehrerliste.add(l20);
		LL.lehrerliste.add(l21);
		LL.lehrerliste.add(l22);
		LL.lehrerliste.add(l23);
		LL.lehrerliste.add(l24);
		LL.lehrerliste.add(l25);
		LL.lehrerliste.add(l26);
		LL.lehrerliste.add(l27);
		//Spezial Objekte erstellt
		Spezial kS1, kS2, kS3, kS4, sS1, sS2;
		kS1 = new Spezial("Cem", "Yildiz", 19, sk2, ks1);
		kS2 = new Spezial("Fatima", "Baba", 19, sk2, ks1);
		kS3 = new Spezial("Rüveyda", "Yildiz", 20, sk1, ks1);
		kS4 = new Spezial("Zvoni", "Jogovic", 19, sk1, ks1);
		sS1 = new Spezial("Cem", "Yildiz", 19, sk2, sss1);
		sS2 = new Spezial("Fatima", "Baba", 19, sk2, sss1);
		
		//Spezial Objekte hinzugefügt
		ks1.addKlassensprecher(kS1);
		ks1.addKlassensprecher(kS2);
		ks1.addKlassensprecher(kS3);
		ks1.addKlassensprecher(kS4);
		sss1.addSchuelersprecher(sS1);
		sss1.addSchuelersprecher(sS2);
		
		
		//Klasse 13-1
		
		Schueler s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20;
		s1 = new Schueler("Gonzalo", "Cofre Real", 18, sk1);
		s2 = new Schueler("Swaastika", "Yogeswaran", 19, sk1);
		s3 = new Schueler("Derin", "Sipahi", 19, sk1);
		s4 = new Schueler("Henry", "Reinhold", 19, sk1);
		s5 = new Schueler("Sara", "Perkovic", 19, sk1);
		s6 = new Schueler("Honia", "Aref", 19, sk1);
		s7 = new Schueler("Finn", "Bolheimer", 17, sk1);
		s8 = new Schueler("Karoline", "Garkos", 18, sk1);
		s9 = new Schueler("Hannah", "Hirth", 18, sk1);
		s10 = new Schueler("Sarah", "Schwarz", 18, sk1);
		s11 = new Schueler("Rüveyda", "Yildiz", 20, sk1);
		s12 = new Schueler("Jibi", "Saji", 18, sk1);
		s13 = new Schueler("Rida", "Jafari", 18, sk1);
		s14 = new Schueler("Patrick", "Bruhn", 18, sk1);
		s15 = new Schueler("Andre", "Rosenau", 19, sk1);
		s16 = new Schueler("Irini", "Chrisivolanto", 19, sk1);
		s17 = new Schueler("Xenia", "Aschenbrenner", 19, sk1);
		s18 = new Schueler("Kristina", "Jokic", 19, sk1);
		s19 = new Schueler("Yavuz", "Salik", 21, sk1);
		s20 = new Schueler("Zvonimir", "Jogovic", 19, sk1);
		
		
		sk1.addSchueler(s1);
		sk1.addSchueler(s2);
		sk1.addSchueler(s3);
		sk1.addSchueler(s4);
		sk1.addSchueler(s5);
		sk1.addSchueler(s6);
		sk1.addSchueler(s7);
		sk1.addSchueler(s8);
		sk1.addSchueler(s9);
		sk1.addSchueler(s10);
		
		//Klasse 13-2
		
		Schueler ss1, ss2, ss3, ss4, ss5, ss6, ss7, ss8;
		ss1 = new Schueler("Cem", "Yildiz", 19, sk2);
		ss2 = new Schueler("Fathima", "Baba", 19, sk2);
		ss3 = new Schueler("Sanjie", "Bislimi", 19, sk2);
		ss4 = new Schueler("Jasmine", "Jaffari", 19, sk2);
		ss5 = new Schueler("Hannah", "Arent", 19, sk2);
		ss6 = new Schueler("Niklas", "Genf", 18, sk2);
		ss7 = new Schueler("Celina", "Musollaj", 18, sk2);
		ss8 = new Schueler("Naomi", "Schmidt", 19, sk2);
		
		sk2.addSchueler(ss1);
		sk2.addSchueler(ss2);
		sk2.addSchueler(ss3);
		sk2.addSchueler(ss4);
		sk2.addSchueler(ss5);
		sk2.addSchueler(ss6);
		
//		final String wg131 = "WG 13-1";
//		final String wg132 = "WG 13-2";
//		final String schueler = "Schüler";
//		final String sprecher = "Sprecher";
//		final String lehrer = "Lehrer";
//		final String person = "Personenbezogen";
//		final String fach = "Fachbezogen";
//		final String lehrersuche = "Lehrersuche";
//		final String mehrere = "Mehrfachsuche";
//		schlusselworte.add(mehrere);
//		schlusselworte.add(wg131);
//		schlusselworte.add(wg132);
//		schlusselworte.add(schueler);
//		schlusselworte.add(sprecher);
//		schlusselworte.add(lehrer);
//		schlusselworte.add(person);
//		schlusselworte.add(fach);
//		schlusselworte.add(lehrersuche);
		
//		final String ksSuche = "KS-Suche";
//		final String ssSuche = "SS-Suche";
//		final String ksAlle = "KS-Alle";
//		final String ssAlle = "SS-Alle";
//		schlusselworte.add(ksSuche);
//		schlusselworte.add(ksAlle);
//		schlusselworte.add(ssSuche);
//		schlusselworte.add(ssAlle);
	}

	public void addFachliste(Fach fach)
	{
		fachlisteNeu.add(fach);
	}
	public Fach getFachliste(int index) {
		return fachlisteNeu.get(index);
	}
	public int fachlisteSize() {
		return fachlisteNeu.size();
	}
	public void addSchuelerNeu(Schulklasse lehrer) {
		schuelerliste.add(lehrer);
	}
	public Schulklasse getSchuelerNeu(int index) {
		return schuelerliste.get(index);
	}
	public int getSChuelerListeSize() {
		return schuelerliste.size();
	}
	public void addSpezial(Sprecher spezial) {
		spezialschueler.add(spezial);
	}
	public Sprecher getSpezial(int index) {
		return spezialschueler.get(index);
	}
	public int getSprecherListeSize() {
		return spezialschueler.size();
	}
}
