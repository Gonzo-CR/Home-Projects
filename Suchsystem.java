package package_GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import package_Fachklassen.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;

import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.ScrollPane;

import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import java.awt.Component;

public class Suchsystem extends JFrame {

	private Testdaten td;
	private JPanel contentPane;
	private JLayeredPane layeredPane;
	private JLayeredPane layeredPaneSchueler;
	private JPanel kategorien;
	private JPanel panelWG13_2;
	private JPanel panelWG13_1;
	private JButton btnWillkommen;
	private JButton btnSprecher;
	private JPanel panelSchueler;
	private JTextField tfNamensucheWG13_1;
	private JLabel lblNameSPWG13_1;
	private JLabel lblAlter;
	private JLabel lblKlasse;
	private JScrollPane scrollPane;
	private JComboBox<String> cbFachAuswahl;
	private ArrayList<String> fachnamen;


	private JTextField tfNameWG13_1;
	private JTextField tfAlterWG13_1;
	private JTextField tfKlasseWG13_1;
	private JButton btnSuchenWG13_1;
	private JButton btnZurckWG13_1;
	
	final String ksSuche = "KS-Suche";
	final String ssSuche = "SS-Suche";
	final String ksAlle = "KS-Alle";
	final String ssAlle = "SS-Alle";
	
