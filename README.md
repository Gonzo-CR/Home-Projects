# Home-Projects
Experimenting with Java at home

package package_Fachklassen;

import java.util.MissingFormatArgumentException;
import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

import javax.management.InstanceAlreadyExistsException;

public class Startklasse {

	public static void main(String[] args) {

		final Schulklasse sk1, sk2;
			sk1 = new Schulklasse("WG 13-1");
			sk2 = new Schulklasse("WG 13-2");
		
		final Sprecher ks1, sss1;
		ks1 = new Sprecher("Klassensprecher");
		sss1 = new Sprecher("Schülersprecher");
		
		final Spezial kS1, kS2, kS3, kS4, sS1, sS2;
		kS1 = new Spezial("Cem", "Yildiz", 19, sk2, ks1);
		kS2 = new Spezial("Fatima", "Baba", 19, sk2, ks1);
		kS3 = new Spezial("Rüveyda", "Yildiz", 20, sk1, ks1);
		kS4 = new Spezial("Zvoni", "Jogovic", 19, sk1, ks1);
		sS1 = new Spezial("Cem", "Yildiz", 19, sk2, sss1);
		sS2 = new Spezial("Fatima", "Baba", 19, sk2, sss1);
		
		ks1.addKlassensprecher(kS1);
		ks1.addKlassensprecher(kS2);
		ks1.addKlassensprecher(kS3);
		ks1.addKlassensprecher(kS4);
		sss1.addSchuelersprecher(sS1);
		sss1.addSchuelersprecher(sS2);
		
		
		//Klasse 13-1
		
		final Schueler s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20;
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
		
		final Schueler ss1, ss2, ss3, ss4, ss5, ss6, ss7, ss8;
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
		
		final String schueler = "Schüler";
		final String sprecher = "Sprecher";
		
		final String ksSuche = "KS-Suche";
		final String ssSuche = "SS-Suche";
		final String ksAlle = "KS-Alle";
		final String ssAlle = "SS-Alle";
	
		while(true) 
		{
			Scanner scan = new Scanner(System.in);
			System.out.println("Welche Kategorie suchen Sie?");
			String input = scan.nextLine();
				switch(input)
				{
					case schueler:
						System.out.println("Welche Klasse besucht der gesuchte SChüler?");
						String k_Input = scan.nextLine();
						switch(k_Input)
						{
							case "WG 13-1":
								System.out.println("Wie heißt Ihr gesuchter Schüler?");
								String n_Input = scan.nextLine();
								for(int i = 0; i < sk1.getListenLaenge(); i++)
								{
									switch(n_Input)
									{
									case sk1.getSchueler(i).getName():
                  case sk1.getSchueler(i).getNachname():
                    System.out.println();
									}
								}
								
							case "WG 13-2":
								System.out.println();
							default:
								System.out.println();	
						}
					case "Sprecher":
						System.out.println();
						String s_Input = scan.nextLine();
						switch(s_Input)
						{
							case "KS-Suche":
								System.out.println();
							case "SS-Suche":
								System.out.println();
							case "KS-Alle":
								System.out.println();
							case "SS-Alle":
								System.out.println();
							default:
								System.out.println();
						}
						
				
				
		}
	}
}}
