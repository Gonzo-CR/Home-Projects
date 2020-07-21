package package_GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLayeredPane;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Component;
import java.awt.Point;
import javax.swing.border.CompoundBorder;
import javax.swing.border.BevelBorder;
import javax.swing.KeyStroke;
import javax.swing.MenuSelectionManager;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.CardLayout;
import javax.swing.border.SoftBevelBorder;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.JTextPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import package_Fachklassen.Fach;
import package_Fachklassen.Lehrer;
import package_Fachklassen.Schueler;
import package_Fachklassen.Schulklasse;
import package_Testdaten.Startklasse;
import package_Testdaten.Testdaten;

import javax.swing.JTextField;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JToolBar;
import javax.swing.JCheckBox;
import javax.swing.JList;
import javax.swing.JComboBox;
import java.awt.Insets;
import javax.swing.JPopupMenu;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.beans.PropertyChangeEvent;
import java.awt.Cursor;
import javax.swing.event.MenuListener;
import javax.swing.event.MenuEvent;

public class Such_Fenster extends JFrame
{
	// Objekte
	private Schulklasse sk1, sk2;
	private Fach M, D, E, BWL, VWL, Sp, GS, Inf, S, Fr, GGK, Eth, EVR, KR, Ch, Phy, Bio2, Bio4, Psy, Semi, WiGeo;
	private Lehrer lehrer, l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13, l14, l15, l16, l17, l18, l19, l20, l21, l22, l23, l24, l25, l26, l27;
	private Schueler s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22;
	private Schueler ss1, ss2, ss3, ss4, ss5, ss6, ss7, ss8, ss9, ss10, ss11, ss12, ss13, ss14, ss15, ss16, ss17, ss18, ss19 , ss20;
	private JPanel contentPane;
	private JLayeredPane LP_Start;
	private JPanel panel_Willkommen;
	private JLayeredPane LP_Allgemeine_Suche;
	private JPanel panel_GesLehrerSuche;
	private ImageIcon ksnStart = new ImageIcon(Such_System.class.getResource("/package_Images/logo-ksn.png"));
	private ImageIcon lehrerIcon = new ImageIcon(Such_Fenster.class.getResource("/package_Icons/teacherIcon32(Black).png"));
	private JTable table_Lehrer;
	private JTextField tfSuchfeldLehrer;
	private Testdaten td = new Testdaten();
	private JCheckBoxMenuItem chbxAllesMarkieren;
	private JCheckBoxMenuItem chbxKrzelAnzeigen;
	private JCheckBoxMenuItem chbxKlasseAnzeigen_1;
	private JCheckBoxMenuItem chbxKlasseAnzeigen_2;
	private JCheckBoxMenuItem chbxFachAnzeigen_1;
	private JCheckBoxMenuItem chbxFachAnzeigen_2;
	private ArrayList<JCheckBoxMenuItem> chbxListe;
	private ArrayList<Lehrer> lehrerliste = new ArrayList<>();
	private ArrayList<Schueler> schuelerliste = new ArrayList<>();
	private ArrayList<Fach> faecherliste = new ArrayList<>();
	private DefaultTableModel model;

	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					Such_Fenster frame = new Such_Fenster();
					frame.setVisible(true);
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}
	
	public void switchPanels(JPanel panel) {
		LP_Start.removeAll();
		LP_Start.add(panel);
		LP_Start.repaint();
		LP_Start.revalidate();
	}
	
	public void switchLayeredPanel (JLayeredPane layeredPane) {
		LP_Start.removeAll();
		LP_Start.add(layeredPane);
		LP_Start.repaint();
		LP_Start.revalidate();
	}

	/**
	 * Create the frame.
	 */
	public Such_Fenster()
	{
		erzeugeTestdaten();
		setTitle("KSN-Such-System");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 600);
		
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		LP_Start = new JLayeredPane();
		LP_Start.setBounds(10, 91, 614, 450);
		contentPane.add(LP_Start);
		LP_Start.setLayout(new CardLayout(0, 0));
		
		panel_Willkommen = new JPanel();
		panel_Willkommen.setBackground(Color.WHITE);
		LP_Start.add(panel_Willkommen, "name_1331559984657259");
		panel_Willkommen.setLayout(null);
		
		JLabel lblSchuelersuche = new JLabel("Sch\u00FClersuche");
		lblSchuelersuche.setForeground(Color.WHITE);
		lblSchuelersuche.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblSchuelersuche.setHorizontalAlignment(SwingConstants.CENTER);
		lblSchuelersuche.setBorder(new MatteBorder(0, 0, 2, 0, (Color) Color.WHITE));
		lblSchuelersuche.setOpaque(true);
		lblSchuelersuche.setBackground(new Color(51, 102, 153));
		lblSchuelersuche.setBounds(425, 130, 179, 46);
		panel_Willkommen.add(lblSchuelersuche);
		
		JLabel lblLehrersuche = new JLabel("Lehrersuche");
		lblLehrersuche.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(255, 255, 255)));
		lblLehrersuche.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblLehrersuche.setForeground(Color.WHITE);
		lblLehrersuche.setHorizontalAlignment(SwingConstants.CENTER);
		lblLehrersuche.setOpaque(true);
		lblLehrersuche.setBackground(new Color(51, 102, 153));
		lblLehrersuche.setBounds(214, 129, 187, 46);
		panel_Willkommen.add(lblLehrersuche);
		
		JLabel lblAllgSuche = new JLabel("Allgemeine Suche");
		lblAllgSuche.setBorder(new MatteBorder(0, 0, 2, 0, (Color) Color.WHITE));
		lblAllgSuche.setHorizontalAlignment(SwingConstants.CENTER);
		lblAllgSuche.setForeground(Color.WHITE);
		lblAllgSuche.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblAllgSuche.setBackground(new Color(51, 102, 153));
		lblAllgSuche.setOpaque(true);
		lblAllgSuche.setBounds(10, 130, 179, 46);
		panel_Willkommen.add(lblAllgSuche);
		
		JLabel lblHerzlichWillkommen = new JLabel("Herzlich Willkommen");
		lblHerzlichWillkommen.setHorizontalAlignment(SwingConstants.CENTER);
		lblHerzlichWillkommen.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblHerzlichWillkommen.setBounds(10, 11, 594, 22);
		panel_Willkommen.add(lblHerzlichWillkommen);
		
		JLabel lblAllgInhalt = new JLabel("");
		lblAllgInhalt.setBackground(new Color(102, 153, 204));
		lblAllgInhalt.setOpaque(true);
		lblAllgInhalt.setEnabled(false);
		lblAllgInhalt.setBounds(10, 174, 179, 221);
		panel_Willkommen.add(lblAllgInhalt);
		
		JLabel lblLehrerInhalt = new JLabel("");
		lblLehrerInhalt.setOpaque(true);
		lblLehrerInhalt.setEnabled(false);
		lblLehrerInhalt.setBackground(new Color(102, 153, 204));
		lblLehrerInhalt.setBounds(214, 174, 187, 221);
		panel_Willkommen.add(lblLehrerInhalt);
		
		JLabel lblSchuelerInhalt = new JLabel("");
		lblSchuelerInhalt.setOpaque(true);
		lblSchuelerInhalt.setEnabled(false);
		lblSchuelerInhalt.setBackground(new Color(102, 153, 204));
		lblSchuelerInhalt.setBounds(425, 174, 179, 221);
		panel_Willkommen.add(lblSchuelerInhalt);
		
		JLabel lblDieSucheNach = new JLabel("W\u00E4hlen Sie eine der Suchm\u00F6glichkeiten aus, um Ihre gew\u00FCnschte Person zu finden");
		lblDieSucheNach.setHorizontalAlignment(SwingConstants.CENTER);
		lblDieSucheNach.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDieSucheNach.setBounds(10, 64, 594, 22);
		panel_Willkommen.add(lblDieSucheNach);
		
		JLabel lblSchnellUndEinfach = new JLabel("Das KSN-Suchsystem steht Ihnen zur Suche von Sch\u00FClern und Lehrern zur Verf\u00FCgung");
		lblSchnellUndEinfach.setHorizontalAlignment(SwingConstants.CENTER);
		lblSchnellUndEinfach.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSchnellUndEinfach.setBounds(20, 44, 594, 22);
		panel_Willkommen.add(lblSchnellUndEinfach);
		
		LP_Allgemeine_Suche = new JLayeredPane();
		LP_Start.add(LP_Allgemeine_Suche, "name_1331560077800902");
		LP_Allgemeine_Suche.setLayout(new CardLayout(0, 0));
		
		panel_GesLehrerSuche = new JPanel();
		LP_Allgemeine_Suche.add(panel_GesLehrerSuche, "name_6209000596474");
		panel_GesLehrerSuche.setBackground(Color.WHITE);
		panel_GesLehrerSuche.setLayout(null);
		
		JLabel lblLehrerSucheIcon_Black = new JLabel("");
		lblLehrerSucheIcon_Black.setIcon(new ImageIcon(Such_Fenster.class.getResource("/package_Icons/teacherIcon32(Black).png")));
		lblLehrerSucheIcon_Black.setBounds(19, 18, 38, 39);
		panel_GesLehrerSuche.add(lblLehrerSucheIcon_Black);
		
		JLabel lblLehrersucheTitel = new JLabel("Lehrersuche");
		lblLehrersucheTitel.setFont(new Font("Segoe UI", Font.BOLD, 18));
		lblLehrersucheTitel.setBounds(60, 11, 117, 46);
		panel_GesLehrerSuche.add(lblLehrersucheTitel);
		
		JLabel lblCross = new JLabel("");
		lblCross.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblCross.setVisible(false);
				loescheLehrerSuchFeld();
			}
		});
		lblCross.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblCross.setHorizontalAlignment(SwingConstants.CENTER);
		lblCross.setIcon(new ImageIcon(Such_Fenster.class.getResource("/package_Icons/criss-crossIcon16(Black).png")));
		lblCross.setBounds(155, 127, 24, 21);
		lblCross.setVisible(false);
		panel_GesLehrerSuche.add(lblCross);
		
		JLabel lblTrashIcon = new JLabel("");
		lblTrashIcon.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblTrashIcon.setVisible(false);
				loescheLehrerTabelle();
			}
		});
		lblTrashIcon.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblTrashIcon.setHorizontalAlignment(SwingConstants.CENTER);
		lblTrashIcon.setIcon(new ImageIcon(Such_Fenster.class.getResource("/package_Icons/trashIcon16(Black).png")));
		lblTrashIcon.setBounds(580, 146, 24, 17);
		lblTrashIcon.setVisible(false);
		panel_GesLehrerSuche.add(lblTrashIcon);
		
		JTextPane txtLehrerSucheText = new JTextPane();
		txtLehrerSucheText.setEditable(false);
		txtLehrerSucheText.setForeground(Color.BLACK);
		txtLehrerSucheText.setBackground(Color.WHITE);
		txtLehrerSucheText.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		txtLehrerSucheText.setText("Tippen Sie den Vor - oder Nachnamen des/der gesuchten Lehrers/in ein und w\u00E4hlen Sie ggf. bestimmte Suchkriterien aus um Ihre Suche zu Starten");
		txtLehrerSucheText.setBounds(19, 50, 594, 46);
		panel_GesLehrerSuche.add(txtLehrerSucheText);
		
		JScrollPane scrollPane_LehrerTabelle = new JScrollPane();
		scrollPane_LehrerTabelle.setBounds(19, 166, 585, 273);
		panel_GesLehrerSuche.add(scrollPane_LehrerTabelle);
		
		table_Lehrer = new JTable();
		table_Lehrer.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Name", "Nachname", "K\u00FCrzel", "1. Klasse", "2. Klasse", "1. Fach", "2. Fach"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class, String.class, String.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table_Lehrer.getColumnModel().getColumn(0).setPreferredWidth(65);
		table_Lehrer.getColumnModel().getColumn(1).setPreferredWidth(80);
		table_Lehrer.getColumnModel().getColumn(2).setResizable(false);
		table_Lehrer.getColumnModel().getColumn(2).setPreferredWidth(40);
		table_Lehrer.getColumnModel().getColumn(3).setResizable(false);
		table_Lehrer.getColumnModel().getColumn(3).setPreferredWidth(70);
		table_Lehrer.getColumnModel().getColumn(4).setResizable(false);
		table_Lehrer.getColumnModel().getColumn(4).setPreferredWidth(70);
		table_Lehrer.getColumnModel().getColumn(5).setResizable(false);
		table_Lehrer.getColumnModel().getColumn(5).setPreferredWidth(80);
		table_Lehrer.getColumnModel().getColumn(6).setResizable(false);
		table_Lehrer.getColumnModel().getColumn(6).setPreferredWidth(80);
		table_Lehrer.setOpaque(false);
		table_Lehrer.getTableHeader().setBackground(new Color(102, 153, 204));
		table_Lehrer.setSelectionForeground(Color.WHITE);
		table_Lehrer.setSelectionBackground(new Color(51, 153, 204));
		scrollPane_LehrerTabelle.setViewportView(table_Lehrer);
		
		JLabel lblEingabe = new JLabel("Vor- oder Nachname");
		lblEingabe.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		lblEingabe.setBounds(18, 105, 135, 17);
		panel_GesLehrerSuche.add(lblEingabe);
		
		tfSuchfeldLehrer = new JTextField();
		tfSuchfeldLehrer.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
		tfSuchfeldLehrer.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tfSuchfeldLehrer.setBounds(19, 125, 135, 23);
		panel_GesLehrerSuche.add(tfSuchfeldLehrer);
		tfSuchfeldLehrer.setColumns(10);
		
		JMenuBar MB_Filter = new JMenuBar();
		MB_Filter.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		MB_Filter.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		MB_Filter.setBorderPainted(false);
		MB_Filter.setBackground(Color.WHITE);
		MB_Filter.setBounds(208, 122, 100, 30);
		panel_GesLehrerSuche.add(MB_Filter);
		
		JMenu mnFilter = new JMenu("Filter");
		mnFilter.setHorizontalAlignment(SwingConstants.RIGHT);
		mnFilter.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		mnFilter.setBackground(Color.WHITE);
		mnFilter.setIcon(new ImageIcon(Such_Fenster.class.getResource("/package_Icons/slider24(Black).png")));
		MB_Filter.add(mnFilter);
		
		chbxAllesMarkieren = new JCheckBoxMenuItem("Alles Markieren");
		chbxAllesMarkieren.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mnFilter.doClick();
				ChbxGroup();
				if(chbxAllesMarkieren.isSelected()) 
				{
					for(int i = 0; i < chbxListe.size(); i++)
					{
						chbxListe.get(i).setSelected(true);
					}
				}
				else
				{
					for(int i = 0; i < chbxListe.size(); i++)
					{
						chbxListe.get(i).setSelected(false);
					}
				}
			}
		});
		mnFilter.add(chbxAllesMarkieren);
		
		chbxKrzelAnzeigen = new JCheckBoxMenuItem("K\u00FCrzel Anzeigen");
		chbxKrzelAnzeigen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mnFilter.doClick();
			}
		});
		mnFilter.add(chbxKrzelAnzeigen);
		
		chbxKlasseAnzeigen_1 = new JCheckBoxMenuItem("1. Klasse Anzeigen");
		chbxKlasseAnzeigen_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mnFilter.doClick();
			}
		});
		mnFilter.add(chbxKlasseAnzeigen_1);
		
		chbxKlasseAnzeigen_2 = new JCheckBoxMenuItem("2. Klasse Anzeigen");
		chbxKlasseAnzeigen_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mnFilter.doClick();
			}
		});
		mnFilter.add(chbxKlasseAnzeigen_2);
		
		chbxFachAnzeigen_1 = new JCheckBoxMenuItem("1. Fach Anzeigen");
		chbxFachAnzeigen_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mnFilter.doClick();
			}
		});
		mnFilter.add(chbxFachAnzeigen_1);
		
		chbxFachAnzeigen_2 = new JCheckBoxMenuItem("2. Fach Anzeigen");
		chbxFachAnzeigen_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mnFilter.doClick();
			}
		});
		mnFilter.add(chbxFachAnzeigen_2);
		
		JMenuBar MB_AlleSuchen = new JMenuBar();
		MB_AlleSuchen.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		MB_AlleSuchen.setBorderPainted(false);
		MB_AlleSuchen.setBackground(Color.WHITE);
		MB_AlleSuchen.setBounds(330, 122, 105, 30);
		panel_GesLehrerSuche.add(MB_AlleSuchen);
		
		JMenu mnAlleSuchen = new JMenu("Alle Suchen");
		mnAlleSuchen.addMenuListener(new MenuListener() {
			public void menuCanceled(MenuEvent e) {
			}
			public void menuDeselected(MenuEvent e) {
			}
			public void menuSelected(MenuEvent e) {
				lblTrashIcon.setVisible(true);
				zeigeAlleLehrer();
			}
		});
		mnAlleSuchen.setIcon(new ImageIcon(Such_Fenster.class.getResource("/package_Icons/searchAllIcon24(Black).png")));
		MB_AlleSuchen.add(mnAlleSuchen);
		
		JMenuBar MB_SuchenLehrer = new JMenuBar();
		MB_SuchenLehrer.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		MB_SuchenLehrer.setBorderPainted(false);
		MB_SuchenLehrer.setBackground(Color.WHITE);
		MB_SuchenLehrer.setBounds(480, 122, 100, 30);
		panel_GesLehrerSuche.add(MB_SuchenLehrer);
		
		JMenu mnSuchenLehrer = new JMenu("Suchen");
		mnSuchenLehrer.addMenuListener(new MenuListener() {
			public void menuCanceled(MenuEvent e) {
			}
			public void menuDeselected(MenuEvent e) {
				
			}
			public void menuSelected(MenuEvent e) {
				lblCross.setVisible(true);
				lblTrashIcon.setVisible(true);
				einzelLehrerSuche();
				checkboxChecking();
			}
		});
		mnSuchenLehrer.setIcon(new ImageIcon(Such_Fenster.class.getResource("/package_Icons/searchSingleIconUnfilled24(Black).png")));
		MB_SuchenLehrer.add(mnSuchenLehrer);
		
		JButton btnTest = new JButton("Test");
		btnTest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				zeigeAlleLehrer();
			}
		});
		btnTest.setBounds(333, 18, 89, 23);
		panel_GesLehrerSuche.add(btnTest);
				