	final String wg131 = "WG 13-1";
	final String wg132 = "WG 13-2";
	final String schueler = "Schüler";
	final String sprecher = "Sprecher";
	final String lehrer = "Lehrer";
	final String person = "Personenbezogen";
	final String fach = "Fachbezogen";
	final String lehrersuche = "Lehrersuche";
	final String mehrere = "Mehrfachsuche";
	private JButton btnLschenWG13_1;
	private JPanel panelErrorMessage;
	private JLabel lblDerGesuchteSchler_1;
	private JLabel lblFehlermeldung;
	private JLabel lblTitelWG13_2;
	private JSeparator separator_3;
	private JLabel lblSucheSchueler;
	private JTextField tfSuchfeldWG13_2;
	private JTextField tfNameWG13_2;
	private JTextField tfAlterWG13_2;
	private JTextField tfKlasseWG13_2;
	private JLayeredPane layeredPaneLehrer;
	private JPanel panelLehrerAuswahl;
	private JPanel panelLehrerSuche;
	private JPanel panelFachSuche;
	private JLabel lblLehrersuche;
	private JSeparator separator_4;
	private JLabel lblWhlenSieEine;
	private JButton btnLehrersuche;
	private JButton btnFachsuche;
	private JButton btnZurckLehrerAuswahl;
	private JTextField tfSuchfeldLehrer;
	private JTextField tfNameLehrer;
	private JTextField tfKürzelLehrer;
	private JTextField tfKlasse_1Lehrer;
	private JTextField tfKlasse_2Lehrer;
	private JTextField tfFach_1Lehrer;
	private JTextField tfFach_2Lehrer;
	private JPanel panelErrorLehrer;
	private JLabel lblFehlermeldungLehrer;
	private JSeparator separator_6;
	private JLabel lblDerGesuchteLehrer;
	private JButton btnNeueSucheLehrer;
	private JTextField tfFachAnzeigen;
	private JTextArea textAreaFach;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Suchsystem frame = new Suchsystem();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}
	public void switchPanels(JPanel panel) {
		layeredPane.removeAll();
		layeredPane.add(panel);
		layeredPane.repaint();
		layeredPane.revalidate();
	}
	public void switchLayeredPanel (JLayeredPane layeredpanel) {
		layeredPane.removeAll();
		layeredPane.add(layeredpanel);
		layeredPane.repaint();
		layeredPane.revalidate();
	}
	public void switchPanels_2(JPanel panel) {
		layeredPaneSchueler.removeAll();
		layeredPaneSchueler.add(panel);
		layeredPaneSchueler.repaint();
		layeredPaneSchueler.revalidate();
	}
	public void switchPanels_3(JPanel panel) {
		layeredPaneLehrer.removeAll();
		layeredPaneLehrer.add(panel);
		layeredPaneLehrer.repaint();
		layeredPaneLehrer.revalidate();
	}
	
	
	/**
	 * Create the frame.
	 */
	public Suchsystem() {
		td = new Testdaten();
		td.erzeugeTestdaten();
		
		fachnamen = new ArrayList();
		fachnamen.add("Mathe");
		fachnamen.add("Englisch");
		fachnamen.add("Deutsch");
		fachnamen.add("Biologie-2");
		fachnamen.add("Biologie-4");
		fachnamen.add("Physik");
		fachnamen.add("Chemie");
		fachnamen.add("Informatik");
		fachnamen.add("Ethik");
		fachnamen.add("Katholische Religion");
		fachnamen.add("Evangelische Religion");
		fachnamen.add("Sport");
		fachnamen.add("GGK");
		fachnamen.add("BWL");
		fachnamen.add("VWL");
		fachnamen.add("Psychologie");
		fachnamen.add("Seminarkurs");
		fachnamen.add("Wirtschaftsgeografie");
		fachnamen.add("Spanisch");
		fachnamen.add("Französisch");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		layeredPane = new JLayeredPane();
		layeredPane.setBounds(10, 34, 414, 217);
		contentPane.add(layeredPane);
		layeredPane.setLayout(new CardLayout(0, 0));
		
		kategorien = new JPanel();
		layeredPane.add(kategorien, "name_371455170045517");
		kategorien.setLayout(null);
		
		JLabel lblFrage_1 = new JLabel("Nach welcher Kategorie suchen sie?");
		lblFrage_1.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblFrage_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblFrage_1.setBounds(0, 58, 414, 27);
		kategorien.add(lblFrage_1);
		
		layeredPaneSchueler = new JLayeredPane();
		layeredPane.add(layeredPaneSchueler, "name_69803202234196");
		layeredPaneSchueler.setLayout(new CardLayout(0, 0));
		
		panelSchueler = new JPanel();
		layeredPaneSchueler.add(panelSchueler, "name_70363986715411");
		panelSchueler.setLayout(null);
		
		JLabel lblHallo = new JLabel("Sch\u00FClersuche");
		lblHallo.setHorizontalAlignment(SwingConstants.CENTER);
		lblHallo.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblHallo.setBounds(10, 11, 394, 24);
		panelSchueler.add(lblHallo);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(145, 33, 120, 2);
		panelSchueler.add(separator);
		
		JButton btnWG13_1 = new JButton("WG 13-1");
		btnWG13_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				switchPanels_2(panelWG13_1);
			}
		});
		btnWG13_1.setBounds(56, 88, 89, 23);
		panelSchueler.add(btnWG13_1);
		
		JButton btnWG13_2 = new JButton("WG 13-2");
		btnWG13_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				switchPanels_2(panelWG13_2);
			}
		});
		btnWG13_2.setBounds(269, 88, 89, 23);
		panelSchueler.add(btnWG13_2);
		
		JLabel lblNewLabel = new JLabel("Welche Klasse besucht ihr gesuchter Sch\u00FCler?");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 46, 394, 14);
		panelSchueler.add(lblNewLabel);
		
		panelWG13_1 = new JPanel();
		layeredPaneSchueler.add(panelWG13_1, "name_81558686386619");
		panelWG13_1.setLayout(null);
		
		JLabel lblTitelPanelWG13_1 = new JLabel("Sch\u00FClersuche - WG 13-1");
		lblTitelPanelWG13_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitelPanelWG13_1.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblTitelPanelWG13_1.setBounds(10, 11, 394, 24);
		panelWG13_1.add(lblTitelPanelWG13_1);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(116, 33, 180, 2);
		panelWG13_1.add(separator_1);
		
		JLabel lblNameOderNachname = new JLabel("Name oder Nachname:");
		lblNameOderNachname.setBounds(10, 46, 128, 14);
		panelWG13_1.add(lblNameOderNachname);
		
		tfNamensucheWG13_1 = new JTextField();
		tfNamensucheWG13_1.setBounds(10, 71, 128, 20);
		panelWG13_1.add(tfNamensucheWG13_1);
		tfNamensucheWG13_1.setColumns(10);
		
		lblNameSPWG13_1 = new JLabel("Name:");
		lblNameSPWG13_1.setBounds(192, 74, 46, 14);
		panelWG13_1.add(lblNameSPWG13_1);
		
		lblAlter = new JLabel("Alter:");
		lblAlter.setBounds(192, 99, 46, 14);
		panelWG13_1.add(lblAlter);
		
		lblKlasse = new JLabel("Klasse:");
		lblKlasse.setBounds(192, 124, 46, 14);
		panelWG13_1.add(lblKlasse);
		
		tfNameWG13_1 = new JTextField();
		tfNameWG13_1.setBounds(248, 71, 140, 20);
		panelWG13_1.add(tfNameWG13_1);
		tfNameWG13_1.setColumns(10);
		
		tfAlterWG13_1 = new JTextField();
		tfAlterWG13_1.setColumns(10);
		tfAlterWG13_1.setBounds(248, 96, 140, 20);
		panelWG13_1.add(tfAlterWG13_1);
		
		tfKlasseWG13_1 = new JTextField();
		tfKlasseWG13_1.setColumns(10);
		tfKlasseWG13_1.setBounds(248, 121, 140, 20);
		panelWG13_1.add(tfKlasseWG13_1);
		
		btnSuchenWG13_1 = new JButton("Suchen");
		btnSuchenWG13_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				schuelerSucheWG13_1();
			}
		});
		btnSuchenWG13_1.setBounds(32, 102, 89, 23);
		panelWG13_1.add(btnSuchenWG13_1);
		
		btnZurckWG13_1 = new JButton("Zur\u00FCck");
		btnZurckWG13_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				switchPanels_2(panelSchueler);
			}
		});
		btnZurckWG13_1.setBounds(10, 183, 89, 23);
		panelWG13_1.add(btnZurckWG13_1);
		
		btnLschenWG13_1 = new JButton("L\u00F6schen");
		btnLschenWG13_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				loeschenWG13_1();
			}
		});
		btnLschenWG13_1.setBounds(315, 183, 89, 23);
		panelWG13_1.add(btnLschenWG13_1);
		
		panelWG13_2 = new JPanel();
		layeredPaneSchueler.add(panelWG13_2, "name_81587703933265");
		panelWG13_2.setLayout(null);
		
		lblTitelWG13_2 = new JLabel("Sch\u00FClersuche - WG 13-2");
		lblTitelWG13_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitelWG13_2.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblTitelWG13_2.setBounds(10, 11, 394, 24);
		panelWG13_2.add(lblTitelWG13_2);
		
		separator_3 = new JSeparator();
		separator_3.setBounds(118, 33, 180, 2);
		panelWG13_2.add(separator_3);
		
		lblSucheSchueler = new JLabel("Name oder Nachname:");
		lblSucheSchueler.setBounds(10, 46, 128, 14);
		panelWG13_2.add(lblSucheSchueler);
		
		tfSuchfeldWG13_2 = new JTextField();
		tfSuchfeldWG13_2.setColumns(10);
		tfSuchfeldWG13_2.setBounds(10, 71, 128, 20);
		panelWG13_2.add(tfSuchfeldWG13_2);
		
		JLabel lblNameWG13_2 = new JLabel("Name:");
		lblNameWG13_2.setBounds(188, 74, 46, 14);
		panelWG13_2.add(lblNameWG13_2);
		
		JLabel lblAlterWG13_2 = new JLabel("Alter:");
		lblAlterWG13_2.setBounds(188, 99, 46, 14);
		panelWG13_2.add(lblAlterWG13_2);
		
		JLabel lblKlasseWG13_2 = new JLabel("Klasse:");
		lblKlasseWG13_2.setBounds(188, 124, 46, 14);
		panelWG13_2.add(lblKlasseWG13_2);
		
		tfNameWG13_2 = new JTextField();
		tfNameWG13_2.setColumns(10);
		tfNameWG13_2.setBounds(244, 71, 140, 20);
		panelWG13_2.add(tfNameWG13_2);
		
		tfAlterWG13_2 = new JTextField();
		tfAlterWG13_2.setColumns(10);
		tfAlterWG13_2.setBounds(244, 96, 140, 20);
		panelWG13_2.add(tfAlterWG13_2);
		
		tfKlasseWG13_2 = new JTextField();
		tfKlasseWG13_2.setColumns(10);
		tfKlasseWG13_2.setBounds(244, 121, 140, 20);
		panelWG13_2.add(tfKlasseWG13_2);
		
		JButton btnSuchenWG13_2 = new JButton("Suchen");
		btnSuchenWG13_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				schuelerSucheWG13_2();
			}
		});
		btnSuchenWG13_2.setBounds(30, 102, 89, 23);
		panelWG13_2.add(btnSuchenWG13_2);
		
		JButton btnZurckWG13_2 = new JButton("Zur\u00FCck");
		btnZurckWG13_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				switchPanels_2(panelSchueler);
			}
		});
		btnZurckWG13_2.setBounds(10, 183, 89, 23);
		panelWG13_2.add(btnZurckWG13_2);
		
		JButton btnLschenWG13_2 = new JButton("L\u00F6schen");
		btnLschenWG13_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				loeschenWG13_2();
			}
		});
		btnLschenWG13_2.setBounds(315, 183, 89, 23);
		panelWG13_2.add(btnLschenWG13_2);
		
		panelErrorMessage = new JPanel();
		layeredPaneSchueler.add(panelErrorMessage, "name_2647501690343");
		panelErrorMessage.setLayout(null);
		
		lblDerGesuchteSchler_1 = new JLabel("Der Gesuchte Sch\u00FCler ist nicht im System!");
		lblDerGesuchteSchler_1.setForeground(Color.RED);
		lblDerGesuchteSchler_1.setFont(new Font("Dialog", Font.PLAIN, 18));
		lblDerGesuchteSchler_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblDerGesuchteSchler_1.setBounds(10, 77, 394, 24);
		panelErrorMessage.add(lblDerGesuchteSchler_1);
		
		lblFehlermeldung = new JLabel("Fehlermeldung");
		lblFehlermeldung.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblFehlermeldung.setHorizontalAlignment(SwingConstants.CENTER);
		lblFehlermeldung.setBounds(10, 11, 394, 21);
		panelErrorMessage.add(lblFehlermeldung);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(148, 34, 117, 2);
		panelErrorMessage.add(separator_2);
		
		JButton btnZureuckFehler = new JButton("Zur\u00FCck");
		btnZureuckFehler.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				switchPanels_2(panelWG13_1);
			}
		});
		btnZureuckFehler.setBounds(161, 130, 89, 23);
		panelErrorMessage.add(btnZureuckFehler);
		
		btnSprecher = new JButton("Sprecher");
		btnSprecher.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
			}
		});
		btnSprecher.setBounds(259, 96, 89, 23);
		kategorien.add(btnSprecher);
		
		JButton btnSchueler = new JButton("Sch\u00FCler");
		btnSchueler.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				switchLayeredPanel(layeredPaneSchueler);
				switchPanels_2(panelSchueler);
			}
		});
		btnSchueler.setBounds(61, 96, 89, 23);
		kategorien.add(btnSchueler);
		
		JButton btnLehrer = new JButton("Lehrer");
		btnLehrer.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				switchLayeredPanel(layeredPaneLehrer);
				switchPanels_3(panelLehrerAuswahl);
			}
		});
		btnLehrer.setBounds(160, 96, 89, 23);
		kategorien.add(btnLehrer);
		
		layeredPaneLehrer = new JLayeredPane();
		layeredPane.add(layeredPaneLehrer, "name_7258844314524");
		layeredPaneLehrer.setLayout(new CardLayout(0, 0));
		
		panelLehrerAuswahl = new JPanel();
		layeredPaneLehrer.add(panelLehrerAuswahl, "name_7276562145211");
		panelLehrerAuswahl.setLayout(null);
		
		lblLehrersuche = new JLabel("Lehrersuche");
		lblLehrersuche.setHorizontalAlignment(SwingConstants.CENTER);
		lblLehrersuche.setFont(new Font("Dialog", Font.PLAIN, 18));
		lblLehrersuche.setBounds(10, 11, 394, 24);
		panelLehrerAuswahl.add(lblLehrersuche);
		
		separator_4 = new JSeparator();
		separator_4.setBounds(148, 33, 117, 2);
		panelLehrerAuswahl.add(separator_4);
		
		lblWhlenSieEine = new JLabel("W\u00E4hlen Sie eine Kategorie!");
		lblWhlenSieEine.setHorizontalAlignment(SwingConstants.CENTER);
		lblWhlenSieEine.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblWhlenSieEine.setBounds(10, 46, 394, 24);
		panelLehrerAuswahl.add(lblWhlenSieEine);
		
		btnLehrersuche = new JButton("Lehrersuche");
		btnLehrersuche.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				switchPanels_3(panelLehrerSuche);
			}
		});
		btnLehrersuche.setBounds(85, 81, 117, 23);
		panelLehrerAuswahl.add(btnLehrersuche);
		
		btnFachsuche = new JButton("Fachsuche");
		btnFachsuche.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				switchPanels_3(panelFachSuche);
			}
		});
		btnFachsuche.setBounds(212, 81, 117, 23);
		panelLehrerAuswahl.add(btnFachsuche);
		
		btnZurckLehrerAuswahl = new JButton("Zur\u00FCck");
		btnZurckLehrerAuswahl.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				switchPanels(kategorien);
			}
		});
		btnZurckLehrerAuswahl.setBounds(10, 183, 89, 23);
		panelLehrerAuswahl.add(btnZurckLehrerAuswahl);
		
		panelLehrerSuche = new JPanel();
		panelLehrerSuche.setBackground(Color.LIGHT_GRAY);
		layeredPaneLehrer.add(panelLehrerSuche, "name_7278432175735");
		panelLehrerSuche.setLayout(null);
		
		JLabel lblLehrersucheNeu = new JLabel("Lehrersuche");
		lblLehrersucheNeu.setFont(new Font("Dialog", Font.PLAIN, 18));
		lblLehrersucheNeu.setHorizontalAlignment(SwingConstants.CENTER);
		lblLehrersucheNeu.setBounds(10, 11, 394, 24);
		panelLehrerSuche.add(lblLehrersucheNeu);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setBounds(152, 33, 108, 2);
		panelLehrerSuche.add(separator_5);
		
		JLabel lblNameOderNachnameLehrer = new JLabel("Name oder Nachname:");
		lblNameOderNachnameLehrer.setBounds(10, 46, 128, 14);
		panelLehrerSuche.add(lblNameOderNachnameLehrer);
		
		tfSuchfeldLehrer = new JTextField();
		tfSuchfeldLehrer.setBounds(10, 71, 113, 20);
		panelLehrerSuche.add(tfSuchfeldLehrer);
		tfSuchfeldLehrer.setColumns(10);
		
		JButton btnSuchenLehrer = new JButton("Suchen");
		btnSuchenLehrer.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lehrerSuche();
			}
		});
		btnSuchenLehrer.setBounds(20, 102, 89, 23);
		panelLehrerSuche.add(btnSuchenLehrer);
		
		JButton btnZurckLehrer = new JButton("Zur\u00FCck");
		btnZurckLehrer.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				switchPanels_3(panelLehrerAuswahl);
			}
		});
		btnZurckLehrer.setBounds(10, 183, 89, 23);
		panelLehrerSuche.add(btnZurckLehrer);
		
		JButton btnLschenLehrer = new JButton("L\u00F6schen");
		btnLschenLehrer.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				loeschenLehrerSuche();
			}
		});
		btnLschenLehrer.setBounds(315, 183, 89, 23);
		panelLehrerSuche.add(btnLschenLehrer);
		
		JLabel lblNameLehrer = new JLabel("Name:");
		lblNameLehrer.setBounds(175, 46, 46, 14);
		panelLehrerSuche.add(lblNameLehrer);
		
		JLabel lblKrzelLehrer = new JLabel("K\u00FCrzel:");
		lblKrzelLehrer.setBounds(175, 74, 46, 14);
		panelLehrerSuche.add(lblKrzelLehrer);
		
		JLabel lblKlasseLehrer = new JLabel("Klasse:");
		lblKlasseLehrer.setBounds(175, 106, 46, 14);
		panelLehrerSuche.add(lblKlasseLehrer);
		
		JLabel lblFachLehrer = new JLabel("Fach:");
		lblFachLehrer.setBounds(175, 131, 46, 14);
		panelLehrerSuche.add(lblFachLehrer);
		
		tfNameLehrer = new JTextField();
		tfNameLehrer.setBounds(231, 43, 150, 20);
		panelLehrerSuche.add(tfNameLehrer);
		tfNameLehrer.setColumns(10);
		
		tfKürzelLehrer = new JTextField();
		tfKürzelLehrer.setColumns(10);
		tfKürzelLehrer.setBounds(231, 71, 150, 20);
		panelLehrerSuche.add(tfKürzelLehrer);
		
		tfKlasse_1Lehrer = new JTextField();
		tfKlasse_1Lehrer.setBounds(231, 103, 70, 20);
		panelLehrerSuche.add(tfKlasse_1Lehrer);
		tfKlasse_1Lehrer.setColumns(10);
		
		tfKlasse_2Lehrer = new JTextField();
		tfKlasse_2Lehrer.setColumns(10);
		tfKlasse_2Lehrer.setBounds(311, 103, 70, 20);
		panelLehrerSuche.add(tfKlasse_2Lehrer);
		
		tfFach_1Lehrer = new JTextField();
		tfFach_1Lehrer.setColumns(10);
		tfFach_1Lehrer.setBounds(231, 128, 70, 20);
		panelLehrerSuche.add(tfFach_1Lehrer);
		
		tfFach_2Lehrer = new JTextField();
		tfFach_2Lehrer.setColumns(10);
		tfFach_2Lehrer.setBounds(311, 128, 70, 20);
		panelLehrerSuche.add(tfFach_2Lehrer);
		
		panelFachSuche = new JPanel();
		panelFachSuche.setBackground(Color.GRAY);
		layeredPaneLehrer.add(panelFachSuche, "name_7280297847389");
		panelFachSuche.setLayout(null);
		
		
		JButton btnSucheFach = new JButton("Suche");
		btnSucheFach.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				taLoeschen();
				sucheFach();
			}
		});
		btnSucheFach.setBounds(10, 120, 99, 23);
		panelFachSuche.add(btnSucheFach);
		
		cbFachAuswahl = new JComboBox<String>();
		cbFachAuswahl.setBounds(10, 87, 101, 20);
		panelFachSuche.add(cbFachAuswahl);
		cbFachAuswahl.addItem("Mathe");
		cbFachAuswahl.addItem("Deutsch");
		cbFachAuswahl.addItem("Englisch");
		cbFachAuswahl.addItem("Biologie-2");
		cbFachAuswahl.addItem("Biologie-4");
		cbFachAuswahl.addItem("Informatik");
		cbFachAuswahl.addItem("Global Studies");
		cbFachAuswahl.addItem("Französisch");
		cbFachAuswahl.addItem("Spanisch");
		cbFachAuswahl.addItem("Wirtschaftsgeografie");
		cbFachAuswahl.addItem("GGK");
		cbFachAuswahl.addItem("BWL");
		cbFachAuswahl.addItem("VWL");
		cbFachAuswahl.addItem("Seminarkurs");
		cbFachAuswahl.addItem("Physik");
		cbFachAuswahl.addItem("Chemie");
		cbFachAuswahl.addItem("Sport");
		cbFachAuswahl.addItem("Ethik");
		cbFachAuswahl.addItem("Katholische Religion");
		cbFachAuswahl.addItem("Evangelische Religion");
		cbFachAuswahl.addItem("Psychologie");
		
		
		JLabel lblWhlenSieEin = new JLabel("W\u00E4hlen sie ein Fach");
		lblWhlenSieEin.setBounds(10, 62, 101, 14);
		panelFachSuche.add(lblWhlenSieEin);
		
		tfFachAnzeigen = new JTextField();
		tfFachAnzeigen.setBounds(180, 59, 206, 20);
		panelFachSuche.add(tfFachAnzeigen);
		tfFachAnzeigen.setColumns(10);
		
		JLabel lblFachbezogeneLehrersuche = new JLabel("Fachbezogene Lehrer-Suche");
		lblFachbezogeneLehrersuche.setHorizontalAlignment(SwingConstants.CENTER);
		lblFachbezogeneLehrersuche.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblFachbezogeneLehrersuche.setBounds(10, 11, 394, 23);
		panelFachSuche.add(lblFachbezogeneLehrersuche);
		
		JSeparator separator_7 = new JSeparator();
		separator_7.setBounds(78, 32, 258, 2);
		panelFachSuche.add(separator_7);
		
		JScrollPane scrollPane_1 = new JScrollPane((Component) null);
		scrollPane_1.setBounds(180, 87, 206, 108);
		panelFachSuche.add(scrollPane_1);
		
		textAreaFach = new JTextArea();
		scrollPane_1.setViewportView(textAreaFach);
		
		
		panelErrorLehrer = new JPanel();
		layeredPaneLehrer.add(panelErrorLehrer, "name_5768358193345");
		panelErrorLehrer.setLayout(null);
		
		lblFehlermeldungLehrer = new JLabel("Fehlermeldung");
		lblFehlermeldungLehrer.setHorizontalAlignment(SwingConstants.CENTER);
		lblFehlermeldungLehrer.setFont(new Font("Dialog", Font.PLAIN, 18));
		lblFehlermeldungLehrer.setBounds(10, 11, 394, 24);
		panelErrorLehrer.add(lblFehlermeldungLehrer);
		
		separator_6 = new JSeparator();
		separator_6.setBounds(145, 35, 126, 2);
		panelErrorLehrer.add(separator_6);
		
		lblDerGesuchteLehrer = new JLabel("Der gesuchte Lehrer ist nicht im System!");
		lblDerGesuchteLehrer.setForeground(Color.RED);
		lblDerGesuchteLehrer.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblDerGesuchteLehrer.setHorizontalAlignment(SwingConstants.CENTER);
		lblDerGesuchteLehrer.setBounds(10, 80, 394, 24);
		panelErrorLehrer.add(lblDerGesuchteLehrer);
		
		btnNeueSucheLehrer = new JButton("Neue Suche");
		btnNeueSucheLehrer.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				switchPanels_3(panelLehrerSuche);
			}
		});
		btnNeueSucheLehrer.setBounds(165, 116, 89, 23);
		panelErrorLehrer.add(btnNeueSucheLehrer);
		
		btnWillkommen = new JButton("Willkommen");
		btnWillkommen.setBounds(175, 5, 89, 23);
		contentPane.add(btnWillkommen);
		btnWillkommen.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
					switchPanels(kategorien);;		
			}
		});
		
		
	}
	public void schuelerSucheWG13_1()
	{
		String name = tfNamensucheWG13_1.getText();
		for(int i =0; i < td.getSchuelerNeu(0).getListenLaenge(); i++)
		{
			if(td.getSchuelerNeu(0).getSchueler(i).getName().equals(name) || td.getSchuelerNeu(0).getSchueler(i).getNachname().equals(name))
			{
				tfNameWG13_1.setText(td.getSchuelerNeu(0).getSchueler(i).getName() + " " + td.getSchuelerNeu(0).getSchueler(i).getNachname());
				tfKlasseWG13_1.setText(td.getSchuelerNeu(0).getSchueler(i).getKlasse().getBezeichnung());
				tfAlterWG13_1.setText(Integer.toString(td.getSchuelerNeu(0).getSchueler(i).getAlter()));
				break;
			}
			else
			{
				switchPanels_2(panelErrorMessage);
				tfAlterWG13_1.setText("");
				tfNameWG13_1.setText("");
				tfKlasseWG13_1.setText("");
			}
		}
	}
	public void schuelerSucheWG13_2() 
	{
		String name2 = tfSuchfeldWG13_2.getText();
		for(int i = 0; i < td.getSchuelerNeu(1).getListenLaenge(); i++)
		{
			if(td.getSchuelerNeu(1).getSchueler(i).getName().equals(name2) || td.getSchuelerNeu(1).getSchueler(i).getNachname().equals(name2))
			{
				tfNameWG13_2.setText(td.getSchuelerNeu(1).getSchueler(i).getName() + " " + td.getSchuelerNeu(1).getSchueler(i).getNachname());
				tfKlasseWG13_2.setText(td.getSchuelerNeu(1).getSchueler(i).getKlasse().getBezeichnung());
				tfAlterWG13_2.setText(Integer.toString(td.getSchuelerNeu(1).getSchueler(i).getAlter()));
				break;
			}
			else
			{
				switchPanels_2(panelErrorMessage);
				tfAlterWG13_2.setText("");
				tfNameWG13_2.setText("");
				tfKlasseWG13_2.setText("");
			}
		}
	}
	public void lehrerSuche() 
	{
		String lehrername = tfSuchfeldLehrer.getText();
		for(int i = 0; i < td.getFachliste(0).getListenLaengeLehrerListe();i++)
				{
					if(td.getFachliste(0).getLehrerliste(i).getName().equals(lehrername) || td.getFachliste(0).getLehrerliste(i).getNachname().equals(lehrername))
					{
						if(td.getFachliste(0).getLehrerliste(i).isMehrerefaecher() && td.getFachliste(0).getLehrerliste(i).isMehrereklassen())
						{
							tfNameLehrer.setText(td.getFachliste(0).getLehrerliste(i).getName() + " " + td.getFachliste(0).getLehrerliste(i).getNachname());
							tfKürzelLehrer.setText(td.getFachliste(0).getLehrerliste(i).getKuerzel() + ".");
							tfKlasse_1Lehrer.setText(td.getFachliste(0).getLehrerliste(i).getKlasse().getBezeichnung());
							tfKlasse_2Lehrer.setText(td.getFachliste(0).getLehrerliste(i).getKlass2().getBezeichnung());
							tfFach_1Lehrer.setText(td.getFachliste(0).getLehrerliste(i).getFach().getFachbezeichnung());
							tfFach_2Lehrer.setText(td.getFachliste(0).getLehrerliste(i).getFach2().getFachbezeichnung());
//							break;
							
						}
						if(td.getFachliste(0).getLehrerliste(i).isMehrerefaecher() == false && td.getFachliste(0).getLehrerliste(i).isMehrereklassen())
						{
							tfNameLehrer.setText(td.getFachliste(0).getLehrerliste(i).getName() + " " + td.getFachliste(0).getLehrerliste(i).getNachname());
							tfKürzelLehrer.setText(td.getFachliste(0).getLehrerliste(i).getKuerzel() + ".");
							tfKlasse_1Lehrer.setText(td.getFachliste(0).getLehrerliste(i).getKlasse().getBezeichnung());
							tfKlasse_2Lehrer.setText(td.getFachliste(0).getLehrerliste(i).getKlass2().getBezeichnung());
							tfFach_1Lehrer.setText(td.getFachliste(0).getLehrerliste(i).getFach().getFachbezeichnung());
//							break;
						}
						if(td.getFachliste(0).getLehrerliste(i).isMehrerefaecher() && td.getFachliste(0).getLehrerliste(i).isMehrereklassen()==false)
						{
							tfNameLehrer.setText(td.getFachliste(0).getLehrerliste(i).getName() + " " + td.getFachliste(0).getLehrerliste(i).getNachname());
							tfKürzelLehrer.setText(td.getFachliste(0).getLehrerliste(i).getKuerzel() + ".");
							tfKlasse_1Lehrer.setText(td.getFachliste(0).getLehrerliste(i).getKlasse().getBezeichnung());
							tfFach_1Lehrer.setText(td.getFachliste(0).getLehrerliste(i).getFach().getFachbezeichnung());
							tfFach_2Lehrer.setText(td.getFachliste(0).getLehrerliste(i).getFach2().getFachbezeichnung());
//							break;
						}
						if(td.getFachliste(0).getLehrerliste(i).isMehrerefaecher() == false && td.getFachliste(0).getLehrerliste(i).isMehrereklassen()==false)
						{
							tfNameLehrer.setText(td.getFachliste(0).getLehrerliste(i).getName() + " " + td.getFachliste(0).getLehrerliste(i).getNachname());
							tfKürzelLehrer.setText(td.getFachliste(0).getLehrerliste(i).getKuerzel() + ".");
							tfKlasse_1Lehrer.setText(td.getFachliste(0).getLehrerliste(i).getKlasse().getBezeichnung());
							tfFach_1Lehrer.setText(td.getFachliste(0).getLehrerliste(i).getFach().getFachbezeichnung());
//							break;
						}
						break;
					}
					else
					{
						switchPanels_3(panelErrorLehrer);
					}
				}
	}
	public void sucheFach() {
		for(int i = 0; i < fachnamen.size(); i++)
		{
			String fach = fachnamen.get(i);
			if(cbFachAuswahl.getSelectedItem().equals(fach))
			{
				for(int j = 0; j < td.getFachliste(0).getListenLaengeLehrerListe(); j++)
				{
					if(td.getFachliste(0).getLehrerliste(j).isMehrerefaecher())
					{
					if(td.getFachliste(0).getLehrerliste(j).getFach().getFachbezeichnung().equals(fach) || td.getFachliste(0).getLehrerliste(j).getFach2().getFachbezeichnung().equals(fach))
						{
							tfFachAnzeigen.setText(fach);
							textAreaFach.append(td.getFachliste(0).getLehrerliste(j).getName() + " " + td.getFachliste(0).getLehrerliste(j).getNachname());
							textAreaFach.append("\n");
							
						}
					}
					else if(td.getFachliste(0).getLehrerliste(j).isMehrerefaecher()==false)
					{
						if(td.getFachliste(0).getLehrerliste(j).getFach().getFachbezeichnung().equals(fach))
						{
							tfFachAnzeigen.setText(fach);
							textAreaFach.append(td.getFachliste(0).getLehrerliste(j).getName() + " " + td.getFachliste(0).getLehrerliste(j).getNachname());
							textAreaFach.append("\n");
						}
					}
				}
			}
		}
	}
//		textAreaFach.setText(td.getFachliste(0).getLehrerliste(0).getName() + "\n" + td.getFachliste(0).getLehrerliste(0).getNachname());
//		textArea.setText(td.getFachliste(0).getLehrerliste(0).getName() + " " + td.getFachliste(0).getLehrerliste(0).getNachname() + td.getFachliste(0).getLehrerliste(0).getKuerzel() + "." + td.getFachliste(0).getLehrerliste(0).getKlasse().getBezeichnung() + td.getFachliste(0).getLehrerliste(0).getKlass2().getBezeichnung() + td.getFachliste(0).getLehrerliste(0).getFach().getFachbezeichnung() + td.getFachliste(0).getLehrerliste(0).getFach2().getFachbezeichnung());
	public void sucheFach2() {
		for(int i = 0; i < 10; i++)
		{
			textAreaFach.append(String.valueOf(i));
			textAreaFach.append("\n");
		}
	}

	public void taLoeschen() {
		textAreaFach.setText("");
	}
	public void loeschenWG13_1() {
		tfNamensucheWG13_1.setText("");
		tfNameWG13_1.setText("");
		tfAlterWG13_1.setText("");
		tfKlasseWG13_1.setText("");
	}
	public void loeschenWG13_2() {
		tfAlterWG13_2.setText("");
		tfKlasseWG13_2.setText("");
		tfNameWG13_2.setText("");
		tfSuchfeldWG13_2.setText("");
	}
	public void loeschenLehrerSuche() {
		tfFach_1Lehrer.setText("");
		tfFach_2Lehrer.setText("");
		tfKlasse_1Lehrer.setText("");
		tfKlasse_2Lehrer.setText("");
		tfKürzelLehrer.setText("");
		tfNameLehrer.setText("");
		tfSuchfeldLehrer.setText("");
	}
	public void test() {
		for(int i=0; i<td.getFachliste(0).getListenLaengeLehrerListe();i++)
		{
			tfFach_1Lehrer.setText(td.getFachliste(0).getLehrerliste(i).getName());
	}
}	
}