//		JMenuBar menuBar_1 = new JMenuBar();
//		menuBar_1.setMargin(new Insets(0, 5, 0, 0));
//		menuBar_1.setBounds(189, 107, 400, 21);
//		panel_GesLehrerSuche.add(menuBar_1);
		
//		JCheckBoxMenuItem chckbxmntmNewCheckItem = new JCheckBoxMenuItem("K\u00FCrzel");
//		menuBar_1.add(chckbxmntmNewCheckItem);
		
//		JCheckBoxMenuItem chckbxmntmNewCheckItem_1 = new JCheckBoxMenuItem("1. Klasse");
//		menuBar_1.add(chckbxmntmNewCheckItem_1);
		
//		JCheckBoxMenuItem chckbxmntmNewCheckItem_2 = new JCheckBoxMenuItem("2. Klasse");
//		menuBar_1.add(chckbxmntmNewCheckItem_2);
		
//		JCheckBoxMenuItem chckbxmntmNewCheckItem_3 = new JCheckBoxMenuItem("1. Fach");
//		menuBar_1.add(chckbxmntmNewCheckItem_3);
		
//		JCheckBoxMenuItem chckbxmntmFach = new JCheckBoxMenuItem("2. Fach");
//		menuBar_1.add(chckbxmntmFach);
		
		JLabel lblNewStart = new JLabel("");
		lblNewStart.setBackground(Color.WHITE);
		lblNewStart.setBounds(26, 10, 164, 70);
		contentPane.add(lblNewStart);
		Image StartImage = ksnStart.getImage();
		Image modStartImage = StartImage.getScaledInstance(lblNewStart.getWidth(), lblNewStart.getHeight(), Image.SCALE_SMOOTH);
		ksnStart = new ImageIcon(modStartImage);
		lblNewStart.setIcon(ksnStart);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setAlignmentX(Component.RIGHT_ALIGNMENT);
		menuBar.setBorder(new CompoundBorder());
		menuBar.setForeground(Color.WHITE);
		menuBar.setBackground(new Color(255, 255, 255));
		menuBar.setBounds(210, 25, 405, 35);
		contentPane.add(menuBar);

		
		JMenu home, algsuche, schuelersuche, lehrersuche;
		JMenuItem schuelerges, lehrerges, WG1, WG2, Fachlehrer;
		
		home = new JMenu("Home");
		home.setForeground(new Color(51, 102, 153));
		home.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		menuBar.add(home);
		
		
		algsuche = new JMenu("Allgemeine Suche");
		algsuche.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		schuelerges = new JMenuItem("Schülersuche");
		schuelerges.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(panel_GesLehrerSuche);
			}
		});
		
		schuelerges.setBackground(Color.WHITE);
		schuelerges.setAlignmentX((float) 0.69);
		schuelerges.setFont(new Font("Segoe UI", Font.PLAIN, 16));

		lehrerges = new JMenuItem("Lehrersuche");
		lehrerges.setBackground(Color.WHITE);
		lehrerges.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		algsuche.add(schuelerges);
		algsuche.add(lehrerges);
		menuBar.add(algsuche);
		
		schuelersuche = new JMenu("Stufensuche");
		schuelersuche.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		menuBar.add(schuelersuche);
		
		WG1 = new JMenuItem("WG 13-1");
		WG1.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		WG1.setBackground(Color.WHITE);
		WG1.setAlignmentX((float) 0.63);
		schuelersuche.add(WG1);
		
		WG2 = new JMenuItem("WG 13-2");
		WG2.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		WG2.setBackground(Color.WHITE);
		schuelersuche.add(WG2);
		
		lehrersuche = new JMenu("Lehrersuche");
		lehrersuche.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		menuBar.add(lehrersuche);
		
		Fachlehrer = new JMenuItem("Fachlehrer");
		Fachlehrer.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		Fachlehrer.setBackground(Color.WHITE);
		Fachlehrer.setAlignmentX(0.7f);
		lehrersuche.add(Fachlehrer);

	}
	public void ChbxGroup()
	{
		chbxListe = new ArrayList();
		chbxListe.add(chbxFachAnzeigen_1);
		chbxListe.add(chbxFachAnzeigen_2);
		chbxListe.add(chbxKlasseAnzeigen_1);
		chbxListe.add(chbxKlasseAnzeigen_2);
		chbxListe.add(chbxKrzelAnzeigen);
	}
	
	public void zeigeAlleLehrer()
	{
		model = (DefaultTableModel)table_Lehrer.getModel();
		loescheLehrerTabelle();
		for(int i = 0; i < lehrerliste.size(); i++) 
		{
			lehrer = lehrerliste.get(i);
			if(lehrer.isMehrereklassen() == true && lehrer.isMehrerefaecher() == true)
			{
				model.addRow(new Object [] {lehrer.getName(), lehrer.getNachname(), lehrer.getKuerzel(), lehrer.getKlasse_1().getBezeichnung(), lehrer.getKlasse_2().getBezeichnung(), lehrer.getFach().getBezeichnung(), lehrer.getFach2().getBezeichnung()});
			}
			else if(lehrer.isMehrereklassen() == true && lehrer.isMehrerefaecher() == false)
			{
				model.addRow(new Object [] {lehrer.getName(), lehrer.getNachname(), lehrer.getKuerzel(), lehrer.getKlasse_1().getBezeichnung(), lehrer.getKlasse_2().getBezeichnung(), lehrer.getFach().getBezeichnung(), " --- "});
			}
			else if(lehrer.isMehrereklassen() == false && lehrer.isMehrerefaecher() == true)
			{
				model.addRow(new Object [] {lehrer.getName(), lehrer.getNachname(), lehrer.getKuerzel(), lehrer.getKlasse_1().getBezeichnung(), " --- ", lehrer.getFach().getBezeichnung(), lehrer.getFach2().getBezeichnung()});
			}
			else
			{
				model.addRow(new Object [] {lehrer.getName(), lehrer.getNachname(), lehrer.getKuerzel(), lehrer.getKlasse_1().getBezeichnung(), " --- ", lehrer.getFach().getBezeichnung(), " --- "});
			}
		}
	}
	public void einzelLehrerSuche()
	{
		model = (DefaultTableModel)table_Lehrer.getModel();
		loescheLehrerTabelle();
		String lehrername = tfSuchfeldLehrer.getText();
		boolean lehrerGefunden = false;
		if(lehrername.isEmpty() == false)
		{
			for(int i = 0; i < lehrerliste.size(); i++)
			{
				lehrer = lehrerliste.get(i);
				if(lehrer.getName().equals(lehrername) || lehrer.getNachname().equals(lehrername))
				{
					lehrerGefunden = true;
					if(lehrer.isMehrereklassen() == true && lehrer.isMehrerefaecher() == true)
					{
						model.addRow(new Object [] {lehrer.getName(), lehrer.getNachname(), lehrer.getKuerzel(), lehrer.getKlasse_1().getBezeichnung(), lehrer.getKlasse_2().getBezeichnung(), lehrer.getFach().getBezeichnung(), lehrer.getFach2().getBezeichnung()});
					}
					else if(lehrer.isMehrereklassen() == true && lehrer.isMehrerefaecher() == false)
					{
					model.addRow(new Object [] {lehrer.getName(), lehrer.getNachname(), lehrer.getKuerzel(), lehrer.getKlasse_1().getBezeichnung(), lehrer.getKlasse_2().getBezeichnung(), lehrer.getFach().getBezeichnung(), " --- "});
					}
					else if(lehrer.isMehrereklassen() == false && lehrer.isMehrerefaecher() == true)
					{
					model.addRow(new Object [] {lehrer.getName(), lehrer.getNachname(), lehrer.getKuerzel(), lehrer.getKlasse_1().getBezeichnung(), " --- ", lehrer.getFach().getBezeichnung(), lehrer.getFach2().getBezeichnung()});
					}
					else
					{
					model.addRow(new Object [] {lehrer.getName(), lehrer.getNachname(), lehrer.getKuerzel(), lehrer.getKlasse_1().getBezeichnung(), " --- ", lehrer.getFach().getBezeichnung(), " --- "});
					}
					break;
				}
			}
			if(!lehrerGefunden)
			{
				JOptionPane.showMessageDialog(null, "Die gesuchte Person ist nicht im System!");
				tfSuchfeldLehrer.setText("");
			}
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Geben Sie einen Namen in das Suchfeld ein!");
		}
	}
	public void checkboxChecking()
	{
		model = (DefaultTableModel)table_Lehrer.getModel();
		loescheLehrerTabelle();
		String lehrername = tfSuchfeldLehrer.getText();
		for(int i = 0; i < lehrerliste.size(); i++)
		{
			lehrer = lehrerliste.get(i);				
			if(lehrer.getName().equals(lehrername) || lehrer.getNachname().equals(lehrername))
			{
				if(chbxKrzelAnzeigen.isSelected())
				{
					model.addRow(new Object [] {lehrer.getName(), lehrer.getNachname(), lehrer.getKuerzel(), " --- ", " --- ", " --- ", " --- "});
				}
				else
				{
					einzelLehrerSuche();			
				}
			}
		}
	}
	public void chbxKuerzelCheck(int i)
	{
		lehrer = lehrerliste.get(i);
		model.addRow(new Object [] {lehrer.getName(), lehrer.getNachname(),lehrer.getKuerzel(), " --- ", " --- ", " --- ", " --- "});
	}
	public void loescheLehrerSuchFeld()
	{
		tfSuchfeldLehrer.setText("");
		
	}
	public void loescheLehrerTabelle() 
	{
		model = (DefaultTableModel)table_Lehrer.getModel();
		model.setRowCount(0);
	}
	
	public void erzeugeTestdaten()
	{
		// Schulklassen Objekte
		
		sk1 = new Schulklasse("WG 13-1");			// 0
		sk2 = new Schulklasse("WG 13-2");			// 1
		
		// Fächer Objekt
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
		EVR = new Fach("Ev. Religion");				// 12
		KR = new Fach("Kath. Religion");			// 13
		Ch = new Fach("Chemie");					// 14
		Phy = new Fach("Physik");					// 15
		Bio2 = new Fach("Biolige-2");				// 16
		Bio4 = new Fach("Biologie-4");				// 17
		Psy = new Fach("Psychologie");				// 18
		Semi = new Fach("Seminarkurs");				// 19
		WiGeo = new Fach("WiGeo");					// 20
		
		//Fächer in die Faecherliste zuteilen
		Collections.addAll(faecherliste, M, D, E, BWL, VWL, Sp, GS, Inf, S, Fr, GGK, Eth, EVR, KR, Ch, Phy, Bio2, Bio4, Psy, Semi, WiGeo);
	
	
		//Lehrer Objekte
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
}
